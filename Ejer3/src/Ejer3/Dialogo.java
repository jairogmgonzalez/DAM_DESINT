/*
 * Jairo Gómez González
 */
package Ejer3;

/**
 *
 * @author jairo
 */
public class Dialogo extends javax.swing.JDialog {

    // Variable para actualizar la Ventana Principal
    VentanaPrincipal p;
    
    public Dialogo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        p = (VentanaPrincipal) parent; // Se guarda la referencia a la Ventana Principal
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonVolver = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("¿Está seguro que desea salir?");

        jButtonVolver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        jButtonSalir.setBackground(new java.awt.Color(255, 51, 51));
        jButtonSalir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(103, 103, 103))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jButtonVolver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSalir)
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVolver)
                    .addComponent(jButtonSalir))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Método que se ejecuta al hacer click en jButtonVolver
    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        dispose(); // Se cierra el dialogo
    }//GEN-LAST:event_jButtonVolverActionPerformed

    // Método que se ejecuta al hacer click en jButtonSalir
    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        p.cerrarVentanaPrincipal(); // Se llama al método cerrarVentanaPrincipal de la Ventana Principal
    }//GEN-LAST:event_jButtonSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Dialogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dialogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dialogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dialogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Dialogo dialog = new Dialogo(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
