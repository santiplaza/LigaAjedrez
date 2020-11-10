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
public class Gerente extends Persona{
    
    private String club;
    private ArrayList<String> historico;
    private int nomina;
    private int irpf;
    private boolean existe;
    
  Gerente()
  {
      super();
      this.club = new String ("default");
      historico = new ArrayList<String>();
      this.nomina = 0;
      this.irpf = 0;
      this.existe = true;
      
      historico.add(new String("default"));
  }
  
  Gerente(String _nombre, String _apellidos, Date _fecha)
  {
      super(_nombre,_apellidos,_fecha);
      this.club = new String ("default");
      historico = new ArrayList<String>();
      this.nomina = 0;
      this.irpf = 0;
      this.existe = true;
      
      historico.add(new String("default"));
  }
  
  Gerente(String _nombre, String _apellidos, String _club, int _nomina, int _irpf)
  {
      super(_nombre,_apellidos,new Date(99,4,1));
      this.club = new String (_club);
      historico = new ArrayList<String>();
      this.nomina = _nomina;
      this.irpf = _irpf;
      this.existe = true;
      
      historico.add(new String(_club));
  }
  
  Gerente(String _club, int _nomina, int _irpf)
  {
      super();
      this.club = new String (_club);
      historico = new ArrayList<String>();
      this.nomina = _nomina;
      this.irpf = _irpf;
      this.existe = true;
      
      historico.add(new String(_club));
  }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public ArrayList<String> getHistorico() {
        return historico;
    }

    public void setHistorico(ArrayList<String> historico) {
        this.historico = historico;
    }

    public int getNomina() {
        return nomina;
    }

    public void setNomina(int nomina) {
        this.nomina = nomina;
    }

    public int getIrpf() {
        return irpf;
    }

    public void setIrpf(int irpf) {
        this.irpf = irpf;
    }

    public boolean isExiste() {
        return existe;
    }

    public void setExiste(boolean existe) {
        this.existe = existe;
    }
    
    public void borrarDatos()
    {
        this.setNombre("Este club no dispone de gerente");
        this.setApellidos("");
        this.setFechaNacimiento(new Date(0,0,0));
        this.club = "Sin club";
        nomina = 0;
        irpf = 0;
        historico.clear();
        existe = false;
        System.out.println("**********LLAMADA BORRAR***********");
    }
    
    public void verDatos(){
        System.out.println("Nombre: " + this.getNombre() + this.getApellidos());
        System.out.println("Club: " + this.getClub());
        System.out.println("Nomina: " + this.nomina);
        System.out.println("irpf: " + this.irpf);
        System.out.println("existe: " + this.existe);
        for (int i = 0; i < historico.size(); i++)
            {
                System.out.println("HISTORIAL GERENTE: " + historico.get(i));
            }
    }
    
    public void setDatos(String _nombre, String _apellidos, String _club, int _nomina, int _irpf, Date _fecha)
    {
        this.setNombre(_nombre);
        this.setApellidos(_apellidos);
        this.setFechaNacimiento(_fecha);
        this.club = _club;
        nomina = _nomina;
        irpf = _irpf;
        historico.add(_club);
        existe = true;
    }
    
    
}
