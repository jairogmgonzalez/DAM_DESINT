/*
 * Jairo Gómez González
 */
package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author jairo
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    // Constructor de la clase VentanaPrincipal
    public VentanaPrincipal() {
        initComponents();
    }

    // Se añade un Listener a jButtonMezclar
    public void addMezclarAction(ActionListener listener) {
        jButtonMezclar.addActionListener(listener);
    }

    public void addReiniciarAction(ActionListener listener) {
        jButtonReiniciar.addActionListener(listener);
    }

    // Método para obtener el primer nombre
    public String getPrimerNombre() {
        return jTextFieldNombre1.getText();
    }

    // Método para obtener el segundo nombre
    public String getSegundoNombre() {
        return jTextFieldNombre2.getText();
    }

    // Método para mostrar las mezclas de nombres en la zona de resultado
    public void mostrarResultados(ArrayList<String> mezclasNombres) {
        // Se itera sobre cada valor de la lista de mezclas de nombres y se añade a jTextFieldResultados
        for (String mezclaNombre : mezclasNombres) {
            jTextFieldResultados.setText(jTextFieldResultados.getText() + mezclaNombre);
        }
    }

    // Método para activar la zona donde se mostrarán los resultados y el botón de reiniciar
    public void activarResultadoYReiniciar() {
        jTextFieldResultados.setEnabled(true);
        jTextFieldResultados.setEditable(false);
        jButtonReiniciar.setEnabled(true);
        jButtonMezclar.setEnabled(false);
    }

    // Método para limpiar toda la ventana
    public void limpiarVentana() {
        jTextFieldNombre1.setText(null);
        jTextFieldNombre2.setText(null);
        jTextFieldResultados.setText(null);
        jTextFieldResultados.setEnabled(false);
        jButtonReiniciar.setEnabled(false);
        jButtonMezclar.setEnabled(true);
    }

    // Método para mostrar un mensaje de error si no se recibe un nombre con la longitud obligatoria
    public void mostrarMensajeError() {
        String mensajeError = "La longitud obligatoria para un nombre es de 4 carácteres";
        JOptionPane.showMessageDialog(null, mensajeError, "Error con los nombres", JOptionPane.ERROR_MESSAGE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNombre1 = new javax.swing.JTextField();
        jTextFieldNombre2 = new javax.swing.JTextField();
        jButtonMezclar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldResultados = new javax.swing.JTextField();
        jButtonReiniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mezclador de nombres");

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setText("Mezcladora de nombres de pareja");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Ingresa el primer nombre:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Ingresa el segundo nombre:");

        jButtonMezclar.setBackground(new java.awt.Color(204, 204, 204));
        jButtonMezclar.setText("Mezclar");

        jLabel4.setText("Estos son los posibles nombres mezclados:");

        jTextFieldResultados.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jTextFieldResultados.setForeground(new java.awt.Color(51, 51, 255));
        jTextFieldResultados.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldResultados.setEnabled(false);

        jButtonReiniciar.setText("Reiniciar");
        jButtonReiniciar.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonMezclar))
                            .addComponent(jTextFieldNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldResultados)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jButtonReiniciar)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMezclar))
                .addGap(42, 42, 42)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonReiniciar)
                .addContainerGap(31, Short.MAX_VALUE))
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
    private javax.swing.JButton jButtonMezclar;
    private javax.swing.JButton jButtonReiniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextFieldNombre1;
    private javax.swing.JTextField jTextFieldNombre2;
    private javax.swing.JTextField jTextFieldResultados;
    // End of variables declaration//GEN-END:variables
}
