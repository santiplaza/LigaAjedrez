/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Clases.Usuario;
import Clases.Club;
import Clases.Federacion;
import Clases.Torneo;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author santi
 */
public class RegistroUsuario extends javax.swing.JFrame {

    /**
     * Creates new form panelRegistro2
     */
    public RegistroUsuario(Inicio inicio) {
        initComponents();
        this.inicio = inicio;
        this.elegirClub = new ElegirClub(this,inicio);     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NombreUser = new javax.swing.JTextField();
        ApellidosUser = new javax.swing.JTextField();
        FechaNacimientoUser = new javax.swing.JTextField();
        IdUser = new javax.swing.JTextField();
        Registrarse = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        ContraseñaUser = new javax.swing.JPasswordField();
        ContraseñaUser2 = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Apellidos:");

        jLabel3.setText("Nombre de usuario:");

        jLabel4.setText("Contraseña:");

        jLabel5.setText("Fecha de nacimiento:");

        Registrarse.setText("Registrarse y elegir club");
        Registrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrarseMouseClicked(evt);
            }
        });

        Cancelar.setText("Cancelar");
        Cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelarMouseClicked(evt);
            }
        });

        jLabel6.setText("Repite contraseña:");

        jLabel7.setText("Introduce la fecha como formato DD/MM/AAAA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Cancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Registrarse))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(71, 71, 71))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ApellidosUser)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(NombreUser)
                                        .addGap(23, 23, 23))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(FechaNacimientoUser, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IdUser, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(99, 99, 99))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ContraseñaUser, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ContraseñaUser2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ApellidosUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(FechaNacimientoUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(IdUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ContraseñaUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ContraseñaUser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancelar)
                    .addComponent(Registrarse))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarseMouseClicked

        arrayC = ContraseñaUser.getPassword(); 
        pass = new String(arrayC);
        arrayC = ContraseñaUser2.getPassword(); 
        pass2 = new String(arrayC);
        
        if(pass.equals(pass2))
        {
            if(ComprobarFormatoFecha(FechaNacimientoUser.getText()))
            {
                usuario = new Usuario(IdUser.getText(), pass, NombreUser.getText(), ApellidosUser.getText(), ConvertirFecha(FechaNacimientoUser.getText()), "null", false);
                elegirClub.setTorneos(torneosList);
                elegirClub.setUsuario(usuario);
                elegirClub.setFederaciones(federacionesList);
                elegirClub.setLabels();
                elegirClub.Iniciar();
                elegirClub.setUsuariosList(usersList);
                this.setVisible(false);
                elegirClub.setVisible(true);
            }
            
        }   
        else
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
        
    }//GEN-LAST:event_RegistrarseMouseClicked

    private void CancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelarMouseClicked
        this.setVisible(false);
        inicio.setVisible(true);
    }//GEN-LAST:event_CancelarMouseClicked

    public Date ConvertirFecha(String _fecha)
    {
        int dia = Integer.parseInt(_fecha.substring(0, 2));
        int mes = Integer.parseInt(_fecha.substring(3, 5))-1;
        int anyo = Integer.parseInt(_fecha.substring(6, 10))-1900;      
        Date fecha = new Date(anyo,mes,dia); 
        
        return fecha;
    }
    
    public boolean ComprobarFormatoFecha(String fecha)
    {
        boolean correcto = false;
        
        if(fecha.substring(2, 3).equals("/") && fecha.substring(5, 6).equals("/") && fecha.length() == 10)
        {
            int dia = Integer.parseInt(fecha.substring(0, 2));
            int mes = Integer.parseInt(fecha.substring(3, 5))-1;
            int anyo = Integer.parseInt(fecha.substring(6, 10))-1900;
            
            if((1 <= dia && 31 >= dia) && (0 <= mes && 11 >= mes))
                 correcto = true;
            else
                JOptionPane.showMessageDialog(null, "Introduce bien la fecha por favor");
        }
            
        else
            JOptionPane.showMessageDialog(null, "Introduce bien la fecha por favor");
        
        return correcto;
    }
    
    public void setUsuario(Usuario usu)
    {
        usuario = usu;
    }
    
    public void setTorneos(ArrayList<Torneo> torneos)
    {
        torneosList = torneos;
    }
    
    public void setFederaciones(ArrayList<Federacion> federaciones)
    {
        federacionesList = federaciones;
    }
    
    public void setUsuariosList(ArrayList<Usuario> list)
    {
        usersList = list;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApellidosUser;
    private javax.swing.JButton Cancelar;
    private javax.swing.JPasswordField ContraseñaUser;
    private javax.swing.JPasswordField ContraseñaUser2;
    private javax.swing.JTextField FechaNacimientoUser;
    private javax.swing.JTextField IdUser;
    private javax.swing.JTextField NombreUser;
    private javax.swing.JButton Registrarse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
    private Inicio inicio;
    private ElegirClub elegirClub;
    private Usuario usuario;
    private ArrayList<Federacion> federacionesList = new ArrayList<Federacion>();
    private ArrayList<Usuario> usersList = new ArrayList<Usuario>();
    private ArrayList<Torneo> torneosList = new ArrayList<Torneo>();
    private char[] arrayC;
    private String pass, pass2;
}
