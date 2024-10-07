/*
 * Jairo Gómez González
 */
package Ejer1;

/**
 *
 * @author jairo
 */
public class Ejer1 extends javax.swing.JFrame {

    // Constructor de la Clase Ejer1
    public Ejer1() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldNum1 = new javax.swing.JTextField();
        jTextFieldNum2 = new javax.swing.JTextField();
        jButtonSumar = new javax.swing.JButton();
        jButtonRestar = new javax.swing.JButton();
        jLabelResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Suma y Resta");

        jButtonSumar.setText("Sumar");
        jButtonSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSumarActionPerformed(evt);
            }
        });

        jButtonRestar.setText("Restar");
        jButtonRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRestarActionPerformed(evt);
            }
        });

        jLabelResultado.setText("El resultado de la operación es: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonSumar)
                    .addComponent(jTextFieldNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldNum2, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                        .addGap(55, 55, 55))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonRestar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSumar)
                    .addComponent(jButtonRestar))
                .addGap(18, 18, 18)
                .addComponent(jLabelResultado)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Método que se ejecuta al hacer click en jButtonSumar
    private void jButtonSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSumarActionPerformed

        // Se crean las variables para recoger los números en ambos TextFields
        double num1 = 0;
        double num2 = 0;

        // Se intenta parsear los valores de ambos TextField de texto a número
        try {
            num1 = Double.parseDouble(jTextFieldNum1.getText());
            num2 = Double.parseDouble(jTextFieldNum2.getText());
            /* Si algunos de los valores no es un número, se mostrará un mensaje de error en el jLabelResultado4
            y se terminará el método
             */
        } catch (NumberFormatException e) {
            jLabelResultado.setText("Por favor, introduce un número válido");
            return;
        }

        // Si los valores son válidos, se realiza la operación de suma y se muestra el resultado
        jLabelResultado.setText("El resultado de la operación es: " + (num1 + num2));

        // Se restablecen los TextField de ambos números a un campo vacío
        jTextFieldNum1.setText("");
        jTextFieldNum2.setText("");
    }//GEN-LAST:event_jButtonSumarActionPerformed

    // Método que se ejecuta al hacer click en jButtonRestar
    private void jButtonRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRestarActionPerformed

        // Se crean las variables para recoger los números en ambos TextFields
        double num1 = 0;
        double num2 = 0;

        // Se intenta parsear los valores de ambos TextField de texto a número
        try {
            num1 = Double.parseDouble(jTextFieldNum1.getText());
            num2 = Double.parseDouble(jTextFieldNum2.getText());
            /* Si algunos de los valores no es un número, se mostrará un mensaje de error en el jLabelResultado4
            y se terminará el método
            */
        } catch (NumberFormatException e) {
            jLabelResultado.setText("Por favor, introduce un número válido");
            return;
        }

        // Si los valores son válidos, se realiza la operación de resta y se muestra el resultado
        jLabelResultado.setText("El resultado de la operación es: " + (num1 + num2));

        // Se restablecen los TextField de ambos números a un campo vacío
        jTextFieldNum1.setText("");
        jTextFieldNum2.setText("");
    }//GEN-LAST:event_jButtonRestarActionPerformed

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
            java.util.logging.Logger.getLogger(Ejer1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejer1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejer1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejer1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejer1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRestar;
    private javax.swing.JButton jButtonSumar;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JTextField jTextFieldNum1;
    private javax.swing.JTextField jTextFieldNum2;
    // End of variables declaration//GEN-END:variables
}
