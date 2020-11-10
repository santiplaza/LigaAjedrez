/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.text.DateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

/**
 *
 * @author enrique
 */
public class Persona {
    private String nombre;
    private String apellidos;
    private Date fechaNacimiento;
    
    Persona()
    {
        this.nombre = new String ("Default");
        this.apellidos = new String(" Default  Default");
        this.fechaNacimiento = new Date(99,4,1);
    }
    
    Persona(String _nombre, String _apellidos, Date _fecha)
    {
        this.nombre = new String (_nombre);
        this.apellidos = new String (_apellidos);
        this.fechaNacimiento = _fecha;
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
      
}
