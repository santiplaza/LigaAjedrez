/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author enrique
 */
public class Club {
    
    private String nombre;
    private Gerente gerente;
    private Entrenador entrenador;
    private ArrayList<Usuario> jugadoresList;
    private String sede;

    public Club() 
    {
        this.nombre = new String ("clubDefault");
        this.gerente = new Gerente();
        this.entrenador = new Entrenador("entrenador1Default", "Default", "clubDefault");
        this.jugadoresList = new ArrayList<Usuario>();
        this.sede = new String("Default");
    }
    
    public Club(String _nombre) 
    {
        this.nombre = new String (_nombre);
        this.gerente = new Gerente();
        this.entrenador = new Entrenador("entrenador1Default", "Default", "clubDefault");
        this.jugadoresList = new ArrayList<Usuario>();
        this.sede = new String("Default");
    }
    
        public Club(String _nombre,String nombreGerente, String apellidoGerente, int _nomina, int _irpf, String nombreEntrenador,String apellidoEntrenador, String _sede) 
    {
        this.nombre = new String (_nombre);
        this.gerente = new Gerente(nombreGerente, apellidoGerente, _nombre, _nomina, _irpf);
        this.entrenador = new Entrenador(nombreEntrenador, apellidoEntrenador, _nombre);
        this.jugadoresList = new ArrayList<Usuario>();
        this.sede = new String("Sede " + _sede);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
        this.gerente.setClub(this.nombre);
        System.out.println("**********LLAMADA SET***********");
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public ArrayList<Usuario> getJugadoresList() {
        return jugadoresList;
    }

    public void setJugadoresList(ArrayList<Usuario> jugadoresList) {
        this.jugadoresList = jugadoresList;
    }
    
    public void addJugador(Usuario jugador)
    {
        this.jugadoresList.add(jugador);
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    } 
}
