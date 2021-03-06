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
import DAO.LigaAjedrezDAO;
import Fachada.FachadaUsuario;
import Factoria.FactoriaPersonas;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Date;

/**
 *
 * @author enrique
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio2
     */
    public Inicio() {
        initComponents();
        
        ligaAjedrezDAO = new LigaAjedrezDAO();
        System.out.println("Conexion:" + ligaAjedrezDAO.isConnected());
        
        fachada = new FachadaUsuario();
        fac = new FactoriaPersonas();
        
        ligaAjedrezDAO.CargarDatosUsuarios(usersList);
        ligaAjedrezDAO.CargarDatosFederaciones(federacionesList);
        ligaAjedrezDAO.CargarDatosClubes(federacionesList, usersList);
        ligaAjedrezDAO.CargarTorneos(torneosList, federacionesList);
       
        for(int j = 0; j < torneosList.size();j++)
        {
            torneosList.get(j).Iniciar();
        }
        
        //IMPORTANTE PASAR ESTOS DATOS LO ÚLTIMO
        menuAdmin = new MenuAdmin(this);
        menuUsuario = new MenuUsuario(this);
        registroUsuario = new RegistroUsuario(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        passwordText = new javax.swing.JPasswordField();
        usuarioText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Registrarse = new javax.swing.JButton();
        IniciarSesion = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Usuario:");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("Contraseña:");

        passwordText.setToolTipText("Contraseña");

        usuarioText.setToolTipText("Usuario");

        jLabel3.setText("¿Aún no eres socio?");

        Registrarse.setText("Regístrate");
        Registrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrarseMouseClicked(evt);
            }
        });

        IniciarSesion.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        IniciarSesion.setText("Iniciar sesión");
        IniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IniciarSesionMouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoLiga.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Registrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(172, 172, 172)
                                        .addComponent(jLabel4))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(usuarioText, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(IniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuarioText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IniciarSesion)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Registrarse))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarseMouseClicked
        this.setVisible(false);
        registroUsuario.setFederaciones(federacionesList);
        registroUsuario.setUsuariosList(usersList);
        registroUsuario.setTorneos(torneosList);
        registroUsuario.setVisible(true);
    }//GEN-LAST:event_RegistrarseMouseClicked

    private void IniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IniciarSesionMouseClicked
        
        if(ComprobarDatosUser())
        {
            this.setVisible(false);
            menuUsuario.setFederaciones(federacionesList);
            menuUsuario.setTorneos(torneosList);
            menuUsuario.setUsuario(fachada.getUsuario());
            menuUsuario.setClub(club);
            menuUsuario.setLabels();
            menuUsuario.setVisible(true);
        }
        else if(ComprobarDatosAdmin())
        {
            this.setVisible(false);
            menuAdmin.setFederaciones(federacionesList);
            menuAdmin.setTorneos(torneosList);
            menuAdmin.setUsuario(fachada.getUsuario());
            menuAdmin.setClub(club);
            menuAdmin.setLabels();
            menuAdmin.setVisible(true);
        }
        else
            JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
            
    }//GEN-LAST:event_IniciarSesionMouseClicked

    private boolean ComprobarDatosUser()
    {
        boolean encontrado = false;
        
        user = new String(usuarioText.getText());
        arrayC = passwordText.getPassword(); 
        pass = new String(arrayC);
                
            for(int j = 0; j < usersList.size();j++)
            {
                if(!usersList.get(j).isAdmin())
                if(usersList.get(j).getUsername().equals(user))
                    if(usersList.get(j).getPassword().equals(pass))
                    {
                        fachada.setUsuario(usersList.get(j));
                        setClub();
                        encontrado = true;
                    }
            }     
        
        return encontrado;
    }
    
    private boolean ComprobarDatosAdmin()
    {
        boolean encontrado = false;
        
        user = new String(usuarioText.getText());
        arrayC = passwordText.getPassword(); 
        pass = new String(arrayC);
        
        for(int j = 0; j < usersList.size();j++)
            {
                if(usersList.get(j).isAdmin())
                if(usersList.get(j).getUsername().equals(user))
                    if(usersList.get(j).getPassword().equals(pass))
                    {
                        fachada.setUsuario(usersList.get(j));
                        setClub();
                        encontrado = true;
                    }
            } 
        
        return encontrado;
    }
    
    
    public ArrayList<Federacion> getFederaciones()
    {
        return federacionesList;
    }
    
    public MenuUsuario getMenuUsuario()
    {
        return menuUsuario;
    }
    
    public void setUsuario(Usuario usu)
    {
        fachada.setUsuario(usu);
    }
    
    public void eliminarUsuario(Usuario usu)
    {
        usersList.remove(usu);
    }
    
    public Usuario getUsuario()
    {
        return fachada.getUsuario();
    }
    public void setFederaciones(ArrayList<Federacion> federaciones)
    {
        federacionesList = federaciones;
    }
    
    public void setTorneos(ArrayList<Torneo> torneos)
    {
        torneosList = torneos;
    }
    
    public void setUsuariosList(ArrayList<Usuario> list)
    {
        usersList = list;
    }
    
    public void setClub()
    {
        for(int i = 0; i < federacionesList.size(); i++)
            for(int j = 0; j < federacionesList.get(i).getClubesList().size(); j++)
            {
                if(federacionesList.get(i).getClubesList().get(j).getJugadoresList().contains(fachada.getUsuario()))
                {
                    club = federacionesList.get(i).getClubesList().get(j);
                }
            }
    }
    
    public void setLabels()
    {
        usuarioText.setText("");
        passwordText.setText("");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton IniciarSesion;
    private javax.swing.JButton Registrarse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JTextField usuarioText;
    // End of variables declaration//GEN-END:variables
    private MenuAdmin menuAdmin;
    private MenuUsuario menuUsuario;
    private RegistroUsuario registroUsuario;
    private LigaAjedrezDAO ligaAjedrezDAO;
    private FactoriaPersonas fac;
    private char[] arrayC;
    private String user;
    private String pass;
    private FachadaUsuario fachada;
    private Usuario usuario;
    private Club club;
    private ArrayList<Usuario> usersList = new ArrayList<Usuario>();
    private ArrayList<Federacion> federacionesList = new ArrayList<Federacion>();
    private ArrayList<Torneo> torneosList = new ArrayList<Torneo>();
}
