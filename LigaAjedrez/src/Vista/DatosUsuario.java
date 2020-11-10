/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Clases.Usuario;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author enrique
 */
public class DatosUsuario extends javax.swing.JFrame {

    /**
     * Creates new form DatosUsuario
     */
    public DatosUsuario(MenuUsuario menuUsuario) {
        initComponents();
        this.menuUsuario = menuUsuario;
        this.datosResponsable = new DatosResponsable(this);
        this.registrarResponsable = new RegistrarResponsableInfantil(this);
        this.admin = false;
        
        datosResponsableButton.setVisible(false);
        nuevaContraseñaLabel.setVisible(false);
        nuevaContraseñaField.setVisible(false);
        Confirmar.setVisible(false);
        ExitoLabel.setVisible(false);
    }
    public DatosUsuario(MenuAdmin menuAdmin) {
        initComponents();
        this.menuAdmin = menuAdmin;
        this.datosResponsable = new DatosResponsable(this);
        this.registrarResponsable = new RegistrarResponsableInfantil(this);
        this.admin = true;
        
        datosResponsableButton.setVisible(false);
        nuevaContraseñaLabel.setVisible(false);
        nuevaContraseñaField.setVisible(false);
        Confirmar.setVisible(false);
        ExitoLabel.setVisible(false);
        this.noRegistrado = false;
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
        CambiarContraseña = new javax.swing.JButton();
        datosResponsableButton = new javax.swing.JButton();
        jLabel0 = new javax.swing.JLabel();
        categoriaUsuario = new javax.swing.JLabel();
        nuevaContraseñaLabel = new javax.swing.JLabel();
        nombreUsuario = new javax.swing.JLabel();
        apellidosUsuario = new javax.swing.JLabel();
        fechaUsuario = new javax.swing.JLabel();
        nuevaContraseñaField = new javax.swing.JPasswordField();
        Confirmar = new javax.swing.JButton();
        Volver = new javax.swing.JButton();
        ExitoLabel = new javax.swing.JLabel();
        historicoJList = new java.awt.List();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pagoLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        eloLabel = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel2.setText("Apellidos:");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel3.setText("Fecha de nacimento:");

        CambiarContraseña.setText("Cambiar contraseña");
        CambiarContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CambiarContraseñaMouseClicked(evt);
            }
        });

        datosResponsableButton.setText("Datos del responsable");
        datosResponsableButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                datosResponsableButtonMouseClicked(evt);
            }
        });

        jLabel0.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel0.setText("Categoria:");

        categoriaUsuario.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        categoriaUsuario.setText("jLabel5");

        nuevaContraseñaLabel.setText("Nueva contraseña:");

        nombreUsuario.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        nombreUsuario.setText("jLabel7");

        apellidosUsuario.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        apellidosUsuario.setText("jLabel7");

        fechaUsuario.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        fechaUsuario.setText("jLabel7");

        Confirmar.setText("Confirmar");
        Confirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConfirmarMouseClicked(evt);
            }
        });

        Volver.setText("Volver");
        Volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VolverMouseClicked(evt);
            }
        });

        ExitoLabel.setText("Contraseña cambiada con éxito!");

        jLabel4.setText("Histórico de clubes:");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel5.setText("Última fecha pago:");

        pagoLabel.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        pagoLabel.setText("jLabel6");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel6.setText("ELO:");

        eloLabel.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        eloLabel.setText("jLabel7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(nuevaContraseñaLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nuevaContraseñaField, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Confirmar))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Volver)))
                        .addGap(0, 179, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CambiarContraseña)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nombreUsuario)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel0)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel6)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(eloLabel)
                                            .addComponent(categoriaUsuario))
                                        .addGap(19, 19, 19))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18)
                                                .addComponent(apellidosUsuario))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(pagoLabel)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(historicoJList, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fechaUsuario)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(datosResponsableButton)))))
                        .addGap(15, 15, 15)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ExitoLabel)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nombreUsuario))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel0)
                            .addComponent(categoriaUsuario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(eloLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apellidosUsuario))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(fechaUsuario))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pagoLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CambiarContraseña)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ExitoLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(historicoJList, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(datosResponsableButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevaContraseñaLabel)
                    .addComponent(nuevaContraseñaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Confirmar))
                .addGap(18, 18, 18)
                .addComponent(Volver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void datosResponsableButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datosResponsableButtonMouseClicked
        
        if(noRegistrado == true)
        {
            datosResponsable.setVisible(true);
            datosResponsable.setUsuario(usuario);
            datosResponsable.setLabels();
        }
        else
        {
            registrarResponsable.setVisible(true);
            registrarResponsable.setUsuario(usuario);
            noRegistrado = true;
        }
        
    }//GEN-LAST:event_datosResponsableButtonMouseClicked

    private void CambiarContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CambiarContraseñaMouseClicked
        nuevaContraseñaLabel.setVisible(true);
        nuevaContraseñaField.setVisible(true);
        Confirmar.setVisible(true);
    }//GEN-LAST:event_CambiarContraseñaMouseClicked

    private void VolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverMouseClicked
        this.setVisible(false);
        if (admin)
            menuAdmin.setVisible(true);
        else
            menuUsuario.setVisible(true);
    }//GEN-LAST:event_VolverMouseClicked

    private void ConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmarMouseClicked
        arrayC = nuevaContraseñaField.getPassword(); 
        pass = new String(arrayC);
        if(admin)
        {
            usuario.setPassword(pass);
            menuAdmin.setUsuario(usuario);
        }
        else
        {
            usuario.setPassword(pass);
            menuUsuario.setUsuario(usuario);
        }
        
        nuevaContraseñaLabel.setVisible(false);
        nuevaContraseñaField.setVisible(false);
        ExitoLabel.setVisible(true);
        Confirmar.setVisible(false);
    }//GEN-LAST:event_ConfirmarMouseClicked

    public void setUsuario(Usuario usu)
    {
        usuario = usu;
    }
    
    public void setLabels ()
    {
        nombreUsuario.setText(usuario.getNombre());
        apellidosUsuario.setText(usuario.getApellidos());
        fechaUsuario.setText(ConvertirFecha(usuario.getFechaNacimiento()));
        categoriaUsuario.setText(usuario.getCategoria());
        eloLabel.setText(String.valueOf(usuario.getELO()));
        if(!usuario.isMoroso())
            pagoLabel.setText(ConvertirFecha(usuario.getUltimoPago()));
        else
            pagoLabel.setText(ConvertirFecha(usuario.getUltimoPago()) + " (Pago pendiente)");
        
        if(usuario.getCategoria().equals("Infantil") && usuario.getResponsable().getNombre().equals("Default"))
        {
            datosResponsableButton.setText("Añadir responsable");
            datosResponsableButton.setVisible(true);
        }
        else
        {
            datosResponsableButton.setText("Consultar responsable");
        }
        
        historicoJList.removeAll();
        for (int i = 0; i < usuario.getHistorico().size(); i++)
        {
                historicoJList.add(usuario.getHistorico().get(i), i);
        }
    }
    
    public String ConvertirFecha(Date fecha)
    {
        String dia = new String("");
        String mes = new String("");
        String anyo = new String("");
        
        dia = Integer.toString(fecha.getDate());
        mes = Integer.toString(fecha.getMonth() + 1);
        anyo = Integer.toString(fecha.getYear() + 1900);
        
        return dia+"/"+mes+"/"+anyo;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CambiarContraseña;
    private javax.swing.JButton Confirmar;
    private javax.swing.JLabel ExitoLabel;
    private javax.swing.JButton Volver;
    private javax.swing.JLabel apellidosUsuario;
    private javax.swing.JLabel categoriaUsuario;
    private javax.swing.JButton datosResponsableButton;
    private javax.swing.JLabel eloLabel;
    private javax.swing.JLabel fechaUsuario;
    private java.awt.List historicoJList;
    private javax.swing.JLabel jLabel0;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel nombreUsuario;
    private javax.swing.JPasswordField nuevaContraseñaField;
    private javax.swing.JLabel nuevaContraseñaLabel;
    private javax.swing.JLabel pagoLabel;
    // End of variables declaration//GEN-END:variables
    private MenuUsuario menuUsuario;
    private MenuAdmin menuAdmin;
    private boolean admin = false;
    private DatosResponsable datosResponsable;
    private RegistrarResponsableInfantil registrarResponsable;
    private Usuario usuario;
    private char[] arrayC;
    private String pass;
    boolean noRegistrado;
}
