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
public class Entrenador extends Persona{
    
    private ArrayList<String> club;
    private ArrayList<Reserva> reservas;
    private boolean existe;
    
    Entrenador()
    {
        super();
        
        this.club = new ArrayList<String>();
        this.reservas = new ArrayList<Reserva>();
        this.existe = true;
        club.add(new String("default"));
    }
    
    Entrenador(String _nombre, String _apellidos, String _club)
    {
        super(_nombre,_apellidos,new Date(99,4,1));
        
        this.club = new ArrayList<String>();
        this.reservas = new ArrayList<Reserva>();
        this.existe = true;
        club.add(new String(_club));
    }

    
    public void borrarDatos()
    {
        this.setNombre("Este club no dispone de entrenador");
        this.setApellidos("");
        this.setFechaNacimiento(new Date(0,0,0));
        club.clear();
        existe = false;
        System.out.println("**********LLAMADA BORRAR***********");
    }

    public ArrayList<String> getClub() {
        return club;
    }

    public void setClub(ArrayList<String> club) {
        this.club = club;
    }
    
    public boolean isExiste() {
        return existe;
    }

    public void setExiste(boolean existe) {
        this.existe = existe;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }
    
    
    
}
