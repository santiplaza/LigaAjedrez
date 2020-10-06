/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author enrique
 */
public class PanelInicial extends JPanel {
    
    private JLabel label;
    private JButton buttonRegistrarse;
    
    public PanelInicial()
    {
        label = new JLabel("Usuario");
        buttonRegistrarse = new JButton("Registrarse");
        
        this.add(label);
        
        this.setVisible(true);
    }
}
