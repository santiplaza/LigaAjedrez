/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Clases.Club;
import Clases.Partida;
import Clases.Torneo;
import java.util.ArrayList;

/**
 *
 * @author enrique
 */
public class Cuadro4 extends javax.swing.JFrame {

    /**
     * Creates new form jugadores4Cuadro
     */
    public Cuadro4(ConfigurarTorneo configurarTorneo) {
        initComponents();
        this.configurarTorneo = configurarTorneo;
        this.admin = true;
        simular1Button.setVisible(true);
        simular2Button.setVisible(true);
        simular3Button.setVisible(false);      
    }
    
    public Cuadro4() {
        initComponents();
        this.admin = false;
        simular1Button.setVisible(false);
        simular2Button.setVisible(false);
        simular3Button.setVisible(false);    
    }

    public void setTorneoSelected(Torneo tor)
    {
        torneo = tor;
    }
    
    public void setLabels ()
    {
        jugador1Label.setText(torneo.getPartidasList().get(0).getJugador1().getNombre());
        jugador2Label.setText(torneo.getPartidasList().get(0).getJugador2().getNombre());
        jugador3Label.setText(torneo.getPartidasList().get(1).getJugador1().getNombre());
        jugador4Label.setText(torneo.getPartidasList().get(1).getJugador2().getNombre());
        sede1Label.setText(torneo.getPartidasList().get(0).getSede());
        sede2Label.setText(torneo.getPartidasList().get(1).getSede());
        sede3Label.setText(torneo.getPartidasList().get(2).getSede());
        
        
        if(torneo.getPartidasList().get(0).isFinalizada())
        {
            simular1Button.setVisible(false);
            puntosJugador1.setText(String.valueOf(torneo.getPartidasList().get(0).getPuntos1()));
            puntosJugador2.setText(String.valueOf(torneo.getPartidasList().get(0).getPuntos2()));
            final1Label.setText(torneo.getPartidasList().get(0).ganador().getNombre());
            if(!torneo.getPartidasList().get(2).isConfigurada())
            {
                torneo.getPartidasList().get(2).setJugador1(torneo.getPartidasList().get(0).ganador());
            }
        }
        
        if(torneo.getPartidasList().get(1).isFinalizada())
        {
            simular2Button.setVisible(false);
            puntosJugador3.setText(String.valueOf(torneo.getPartidasList().get(1).getPuntos1()));
            puntosJugador4.setText(String.valueOf(torneo.getPartidasList().get(1).getPuntos2()));
            final2Label.setText(torneo.getPartidasList().get(1).ganador().getNombre());
            if(!torneo.getPartidasList().get(2).isConfigurada())
            {
                torneo.getPartidasList().get(2).setJugador2(torneo.getPartidasList().get(1).ganador());
            }
        }
        
        if(torneo.getPartidasList().get(0).isFinalizada() && torneo.getPartidasList().get(1).isFinalizada())
        {
            if(admin)
                simular3Button.setVisible(true);
            
            System.out.println("antes del set configurada");
            torneo.getPartidasList().get(2).setConfigurada(true);
        }
        
        if(torneo.getPartidasList().get(2).isFinalizada())
        {
            if(admin)
                simular3Button.setVisible(false);
            
            final1Label.setText(torneo.getPartidasList().get(2).getJugador1().getNombre());
            final2Label.setText(torneo.getPartidasList().get(2).getJugador2().getNombre());
            puntosFinal1.setText(String.valueOf(torneo.getPartidasList().get(2).getPuntos1()));
            puntosFinal2.setText(String.valueOf(torneo.getPartidasList().get(2).getPuntos2()));
            
            torneo.setFinalizado(true);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jugador1Label = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jugador2Label = new javax.swing.JLabel();
        jugador3Label = new javax.swing.JLabel();
        jugador4Label = new javax.swing.JLabel();
        final1Label = new javax.swing.JLabel();
        final2Label = new javax.swing.JLabel();
        volverButton = new javax.swing.JButton();
        simular1Button = new javax.swing.JButton();
        simular2Button = new javax.swing.JButton();
        simular3Button = new javax.swing.JButton();
        puntosJugador1 = new javax.swing.JLabel();
        puntosJugador2 = new javax.swing.JLabel();
        puntosJugador3 = new javax.swing.JLabel();
        puntosJugador4 = new javax.swing.JLabel();
        puntosFinal1 = new javax.swing.JLabel();
        puntosFinal2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        sede1Label = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sede2Label = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        sede3Label = new javax.swing.JLabel();

        jugador1Label.setText("jLabel1");

        jLabel2.setText("vs.");

        jLabel3.setText("vs.");

        jLabel4.setText("vs.");

        jugador2Label.setText("jLabel1");

        jugador3Label.setText("jLabel6");

        jugador4Label.setText("jLabel7");

        final1Label.setText("jLabel8");

        final2Label.setText("jLabel9");

        volverButton.setText("Volver");
        volverButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverButtonMouseClicked(evt);
            }
        });

        simular1Button.setText("Simular");
        simular1Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                simular1ButtonMouseClicked(evt);
            }
        });

        simular2Button.setText("Simular");
        simular2Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                simular2ButtonMouseClicked(evt);
            }
        });

        simular3Button.setText("Simular");
        simular3Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                simular3ButtonMouseClicked(evt);
            }
        });

        jLabel1.setText("Sede:");

        sede1Label.setText("Por especificar");

        jLabel5.setText("Sede:");

        sede2Label.setText("Por especificar");

        jLabel6.setText("Sede:");

        sede3Label.setText("Por especificar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(101, 101, 101))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(simular1Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(simular2Button)
                .addGap(54, 54, 54))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(volverButton)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(sede1Label)
                        .addGap(101, 101, 101)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sede2Label))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jugador1Label)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(puntosJugador1))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jugador2Label)
                                                .addGap(18, 18, 18)
                                                .addComponent(puntosJugador2)))
                                        .addGap(28, 28, 28))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(puntosFinal1)
                                        .addGap(91, 91, 91)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(104, 104, 104)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(puntosJugador4, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(puntosJugador3, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(simular3Button)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(puntosFinal2))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(102, 102, 102)
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sede3Label))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(112, 112, 112)
                                    .addComponent(final1Label)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(final2Label))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jugador3Label)
                                .addGap(47, 47, 47))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jugador4Label)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jugador1Label)
                    .addComponent(jugador3Label)
                    .addComponent(puntosJugador1)
                    .addComponent(puntosJugador3))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jugador2Label)
                    .addComponent(jugador4Label)
                    .addComponent(puntosJugador2)
                    .addComponent(puntosJugador4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(sede1Label)
                    .addComponent(jLabel5)
                    .addComponent(sede2Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simular1Button)
                    .addComponent(simular2Button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sede3Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(final1Label)
                            .addComponent(jLabel4)
                            .addComponent(final2Label))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(puntosFinal1)
                            .addComponent(puntosFinal2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(simular3Button)
                        .addGap(16, 16, 16)))
                .addComponent(volverButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverButtonMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_volverButtonMouseClicked

    private void simular1ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_simular1ButtonMouseClicked
        int random1 = (int) (Math.random()*99+1);
        int random2 = (int) (Math.random()*99+1);
                
        torneo.getPartidasList().get(0).setPuntos1(random1);
        torneo.getPartidasList().get(0).setPuntos2(random2);
        if(torneo.getPartidasList().get(0).getSede().equals("Por definir"))
        {
            torneo.getPartidasList().get(0).setSede("Sede " + torneo.getPartidasList().get(0).getJugador1().getClub());
            sede1Label.setText(torneo.getPartidasList().get(0).getSede());
        }
        torneo.getPartidasList().get(0).setFinalizada(true);
        simular1Button.setVisible(false);

        setLabels();
    }//GEN-LAST:event_simular1ButtonMouseClicked

    private void simular2ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_simular2ButtonMouseClicked
        int random1 = (int) (Math.random()*99+1);
        int random2 = (int) (Math.random()*99+1);
                
        torneo.getPartidasList().get(1).setPuntos1(random1);
        torneo.getPartidasList().get(1).setPuntos2(random2);
        if(torneo.getPartidasList().get(1).getSede().equals("Por definir"))
        {
            torneo.getPartidasList().get(1).setSede("Sede " + torneo.getPartidasList().get(1).getJugador1().getClub());
            sede2Label.setText(torneo.getPartidasList().get(1).getSede());
        }
        torneo.getPartidasList().get(1).setFinalizada(true);
        simular2Button.setVisible(false);
        setLabels();
    }//GEN-LAST:event_simular2ButtonMouseClicked

    private void simular3ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_simular3ButtonMouseClicked
        int random1 = (int) (Math.random()*99+1);
        int random2 = (int) (Math.random()*99+1);
                
        torneo.getPartidasList().get(2).setPuntos1(random1);
        torneo.getPartidasList().get(2).setPuntos2(random2);
        if(torneo.getPartidasList().get(2).getSede().equals("Por definir"))
        {
            torneo.getPartidasList().get(2).setSede("Sede " + torneo.getPartidasList().get(2).getJugador1().getClub());
            sede3Label.setText(torneo.getPartidasList().get(2).getSede());
        }
        torneo.getPartidasList().get(2).setFinalizada(true);
        simular3Button.setVisible(false);
        puntosFinal1.setText(String.valueOf(torneo.getPartidasList().get(2).getPuntos1()));
        puntosFinal2.setText(String.valueOf(torneo.getPartidasList().get(2).getPuntos2()));
        torneo.setFinalizado(true);
    }//GEN-LAST:event_simular3ButtonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel final1Label;
    private javax.swing.JLabel final2Label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jugador1Label;
    private javax.swing.JLabel jugador2Label;
    private javax.swing.JLabel jugador3Label;
    private javax.swing.JLabel jugador4Label;
    private javax.swing.JLabel puntosFinal1;
    private javax.swing.JLabel puntosFinal2;
    private javax.swing.JLabel puntosJugador1;
    private javax.swing.JLabel puntosJugador2;
    private javax.swing.JLabel puntosJugador3;
    private javax.swing.JLabel puntosJugador4;
    private javax.swing.JLabel sede1Label;
    private javax.swing.JLabel sede2Label;
    private javax.swing.JLabel sede3Label;
    private javax.swing.JButton simular1Button;
    private javax.swing.JButton simular2Button;
    private javax.swing.JButton simular3Button;
    private javax.swing.JButton volverButton;
    // End of variables declaration//GEN-END:variables
    private ConfigurarTorneo configurarTorneo;
    private Torneo torneo;
    private boolean admin;
}