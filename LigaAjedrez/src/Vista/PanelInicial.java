/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author enrique
 */
public class PanelInicial extends JPanel {
    
    private JLabel usuario;
    private JLabel password;
    private JLabel socioInfo;
    private JButton buttonRegistrarse;
    
    public PanelInicial()
    {
        
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        usuario = new JLabel("Usuario");
        password = new JLabel("Contraseña");
        socioInfo = new JLabel("¿Aún no eres socio?");
        
        buttonRegistrarse = new JButton("Registrarse");
        buttonRegistrarse.setActionCommand("siguiente");
        
        this.add(usuario);
        this.add(password);
        this.add(buttonRegistrarse);
        
        this.setVisible(true);
    }
}
