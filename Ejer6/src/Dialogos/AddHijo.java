/*
 * Jairo Gómez González
 */
package Dialogos;

import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;

/**
 *
 * @author jairo
 */
public class AddHijo extends javax.swing.JDialog {

    // Constructor por defecto de la clase AddHijo
    public AddHijo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        inicializarNiveles(); // Se inicializa el Spinner de niveles
        inicializarFechaNacimiento(); // Se inicializa el Spinner de la fecha de nacimiento
    }

    // Método para inicializar el Spinner de niveles 
    private void inicializarNiveles() {
        String[] niveles = {"Inicial", "Medio", "Avanzado", "Profesional"}; // Se definen los niveles en un array
        SpinnerListModel modeloSpinnerNiveles = new SpinnerListModel(niveles); // Se crea un modelo para el Spinner de niveles

        // Se aplica el modelo de Spinner al componente jSpinnerNiveles
        jSpinnerNiveles.setModel(modeloSpinnerNiveles);
    }
    
    // Se añade un Listener a jButtonAñadir
    public void addAñadirAction(ActionListener listener){
        jButtonAñadir.addActionListener(listener);
    }

    // Método para inicializar el Spinner de la fecha de nacimiento
    private void inicializarFechaNacimiento() {
        // Se establece la fecha inicial
        Date fechaInicial = new Date(); // Fecha actual como valor por defecto

        // Se crea un modelo de SpinnerDateModel con la fecha inicial y se establece el rango de fechas
        SpinnerDateModel modeloSpinnerFechaNacimiento = new SpinnerDateModel(
                fechaInicial, // Fecha inicial
                null, // Fecha más temprana
                null, // Fecha más tardía
                java.util.Calendar.DAY_OF_MONTH // Tipo de cambio
        );

        // Se aplica el modelo de Spinner al componente jSpinnerFechaNacimiento
        jSpinnerFechaNacimiento.setModel(modeloSpinnerFechaNacimiento);

        // Se establece el formato de visualización de la fecha
        JSpinner.DateEditor editor = new JSpinner.DateEditor(jSpinnerFechaNacimiento, "dd/MM/yyyy");
        jSpinnerFechaNacimiento.setEditor(editor); // Se establece el editor al spinner

        // Se establece el formato inicial de fecha para el jSpiner
        jSpinnerFechaNacimiento.setValue(fechaInicial);
    }

    // Método para obtener el nombre
    public String getNombre(){
        return jTextFieldNombre.getText();
    }
    
    // Método para obtener los apellidos
    public String getApellidos() {
        return jTextFieldApellidos.getText();
    }
    
    
    // Método para obtener el deporte seleccionado
    public String getDeporte() {
        return (String) jComboBoxDeportes.getSelectedItem();
    }

    // Método para obtener el nivel seleccionado
    public String getNivel() {
        return (String) jSpinnerNiveles.getValue();
    }
    
    // Método para obtener la fecha de nacimiento
    public Date getFechaNacimiento(){
        return (Date) jSpinnerFechaNacimiento.getValue();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jLabelDatos = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelApellidos = new javax.swing.JLabel();
        jTextFieldApellidos = new javax.swing.JTextField();
        jLabelDeporte = new javax.swing.JLabel();
        jComboBoxDeportes = new javax.swing.JComboBox<>();
        jLabelNivel = new javax.swing.JLabel();
        jSpinnerNiveles = new javax.swing.JSpinner();
        jPanelFechaNacimiento = new javax.swing.JPanel();
        jLabelFechaNacimiento = new javax.swing.JLabel();
        jSpinnerFechaNacimiento = new javax.swing.JSpinner();
        jButtonAñadir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabelTitulo.setText("Añadir Hijo");

        jLabelDatos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelDatos.setText("Datos");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabelNombre.setText("Nombre:");

        jLabelApellidos.setText("Apellidos:");

        jLabelDeporte.setText("Deporte:");

        jComboBoxDeportes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tenis", "Padel", "Squash" }));

        jLabelNivel.setText("Nivel:");

        jPanelFechaNacimiento.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabelFechaNacimiento.setText("Fecha de Nacimiento:");

        javax.swing.GroupLayout jPanelFechaNacimientoLayout = new javax.swing.GroupLayout(jPanelFechaNacimiento);
        jPanelFechaNacimiento.setLayout(jPanelFechaNacimientoLayout);
        jPanelFechaNacimientoLayout.setHorizontalGroup(
            jPanelFechaNacimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFechaNacimientoLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabelFechaNacimiento)
                .addGap(18, 18, 18)
                .addComponent(jSpinnerFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanelFechaNacimientoLayout.setVerticalGroup(
            jPanelFechaNacimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFechaNacimientoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanelFechaNacimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFechaNacimiento)
                    .addComponent(jSpinnerFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabelNombre)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabelApellidos)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldApellidos)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelNivel)
                                    .addComponent(jLabelDeporte))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSpinnerNiveles, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxDeportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanelFechaNacimiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelApellidos)
                    .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxDeportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDeporte))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinnerNiveles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNivel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jPanelFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jButtonAñadir.setText("AÑADIR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(jLabelTitulo))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelDatos)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonAñadir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo)
                .addGap(18, 18, 18)
                .addComponent(jLabelDatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jButtonAñadir)
                .addContainerGap())
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
            java.util.logging.Logger.getLogger(AddHijo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddHijo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddHijo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddHijo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddHijo dialog = new AddHijo(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButtonAñadir;
    private javax.swing.JComboBox<String> jComboBoxDeportes;
    private javax.swing.JLabel jLabelApellidos;
    private javax.swing.JLabel jLabelDatos;
    private javax.swing.JLabel jLabelDeporte;
    private javax.swing.JLabel jLabelFechaNacimiento;
    private javax.swing.JLabel jLabelNivel;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelFechaNacimiento;
    private javax.swing.JSpinner jSpinnerFechaNacimiento;
    private javax.swing.JSpinner jSpinnerNiveles;
    private javax.swing.JTextField jTextFieldApellidos;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables

}
