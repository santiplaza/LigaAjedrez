/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fachada;

import Clases.Persona;
import Clases.Usuario;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author enrique
 * ***************************
 * La fachada esta implementada en Inicio y durante todo el proceso de registro de un jugador.
 * También se utiliza en VerDatos
 * *******************************
 */
public class FachadaUsuario {
    
    private Usuario usuario;
    
    public FachadaUsuario()
    {
        usuario = new Usuario();
    }
    
    
    public void setUsuario(Usuario usu)
    {
        this.usuario = usu;
    }
    
    public Usuario getUsuario()
    {
        return usuario;
    }
    
    public void setPassword(String pass)
    {
        usuario.setPassword(pass);
    }
    
    public String getPassword()
    {
        return usuario.getPassword();
    }
    
    public String getNombre()
    {
        return usuario.getNombre();
    }
    
    public String getApellidos()
    {
        return usuario.getApellidos();
    }
    
    public Date getFechaNacimiento()
    {
        return usuario.getFechaNacimiento();
    }
    
    public String getCategoria()
    {
        return usuario.getCategoria();
    }
    
    public int getELO()
    {
        return usuario.getELO();
    }
    
    public boolean isMoroso()
    {
        return usuario.isMoroso();
    }
    
    public boolean isAdmin()
    {
        return usuario.isAdmin();
    }
    
    public Date getUltimoPago()
    {
        return usuario.getUltimoPago();
    }
    
    public Persona getResponsable()
    {
        return usuario.getResponsable();
    }
    
     public ArrayList<String> getHistorico() {
        return usuario.getHistorico();
    }
    
    public void addELO(int _ELO) {
        usuario.addELO(_ELO);
    }
    
    public void setELO(int _ELO) {
        usuario.setELO(_ELO);
    }
    
    public String getId() {
        return usuario.getUsername();
    }
    
    public void setClub(String _club) {
        usuario.setClub(_club);
    }
}
