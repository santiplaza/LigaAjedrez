/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Clases.Club;
import Clases.Federacion;
import Clases.Torneo;
import Clases.Usuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author enrique
 */
public class AdministracionTorneos extends javax.swing.JFrame {

    /**
     * Creates new form AdministracionTorneos
     */
    public AdministracionTorneos(MenuAdmin menuAdmin) {
        initComponents();
        this.menuAdmin = menuAdmin;
        this.configurarTorneo = new ConfigurarTorneo(this);
        finalizadoLabel.setVisible(false);
        
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
        torneosJList = new java.awt.List();
        crearTorneoButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        numJugadoresLabel = new javax.swing.JLabel();
        volverButton = new javax.swing.JButton();
        configurarTorneoButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        numRequeridoJugadores = new javax.swing.JLabel();
        finalizadoLabel = new javax.swing.JLabel();
        apuntarseButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        federacionLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Torneos en curso:");

        torneosJList.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                torneosJListItemStateChanged(evt);
            }
        });

        crearTorneoButton.setText("Crear torneo");
        crearTorneoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearTorneoButtonMouseClicked(evt);
            }
        });

        jLabel2.setText("Número de jugadores:");

        volverButton.setText("Volver");
        volverButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverButtonMouseClicked(evt);
            }
        });

        configurarTorneoButton.setText("Configurar torneo");
        configurarTorneoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                configurarTorneoButtonMouseClicked(evt);
            }
        });

        jLabel3.setText("Número de jugadores requerido:");

        finalizadoLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        finalizadoLabel.setText("Torneo finalizado");

        apuntarseButton.setText("Apuntarse");
        apuntarseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                apuntarseButtonMouseClicked(evt);
            }
        });

        jLabel4.setText("Federación organizadora:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(volverButton)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(torneosJList, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numJugadoresLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(finalizadoLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(configurarTorneoButton)
                                .addGap(26, 26, 26)
                                .addComponent(apuntarseButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(federacionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numRequeridoJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(crearTorneoButton)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(crearTorneoButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(numJugadoresLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(numRequeridoJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(federacionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(finalizadoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(configurarTorneoButton)
                            .addComponent(apuntarseButton)))
                    .addComponent(torneosJList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(62, 62, 62)
                .addComponent(volverButton)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverButtonMouseClicked
       this.setVisible(false);
       menuAdmin.setTorneos(torneosList);
       menuAdmin.setVisible(true);
    }//GEN-LAST:event_volverButtonMouseClicked

    private void torneosJListItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_torneosJListItemStateChanged
        numTorneoSelected = torneosJList.getSelectedIndex();
        torneoSelected = torneosList.get(numTorneoSelected);
        setLabels();
        
    }//GEN-LAST:event_torneosJListItemStateChanged

    private void crearTorneoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearTorneoButtonMouseClicked
        
        String fedes[] = new String[federacionesList.size()];
        String listaFedes = new String("");
        Federacion f = new Federacion();
        
        for(int i = 0; i < federacionesList.size(); i++)
        {
            fedes[i] = federacionesList.get(i).getProvincia();
            listaFedes = listaFedes + ", " + fedes[i];    
        }
        
        String federacion = new String(JOptionPane.showInputDialog("¿Que federación lo organizará? Federaciones activas: " + listaFedes));
        
        boolean coincide =false;
        for(int i = 0; i < federacionesList.size(); i++)
        {
            if(federacionesList.get(i).getProvincia().equals(federacion))
            {
                f = federacionesList.get(i);
                coincide = true;
            }
                
        }
        
        if(!coincide)
        {
            JOptionPane.showMessageDialog(null, "Federacion mal introducida");
        }
        else
        {
            String nombre = new String(JOptionPane.showInputDialog("Escribe el nombre del torneo:"));
            int numeroJugadores = Integer.parseInt(new String(JOptionPane.showInputDialog("Número de jugadores(Solo puede ser 4 o 8):")));
       
            while((numeroJugadores != 4) && (numeroJugadores != 8))
            {
                numeroJugadores = Integer.parseInt(new String(JOptionPane.showInputDialog("Número de jugadores(Solo puede ser 4 o 8):")));
            }
       
            torneosList.add(new Torneo(nombre, f, numeroJugadores, true));
            setLabels();
        }
    }//GEN-LAST:event_crearTorneoButtonMouseClicked

    private void configurarTorneoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_configurarTorneoButtonMouseClicked
       this.setVisible(false);
       configurarTorneo.setTorneoSelected(torneoSelected);
       configurarTorneo.setLabels();
       configurarTorneo.setVisible(true);
    }//GEN-LAST:event_configurarTorneoButtonMouseClicked

    private void apuntarseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apuntarseButtonMouseClicked
        if(torneoSelected.getJugadoresList().contains(usuario))
            JOptionPane.showMessageDialog(null, "Ya te has apuntado");
        else if (torneoSelected.getFederacion().getClubesList().contains(club))
        {
            torneoSelected.getJugadoresList().add(usuario);
            numJugadoresLabel.setText(String.valueOf(torneoSelected.getJugadoresList().size()));
            if(torneoSelected.getNumJugadores() == torneoSelected.getJugadoresList().size())
            {
                torneoSelected.Iniciar();
                torneoSelected.setInscripcionAbierta(false);
            }
            setLabels();
        }
        else
            JOptionPane.showMessageDialog(null, "Tu club no pertenece a la federación organizadora");
    }//GEN-LAST:event_apuntarseButtonMouseClicked
    
    public void setTorneos(ArrayList<Torneo> torneos)
    {
        torneosList = torneos;
        torneoSelected = torneosList.get(0);
    }
    
    public void setUsuario(Usuario usu)
    {
        usuario = usu;
    }
    
    public void setClub(Club _club)
    {
        club = _club;
    }
    
    public void setFederaciones(ArrayList<Federacion> federaciones)
    {
        federacionesList = federaciones;
    }
    
    public void setLabels ()
    {
        torneosJList.removeAll();
        for (int i = 0; i < torneosList.size(); i++)
        {
            torneosJList.add(torneosList.get(i).getNombre(), i);
        }
        
        numJugadoresLabel.setText(String.valueOf(torneoSelected.getJugadoresList().size()));
        numRequeridoJugadores.setText(String.valueOf(torneoSelected.getNumJugadores()));
        federacionLabel.setText(torneoSelected.getFederacion().getProvincia());
        
        if(torneoSelected.isFinalizado())
            finalizadoLabel.setVisible(true);
        else
            finalizadoLabel.setVisible(false);
        
        if(!torneoSelected.isInscripcionAbierta())
        {
            apuntarseButton.setVisible(false);
        }
        else
        {
            apuntarseButton.setVisible(true);
        }
          
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton apuntarseButton;
    private javax.swing.JButton configurarTorneoButton;
    private javax.swing.JButton crearTorneoButton;
    private javax.swing.JLabel federacionLabel;
    private javax.swing.JLabel finalizadoLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel numJugadoresLabel;
    private javax.swing.JLabel numRequeridoJugadores;
    private java.awt.List torneosJList;
    private javax.swing.JButton volverButton;
    // End of variables declaration//GEN-END:variables
    private MenuAdmin menuAdmin;
    private ConfigurarTorneo configurarTorneo;
    private ArrayList<Torneo> torneosList = new ArrayList<Torneo>();
    private ArrayList<Federacion> federacionesList = new ArrayList<Federacion>();
    private Usuario usuario;
    private Club club;
    private int numTorneoSelected;
    private Torneo torneoSelected;
}
