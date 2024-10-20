/*
 * Jairo Gómez González
 */
package Ventanas;

import dto.Hijo;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JTable;
import javax.swing.SpinnerListModel;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jairo
 */
public class VentanaRegistro extends javax.swing.JFrame {

    // Constructor de la clase VentanaRegistro
    public VentanaRegistro() {
        try {
            // Cambia "Nimbus" por el Look and Feel que desees (Metal, Nimbus, CDE/Motif, GTK+, etc.)
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            // Si Nimbus no está disponible, puedes establecer el look and feel por defecto.
            java.util.logging.Logger.getLogger(VentanaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        initComponents();
        inicializarNiveles(); // Se inicializa el Spinner de niveles
        inicializarTabla(); // Se inicializa la Tabla de hijos

    }

    // Método para inicializar el Spinner de niveles 
    private void inicializarNiveles() {
        String[] niveles = {"Inicial", "Medio", "Avanzado", "Profesional"}; // Se definen los niveles en un array
        SpinnerListModel modeloSpinnerNiveles = new SpinnerListModel(niveles); // Se crea un modelo para el Spinner de niveles

        // Se aplica el modelo de Spinner al componente jSpinnerNiveles
        jSpinnerNiveles.setModel(modeloSpinnerNiveles);
    }

    // Método para inicializar la tabla que contendra los datos de cada hijo registrado
    private void inicializarTabla() {
        DefaultTableModel modeloTabla = new DefaultTableModel(); // Se crea un modelo de tabla por defecto

        // Se establecen las columnas que tendra la tabla
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Apellidos");
        modeloTabla.addColumn("Deporte");
        modeloTabla.addColumn("Nivel");
        modeloTabla.addColumn("F.Nacimiento");

        jTableHijos.setModel(modeloTabla); // Se aplica el modelo de tabla creado al componente jTableHijos
        jScrollPaneHijos.setVisible(false); // Se establece el jScrollPane de la tabla como no visible para no mostrar la tabla al abrir la ventana
        jTableHijos.setVisible(true); // Se establece la tabla como visible
    }

    // Método para mostrar la tabla
    public void mostrarTabla() {
        jScrollPaneHijos.setVisible(true); // Hace visible el JScrollPane que contiene la tabla
        pack(); // Se ajuste el JFrame al contenido
    }

    // Método para ocultar la tabla
    public void ocultarTabla() {
        jScrollPaneHijos.setVisible(false); // Oculta el JScrollPane que contiene la tabla
        pack(); // Se ajuste el JFrame al contenido
    }

    // Método para añadir un registro de hijo a la tabla
    public void añadirHijo(Hijo h) {
        DefaultTableModel modeloTabla = (DefaultTableModel) jTableHijos.getModel();
        modeloTabla.addRow(h.toArrayString()); // Se añade un nuevo registro a la tabla
    }

    // Se añade un Listener a jButtonMatricular
    public void addMatricularAction(ActionListener listener) {
        jButtonMatricular.addActionListener(listener);
    }

    // Se añade un Listener a jButtonVerOcultarTabla
    public void addVerOcultarTablaAction(ActionListener listener) {
        jButtonVerOcultarTabla.addActionListener(listener);
    }

    // Se añade un Listener a jButtonAñadirHijo
    public void addAñadirHijoAction(ActionListener listener) {
        jButtonAñadirHijo.addActionListener(listener);
    }

    // Método para obtener el deporte seleccionado
    public String getDeporte() {
        return (String) jComboBoxDeportes.getSelectedItem();
    }

    // Método para obtener el nivel seleccionado
    public String getNivel() {
        return (String) jSpinnerNiveles.getValue();
    }

    // Método para obtener el turno seleccionado
    public String getTurno() {
        // Se verifica si se ha seleccionado el turno de mañana
        if (jRadioButtonMañana.isSelected()) {
            return "Mañana"; // Se devuelve "Mañana"
            // Se verifica si se ha seleccionado el turno de tarde
        } else if (jRadioButtonTarde.isSelected()) {
            return "Tarde"; // Se devuelve "Tarde"
        }

        return null; // Se devuelve null si no se selecciona nada
    }

    // Método para obtener el tipo de renovacion seleccionado
    public String getRenovacion() {
        // Se verifica si jCheckBoxTrimestral está seleccionado
        if (jCheckBoxTrimestral.isSelected()) {
            return "Trimestral"; // Se devuelve "Trimestral"
            // Se verifica si jCheckBoxAnual está seleccionado
        } else if (jCheckBoxAnual.isSelected()) {
            return "Anual"; // Se devuelve "Anual"
        }

        return null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupTurnos = new javax.swing.ButtonGroup();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelSeleccionaDeporte = new javax.swing.JLabel();
        jPanelDatos = new javax.swing.JPanel();
        jLabelDeporte = new javax.swing.JLabel();
        jComboBoxDeportes = new javax.swing.JComboBox<>();
        jLabelNivel = new javax.swing.JLabel();
        jSpinnerNiveles = new javax.swing.JSpinner();
        jLabelTurno = new javax.swing.JLabel();
        jRadioButtonMañana = new javax.swing.JRadioButton();
        jRadioButtonTarde = new javax.swing.JRadioButton();
        jLabelRenovacion = new javax.swing.JLabel();
        jCheckBoxTrimestral = new javax.swing.JCheckBox();
        jCheckBoxAnual = new javax.swing.JCheckBox();
        jLabelHijos = new javax.swing.JLabel();
        jPanelHijos = new javax.swing.JPanel();
        jButtonVerOcultarTabla = new javax.swing.JButton();
        jButtonAñadirHijo = new javax.swing.JButton();
        jScrollPaneHijos = new javax.swing.JScrollPane();
        jTableHijos = new javax.swing.JTable();
        jButtonMatricular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabelTitulo.setText("REGISTRO DEPORTIVO");

        jLabelSeleccionaDeporte.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelSeleccionaDeporte.setText("Selección deporte");

        jPanelDatos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabelDeporte.setText("Deporte");

        jComboBoxDeportes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tenis", "Padel", "Squash" }));

        jLabelNivel.setText("Nivel");

        jLabelTurno.setText("Turno");

        buttonGroupTurnos.add(jRadioButtonMañana);
        jRadioButtonMañana.setText("Mañana");

        buttonGroupTurnos.add(jRadioButtonTarde);
        jRadioButtonTarde.setText("Tarde");

        jLabelRenovacion.setText("Renovación");

        jCheckBoxTrimestral.setText("Trimestral");

        jCheckBoxAnual.setText("Anual");

        jLabelHijos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelHijos.setText("Hijos");

        jPanelHijos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jButtonVerOcultarTabla.setText("Ver/Ocultar Tabla");

        jButtonAñadirHijo.setText("Añadir hijo");

        jTableHijos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPaneHijos.setViewportView(jTableHijos);

        javax.swing.GroupLayout jPanelHijosLayout = new javax.swing.GroupLayout(jPanelHijos);
        jPanelHijos.setLayout(jPanelHijosLayout);
        jPanelHijosLayout.setHorizontalGroup(
            jPanelHijosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHijosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHijosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneHijos)
                    .addGroup(jPanelHijosLayout.createSequentialGroup()
                        .addComponent(jButtonVerOcultarTabla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 249, Short.MAX_VALUE)
                        .addComponent(jButtonAñadirHijo)))
                .addContainerGap())
        );
        jPanelHijosLayout.setVerticalGroup(
            jPanelHijosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHijosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHijosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVerOcultarTabla)
                    .addComponent(jButtonAñadirHijo))
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneHijos, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelDatosLayout = new javax.swing.GroupLayout(jPanelDatos);
        jPanelDatos.setLayout(jPanelDatosLayout);
        jPanelDatosLayout.setHorizontalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDatosLayout.createSequentialGroup()
                                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButtonMañana)
                                            .addComponent(jLabelTurno)
                                            .addComponent(jRadioButtonTarde)))
                                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                                        .addGap(68, 68, 68)
                                        .addComponent(jLabelDeporte)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBoxDeportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42)
                                        .addComponent(jLabelNivel)))
                                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelRenovacion)
                                            .addComponent(jCheckBoxTrimestral)
                                            .addComponent(jCheckBoxAnual)))
                                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jSpinnerNiveles, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanelDatosLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelHijos)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelHijos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelDatosLayout.setVerticalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDeporte)
                    .addComponent(jComboBoxDeportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNivel)
                    .addComponent(jSpinnerNiveles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTurno)
                    .addComponent(jLabelRenovacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonMañana)
                    .addComponent(jCheckBoxTrimestral))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonTarde)
                    .addComponent(jCheckBoxAnual))
                .addGap(30, 30, 30)
                .addComponent(jLabelHijos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelHijos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonMatricular.setText("MATRICULAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelTitulo)
                        .addGap(127, 127, 127))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelSeleccionaDeporte)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonMatricular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabelTitulo)
                .addGap(37, 37, 37)
                .addComponent(jLabelSeleccionaDeporte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonMatricular)
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
            java.util.logging.Logger.getLogger(VentanaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupTurnos;
    private javax.swing.JButton jButtonAñadirHijo;
    private javax.swing.JButton jButtonMatricular;
    private javax.swing.JButton jButtonVerOcultarTabla;
    private javax.swing.JCheckBox jCheckBoxAnual;
    private javax.swing.JCheckBox jCheckBoxTrimestral;
    private javax.swing.JComboBox<String> jComboBoxDeportes;
    private javax.swing.JLabel jLabelDeporte;
    private javax.swing.JLabel jLabelHijos;
    private javax.swing.JLabel jLabelNivel;
    private javax.swing.JLabel jLabelRenovacion;
    private javax.swing.JLabel jLabelSeleccionaDeporte;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTurno;
    private javax.swing.JPanel jPanelDatos;
    private javax.swing.JPanel jPanelHijos;
    private javax.swing.JRadioButton jRadioButtonMañana;
    private javax.swing.JRadioButton jRadioButtonTarde;
    private javax.swing.JScrollPane jScrollPaneHijos;
    private javax.swing.JSpinner jSpinnerNiveles;
    private javax.swing.JTable jTableHijos;
    // End of variables declaration//GEN-END:variables

}
