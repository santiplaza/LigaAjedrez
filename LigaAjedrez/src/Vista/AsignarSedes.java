/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Clases.Federacion;
import Clases.Partida;
import Clases.Torneo;
import java.util.ArrayList;

/**
 *
 * @author enrique
 */
public class AsignarSedes extends javax.swing.JFrame {

    /**
     * Creates new form AsignarSedes
     */
    public AsignarSedes(MenuAdmin menuAdmin) {
        initComponents();
        this.menuAdmin = menuAdmin;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        volverButton = new javax.swing.JButton();
        torneosJList = new java.awt.List();
        jLabel1 = new javax.swing.JLabel();
        sedesJList = new java.awt.List();
        jLabel2 = new javax.swing.JLabel();
        partidasJList = new java.awt.List();
        jLabel3 = new javax.swing.JLabel();
        añadirButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        estadoLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sedeLabel = new javax.swing.JLabel();
        exitoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        volverButton.setText("Volver");
        volverButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverButtonMouseClicked(evt);
            }
        });

        torneosJList.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                torneosJListItemStateChanged(evt);
            }
        });

        jLabel1.setText("Torneos:");

        jLabel2.setText("Sedes disponibles:");

        partidasJList.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                partidasJListItemStateChanged(evt);
            }
        });

        jLabel3.setText("Lista de partidas:");

        añadirButton.setText("Añadir sede a partida");
        añadirButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                añadirButtonMouseClicked(evt);
            }
        });

        jLabel4.setText("Estado:");

        estadoLabel.setText("jLabel5");

        jLabel5.setText("Sede:");

        sedeLabel.setText("jLabel6");

        exitoLabel.setText("Sede añadida con éxito!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(torneosJList, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sedesJList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(volverButton))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(exitoLabel))
                            .addComponent(jLabel3)
                            .addComponent(añadirButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(partidasJList, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(estadoLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sedeLabel)))))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sedesJList, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(torneosJList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(partidasJList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(estadoLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(sedeLabel))))
                .addGap(18, 18, 18)
                .addComponent(añadirButton)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(volverButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(exitoLabel)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverButtonMouseClicked
       this.setVisible(false);
       menuAdmin.setVisible(true);
    }//GEN-LAST:event_volverButtonMouseClicked

    private void torneosJListItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_torneosJListItemStateChanged
        exitoLabel.setVisible(false);
        
        federacion = torneosList.get(torneosJList.getSelectedIndex()).getFederacion();
        sedesJList.removeAll();
        for(int i = 0; i < federacion.getClubesList().size(); i++)
        {
            sedesJList.add(federacion.getClubesList().get(i).getSede(), i);
        }
        
        partidasList.clear();
        partidasJList.removeAll();
        for(int i = 0; i < torneosList.get(torneosJList.getSelectedIndex()).getPartidasList().size(); i++)
        {
            partidasList.add(torneosList.get(torneosJList.getSelectedIndex()).getPartidasList().get(i));
            partidasJList.add(partidasList.get(i).getJugador1().getNombre() + " vs. " + partidasList.get(i).getJugador2().getNombre(), i);
        }
        
    }//GEN-LAST:event_torneosJListItemStateChanged

    private void partidasJListItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_partidasJListItemStateChanged
        if(partidasList.get(partidasJList.getSelectedIndex()).isConfigurada() && !partidasList.get(partidasJList.getSelectedIndex()).isFinalizada())
            estadoLabel.setText("Preparada para jugarse");
        else if(partidasList.get(partidasJList.getSelectedIndex()).isFinalizada())
             estadoLabel.setText("Finalizada");
        else
            estadoLabel.setText("Aún por definir");
        
        sedeLabel.setText(partidasList.get(partidasJList.getSelectedIndex()).getSede());
        exitoLabel.setVisible(false);
    }//GEN-LAST:event_partidasJListItemStateChanged

    private void añadirButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_añadirButtonMouseClicked
        partidasList.get(partidasJList.getSelectedIndex()).setSede(sedesJList.getSelectedItem());
        exitoLabel.setVisible(true);
    }//GEN-LAST:event_añadirButtonMouseClicked

        
    public void setTorneos(ArrayList<Torneo> torneos)
    {
        torneosList = torneos;
        System.out.println("Num Partidas(0):" + torneosList.get(0).getPartidasList().size());
        System.out.println("Num Partidas(1):" + torneosList.get(1).getPartidasList().size());
    }
    
    public void setLabels()
    {
        torneosJList.removeAll();
        for(int i = 0; i < torneosList.size(); i++)
        {
            torneosJList.add(torneosList.get(i).getNombre(), i);
        }
        exitoLabel.setVisible(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton añadirButton;
    private javax.swing.JLabel estadoLabel;
    private javax.swing.JLabel exitoLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private java.awt.List partidasJList;
    private javax.swing.JLabel sedeLabel;
    private java.awt.List sedesJList;
    private java.awt.List torneosJList;
    private javax.swing.JButton volverButton;
    // End of variables declaration//GEN-END:variables
    private MenuAdmin menuAdmin;
    private ArrayList<Torneo> torneosList = new ArrayList<Torneo>();
    private ArrayList<Partida> partidasList = new ArrayList<Partida>();
    private Federacion federacion;
}