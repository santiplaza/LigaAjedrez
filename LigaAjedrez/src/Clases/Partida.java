/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author enrique
 */
public class Partida {
    
    private Usuario jugador1;
    private Usuario jugador2;
    private int puntos1;
    private int puntos2;
    private String sede;
    private boolean finalizada;
    private boolean configurada;
    
    public Partida()
    {
        this.jugador1 = new Usuario();
        this.jugador2 = new Usuario();
        this.puntos1 = 0;
        this.puntos2 = 0;
        this.finalizada = false;
        this.configurada = false;
        this.sede = new String("Por definir");
    }
    

    public Usuario getJugador1() {
        return jugador1;
    }

    public void setJugador1(Usuario jugador1) {
        this.jugador1 = jugador1;
    }

    public Usuario getJugador2() {
        return jugador2;
    }

    public void setJugador2(Usuario jugador2) {
        this.jugador2 = jugador2;
    }

    public int getPuntos1() {
        return puntos1;
    }

    public void setPuntos1(int puntos1) {
        this.puntos1 = puntos1;
    }

    public int getPuntos2() {
        return puntos2;
    }

    public void setPuntos2(int puntos2) {
        this.puntos2 = puntos2;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

    public boolean isConfigurada() {
        return configurada;
    }

    public void setConfigurada(boolean configurada) {
        this.configurada = configurada;
    }
    
    public Usuario ganador()
    {
        if(puntos1 > puntos2)
            return jugador1;
        else if (puntos2 > puntos1)
            return jugador2;
        else
            return jugador1;
    }
    
    public void VerPartida()
    {
        System.out.println(jugador1.getNombre()+ ": " + puntos1);
        System.out.println(jugador2.getNombre()+ ": " + puntos2);
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }
}
