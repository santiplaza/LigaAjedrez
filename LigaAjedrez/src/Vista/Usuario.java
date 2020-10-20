/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.util.Date;

/**
 *
 * @author enrique
 */
public class Usuario {
    
    private String id;
    private String password;
    private String nombre;
    private String apellidos;
    private Date fechaNacimiento;
    private String categoria;
    private String club;
    private boolean admin;
    
    public Usuario()
    {
        this.id = new String ("userDefault");
        this.password = new String ("default");
        this.nombre = new String ("Default");
        this.apellidos = new String(" Default  Default");
        this.fechaNacimiento = new Date(99,4,1);
        this.categoria = new String ("default");
        this.club = new String ("Mi club ");
        this.admin = true;
    }
    
    public Usuario(String _id, String _password, String _nombre, String _apellidos, Date _fecha, String _categoria, String _club, boolean _admin)
    {
        this.id = new String (_id);
        this.password = new String (_password);
        this.nombre = new String (_nombre);
        this.apellidos = new String(_apellidos);
        this.fechaNacimiento = _fecha;
        this.categoria = _categoria;
        this.club = new String (_club);
        this.admin = _admin;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
    
    
}
