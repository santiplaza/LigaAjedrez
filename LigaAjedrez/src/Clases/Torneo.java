/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author enrique
 */
public class Torneo{
    
    private String nombre;
    private ArrayList<Usuario> jugadoresList;
    private boolean inscripcionAbierta;
    private ArrayList<Partida> partidasList;
    private int numJugadores;
    private boolean finalizado;
    private Federacion federacion;
    
    public Torneo()
    {
        this.nombre = new String("default");
        this.jugadoresList = new ArrayList<Usuario>();
        this.partidasList = new ArrayList<Partida>();
        this.inscripcionAbierta = true;
        this.numJugadores = 0;
        this.finalizado = false;
        this.federacion = new Federacion();
    }
    
    public Torneo(String _nombre, Federacion _federacion, int _num, boolean _inscripcion)
    {
        this.nombre = new String (_nombre);
        this.federacion = _federacion;
        this.jugadoresList = new ArrayList<Usuario>();
        this.partidasList = new ArrayList<Partida>();
        this.inscripcionAbierta = _inscripcion;
        this.numJugadores = _num;
        this.finalizado = false;
        
        for (int i = 0; i < numJugadores-1; i++)
        {
            
            partidasList.add(new Partida());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Usuario> getJugadoresList() {
        return jugadoresList;
    }

    public void setJugadoresList(ArrayList<Usuario> jugadoresList) {
        this.jugadoresList = jugadoresList;
    }

    public boolean isInscripcionAbierta() {
        return inscripcionAbierta;
    }

    public void setInscripcionAbierta(boolean inscripcionAbierta) {
        this.inscripcionAbierta = inscripcionAbierta;
    }

    public ArrayList<Partida> getPartidasList() {
        return partidasList;
    }

    public void setPartidasList(ArrayList<Partida> partidasList) {
        this.partidasList = partidasList;
    } 

    public int getNumJugadores() {
        return numJugadores;
    }

    public void setNumJugadores(int numJugadores) {
        this.numJugadores = numJugadores;
    }
    
    public void Iniciar()
    {
        if(jugadoresList.size() == numJugadores)
        {
            for (int i = 0; i < (numJugadores/2); i++)
            {
                    partidasList.get(i).setJugador1(jugadoresList.get(i));
                    System.out.println(jugadoresList.get(i).getNombre());
                    partidasList.get(i).setJugador2(jugadoresList.get((numJugadores-1)-i));
                    System.out.println(jugadoresList.get((numJugadores-1)-i).getNombre());
                    partidasList.get(i).setConfigurada(true);
            }
            
            this.setInscripcionAbierta(false);
        }
        else
            System.out.println("No iniciado");
        
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    public Federacion getFederacion() {
        return federacion;
    }

    public void setFederacion(Federacion federacion) {
        this.federacion = federacion;
    }
    
    public void VerTorneo()
    {
        for(int i = 0; i < partidasList.size(); i++)
        {
            partidasList.get(i).VerPartida();
        }
    }
}
