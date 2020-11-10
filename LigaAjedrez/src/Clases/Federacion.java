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
public class Federacion {
    String provincia;
    private ArrayList<Club> clubesList;
    
    public Federacion()
    {
        this.provincia = new String ("Default");
        this.clubesList = new ArrayList<Club>();
    }
    
    public Federacion(String _provincia)
    {
        this.provincia = _provincia;
        this.clubesList = new ArrayList<Club>();
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public ArrayList<Club> getClubesList() {
        return clubesList;
    }

    public void setClubesList(ArrayList<Club> clubesList) {
        this.clubesList = clubesList;
    }
    
}

