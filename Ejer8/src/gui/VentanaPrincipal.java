/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.awt.CardLayout;
import java.awt.event.ActionListener;

/**
 *
 * @author jairo
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    // Constructor de la clase VentanaPrincipal
    public VentanaPrincipal() {
        initComponents();
    }

    // Método para añadir un listener a jRadioButtonAcciones
    public void addAccionesAction(ActionListener listener) {
        jRadioButtonAcciones.addActionListener(listener);
    }

    // Método para añadir un listener a jRadioButtonResultados
    public void addResultadosAction(ActionListener listener) {
        jRadioButtonResultados.addActionListener(listener);
    }

    // Método para añadir un listener a jComboBoxCambiarAccion
    public void addCambiarAccionAction(ActionListener listener) {
        jComboBoxCambiarAccion.addActionListener(listener);
    }

    // Método para añadir un listener a jButtonB1
    public void addButtonB1Action(ActionListener listener) {
        jButtonB1.addActionListener(listener);
    }

    // Método para añadir un listener a jButtonB2
    public void addButtonB2Action(ActionListener listener) {
        jButtonB2.addActionListener(listener);
    }

    // Método para añadir un listener a jButtonB3
    public void addButtonB3Action(ActionListener listener) {
        jButtonB3.addActionListener(listener);
    }

    // Método para añadir un listener a jButtonB4
    public void addButtonB4Action(ActionListener listener) {
        jButtonB4.addActionListener(listener);
    }

    // Método para añadir un listener a jCheckBoxLeer
    public void addCheckBoxLeer(ActionListener listener) {
        jCheckBoxLeer.addActionListener(listener);
    }

    // Método para añadir un listener a jCheckBoxEscalada
    public void addCheckBoxEscalada(ActionListener listener) {
        jCheckBoxEscalada.addActionListener(listener);
    }

    // Método para añadir un listener a jCheckBoxEsquiar
    public void addCheckBoxEsquiar(ActionListener listener) {
        jCheckBoxEsquiar.addActionListener(listener);
    }

    // Método para añadir un listener a jCheckBoxSubmarinismo
    public void addCheckBoxSubmarinismo(ActionListener listener) {
        jCheckBoxSubmarinismo.addActionListener(listener);
    }

    // Método para añadir un listener a jComboBoxCambiarResultado
    public void addCambiarResultadoAction(ActionListener listener) {
        //jComboBoxCambiarResultado.addActionListener(listener);
    }

    // Método para mostrar el panel acciones
    public void mostrarPanelAcciones() {
        System.out.println("Hola");
        CardLayout cardLayout = (CardLayout) jPanelCentral.getLayout();

        // Vaciar todos los componentes del panel central antes de añadir uno nuevo
        jPanelCentral.removeAll(); // Elimina todos los componentes actuales en jPanelCentral

        // Añadir el nuevo panel que queremos mostrar
        jPanelCentral.add(jPanelAcciones, "Acciones"); // Añade jPanelAcciones al panel central con el nombre "Acciones"

        // Mostrar el panel especificado por su nombre
        cardLayout.show(jPanelCentral, "Acciones");

        // Refrescar el panel central para que los cambios se reflejen
        jPanelCentral.revalidate(); // Revalida el contenedor para que reconozca los cambios en los componentes
        jPanelCentral.repaint(); // Vuelve a dibujar el contenedor y sus componentes
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupPaneles = new javax.swing.ButtonGroup();
        jPanelVentanaPrincipal = new javax.swing.JPanel();
        jPanelOpcionesPaneles = new javax.swing.JPanel();
        jLabelPaneles = new javax.swing.JLabel();
        jRadioButtonAcciones = new javax.swing.JRadioButton();
        jRadioButtonResultados = new javax.swing.JRadioButton();
        jPanelCentral = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jPanelAcciones = new javax.swing.JPanel();
        jPanelCambiarAcciones = new javax.swing.JPanel();
        jLabelCambiarAccion = new javax.swing.JLabel();
        jComboBoxCambiarAccion = new javax.swing.JComboBox<>();
        jPanelSubAcciones = new javax.swing.JPanel();
        jPanelBotones = new javax.swing.JPanel();
        jButtonB1 = new javax.swing.JButton();
        jButtonB2 = new javax.swing.JButton();
        jButtonB3 = new javax.swing.JButton();
        jButtonB4 = new javax.swing.JButton();
        jPanelOpciones = new javax.swing.JPanel();
        jCheckBoxLeer = new javax.swing.JCheckBox();
        jCheckBoxEscalada = new javax.swing.JCheckBox();
        jCheckBoxEsquiar = new javax.swing.JCheckBox();
        jCheckBoxSubmarinismo = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusCycleRoot(false);
        setPreferredSize(new java.awt.Dimension(500, 400));

        jPanelVentanaPrincipal.setLayout(new java.awt.BorderLayout());

        jPanelOpcionesPaneles.setBackground(new java.awt.Color(0, 0, 0));

        jLabelPaneles.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabelPaneles.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPaneles.setText("CAMBIAR PANELES:");

        jRadioButtonAcciones.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroupPaneles.add(jRadioButtonAcciones);
        jRadioButtonAcciones.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonAcciones.setText("ACCIONES");
        jRadioButtonAcciones.setFocusable(false);
        jRadioButtonAcciones.setName("Acciones"); // NOI18N

        jRadioButtonResultados.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroupPaneles.add(jRadioButtonResultados);
        jRadioButtonResultados.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonResultados.setText("RESULTADOS");
        jRadioButtonResultados.setFocusable(false);
        jRadioButtonResultados.setName("Resultados"); // NOI18N
        jRadioButtonResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonResultadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelOpcionesPanelesLayout = new javax.swing.GroupLayout(jPanelOpcionesPaneles);
        jPanelOpcionesPaneles.setLayout(jPanelOpcionesPanelesLayout);
        jPanelOpcionesPanelesLayout.setHorizontalGroup(
            jPanelOpcionesPanelesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOpcionesPanelesLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabelPaneles)
                .addGap(29, 29, 29)
                .addComponent(jRadioButtonAcciones, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButtonResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jPanelOpcionesPanelesLayout.setVerticalGroup(
            jPanelOpcionesPanelesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOpcionesPanelesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelOpcionesPanelesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPaneles)
                    .addComponent(jRadioButtonAcciones)
                    .addComponent(jRadioButtonResultados))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanelVentanaPrincipal.add(jPanelOpcionesPaneles, java.awt.BorderLayout.PAGE_END);

        jPanelCentral.setLayout(new java.awt.CardLayout());

        jLabelTitulo.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("JUEGO DE PANELES");
        jPanelCentral.add(jLabelTitulo, "card2");

        jPanelAcciones.setName("Acciones"); // NOI18N
        jPanelAcciones.setLayout(new java.awt.BorderLayout());

        jPanelCambiarAcciones.setBackground(new java.awt.Color(255, 102, 102));
        jPanelCambiarAcciones.setPreferredSize(new java.awt.Dimension(40, 40));

        jLabelCambiarAccion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelCambiarAccion.setText("Cambiar acciones:");

        jComboBoxCambiarAccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Botones", "Opciones" }));

        javax.swing.GroupLayout jPanelCambiarAccionesLayout = new javax.swing.GroupLayout(jPanelCambiarAcciones);
        jPanelCambiarAcciones.setLayout(jPanelCambiarAccionesLayout);
        jPanelCambiarAccionesLayout.setHorizontalGroup(
            jPanelCambiarAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCambiarAccionesLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabelCambiarAccion)
                .addGap(52, 52, 52)
                .addComponent(jComboBoxCambiarAccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanelCambiarAccionesLayout.setVerticalGroup(
            jPanelCambiarAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCambiarAccionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCambiarAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCambiarAccion)
                    .addComponent(jComboBoxCambiarAccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanelAcciones.add(jPanelCambiarAcciones, java.awt.BorderLayout.PAGE_START);

        jPanelSubAcciones.setLayout(new java.awt.CardLayout());

        jButtonB1.setText("B1");

        jButtonB2.setText("B2");

        jButtonB3.setText("B3");

        jButtonB4.setText("B3");

        javax.swing.GroupLayout jPanelBotonesLayout = new javax.swing.GroupLayout(jPanelBotones);
        jPanelBotones.setLayout(jPanelBotonesLayout);
        jPanelBotonesLayout.setHorizontalGroup(
            jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotonesLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jButtonB1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jButtonB2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jButtonB3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jButtonB4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanelBotonesLayout.setVerticalGroup(
            jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotonesLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonB1)
                    .addComponent(jButtonB2)
                    .addComponent(jButtonB3)
                    .addComponent(jButtonB4))
                .addContainerGap(196, Short.MAX_VALUE))
        );

        jPanelSubAcciones.add(jPanelBotones, "card2");

        jCheckBoxLeer.setText("Leer");

        jCheckBoxEscalada.setText("Escalada");

        jCheckBoxEsquiar.setText("Esquiar");

        jCheckBoxSubmarinismo.setText("Submarinismo");

        javax.swing.GroupLayout jPanelOpcionesLayout = new javax.swing.GroupLayout(jPanelOpciones);
        jPanelOpciones.setLayout(jPanelOpcionesLayout);
        jPanelOpcionesLayout.setHorizontalGroup(
            jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOpcionesLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxLeer, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxEsquiar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addGroup(jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxEscalada, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxSubmarinismo))
                .addGap(75, 75, 75))
        );
        jPanelOpcionesLayout.setVerticalGroup(
            jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOpcionesLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxLeer)
                    .addComponent(jCheckBoxEscalada))
                .addGap(39, 39, 39)
                .addGroup(jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxSubmarinismo)
                    .addComponent(jCheckBoxEsquiar))
                .addContainerGap(135, Short.MAX_VALUE))
        );

        jPanelSubAcciones.add(jPanelOpciones, "card3");

        jPanelAcciones.add(jPanelSubAcciones, java.awt.BorderLayout.CENTER);

        jPanelCentral.add(jPanelAcciones, "card3");

        jPanelVentanaPrincipal.add(jPanelCentral, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelVentanaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelVentanaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonResultadosActionPerformed

    }//GEN-LAST:event_jRadioButtonResultadosActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupPaneles;
    private javax.swing.JButton jButtonB1;
    private javax.swing.JButton jButtonB2;
    private javax.swing.JButton jButtonB3;
    private javax.swing.JButton jButtonB4;
    private javax.swing.JCheckBox jCheckBoxEscalada;
    private javax.swing.JCheckBox jCheckBoxEsquiar;
    private javax.swing.JCheckBox jCheckBoxLeer;
    private javax.swing.JCheckBox jCheckBoxSubmarinismo;
    private javax.swing.JComboBox<String> jComboBoxCambiarAccion;
    private javax.swing.JLabel jLabelCambiarAccion;
    private javax.swing.JLabel jLabelPaneles;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelAcciones;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JPanel jPanelCambiarAcciones;
    private javax.swing.JPanel jPanelCentral;
    private javax.swing.JPanel jPanelOpciones;
    private javax.swing.JPanel jPanelOpcionesPaneles;
    private javax.swing.JPanel jPanelSubAcciones;
    private javax.swing.JPanel jPanelVentanaPrincipal;
    private javax.swing.JRadioButton jRadioButtonAcciones;
    private javax.swing.JRadioButton jRadioButtonResultados;
    // End of variables declaration//GEN-END:variables
}
