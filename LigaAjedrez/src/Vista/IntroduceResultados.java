/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Clases.Club;
import Clases.Partida;
import Clases.Torneo;
import Clases.Usuario;
import java.util.ArrayList;

/**
 *
 * @author santi
 */
public class IntroduceResultados extends javax.swing.JFrame {

    /**
     * Creates new form IntroduceResultados
     */
    public IntroduceResultados(MenuUsuario menuUsuario) {
        initComponents();
        this.menuUsuario = menuUsuario;
        this.cuadro4 = new Cuadro4 ();
        this.cuadro8 = new Cuadro8 ();
        this.admin = false;
        añadirButton.setVisible(false);
        puntuacionLabel.setVisible(false);
        eliminadoLabel.setVisible(false);
        finalizadoLabel.setVisible(false);
        jugador1Label.setVisible(false);
        vsLabel.setVisible(false);
        jugador2Label.setVisible(false);
        puntos1Text.setVisible(false);
        puntos2Text.setVisible(false);
        puntos1Label.setVisible(false);
        puntos2Label.setVisible(false);
        actualizarLabel.setVisible(false);
        esperandoLabel.setVisible(false);
        noApuntadoLabel.setVisible(false);
        
    }
    
    public IntroduceResultados(MenuAdmin menuAdmin) {
        initComponents();
        this.menuAdmin = menuAdmin;
        this.cuadro4 = new Cuadro4 ();
        this.cuadro8 = new Cuadro8 ();
        this.admin = true;
        añadirButton.setVisible(false);
        puntuacionLabel.setVisible(false);
        eliminadoLabel.setVisible(false);
        finalizadoLabel.setVisible(false);
        jugador1Label.setVisible(false);
        vsLabel.setVisible(false);
        jugador2Label.setVisible(false);
        puntos1Text.setVisible(false);
        puntos2Text.setVisible(false);
        puntos1Label.setVisible(false);
        puntos2Label.setVisible(false);
        actualizarLabel.setVisible(false);
        esperandoLabel.setVisible(false);
         noApuntadoLabel.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        añadirButton = new javax.swing.JButton();
        volverButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        torneosJList = new java.awt.List();
        jugador1Label = new javax.swing.JLabel();
        vsLabel = new javax.swing.JLabel();
        jugador2Label = new javax.swing.JLabel();
        puntuacionLabel = new javax.swing.JLabel();
        puntos1Text = new javax.swing.JTextField();
        puntos2Text = new javax.swing.JTextField();
        finalizadoLabel = new javax.swing.JLabel();
        puntos1Label = new javax.swing.JLabel();
        puntos2Label = new javax.swing.JLabel();
        eliminadoLabel = new javax.swing.JLabel();
        actualizarLabel = new javax.swing.JLabel();
        cuadroButton = new javax.swing.JButton();
        esperandoLabel = new javax.swing.JLabel();
        noApuntadoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        añadirButton.setText("Añadir resultado");
        añadirButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                añadirButtonMouseClicked(evt);
            }
        });
        añadirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirButtonActionPerformed(evt);
            }
        });

        volverButton.setText("Volver");
        volverButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverButtonMouseClicked(evt);
            }
        });

        jLabel6.setText("Torneos en los que participas:");

        torneosJList.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                torneosJListItemStateChanged(evt);
            }
        });

        jugador1Label.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jugador1Label.setText("jLabel1");

        vsLabel.setText("vs.");

        jugador2Label.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jugador2Label.setText("jLabel2");

        puntuacionLabel.setText("Introduce puntuación:");

        finalizadoLabel.setText("El torneo ha finalizado");

        puntos1Label.setText("jLabel3");

        puntos2Label.setText("jLabel3");

        eliminadoLabel.setText("Fuiste eliminado");

        actualizarLabel.setText("Ver cuadro del torneo para actualizar resultados y introducir próxima partida");

        cuadroButton.setText("Ver cuadro ");
        cuadroButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cuadroButtonMouseClicked(evt);
            }
        });

        esperandoLabel.setText("No se ha registrado el número de jugadores  requeridos para inicar el torneo.");

        noApuntadoLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        noApuntadoLabel.setText("No estás apuntado a ningún torneo aún.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(volverButton)
                                .addGap(40, 40, 40)
                                .addComponent(cuadroButton)
                                .addGap(27, 27, 27)
                                .addComponent(añadirButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(torneosJList, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(puntuacionLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jugador1Label)
                                                .addGap(18, 18, 18)
                                                .addComponent(vsLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(jugador2Label))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(puntos1Text, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(puntos1Label))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(6, 6, 6)
                                                        .addComponent(puntos2Label))
                                                    .addComponent(puntos2Text, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(noApuntadoLabel)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(finalizadoLabel)
                                                .addGap(41, 41, 41)
                                                .addComponent(eliminadoLabel)))))))
                        .addContainerGap(183, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(actualizarLabel)
                            .addComponent(esperandoLabel))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(torneosJList, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jugador1Label)
                            .addComponent(vsLabel)
                            .addComponent(jugador2Label))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(puntuacionLabel)
                            .addComponent(puntos1Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(puntos2Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(puntos1Label)
                            .addComponent(puntos2Label))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eliminadoLabel)
                            .addComponent(finalizadoLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(noApuntadoLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(esperandoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(actualizarLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(volverButton)
                    .addComponent(cuadroButton)
                    .addComponent(añadirButton))
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void añadirButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_añadirButtonMouseClicked

        partida.setPuntos1(Integer.parseInt(new String(puntos1Text.getText())));
        partida.setPuntos2(Integer.parseInt(new String(puntos2Text.getText())));
        partida.VerPartida();
        partida.setFinalizada(true);
        
        puntuacionLabel.setVisible(false);
        puntos1Text.setVisible(false);
        puntos2Text.setVisible(false);
        añadirButton.setVisible(false);
        puntos1Label.setVisible(true);
        puntos2Label.setVisible(true);
        puntos1Label.setText(String.valueOf(partida.getPuntos1()));
        puntos2Label.setText(String.valueOf(partida.getPuntos2()));
        
        if(partida.ganador() != usuario)
        {
            eliminadoLabel.setVisible(true);
        }
        else
            actualizarLabel.setVisible(true);
            
    }//GEN-LAST:event_añadirButtonMouseClicked

    private void volverButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverButtonMouseClicked
        this.setVisible(false);
        if (admin)
        {
            menuAdmin.setTorneos(torneosList);
            menuAdmin.setVisible(true);  
        }
            
        else
        {
            menuUsuario.setTorneos(torneosList);
            menuUsuario.setVisible(true);
        }
        setLabels();
            
    }//GEN-LAST:event_volverButtonMouseClicked

    private void torneosJListItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_torneosJListItemStateChanged
        torneo = participacionesList.get(torneosJList.getSelectedIndex());
        ConfigurarPartida();
    }//GEN-LAST:event_torneosJListItemStateChanged
    
    private void ConfigurarPartida()
    {
        setLabels();       
        if(torneo.isFinalizado())
        {
            finalizadoLabel.setVisible(true);
        }
        else if(torneo.isInscripcionAbierta())
        {
            esperandoLabel.setVisible(true);
        }
        else
        {
            for(int i = 0; i < torneo.getPartidasList().size(); i++)
            {
                if((torneo.getPartidasList().get(i).getJugador1() == usuario || torneo.getPartidasList().get(i).getJugador2() == usuario) && torneo.getPartidasList().get(i).isConfigurada() && !torneo.getPartidasList().get(i).isFinalizada())
                {
                    System.out.println("Partida Configurada y NO finalizada");
                    setPartida(torneo.getPartidasList().get(i));
                    jugador1Label.setVisible(true);
                    jugador2Label.setVisible(true);
                    jugador1Label.setText(partida.getJugador1().getNombre());
                    jugador2Label.setText(partida.getJugador2().getNombre());
                    puntuacionLabel.setVisible(true);
                    puntos1Text.setVisible(true);
                    puntos2Text.setVisible(true);
                    añadirButton.setVisible(true);

                }
                else if((torneo.getPartidasList().get(i).getJugador1() == usuario || torneo.getPartidasList().get(i).getJugador2() == usuario) && torneo.getPartidasList().get(i).ganador() != usuario)
                {
                    System.out.println("Partida Configurada y SI finalizada");
                    setPartida(torneo.getPartidasList().get(i));
                    jugador1Label.setVisible(true);
                    jugador2Label.setVisible(true);
                    jugador1Label.setText(partida.getJugador1().getNombre());
                    jugador2Label.setText(partida.getJugador2().getNombre());
                    puntos1Label.setVisible(true);
                    puntos2Label.setVisible(true);
                    puntos1Label.setText(String.valueOf(partida.getPuntos1()));
                    puntos2Label.setText(String.valueOf(partida.getPuntos2()));
                    eliminadoLabel.setVisible(true);
                }
            }   
        }
    }
    
    private void cuadroButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuadroButtonMouseClicked
        if(torneo.getNumJugadores() == 4)
        {
            cuadro4.setTorneoSelected(torneo);
            cuadro4.setLabels();
            cuadro4.setVisible(true);
            ConfigurarPartida();
        }
        else if(torneo.getNumJugadores() == 8)
        {
            cuadro8.setTorneoSelected(torneo);
            cuadro8.setLabels();
            cuadro8.setVisible(true);
            ConfigurarPartida();
        }
            
    }//GEN-LAST:event_cuadroButtonMouseClicked

    private void añadirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_añadirButtonActionPerformed

    public void setUsuario(Usuario usu)
    {
        usuario = usu;
    }
    
    public void setTorneos(ArrayList<Torneo> torneos)
    {
        torneosList = torneos;
    }
    
    public void setPartida(Partida p)
    {
        partida = p;
    }
    
    public void setLabels ()
    {
        añadirButton.setVisible(false);
        puntuacionLabel.setVisible(false);
        eliminadoLabel.setVisible(false);
        finalizadoLabel.setVisible(false);
        jugador1Label.setVisible(false);
        jugador2Label.setVisible(false);
        vsLabel.setVisible(false);
        puntos1Text.setVisible(false);
        puntos1Text.setText("");
        puntos2Text.setVisible(false);
        puntos2Text.setText("");
        puntos1Label.setVisible(false);
        puntos2Label.setVisible(false);
        actualizarLabel.setVisible(false);
        esperandoLabel.setVisible(false);
    }
    
    public void Iniciar()
    {
        torneosJList.removeAll();
        participacionesList.clear();
        
        for(int i = 0; i < torneosList.size(); i++)
        {
            if(torneosList.get(i).getJugadoresList().contains(usuario))
            {
                participacionesList.add(torneosList.get(i));
                torneosJList.add(torneosList.get(i).getNombre(), i);
            }
        }
        
        if(participacionesList.isEmpty())
        {
            cuadroButton.setVisible(false);
            noApuntadoLabel.setVisible(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel actualizarLabel;
    private javax.swing.JButton añadirButton;
    private javax.swing.JButton cuadroButton;
    private javax.swing.JLabel eliminadoLabel;
    private javax.swing.JLabel esperandoLabel;
    private javax.swing.JLabel finalizadoLabel;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jugador1Label;
    private javax.swing.JLabel jugador2Label;
    private javax.swing.JLabel noApuntadoLabel;
    private javax.swing.JLabel puntos1Label;
    private javax.swing.JTextField puntos1Text;
    private javax.swing.JLabel puntos2Label;
    private javax.swing.JTextField puntos2Text;
    private javax.swing.JLabel puntuacionLabel;
    private java.awt.List torneosJList;
    private javax.swing.JButton volverButton;
    private javax.swing.JLabel vsLabel;
    // End of variables declaration//GEN-END:variables
    private MenuUsuario menuUsuario;
    private MenuAdmin menuAdmin;
    private Cuadro4 cuadro4;
    private Cuadro8 cuadro8;
    private boolean admin = false;
    private Usuario usuario;
    private ArrayList<Torneo> torneosList = new ArrayList<Torneo>();
    private ArrayList<Torneo> participacionesList = new ArrayList<Torneo>();
    private Torneo torneo;
    private Partida partida;
}
