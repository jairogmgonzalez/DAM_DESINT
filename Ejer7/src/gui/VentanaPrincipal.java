/*
 * Jairo Gómez González
 */
package gui;

import java.awt.Color;
import java.awt.Component;
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

    // Se añade un Listener a jButtonAzul
    public void addButtonAzulAction(ActionListener listener) {
        jButtonAzul.addActionListener(listener);
    }

    // Se añade un Listener a jButtonRojo
    public void addButtonRojoAction(ActionListener listener) {
        jButtonRojo.addActionListener(listener);
    }

    // Se añade un Listener a jButtonVerde
    public void addButtonVerdeAction(ActionListener listener) {
        jButtonVerde.addActionListener(listener);
    }

    // Se añade un Listener a jButtonRosa
    public void addButtonRosaAction(ActionListener listener) {
        jButtonRosa.addActionListener(listener);
    }

    // Se añade un Listener a jButtonRestablecer
    public void addRestablecerAction(ActionListener listener) {
        jButtonRestablecer.addActionListener(listener);
    }

    // Método para obtener la zona del listado que se desea modificar
    public String obtenerZona() {
        // Se verifica que jRadioButton está seleccionado
        if (jRadioButtonRejilla.isSelected()) { // Si el jRadioButtonRejilla está seleccionado
            return jRadioButtonRejilla.getText(); // Se devuelve "Rejilla"
        } else if (jRadioButtonFondo.isSelected()) { // Si el jRadioButtonFondo está seleccionad
            return jRadioButtonFondo.getText(); // Se devuelve "Fondo"
        } else if (jRadioButtonListado.isSelected()) { // Si el jRadioButtonListado está seleccionado
            return jRadioButtonListado.getText(); // Se devuelve "Listado"
        }
        
        return null; // Se devuelve null
    }

    // Método para cambiar fondo del panel rejilla
    public void cambiarColorRejilla(Color color){
        jPanelRejilla.setBackground(color);
    }
    
    // Método para cambiar el color del panel de fondo
    public void cambiarColorFondo(Color color) {
        jPanelFondo.setBackground(color);
    }
    
    // Método para cambiar color del panel listado
    public void cambiarColorListado(Color color){
        jPanelListado.setBackground(color);
        
        // Se itera sobre cada componente (jRadioButtons) de jPanelListado y se cambia también su color de fondo
        for(Component componente : jPanelListado.getComponents()){
            componente.setBackground(color);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listadoZonas = new javax.swing.ButtonGroup();
        jPanelFondo = new javax.swing.JPanel();
        jPanelRejilla = new javax.swing.JPanel();
        jButtonAzul = new javax.swing.JButton();
        jButtonRojo = new javax.swing.JButton();
        jButtonVerde = new javax.swing.JButton();
        jButtonRosa = new javax.swing.JButton();
        jButtonRestablecer = new javax.swing.JButton();
        jPanelListado = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jRadioButtonRejilla = new javax.swing.JRadioButton();
        jRadioButtonFondo = new javax.swing.JRadioButton();
        jRadioButtonListado = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelRejilla.setBackground(new java.awt.Color(0, 0, 0));
        jPanelRejilla.setLayout(new java.awt.GridLayout(2, 2, 10, 10));

        jButtonAzul.setText("Azul");
        jPanelRejilla.add(jButtonAzul);

        jButtonRojo.setText("Rojo");
        jPanelRejilla.add(jButtonRojo);

        jButtonVerde.setText("Verde");
        jPanelRejilla.add(jButtonVerde);

        jButtonRosa.setText("Rosa");
        jPanelRejilla.add(jButtonRosa);

        jButtonRestablecer.setText("Restablecer");

        jPanelListado.setBackground(new java.awt.Color(204, 204, 204));
        jPanelListado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelListado.setLayout(new javax.swing.BoxLayout(jPanelListado, javax.swing.BoxLayout.PAGE_AXIS));

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabelTitulo.setText("LISTADO");
        jPanelListado.add(jLabelTitulo);

        jRadioButtonRejilla.setBackground(new java.awt.Color(204, 204, 204));
        listadoZonas.add(jRadioButtonRejilla);
        jRadioButtonRejilla.setSelected(true);
        jRadioButtonRejilla.setText("Rejilla");
        jPanelListado.add(jRadioButtonRejilla);

        jRadioButtonFondo.setBackground(new java.awt.Color(204, 204, 204));
        listadoZonas.add(jRadioButtonFondo);
        jRadioButtonFondo.setText("Fondo");
        jPanelListado.add(jRadioButtonFondo);

        jRadioButtonListado.setBackground(new java.awt.Color(204, 204, 204));
        listadoZonas.add(jRadioButtonListado);
        jRadioButtonListado.setText("Listado");
        jPanelListado.add(jRadioButtonListado);

        javax.swing.GroupLayout jPanelFondoLayout = new javax.swing.GroupLayout(jPanelFondo);
        jPanelFondo.setLayout(jPanelFondoLayout);
        jPanelFondoLayout.setHorizontalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondoLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jPanelRejilla, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelListado, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRestablecer, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanelFondoLayout.setVerticalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jPanelRejilla, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jPanelListado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonRestablecer)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JButton jButtonAzul;
    private javax.swing.JButton jButtonRestablecer;
    private javax.swing.JButton jButtonRojo;
    private javax.swing.JButton jButtonRosa;
    private javax.swing.JButton jButtonVerde;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JPanel jPanelListado;
    private javax.swing.JPanel jPanelRejilla;
    private javax.swing.JRadioButton jRadioButtonFondo;
    private javax.swing.JRadioButton jRadioButtonListado;
    private javax.swing.JRadioButton jRadioButtonRejilla;
    private javax.swing.ButtonGroup listadoZonas;
    // End of variables declaration//GEN-END:variables

}
