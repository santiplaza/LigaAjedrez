/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Clases.Persona;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author enrique
 */
public class Usuario extends Persona{
    
    private String id;
    private String password;
    private String categoria;
    private String club;
    private Date ultimoPago;
    private ArrayList<String> historico;
    private boolean moroso;
    private boolean admin;
    private Persona responsable;
    
    public Usuario()
    {
        super();
        this.id = new String ("userDefault");
        this.password = new String ("default");
        this.categoria = new String ("default");
        this.club = new String ("Mi club ");
        this.ultimoPago = new Date(119,1,7);
        historico = new ArrayList<String>();
        this.moroso = false;
        this.admin = true;
        
        historico.add(new String("default"));
    }
    
    public Usuario(String _id, String _password, String _nombre, String _apellidos, Date _fecha, String _club, boolean _admin)
    {
        super(_nombre,_apellidos,_fecha);
        this.id = new String (_id);
        this.password = new String (_password);
        this.club = new String (_club);
        this.ultimoPago = new Date(120,0,15);;
        historico = new ArrayList<String>();
        this.moroso = false;
        this.admin = _admin;
        
        if(this.getFechaNacimiento().compareTo(new Date(101,0,0)) == -1)
            this.categoria = new String("Senior");
        else if(this.getFechaNacimiento().compareTo(new Date(102,0,0)) == -1 && this.getFechaNacimiento().compareTo(new Date(104,0,0)) == 1)
            this.categoria = new String("Junior");
        else
        {
            this.categoria = new String("Infantil");
            this.responsable = new Persona();
        }
            
            
        
        historico.add(new String(_club));
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

    public Date getUltimoPago() {
        return ultimoPago;
    }

    public void setUltimoPago(Date ultimoPago) {
        this.ultimoPago = ultimoPago;
    }

    public boolean isMoroso() {
        return moroso;
    }

    public void setMoroso(boolean moroso) {
        this.moroso = moroso;
    }

    public ArrayList<String> getHistorico() {
        return historico;
    }

    public void setHistorico(ArrayList<String> historico) {
        this.historico = historico;
    }

    public Persona getResponsable() {
        return responsable;
    }

    public void setResponsable(Persona responsable) {
        this.responsable = responsable;
    }
    
    
    
}
