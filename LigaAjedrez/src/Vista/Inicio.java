/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JFrame;

/**
 *
 * @author enrique
 */
public class Inicio extends JFrame{
    
    private PanelInicial panelInicial;
    
    public Inicio(){
    
        super("Inicial");
        this.setSize(400,600);
        
        
        panelInicial = new PanelInicial();
        add(panelInicial);
        
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
}
