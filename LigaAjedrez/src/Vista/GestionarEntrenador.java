/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Clases.Club;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author enrique
 */
public class GestionarEntrenador extends javax.swing.JFrame {

    /**
     * Creates new form VerJugadoresClub
     */
    public GestionarEntrenador(AdministracionClubs administracionClubs) {
        initComponents();
        this.administracionClubs = administracionClubs;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Volver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        equiposJList = new java.awt.List();
        entrenadorNombre = new javax.swing.JLabel();
        entrenadorApellidos = new javax.swing.JLabel();
        entrenadorFecha = new javax.swing.JLabel();
        eliminarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Volver.setText("Volver");
        Volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VolverMouseClicked(evt);
            }
        });

        jLabel1.setText("Nombre:");

        jLabel2.setText("Apellidos:");

        jLabel3.setText("Fecha de nacimiento:");

        jLabel4.setText("Equipos a los que entrena:");

        equiposJList.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                equiposJListItemStateChanged(evt);
            }
        });

        entrenadorNombre.setText("jLabel5");

        entrenadorApellidos.setText("jLabel5");

        entrenadorFecha.setText("jLabel5");

        eliminarButton.setText("Eliminar equipo");
        eliminarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(entrenadorNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(entrenadorApellidos, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(entrenadorFecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(equiposJList, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(eliminarButton)
                            .addComponent(jLabel4))
                        .addGap(24, 24, 24))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Volver)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(entrenadorNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(entrenadorApellidos))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(entrenadorFecha)))
                    .addComponent(equiposJList, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eliminarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(Volver)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverMouseClicked
        this.setVisible(false);
        administracionClubs.setClubes(clubesList);
        administracionClubs.setVisible(true);
    }//GEN-LAST:event_VolverMouseClicked

    private void equiposJListItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_equiposJListItemStateChanged
        clubSelectedString = equiposJList.getSelectedItem();
        clubSelectedInt = equiposJList.getSelectedIndex();
    }//GEN-LAST:event_equiposJListItemStateChanged

    private void eliminarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarButtonMouseClicked
        
        for(int i = 0; i < clubesList.size(); i++)
        {
            if(clubesList.get(i).getNombre().equals(equiposJList.getSelectedItem()))
            {
                clubesList.get(i).getEntrenador().borrarDatos();
            }
        }
        setLabels();
    }//GEN-LAST:event_eliminarButtonMouseClicked

    public void setClubes(ArrayList<Club> clubes)
    {
        clubesList = clubes;    
    }
    
    public void setClub(Club _club)
    {
        club = _club;
    }
    
    public void setLabels()
    {
        
        equiposJList.removeAll();
        for (int i = 0; i < club.getEntrenador().getClub().size(); i++)
        {
                 equiposJList.add(club.getEntrenador().getClub().get(i), i);
        }
        
        entrenadorNombre.setText(club.getEntrenador().getNombre());
        entrenadorApellidos.setText(club.getEntrenador().getApellidos());
        entrenadorFecha.setText(ConvertirFecha(club.getEntrenador().getFechaNacimiento()));
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
    private javax.swing.JButton Volver;
    private javax.swing.JButton eliminarButton;
    private javax.swing.JLabel entrenadorApellidos;
    private javax.swing.JLabel entrenadorFecha;
    private javax.swing.JLabel entrenadorNombre;
    private java.awt.List equiposJList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
    private AdministracionClubs administracionClubs;
    private ArrayList<Club> clubesList = new ArrayList<Club>();
    private Club club;
    private String clubSelectedString;
    private int clubSelectedInt;
    
}
