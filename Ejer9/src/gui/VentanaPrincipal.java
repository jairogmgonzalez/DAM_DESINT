/*
 * Jairo Gómez González
 */
package gui;

import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentListener;

/**
 *
 * @author jairo
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    // Constructor por defecto de la clase VentanaPrincipal
    public VentanaPrincipal() {
        initComponents();
        deshabilitarPanelEspejo();
    }

    // Método para establecer todos los componentes de jPanelEspejo como falso
    private void deshabilitarPanelEspejo() {
        Component[] componentes = jPanelEspejo.getComponents(); // Se obtienen todos los componentes de jPanelEspejo

        // Se recorre el array de cada componentes y se establece cada uno como falso
        for (Component componente : componentes) {
            componente.setEnabled(false);
        }
    }

    // Método para añadir un Listener a jRadioButtonOriginal1
    public void addRadioButtonOriginal1(ActionListener listener) {
        jRadioButtonOriginal1.addActionListener(listener);
    }

    // Método para añadir un Listener a jRadioButtonOriginal2
    public void addRadioButtonOriginal2(ActionListener listener) {
        jRadioButtonOriginal2.addActionListener(listener);
    }

    // Método para añadir un Listener a jRadioButtonOriginal3
    public void addRadioButtonOriginal3(ActionListener listener) {
        jRadioButtonOriginal3.addActionListener(listener);
    }

    // Método para añadir un Listener a jCheckBoxOriginal4
    public void addCheckBoxOriginal4(ItemListener listener) {
        jCheckBoxOriginal4.addItemListener(listener);
    }

    // Método para añadir un Listener a jCheckBoxOriginal5
    public void addCheckBoxOriginal5(ItemListener listener) {
        jCheckBoxOriginal5.addItemListener(listener);
    }

    // Método para añadir un Listener a jCheckBoxOriginal6
    public void addCheckBoxOriginal6(ItemListener listener) {
        jCheckBoxOriginal6.addItemListener(listener);
    }

    // Método para añadir un Listener a jTextFieldOriginal
    public void addTextFieldOriginal(DocumentListener listener) {
        jTextFieldOriginal.getDocument().addDocumentListener(listener);
    }

    // Método para añadir un Listener a jComboBoxOriginal
    public void addComboBoxOriginal(ActionListener listener) {
        jComboBoxOriginal.addActionListener(listener);
    }

    // Método para añadir un Listener a jSpinnerOriginal
    public void addSpinnerOriginal(ChangeListener listener) {
        jSpinnerOriginal.addChangeListener(listener);
    }

    // Método para cambiar el estado de selección de jRadioButtonEspejo1 según el estado del original
    public void radioButtonEspejo1Cambiar() {
        boolean originalSeleccionado = jRadioButtonOriginal1.isSelected();
        jRadioButtonEspejo1.setSelected(originalSeleccionado);
    }

    // Método para cambiar el estado de selección de jRadioButtonEspejo2 según el estado del original
    public void radioButtonEspejo2Cambiar() {
        boolean originalSeleccionado = jRadioButtonOriginal2.isSelected();
        jRadioButtonEspejo2.setSelected(originalSeleccionado);
    }

    // Método para cambiar el estado de selección de jRadioButtonEspejo3 según el estado del original
    public void radioButtonEspejo3Cambiar() {
        boolean originalSeleccionado = jRadioButtonOriginal3.isSelected();
        jRadioButtonEspejo3.setSelected(originalSeleccionado);
    }

    // Método para cambiar el estado de selección de jCheckBoxEspejo4 según el estado del original
    public void checkBoxEspejo4Cambiar() {
        boolean originalSeleccionado = jCheckBoxOriginal4.isSelected();
        jCheckBoxEspejo4.setSelected(originalSeleccionado);
    }

    // Método para cambiar el estado de selección de jCheckBoxEspejo5 según el estado del original
    public void checkBoxEspejo5Cambiar() {
        boolean originalSeleccionado = jCheckBoxOriginal5.isSelected();
        jCheckBoxEspejo5.setSelected(originalSeleccionado);
    }

    // Método para cambiar el estado de selección de jCheckBoxEspejo6 según el estado del original
    public void checkBoxEspejo6Cambiar() {
        boolean originalSeleccionado = jCheckBoxOriginal6.isSelected();
        jCheckBoxEspejo6.setSelected(originalSeleccionado);
    }

    // Método para añadir el texto de jTextFieldOriginal a jTextFieldEspejo
    public void textFieldEspejoActualizar() {
        String textoOriginal = jTextFieldOriginal.getText();
        jTextFieldEspejo.setText(textoOriginal);
    }

    // Método para seleccionar el mismo item en jComboBoxEspejo que jComboBoxOriginal
    public void comboBoxEspejoActualizar() {
        int itemOriginal = jComboBoxOriginal.getSelectedIndex();
        jComboBoxEspejo.setSelectedIndex(itemOriginal);
    }

    // Método para seleccionar el mismo item en jSpinnerEspejo que jSpinnerOriginal
    public void spinnerEspejoActualizar() {
        Object valor = jSpinnerOriginal.getValue();
        jSpinnerEspejo.setValue(valor);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupOriginal = new javax.swing.ButtonGroup();
        jPanelEspejo = new javax.swing.JPanel();
        jLabelEspejo = new javax.swing.JLabel();
        jRadioButtonEspejo1 = new javax.swing.JRadioButton();
        jRadioButtonEspejo2 = new javax.swing.JRadioButton();
        jRadioButtonEspejo3 = new javax.swing.JRadioButton();
        jCheckBoxEspejo4 = new javax.swing.JCheckBox();
        jCheckBoxEspejo5 = new javax.swing.JCheckBox();
        jCheckBoxEspejo6 = new javax.swing.JCheckBox();
        jTextFieldEspejo = new javax.swing.JTextField();
        jSpinnerEspejo = new javax.swing.JSpinner();
        jComboBoxEspejo = new javax.swing.JComboBox<>();
        jSeparator = new javax.swing.JSeparator();
        jPanelOriginal = new javax.swing.JPanel();
        jLabelOriginal = new javax.swing.JLabel();
        jRadioButtonOriginal1 = new javax.swing.JRadioButton();
        jRadioButtonOriginal2 = new javax.swing.JRadioButton();
        jRadioButtonOriginal3 = new javax.swing.JRadioButton();
        jCheckBoxOriginal4 = new javax.swing.JCheckBox();
        jCheckBoxOriginal5 = new javax.swing.JCheckBox();
        jCheckBoxOriginal6 = new javax.swing.JCheckBox();
        jTextFieldOriginal = new javax.swing.JTextField();
        jSpinnerOriginal = new javax.swing.JSpinner();
        jComboBoxOriginal = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Imitador");

        jLabelEspejo.setText("Espejo");

        jRadioButtonEspejo1.setText("Opción 1");

        jRadioButtonEspejo2.setText("Opción 2");

        jRadioButtonEspejo3.setText("Opción 3");

        jCheckBoxEspejo4.setText("Opción 4");

        jCheckBoxEspejo5.setText("Opción 5");

        jCheckBoxEspejo6.setText("Opción 6");

        jComboBoxEspejo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanelEspejoLayout = new javax.swing.GroupLayout(jPanelEspejo);
        jPanelEspejo.setLayout(jPanelEspejoLayout);
        jPanelEspejoLayout.setHorizontalGroup(
            jPanelEspejoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEspejoLayout.createSequentialGroup()
                .addGroup(jPanelEspejoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEspejoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelEspejo))
                    .addGroup(jPanelEspejoLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanelEspejoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonEspejo1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButtonEspejo2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButtonEspejo3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanelEspejoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxEspejo4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBoxEspejo6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBoxEspejo5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(jPanelEspejoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxEspejo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelEspejoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldEspejo, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                .addComponent(jSpinnerEspejo)))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanelEspejoLayout.setVerticalGroup(
            jPanelEspejoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEspejoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelEspejo)
                .addGap(18, 18, 18)
                .addGroup(jPanelEspejoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonEspejo1)
                    .addComponent(jCheckBoxEspejo4)
                    .addComponent(jTextFieldEspejo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelEspejoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonEspejo2)
                    .addComponent(jCheckBoxEspejo5)
                    .addComponent(jComboBoxEspejo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelEspejoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonEspejo3)
                    .addComponent(jCheckBoxEspejo6)
                    .addComponent(jSpinnerEspejo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jLabelOriginal.setText("Original");

        buttonGroupOriginal.add(jRadioButtonOriginal1);
        jRadioButtonOriginal1.setText("Opción 1");

        buttonGroupOriginal.add(jRadioButtonOriginal2);
        jRadioButtonOriginal2.setText("Opción 2");

        buttonGroupOriginal.add(jRadioButtonOriginal3);
        jRadioButtonOriginal3.setText("Opción 3");

        jCheckBoxOriginal4.setText("Opción 4");

        jCheckBoxOriginal5.setText("Opción 5");

        jCheckBoxOriginal6.setText("Opción 6");

        jComboBoxOriginal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanelOriginalLayout = new javax.swing.GroupLayout(jPanelOriginal);
        jPanelOriginal.setLayout(jPanelOriginalLayout);
        jPanelOriginalLayout.setHorizontalGroup(
            jPanelOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOriginalLayout.createSequentialGroup()
                .addGroup(jPanelOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelOriginalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelOriginal))
                    .addGroup(jPanelOriginalLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanelOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonOriginal1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButtonOriginal2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButtonOriginal3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanelOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxOriginal4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBoxOriginal6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBoxOriginal5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(jPanelOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldOriginal, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                .addComponent(jSpinnerOriginal)))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanelOriginalLayout.setVerticalGroup(
            jPanelOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOriginalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelOriginal)
                .addGap(18, 18, 18)
                .addGroup(jPanelOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonOriginal1)
                    .addComponent(jCheckBoxOriginal4)
                    .addComponent(jTextFieldOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonOriginal2)
                    .addComponent(jCheckBoxOriginal5)
                    .addComponent(jComboBoxOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonOriginal3)
                    .addComponent(jCheckBoxOriginal6)
                    .addComponent(jSpinnerOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelEspejo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator)
            .addComponent(jPanelOriginal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelEspejo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    private javax.swing.ButtonGroup buttonGroupOriginal;
    private javax.swing.JCheckBox jCheckBoxEspejo4;
    private javax.swing.JCheckBox jCheckBoxEspejo5;
    private javax.swing.JCheckBox jCheckBoxEspejo6;
    private javax.swing.JCheckBox jCheckBoxOriginal4;
    private javax.swing.JCheckBox jCheckBoxOriginal5;
    private javax.swing.JCheckBox jCheckBoxOriginal6;
    private javax.swing.JComboBox<String> jComboBoxEspejo;
    private javax.swing.JComboBox<String> jComboBoxOriginal;
    private javax.swing.JLabel jLabelEspejo;
    private javax.swing.JLabel jLabelOriginal;
    private javax.swing.JPanel jPanelEspejo;
    private javax.swing.JPanel jPanelOriginal;
    private javax.swing.JRadioButton jRadioButtonEspejo1;
    private javax.swing.JRadioButton jRadioButtonEspejo2;
    private javax.swing.JRadioButton jRadioButtonEspejo3;
    private javax.swing.JRadioButton jRadioButtonOriginal1;
    private javax.swing.JRadioButton jRadioButtonOriginal2;
    private javax.swing.JRadioButton jRadioButtonOriginal3;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JSpinner jSpinnerEspejo;
    private javax.swing.JSpinner jSpinnerOriginal;
    private javax.swing.JTextField jTextFieldEspejo;
    private javax.swing.JTextField jTextFieldOriginal;
    // End of variables declaration//GEN-END:variables
}
