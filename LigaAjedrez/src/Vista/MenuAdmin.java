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
 * @author enrique
 */
public class MenuAdmin extends javax.swing.JFrame {

    /**
     * Creates new form PanelAdmin
     */
    public MenuAdmin(Inicio inicio) {
        initComponents();
        this.inicio = inicio;
        this.introduceResultados = new IntroduceResultados(this);
        this.reservaEntrenamiento = new ReservaEntrenamiento(this);
        this.datosUsuario = new DatosUsuario(this);      
        this.administracionClubs = new AdministracionClubs(this);
        this.datosClub = new DatosClub(this, inicio);
        this.administracionTorneos = new AdministracionTorneos(this);
        this.asignarSedes = new AsignarSedes(this);
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

        realizarReserva = new javax.swing.JButton();
        RegistrarDatosPartida = new javax.swing.JButton();
        AsignarSede = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        FinalizarSesion = new javax.swing.JButton();
        MiClub = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        AdministrarClubs = new javax.swing.JButton();
        usuarioLabel = new javax.swing.JLabel();
        MisDatos = new javax.swing.JButton();
        administrarTorneosButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        realizarReserva.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        realizarReserva.setText("Realizar reserva");
        realizarReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                realizarReservaMouseClicked(evt);
            }
        });

        RegistrarDatosPartida.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        RegistrarDatosPartida.setText("Registrar datos partida");
        RegistrarDatosPartida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrarDatosPartidaMouseClicked(evt);
            }
        });

        AsignarSede.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        AsignarSede.setText("Asignar sede a partida");
        AsignarSede.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AsignarSedeMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setText("Bienvenido,");

        FinalizarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CerrarSesion.png"))); // NOI18N
        FinalizarSesion.setText("Finalizar sesión");
        FinalizarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FinalizarSesionMouseClicked(evt);
            }
        });

        MiClub.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        MiClub.setText("Mi club");
        MiClub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MiClubMouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ReyGold.png"))); // NOI18N

        AdministrarClubs.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        AdministrarClubs.setText("Administrar clubs");
        AdministrarClubs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdministrarClubsMouseClicked(evt);
            }
        });

        usuarioLabel.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        usuarioLabel.setText("jLabel2");

        MisDatos.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        MisDatos.setText("Mis datos");
        MisDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MisDatosMouseClicked(evt);
            }
        });

        administrarTorneosButton.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        administrarTorneosButton.setText("Administrar torneos");
        administrarTorneosButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                administrarTorneosButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usuarioLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MiClub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MisDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addComponent(FinalizarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(administrarTorneosButton, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addComponent(realizarReserva, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addComponent(AsignarSede, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addComponent(AdministrarClubs, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addComponent(RegistrarDatosPartida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(112, 112, 112))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(usuarioLabel))))
                        .addGap(26, 26, 26)
                        .addComponent(MiClub, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(FinalizarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MisDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(realizarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(RegistrarDatosPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AsignarSede, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AdministrarClubs, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(administrarTorneosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void realizarReservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_realizarReservaMouseClicked
        this.setVisible(false);
        reservaEntrenamiento.setClub(club);
        reservaEntrenamiento.setUsuario(fachada.getUsuario());
        reservaEntrenamiento.setLabels();
        reservaEntrenamiento.setVisible(true);
    }//GEN-LAST:event_realizarReservaMouseClicked

    private void RegistrarDatosPartidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarDatosPartidaMouseClicked
        this.setVisible(false);
        introduceResultados.setTorneos(torneosList);
        introduceResultados.setUsuario(fachada.getUsuario());
        introduceResultados.Iniciar();
        introduceResultados.setLabels();
        introduceResultados.setVisible(true);
    }//GEN-LAST:event_RegistrarDatosPartidaMouseClicked

    private void FinalizarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FinalizarSesionMouseClicked
        this.setVisible(false);
        inicio.setUsuario(fachada.getUsuario());
        inicio.setFederaciones(federacionesList);
        inicio.setTorneos(torneosList);
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

    private void AdministrarClubsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdministrarClubsMouseClicked
        this.setVisible(false);
        administracionClubs.setFederaciones(federacionesList);
        administracionClubs.setUsuario(fachada.getUsuario());
        administracionClubs.setLabels();
        administracionClubs.setVisible(true);
    }//GEN-LAST:event_AdministrarClubsMouseClicked

    private void MisDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MisDatosMouseClicked
        datosUsuario.setUsuario(fachada.getUsuario());
        datosUsuario.setLabels();
        datosUsuario.setVisible(true);
    }//GEN-LAST:event_MisDatosMouseClicked

    private void administrarTorneosButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_administrarTorneosButtonMouseClicked
        this.setVisible(false);
        administracionTorneos.setClub(club);
        administracionTorneos.setTorneos(torneosList);
        administracionTorneos.setFederaciones(federacionesList);
        administracionTorneos.setUsuario(fachada.getUsuario());
        administracionTorneos.setLabels();
        administracionTorneos.setVisible(true);
    }//GEN-LAST:event_administrarTorneosButtonMouseClicked

    private void AsignarSedeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AsignarSedeMouseClicked
        this.setVisible(false);
        asignarSedes.setTorneos(torneosList);
        asignarSedes.setLabels();
        asignarSedes.setVisible(true);
    }//GEN-LAST:event_AsignarSedeMouseClicked

    public void setUsuario(Usuario usu)
    {
        fachada.setUsuario(usu);
    }
    
    public void setClub(Club _club)
    {
        club = _club;    
    }
    
    public void setTorneos(ArrayList<Torneo> torneos)
    {
        torneosList = torneos;
    }
    
    public void setFederaciones(ArrayList<Federacion> federaciones)
    {
        federacionesList = federaciones;
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
    private javax.swing.JButton AdministrarClubs;
    private javax.swing.JButton AsignarSede;
    private javax.swing.JButton FinalizarSesion;
    private javax.swing.JButton MiClub;
    private javax.swing.JButton MisDatos;
    private javax.swing.JButton RegistrarDatosPartida;
    private javax.swing.JButton administrarTorneosButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton realizarReserva;
    private javax.swing.JLabel usuarioLabel;
    // End of variables declaration//GEN-END:variables
    private Inicio inicio;
    private DatosClub datosClub;
    private ReservaEntrenamiento reservaEntrenamiento;
    private IntroduceResultados introduceResultados;
    private DatosUsuario datosUsuario;
    private AdministracionClubs administracionClubs;
    private AdministracionTorneos administracionTorneos;
    private AsignarSedes asignarSedes;
    private FachadaUsuario fachada;
    private Club club;
    private ArrayList<Torneo> torneosList = new ArrayList<Torneo>();
    private ArrayList<Federacion> federacionesList = new ArrayList<Federacion>();
}
