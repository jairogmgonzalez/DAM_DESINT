/*
 * Jairo Gómez González
 */
package Ejer2;

/**
 *
 * @author jairo
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    // Variable para la ventana Diálogo que se mostrará 
    private Dialogo d;

    // Constructor de la clase VentanaPrincipal
    public VentanaPrincipal() {
        initComponents();
    }

    // Método para actualizar el jLabelResultado con la conversión de euros a pesetas
    public void actualizarjLabelResultado(double euros, double pesetas) {
        // Se redondea el valor de las pesetas a dos decimales
        pesetas = Math.round(pesetas * 100.0) / 100.0;
        // Se actualiza el valor del jLabelResultado mostrando el resultado de la conversión
        jLabelResultado.setText(euros + " euros son: " + pesetas + " pesetas");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonIngresar = new javax.swing.JButton();
        jLabelResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor de Euros a Pesetas");
        setSize(new java.awt.Dimension(300, 400));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Convertidor de Euros a Pesetas");

        jButtonIngresar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonIngresar.setText("Ingresa cantidad");
        jButtonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresarActionPerformed(evt);
            }
        });

        jLabelResultado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jButtonIngresar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(89, 89, 89)
                .addComponent(jButtonIngresar)
                .addGap(68, 68, 68)
                .addComponent(jLabelResultado)
                .addContainerGap(166, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Método que se ejecuta al hacer click en jButtonIngresar
    private void jButtonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresarActionPerformed
        d = new Dialogo(this, true); // Se inicializa la ventana Diálogo como modal
        d.setVisible(true); // Se muestra el diálogo
    }//GEN-LAST:event_jButtonIngresarActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelResultado;
    // End of variables declaration//GEN-END:variables

}
