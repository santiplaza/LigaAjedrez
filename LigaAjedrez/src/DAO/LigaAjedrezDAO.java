package DAO;

import Clases.Club;
import Clases.Federacion;
import Clases.Torneo;
import Clases.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author enrique
 */
public class LigaAjedrezDAO {
    
    private Connection conexionBD;
    
    public LigaAjedrezDAO(){
        
        String bd = "jdbc:mysql://localhost:3306/LigaAjedrezBD";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexionBD = DriverManager.getConnection(bd, "root", "12345678");
        } catch (Exception e) { 
        
        System.out.println("Error de conexión");
        System.out.println(e.getMessage());
        }
    
    }
    
    public boolean isConnected()
    {
        return conexionBD != null;
    }
    
    public void CargarDatosUsuarios(ArrayList<Usuario> list)
    {
        ResultSet resultados = null; 
        try {
            String consulta;
            Statement s = conexionBD.createStatement();
            consulta = "SELECT *,\n" +
                        "(SELECT nombre FROM Personas WHERE idPersona = idPersonaU) AS nombre,\n" +
                        "(SELECT apellidos FROM Personas WHERE idPersona = idPersonaU) AS apellidos,\n" +
                        "(SELECT fechaNacimiento FROM Personas WHERE idPersona = idPersonaU) AS FechaNacimiento,\n" +
                        "(SELECT nombre FROM Clubes WHERE idClub = club) AS nclub\n" +
                        "FROM Usuarios"; 
            resultados = s.executeQuery(consulta);
            while (resultados.next())
            {
                String username = new String(resultados.getString("username"));
                String pass = new String(resultados.getString("password"));
                String nombre = new String(resultados.getString("nombre"));
                String apellidos = new String(resultados.getString("apellidos"));
                String fecha = new String(resultados.getString("FechaNacimiento"));
                String club = new String(resultados.getString("nclub"));
                Boolean admin = resultados.getBoolean("admin");
                int id = resultados.getInt("idUsuario");
                
                list.add(new Usuario(username,pass,nombre,apellidos,ConvertirFecha(fecha),club, admin, id));
                
                
                //System.out.println(nombre + " " + apellidos + " " + username + " " + pass + "  " + club);
            }
        } 
        catch (Exception e) 
        {
            System.out.println("Error en la petición a la BD (Usuarios)");
            System.out.println(e.getMessage());
        }
 
    }
    
    public void CargarDatosFederaciones(ArrayList<Federacion> list)
    {
        ResultSet resultados = null; 
        try {
            String consulta;
            Statement s = conexionBD.createStatement();
            consulta = "SELECT provincia FROM Federaciones"; 
            resultados = s.executeQuery(consulta);
            while (resultados.next())
            {
                String provincia = new String(resultados.getString("provincia"));
                list.add(new Federacion(provincia));
            }
        } 
        catch (Exception e) 
        {
            System.out.println("Error en la petición a la BD");
            System.out.println(e.getMessage());
        }
    }
    
    public void CargarDatosClubes(ArrayList<Federacion> list, ArrayList<Usuario> list2)
    {
        ResultSet resultados = null;
        try {
            String consulta;
            Statement s = conexionBD.createStatement();
            consulta = "SELECT *, \n" +
                        "(SELECT nombre FROM Personas WHERE idPersona = (SELECT idPersonaG FROM Gerentes WHERE idGerente = idGerenteC)) AS nombreGerente,\n" +
                        "(SELECT apellidos FROM Personas WHERE idPersona = (SELECT idPersonaG FROM Gerentes WHERE idGerente = idGerenteC)) AS apellidosGerente,\n" +
                        "(SELECT irpf FROM Gerentes WHERE idGerente = idGerenteC) AS irpf,\n" +
                        "(SELECT nomina FROM Gerentes WHERE idGerente = idGerenteC) AS nomina,\n" +
                        "(SELECT nombre FROM Personas WHERE idPersona = (SELECT idPersonaE FROM Entrenadores WHERE idEntrenador = idEntrenadorC)) AS nombreEntrenador,\n" +
                        "(SELECT apellidos FROM Personas WHERE idPersona = (SELECT idPersonaE FROM Entrenadores WHERE idEntrenador = idEntrenadorC)) AS apellidosEntrenador\n" +
                        "FROM Clubes;"; 
            
            resultados = s.executeQuery(consulta);
            while (resultados.next())
            {
                String nombre = new String(resultados.getString("nombre"));
                int nfederacion = resultados.getInt("idFederacionC");
                String nombreGerente = new String(resultados.getString("nombreGerente"));
                String apellidosGerente = new String(resultados.getString("apellidosGerente"));
                int irpf = resultados.getInt("irpf");
                int nomina = resultados.getInt("nomina");
                String nombreEntrenador = new String(resultados.getString("nombreEntrenador"));
                String apellidosEntrenador = new String(resultados.getString("apellidosEntrenador"));
                String sede = new String(resultados.getString("sede"));
                int idClub = resultados.getInt("idClub");
                Club club = new Club(nombre,nombreGerente,apellidosGerente,nomina,irpf,nombreEntrenador, apellidosEntrenador,sede);
                
                list.get(nfederacion).getClubesList().add(club);
                
                for(int j = 0; j < list2.size();j++)
                {
                    if (club.getNombre().equals(list2.get(j).getClub()))
                    {
                        club.addJugador(list2.get(j));
                    }

                    if(list2.get(j).getUltimoPago().compareTo(new Date(120,0,1)) == -1)
                    {
                        list2.get(j).setMoroso(true);
                    }
                }
            }
        } 
        catch (Exception e) 
        {
            System.out.println("Error en la petición a la BD (Clubes)");
            System.out.println(e.getMessage());
        }
        
    }

    public void CargarTorneos(ArrayList<Torneo> list, ArrayList<Federacion> list2)
    {
        ResultSet resultados = null; 
        try {
            String consulta;
            Statement s = conexionBD.createStatement();
            consulta = "SELECT * FROM Torneos;"; 
            resultados = s.executeQuery(consulta);
            while (resultados.next())
            {
                int idFederacion = resultados.getInt("idFederacion");
                String nombre = new String(resultados.getString("nombre"));
                Boolean inscripcion = resultados.getBoolean("inscripcionAbierta");
                int nJugadores = resultados.getInt("numJugadores");
                
                list.add(new Torneo(nombre, list2.get(idFederacion),nJugadores,inscripcion));
            }
        } 
        catch (Exception e) 
        {
            System.out.println("Error en la petición a la BD (Torneos)");
            System.out.println(e.getMessage());
        }
    }
    
    public Date ConvertirFecha(String _fecha)
    {
        int dia = Integer.parseInt(_fecha.substring(0, 2));
        int mes = Integer.parseInt(_fecha.substring(3, 5))-1;
        int anyo = Integer.parseInt(_fecha.substring(6, 10))-1900;      
        Date fecha = new Date(anyo,mes,dia); 
        
        return fecha;
    }
    
    public String ConvertirFecha(Date fecha)
    {
        String dia = new String("");
        String mes = new String("");
        String anyo = new String("");
        
        dia = Integer.toString(fecha.getDate());
        mes = Integer.toString(fecha.getMonth() + 1);
        anyo = Integer.toString(fecha.getYear() + 1900);
        
        return dia+"/"+mes+"/"+anyo;
    }
    
    public int RegistrarUsuario(String nombre, String apellidos, Date fecha, String categoria,String usuario, String pass, String club)
    {
        ResultSet resultados2 = null;
        int id = 0;
        
        try {
            Statement s = conexionBD.createStatement();
            System.out.println("CLUB: " + club);
            String con = "call LigaAjedrezBD.AñadirUsuario('" + nombre + "','" + apellidos + "','" + ConvertirFecha(fecha) + "','" + categoria + "','" + club + "','" + usuario + "','" + pass + "');";
            PreparedStatement preparedStmt = conexionBD.prepareStatement(con); 
            preparedStmt.executeUpdate();
        }
        catch(Exception e)
        {
            System.out.println("No se ha completado la operación de AÑADIR USUARIO");
            System.out.println(e.getMessage());
        }
        
        return SelectId(usuario);
    }
    
    public int SelectId(String usu)
    {
        int id = 0;
        ResultSet resultados = null; 
        try {
            String consulta;
            Statement s = conexionBD.createStatement();
            consulta = "SELECT idUsuario FROM Usuarios WHERE username = '" + usu + "';"; 
            resultados = s.executeQuery(consulta);
            while (resultados.next())
            {
                id = resultados.getInt("idUsuario");
            }
        } 
        catch (Exception e) 
        {
            System.out.println("Error en la petición a la BD (Select Usuario)");
            System.out.println(e.getMessage());
        }
        
        return id;
    }
    
    public void RegistrarEntrenador(String nombre, String apellidos, Date fecha, String club)
    {
        ResultSet resultados2 = null; 
        try {
            Statement s = conexionBD.createStatement();
            String con = "call LigaAjedrezBD.AñadirEntrenador('" + nombre + "','" + apellidos + "','" + ConvertirFecha(fecha) + "','" + club + "');";
            System.out.println(con);
            PreparedStatement preparedStmt = conexionBD.prepareStatement(con); 
            preparedStmt.executeUpdate();
        }
        catch(Exception e)
        {
            System.out.println("No se ha completado la operación de AÑADIR ENTRENADOR");
            System.out.println(e.getMessage());
        }
 
    }
    
    public void RegistrarGerente(String nombre, String apellidos, String fecha, String club, int irpf, int nomina)
    {
        ResultSet resultados2 = null; 
        try {
            Statement s = conexionBD.createStatement();
            String con = "call LigaAjedrezBD.AñadirGerente('" + nombre + "','" + apellidos + "','" + fecha + "','" + club + "','" + irpf + "','" + nomina+ "');";
            System.out.println(con);
            PreparedStatement preparedStmt = conexionBD.prepareStatement(con); 
            preparedStmt.executeUpdate();
        }
        catch(Exception e)
        {
            System.out.println("No se ha completado la operación de AÑADIR Gerente");
            System.out.println(e.getMessage());
        }
 
    }
    
    public void CambiarJugadorClub(int id, String club)
    {
       ResultSet resultados = null; 
        try {
            Statement s = conexionBD.createStatement();
            String con = "call LigaAjedrezBD.CambiarJugadorClub('" + id + "','" + club + "');";
            System.out.println(con);
            PreparedStatement preparedStmt = conexionBD.prepareStatement(con); 
            preparedStmt.executeUpdate();
        }
        catch(Exception e)
        {
            System.out.println("No se ha completado la operación de Cambiar Club");
            System.out.println(e.getMessage());
        }
    }
    
}
