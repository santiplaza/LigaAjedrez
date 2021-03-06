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
import Fachada.FachadaUsuario;
import java.util.ArrayList;

/**
 *
 * @author santi
 */
public class MenuUsuario extends javax.swing.JFrame {

    /**
     * Creates new form MenuUsuario
     */
    public MenuUsuario(Inicio inicio) {
        initComponents();
        this.inicio = inicio;
        this.datosClub = new DatosClub(this, inicio);
        this.introduceResultados = new IntroduceResultados(this);
        this.reservaEntrenamiento = new ReservaEntrenamiento(this);
        this.datosUsuario = new DatosUsuario(this);
        this.torneosUser = new TorneosUser(this);
        fachada = new FachadaUsuario();
            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ReservaEntrenamiento = new javax.swing.JButton();
        IntroducirResultados = new javax.swing.JButton();
        FinalizarSesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        MiClub = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        MisDatos = new javax.swing.JButton();
        usuarioLabel = new javax.swing.JLabel();
        torneosButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ReservaEntrenamiento.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        ReservaEntrenamiento.setText("Reserva entrenamiento");
        ReservaEntrenamiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReservaEntrenamientoMouseClicked(evt);
            }
        });

        IntroducirResultados.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        IntroducirResultados.setText("Introduce resultados");
        IntroducirResultados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IntroducirResultadosMouseClicked(evt);
            }
        });

        FinalizarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CerrarSesion.png"))); // NOI18N
        FinalizarSesion.setText("Finalizar sesión");
        FinalizarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FinalizarSesionMouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 102, 102));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setText("Bienvenido,");

        MiClub.setText("Mi club");
        MiClub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MiClubMouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Rey.png"))); // NOI18N

        MisDatos.setText("Mis datos");
        MisDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MisDatosMouseClicked(evt);
            }
        });

        usuarioLabel.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        usuarioLabel.setText("jLabel3");

        torneosButton.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        torneosButton.setText("Torneos");
        torneosButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                torneosButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usuarioLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(FinalizarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(MiClub)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MisDatos)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(IntroducirResultados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ReservaEntrenamiento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(torneosButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(FinalizarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(usuarioLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MiClub)
                    .addComponent(MisDatos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(torneosButton, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ReservaEntrenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(IntroducirResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ReservaEntrenamientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReservaEntrenamientoMouseClicked
        this.setVisible(false);
        reservaEntrenamiento.setClub(club);
        reservaEntrenamiento.setUsuario(fachada.getUsuario());
        reservaEntrenamiento.setLabels();
        reservaEntrenamiento.setVisible(true);
    }//GEN-LAST:event_ReservaEntrenamientoMouseClicked

    private void IntroducirResultadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IntroducirResultadosMouseClicked
        this.setVisible(false);
        introduceResultados.setTorneos(torneosList);
        introduceResultados.setUsuario(fachada.getUsuario());
        introduceResultados.Iniciar();
        introduceResultados.setLabels();
        introduceResultados.setVisible(true);
    }//GEN-LAST:event_IntroducirResultadosMouseClicked

    private void FinalizarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FinalizarSesionMouseClicked
        this.setVisible(false);
        inicio.setFederaciones(federacionesList);
        inicio.setLabels();
        inicio.setVisible(true);
    }//GEN-LAST:event_FinalizarSesionMouseClicked

    private void MiClubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MiClubMouseClicked
        datosClub.setFederaciones(federacionesList);
        datosClub.setClub(club);
        datosClub.setUsuario(fachada.getUsuario());
        datosClub.setLabels();
        datosClub.setVisible(true);
    }//GEN-LAST:event_MiClubMouseClicked

    private void MisDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MisDatosMouseClicked
        datosUsuario.setUsuario(fachada.getUsuario());
        datosUsuario.setLabels();
        datosUsuario.setVisible(true);
    }//GEN-LAST:event_MisDatosMouseClicked

    private void torneosButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_torneosButtonMouseClicked
        this.setVisible(false);
        torneosUser.setClub(club);
        torneosUser.setTorneos(torneosList);
        torneosUser.setUsuario(fachada.getUsuario());
        torneosUser.setLabels();
        torneosUser.setVisible(true);
    }//GEN-LAST:event_torneosButtonMouseClicked
    
    public void setUsuario(Usuario usu)
    {
        fachada.setUsuario(usu);
    }
    
    public void setFederaciones(ArrayList<Federacion> federaciones)
    {
        federacionesList = federaciones;
    }
    
    public void setClub(Club _club)
    {
        club = _club;    
    }
    
    public void setTorneos(ArrayList<Torneo> torneos)
    {
        torneosList = torneos;
    }
    
    public void setELO()
    {
        fachada.setELO(1000);
        
        for(int i = 0; i < torneosList.size(); i++)
            for(int j = 0; j < torneosList.get(i).getPartidasList().size(); j++)
            {
                if(torneosList.get(i).getPartidasList().get(j).ganador() == fachada.getUsuario())
                {
                    fachada.addELO(10);
                }
                else if((torneosList.get(i).getPartidasList().get(j).getJugador1() == fachada.getUsuario()) ||(torneosList.get(i).getPartidasList().get(j).getJugador2() == fachada.getUsuario()))
                    fachada.addELO(-5);
            }
    }
    
    public void setLabels ()
    {
        usuarioLabel.setText(fachada.getId());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FinalizarSesion;
    private javax.swing.JButton IntroducirResultados;
    private javax.swing.JButton MiClub;
    private javax.swing.JButton MisDatos;
    private javax.swing.JButton ReservaEntrenamiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton torneosButton;
    private javax.swing.JLabel usuarioLabel;
    // End of variables declaration//GEN-END:variables
    private Inicio inicio;
    private DatosClub datosClub;
    private ReservaEntrenamiento reservaEntrenamiento;
    private IntroduceResultados introduceResultados;
    private DatosUsuario datosUsuario;
    private TorneosUser torneosUser;
    private FachadaUsuario fachada;
    private Club club;
    private ArrayList<Torneo> torneosList = new ArrayList<Torneo>();
    private ArrayList<Federacion> federacionesList = new ArrayList<Federacion>();
    
}
