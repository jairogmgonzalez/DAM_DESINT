/*
 * Jairo Gómez González
 */
package gui.Secundarias;

import dto.Persona;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author jairo
 */
public class Encuesta extends javax.swing.JDialog {

    // Constructor de la clase Encuesta
    public Encuesta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        inicializarDeportes(); // Se incializa la lista de deportes
    }

    // Método para inicializar la lista de deportes en relación con el atributo deportes de Persona
    private void inicializarDeportes() {
        String[] deportes = {"Fútbol", "Baloncesto", "Balonmano", "Volleyball", "Tenis", "Atletismo", "Natación", "Otros"}; // Se definen los deportes en un array
        DefaultListModel<String> modeloListaDeportes = new DefaultListModel<>(); // Se crea un modelo para la lista de deportes
        for (String deporte : deportes) { // Se itera sobre cada deporte del array
            modeloListaDeportes.addElement(deporte); // Se añade cada deporte al modelo
        }
        jListDeportes.setModel(modeloListaDeportes); // Se aplica el modelo de lista al componente jListDeportes
    }

    // Se añade un Listener a jButtonAceptar
    public void addAceptarAction(ActionListener listener) {
        jButtonAceptar.addActionListener(listener);
    }

    // Se añade un Listener a jButtonCancelar
    public void addCancelarAction(ActionListener listener) {
        jButtonCancelar.addActionListener(listener);
    }

    // Se añade un ItemListener a jCheckBoxDeporte
    public void addCheckBoxDeporteListener(ItemListener listener) {
        jCheckBoxDeporte.addItemListener(listener);
    }
    
    // Método para obtener la profesión
    public String getProfesion() {
        return jTextFieldProfesion.getText();
    }

    // Método para obtener el rango de edad
    public String getEdad() {
        return (String) jComboBoxEdad.getSelectedItem();
    }
    
    // Método para obtener el número de hermanos
    public int getNumHermanos() {
        return (int) jSpinnerHermanos.getValue();
    }

    // Método para obtener el sexo seleccionado
    public Persona.Sexo getSexo() {
        // Se verifica si el radio button de hombre se ha seleccionado
        if (jRadioButtonHombre.isSelected()) {
            return Persona.Sexo.Masculino; // Se devuelve sexo Masculino
            // Se verifica si el radio button de mujer se ha seleccionado
        } else if (jRadioButtonMujer.isSelected()) {
            return Persona.Sexo.Femenino; // Se devuelve sexo Femenino
            // Si no se cumple ninguna de las dos opciones, es decir, si no se marca ninguna opción
        } else {
            return Persona.Sexo.Desconocido; // Se devuelve el valor Desconocido
        }
    }

    // Método para saber si practica deporte
    public boolean getPracticaDeporte() {
        return jCheckBoxDeporte.isSelected();
    }

    // Método para obtener la lista de deportes que practica
    public ArrayList<Persona.Deportes> getDeportes() {
        ArrayList<Persona.Deportes> deportes = new ArrayList<>(); // Se crea una lista para los deportes seleccionados
        Map<String, Persona.Deportes> deporteMap = new HashMap<>(); // Se crea un mapa para relacionar los deportes con los valores del enum
        
        // Se añaden los deportes al mapa junto al valor del enum
        deporteMap.put("Fútbol", Persona.Deportes.Fútbol);
        deporteMap.put("Baloncesto", Persona.Deportes.Baloncesto);
        deporteMap.put("Balonmano", Persona.Deportes.Balonmano);
        deporteMap.put("Volleyball", Persona.Deportes.Volleyball);
        deporteMap.put("Tenis", Persona.Deportes.Tenis);
        deporteMap.put("Atletismo", Persona.Deportes.Atletismo);
        deporteMap.put("Natación", Persona.Deportes.Natación);
        deporteMap.put("Otros", Persona.Deportes.Otros);

        // Se obtiene la lista de los deportes que ha seleccionado
        List<String> deportesSeleccionados = jListDeportes.getSelectedValuesList();
        
        // Se itera sobre cada deporte seleccionado
        for (String deporte : deportesSeleccionados) {
            deportes.add(deporteMap.get(deporte)); // Se añaden los deportes al ArrayList usando la clave del mapa
        }

        return deportes; // Se devuelve el ArrayList de deportes que practica
    }

    // Método para obtener el grado de afición a las compras
    public int getCompras() {
        return jSliderCompras.getValue();
    }

    // Método para obtener el grado de afición a ver la TV
    public int getVerTV() {
        return jSliderTV.getValue();
    }

    // Método para obtener el grado de afición a ir al cine
    public int getIrCine() {
        return jSliderCine.getValue();
    }

    // Método para mostrar un mensaje de error si no ha rellenado el campo obligatorio (Profesión)
    public void mostrarMensajeError() {
        String mensajeError = "Falta por rellenar un campo obligatorio";
        JOptionPane.showMessageDialog(null, mensajeError, "Rellena el campo antes de aceptar", JOptionPane.ERROR_MESSAGE);
        jTextFieldProfesion.requestFocusInWindow(); // Se solicita el foco en el campo obligatorio
    }

    // Método para activar la sección de la lista de deportes
    public void activarListaDeportes() {
        jPanelDeportes.setEnabled(true);
        jScrollPaneDeportes.setEnabled(true);
        jListDeportes.setEnabled(true);
    }

    // Método para desactivar la sección de la lista de deportes
    public void desactivarListaDeportes() {
        jPanelDeportes.setEnabled(false);
        jScrollPaneDeportes.setEnabled(false);
        jListDeportes.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupSexo = new javax.swing.ButtonGroup();
        jLabelProfesion = new javax.swing.JLabel();
        jLabelObligatorio = new javax.swing.JLabel();
        jTextFieldProfesion = new javax.swing.JTextField();
        jLabelHermanos = new javax.swing.JLabel();
        jSpinnerHermanos = new javax.swing.JSpinner();
        jLabelEdad = new javax.swing.JLabel();
        jPanelSexo = new javax.swing.JPanel();
        jRadioButtonHombre = new javax.swing.JRadioButton();
        jRadioButtonMujer = new javax.swing.JRadioButton();
        jComboBoxEdad = new javax.swing.JComboBox<>();
        jCheckBoxDeporte = new javax.swing.JCheckBox();
        jPanelDeportes = new javax.swing.JPanel();
        jScrollPaneDeportes = new javax.swing.JScrollPane();
        jListDeportes = new javax.swing.JList<>();
        jLabelAficiones = new javax.swing.JLabel();
        jButtonAceptar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelCompras = new javax.swing.JLabel();
        jSliderTV = new javax.swing.JSlider();
        jSliderCompras = new javax.swing.JSlider();
        jLabelTV = new javax.swing.JLabel();
        jLabelCine = new javax.swing.JLabel();
        jSliderCine = new javax.swing.JSlider();
        jLabelSeparador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelProfesion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelProfesion.setText("Profesión:");

        jLabelObligatorio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelObligatorio.setForeground(new java.awt.Color(204, 0, 0));
        jLabelObligatorio.setText("*");

        jTextFieldProfesion.setToolTipText("Escriba su profesión...");

        jLabelHermanos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelHermanos.setText("Nº hermanos:");

        jSpinnerHermanos.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinnerHermanos.setToolTipText("Indique cuántos hermanos tiene...");

        jLabelEdad.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelEdad.setText("Edad:");

        jPanelSexo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sexo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanelSexo.setToolTipText("");

        buttonGroupSexo.add(jRadioButtonHombre);
        jRadioButtonHombre.setText("Hombre");
        jRadioButtonHombre.setToolTipText("Elija su sexo...");

        buttonGroupSexo.add(jRadioButtonMujer);
        jRadioButtonMujer.setText("Mujer");
        jRadioButtonMujer.setToolTipText("Elija su sexo...");

        javax.swing.GroupLayout jPanelSexoLayout = new javax.swing.GroupLayout(jPanelSexo);
        jPanelSexo.setLayout(jPanelSexoLayout);
        jPanelSexoLayout.setHorizontalGroup(
            jPanelSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSexoLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jRadioButtonHombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(jRadioButtonMujer)
                .addGap(60, 60, 60))
        );
        jPanelSexoLayout.setVerticalGroup(
            jPanelSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSexoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonMujer)
                    .addComponent(jRadioButtonHombre))
                .addGap(12, 12, 12))
        );

        jComboBoxEdad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entre 18 y 30", "Entre 31 y 50", "Entre 51 y 65", "Mayor de 65" }));
        jComboBoxEdad.setToolTipText("Seleccione su rango de edad...");

        jCheckBoxDeporte.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBoxDeporte.setText("¿Practica algún deporte?");
        jCheckBoxDeporte.setToolTipText("Indique si practica algún deporte...");

        jPanelDeportes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "¿Cuál?", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanelDeportes.setEnabled(false);

        jScrollPaneDeportes.setEnabled(false);

        jListDeportes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Fútbol", "Baloncesto", "Balonmano", "Volleyball", "Tenis", "Atletismo", "Natación", "Otros" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListDeportes.setToolTipText("Indique el deporte o los deportes que practica...");
        jListDeportes.setEnabled(false);
        jScrollPaneDeportes.setViewportView(jListDeportes);

        javax.swing.GroupLayout jPanelDeportesLayout = new javax.swing.GroupLayout(jPanelDeportes);
        jPanelDeportes.setLayout(jPanelDeportesLayout);
        jPanelDeportesLayout.setHorizontalGroup(
            jPanelDeportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDeportesLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jScrollPaneDeportes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanelDeportesLayout.setVerticalGroup(
            jPanelDeportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneDeportes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
        );

        jLabelAficiones.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabelAficiones.setText("Marque del 1 al 10 su grado de afición a:");

        jButtonAceptar.setBackground(new java.awt.Color(153, 204, 255));
        jButtonAceptar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonAceptar.setText("Aceptar");

        jButtonCancelar.setBackground(new java.awt.Color(153, 204, 255));
        jButtonCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonCancelar.setText("Cancelar");

        jLabelCompras.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelCompras.setText("Compras:");
        jLabelCompras.setToolTipText("");

        jSliderTV.setMajorTickSpacing(1);
        jSliderTV.setMaximum(10);
        jSliderTV.setMinorTickSpacing(1);
        jSliderTV.setPaintLabels(true);
        jSliderTV.setPaintTicks(true);
        jSliderTV.setSnapToTicks(true);
        jSliderTV.setToolTipText("Indique su grado de afición a ver la televisión...");
        jSliderTV.setValue(0);

        jSliderCompras.setMajorTickSpacing(1);
        jSliderCompras.setMaximum(10);
        jSliderCompras.setMinorTickSpacing(1);
        jSliderCompras.setPaintLabels(true);
        jSliderCompras.setPaintTicks(true);
        jSliderCompras.setSnapToTicks(true);
        jSliderCompras.setToolTipText("Indique su grado de afición a las compras...");
        jSliderCompras.setValue(0);

        jLabelTV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelTV.setText("Ver TV:");

        jLabelCine.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelCine.setText("Ir al cine:");

        jSliderCine.setMajorTickSpacing(1);
        jSliderCine.setMaximum(10);
        jSliderCine.setMinorTickSpacing(1);
        jSliderCine.setPaintLabels(true);
        jSliderCine.setPaintTicks(true);
        jSliderCine.setSnapToTicks(true);
        jSliderCine.setToolTipText("Indique su grado de afición de ir al cine...");
        jSliderCine.setValue(0);

        jLabelSeparador.setText("_________________________________________________________________________________________________________");
        jLabelSeparador.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelObligatorio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelProfesion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelHermanos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinnerHermanos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(jLabelEdad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBoxDeporte)
                                .addGap(45, 45, 45)
                                .addComponent(jPanelDeportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(210, 210, 210)
                                .addComponent(jButtonCancelar)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jButtonAceptar)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSeparador, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCompras)
                            .addComponent(jLabelTV)
                            .addComponent(jLabelCine))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSliderCompras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSliderTV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSliderCine, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabelAficiones)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProfesion)
                    .addComponent(jTextFieldProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelObligatorio))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHermanos)
                    .addComponent(jSpinnerHermanos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEdad)
                    .addComponent(jComboBoxEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jPanelSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxDeporte)
                    .addComponent(jPanelDeportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelSeparador)
                .addGap(18, 18, 18)
                .addComponent(jLabelAficiones)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCompras)
                    .addComponent(jSliderCompras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTV)
                    .addComponent(jSliderTV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(jLabelCine)
                        .addGap(70, 70, 70))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jSliderCine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAceptar)
                    .addComponent(jButtonCancelar))
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
            java.util.logging.Logger.getLogger(Encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Encuesta dialog = new Encuesta(new javax.swing.JFrame(), true);
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
    private javax.swing.ButtonGroup buttonGroupSexo;
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JCheckBox jCheckBoxDeporte;
    private javax.swing.JComboBox<String> jComboBoxEdad;
    private javax.swing.JLabel jLabelAficiones;
    private javax.swing.JLabel jLabelCine;
    private javax.swing.JLabel jLabelCompras;
    private javax.swing.JLabel jLabelEdad;
    private javax.swing.JLabel jLabelHermanos;
    private javax.swing.JLabel jLabelObligatorio;
    private javax.swing.JLabel jLabelProfesion;
    private javax.swing.JLabel jLabelSeparador;
    private javax.swing.JLabel jLabelTV;
    private javax.swing.JList<String> jListDeportes;
    private javax.swing.JPanel jPanelDeportes;
    private javax.swing.JPanel jPanelSexo;
    private javax.swing.JRadioButton jRadioButtonHombre;
    private javax.swing.JRadioButton jRadioButtonMujer;
    private javax.swing.JScrollPane jScrollPaneDeportes;
    private javax.swing.JSlider jSliderCine;
    private javax.swing.JSlider jSliderCompras;
    private javax.swing.JSlider jSliderTV;
    private javax.swing.JSpinner jSpinnerHermanos;
    private javax.swing.JTextField jTextFieldProfesion;
    // End of variables declaration//GEN-END:variables
}
