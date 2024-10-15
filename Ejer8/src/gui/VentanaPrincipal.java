/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jairo
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    // Constructor de la clase VentanaPrincipal
    public VentanaPrincipal() {
        initComponents();
        inicializarTablaPulsaciones(); // Se inicializa el modelo que tendrá la tabla de Pulsaciones
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
        jComboBoxCambiarResultado.addActionListener(listener);
    }

    // Método para mostrar el panel acciones
    public void mostrarPanelAcciones() {
        // Se obtiene un objeto de tipo CardLayout
        CardLayout cardLayout = (CardLayout) jPanelCentral.getLayout();

        // Se vacia todos los componentes del panel central antes de añadir uno nuevo
        jPanelCentral.removeAll();

        // Se añade el panel Acciones
        jPanelCentral.add(jPanelAcciones, "Acciones");

        // Se muestra el panel Acciones
        cardLayout.show(jPanelCentral, "Acciones");

        // Se refresca el panel central para que los cambios se reflejen
        jPanelCentral.revalidate(); // Se revalida el contenedor para que reconozca los cambios en los componentes
        jPanelCentral.repaint(); // Se vuelve a dibujar el contenedor y sus componentes
    }

    // Método para mostrar los subpaneles Botones u Opciones dentro del panel Acciones
    public void mostrarSubPanelAcciones() {
        // Se verifica si el item seleccionado en el comboBox es Botones
        if (jComboBoxCambiarAccion.getSelectedItem().equals("Botones")) {
            // Se obtiene un objeto de tipo CardLayout
            CardLayout cardLayout = (CardLayout) jPanelSubAcciones.getLayout();

            // Se vacía todos los componentes del panel central de Acciones antes de añadir uno nuevo
            jPanelSubAcciones.removeAll();

            // Se añade el panel Botones
            jPanelSubAcciones.add(jPanelBotones, "Botones");

            // Se muestra el panel Botones
            cardLayout.show(jPanelSubAcciones, "Botones");

            // Se refresca el panel SubAcciones para que los cambios se reflejen
            jPanelCentral.revalidate(); // Se revalida el contenedor para que reconozca los cambios en los componentes
            jPanelCentral.repaint(); // Se vuelve a dibujar el contenedor y sus componentes
        } else {
            // Se obtiene un objeto de tipo CardLayout
            CardLayout cardLayout = (CardLayout) jPanelSubAcciones.getLayout();

            // Se vacía todos los componentes del panel central antes de añadir uno nuevo
            jPanelSubAcciones.removeAll();

            // Se añade el panel Opciones
            jPanelSubAcciones.add(jPanelOpciones, "Opciones");

            // Se muestra el panel Opciones
            cardLayout.show(jPanelSubAcciones, "Opciones");

            // Se refresca el panel SubAcciones para que los cambios se reflejen
            jPanelCentral.revalidate(); // Se revalida el contenedor para que reconozca los cambios en los componentes
            jPanelCentral.repaint(); // Se vuelve a dibujar el contenedor y sus componentes
        }
    }

    // Método para mostrar el panel resultados
    public void mostrarPanelResultados() {
        // Se obtiene un objeto de tipo CardLayout
        CardLayout cardLayout = (CardLayout) jPanelCentral.getLayout();
        

        // Se vacia todos los componentes del panel central antes de añadir uno nuevo
        jPanelCentral.removeAll();

        // Se añade el panel Resultados
        jPanelCentral.add(jPanelResultados, "Resultados");

        // Se muestra el panel Resultados
        cardLayout.show(jPanelCentral, "Resultados");

        // Se refresca el panel central para que los cambios se reflejen
        jPanelCentral.revalidate(); // Se revalida el contenedor para que reconozca los cambios en los componentes
        jPanelCentral.repaint(); // Se vuelve a dibujar el contenedor y sus componentes
    }

    // Método para mostrar los subpaneles Botones u Opciones dentro del panel Resultados
    public void mostrarSubPanelResultados() {
        // Se verifica si el item seleccionado en el comboBox es Pulsaciones
        if (jComboBoxCambiarResultado.getSelectedItem().equals("Pulsaciones")) {
            // Se obtiene un objeto de tipo CardLayout
            CardLayout cardLayout = (CardLayout) jPanelSubResultados.getLayout();

            // Se añade el panel Pulsaciones
            jPanelSubResultados.add(jPanelPulsaciones, "Pulsaciones");

            // Se muestra el panel Pulsaciones
            cardLayout.show(jPanelSubResultados, "Pulsaciones");

            // Se refresca el panel SubResultados para que los cambios se reflejen
            jPanelCentral.revalidate(); // Se revalida el contenedor para que reconozca los cambios en los componentes
            jPanelCentral.repaint(); // Se vuelve a dibujar el contenedor y sus componentes
        } else {
            // Se obtiene un objeto de tipo CardLayout
            CardLayout cardLayout = (CardLayout) jPanelSubResultados.getLayout();

            // Se añade el panel Selecciones
            jPanelSubResultados.add(jPanelSelecciones, "Selecciones");

            // Se muestra el panel Selecciones
            cardLayout.show(jPanelSubResultados, "Selecciones");

            // Se refresca el panel SubResultados para que los cambios se reflejen
            jPanelCentral.revalidate(); // Se revalida el contenedor para que reconozca los cambios en los componentes
            jPanelCentral.repaint(); // Se vuelve a dibujar el contenedor y sus componentes

            // Se llama al método añadirSelecciones para mostrar en el textArea las jCheckBoxs de Opciones marcadas
            añadirSelecciones();
        }
    }

    // Método para inicializar la tabla en el subpanel Pulsaciones del panel Resultados
    private void inicializarTablaPulsaciones() {
        DefaultTableModel modeloTabla = new DefaultTableModel(); // Se crea un modelo de tabla por defecto
        modeloTabla.setColumnIdentifiers(new String[]{ // Se establecen las columnas que tendra la tabla
            "Botón", "Pulsaciones"
        });
        jTablePulsaciones.setModel(modeloTabla); // Se aplica el modelo de tabla creado al componente jTablePersonas
    }

    // Método para añadir un registro a la tabla Pulsaciones con el número de pulsaciones por botón
    public void añadirRegistroTablaPulsaciones(Map<String, Integer> pulsacionesBoton) {
        DefaultTableModel modeloTabla = (DefaultTableModel) jTablePulsaciones.getModel();

    }

    // Método para añadir las opciones seleccionadas en el subpanelOpciones del Panel Acciones al textField de Selecciones
    public void añadirSelecciones() {
        ArrayList<String> selecciones = new ArrayList<>();

        if (jCheckBoxLeer.isSelected()) {
            selecciones.add(jCheckBoxLeer.getText());
        } else if (jCheckBoxEscalada.isSelected()) {
            selecciones.add(jCheckBoxEscalada.getText());
        } else if (jCheckBoxEsquiar.isSelected()) {
            selecciones.add(jCheckBoxEsquiar.getText());
        } else if (jCheckBoxSubmarinismo.isSelected()) {
            selecciones.add(jCheckBoxSubmarinismo.getText());
        }

        // Se convierte la lista de selecciones a una cadena
        String seleccionTexto = String.join("\n", selecciones);

        // Se establece las selecciones en cadena en el texto en el JTextArea
        jTextAreaSelecciones.setText(seleccionTexto);
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
        jPanelResultados = new javax.swing.JPanel();
        jPanelCambiarResultados = new javax.swing.JPanel();
        jLabelCambiarResultado = new javax.swing.JLabel();
        jComboBoxCambiarResultado = new javax.swing.JComboBox<>();
        jPanelSubResultados = new javax.swing.JPanel();
        jPanelPulsaciones = new javax.swing.JPanel();
        jLabelPulsaciones = new javax.swing.JLabel();
        jScrollPanePulsaciones = new javax.swing.JScrollPane();
        jTablePulsaciones = new javax.swing.JTable();
        jPanelSelecciones = new javax.swing.JPanel();
        jLabelSelecciones = new javax.swing.JLabel();
        jScrollPaneSelecciones = new javax.swing.JScrollPane();
        jTextAreaSelecciones = new javax.swing.JTextArea();
        jPanelAcciones = new javax.swing.JPanel();
        jPanelCambiarAcciones = new javax.swing.JPanel();
        jLabelCambiarAccion = new javax.swing.JLabel();
        jComboBoxCambiarAccion = new javax.swing.JComboBox<>();
        jPanelSubAcciones = new javax.swing.JPanel();
        jPanelBotones = new javax.swing.JPanel();
        jButtonB1 = new javax.swing.JButton();
        jButtonB3 = new javax.swing.JButton();
        jButtonB2 = new javax.swing.JButton();
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

        jPanelResultados.setName("Resultados"); // NOI18N
        jPanelResultados.setLayout(new java.awt.BorderLayout());

        jPanelCambiarResultados.setBackground(new java.awt.Color(51, 255, 51));
        jPanelCambiarResultados.setPreferredSize(new java.awt.Dimension(466, 46));
        jPanelCambiarResultados.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 40, 10));

        jLabelCambiarResultado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelCambiarResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCambiarResultado.setText("Cambiar resultados:");
        jPanelCambiarResultados.add(jLabelCambiarResultado);

        jComboBoxCambiarResultado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pulsaciones", "Selecciones" }));
        jPanelCambiarResultados.add(jComboBoxCambiarResultado);

        jPanelResultados.add(jPanelCambiarResultados, java.awt.BorderLayout.PAGE_START);

        jPanelSubResultados.setLayout(new java.awt.CardLayout());

        jPanelPulsaciones.setName("Pulsaciones"); // NOI18N

        jLabelPulsaciones.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabelPulsaciones.setText("RECUENTO Nº PULSACIONES de los botones ");

        jTablePulsaciones.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPanePulsaciones.setViewportView(jTablePulsaciones);

        javax.swing.GroupLayout jPanelPulsacionesLayout = new javax.swing.GroupLayout(jPanelPulsaciones);
        jPanelPulsaciones.setLayout(jPanelPulsacionesLayout);
        jPanelPulsacionesLayout.setHorizontalGroup(
            jPanelPulsacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPulsacionesLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabelPulsaciones)
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPulsacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPanePulsaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
        );
        jPanelPulsacionesLayout.setVerticalGroup(
            jPanelPulsacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPulsacionesLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabelPulsaciones)
                .addGap(18, 18, 18)
                .addComponent(jScrollPanePulsaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jPanelSubResultados.add(jPanelPulsaciones, "card2");

        jPanelSelecciones.setName("Selecciones"); // NOI18N

        jLabelSelecciones.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabelSelecciones.setText("OPCIONES SELECCIONADAS");

        jTextAreaSelecciones.setColumns(20);
        jTextAreaSelecciones.setRows(5);
        jScrollPaneSelecciones.setViewportView(jTextAreaSelecciones);

        javax.swing.GroupLayout jPanelSeleccionesLayout = new javax.swing.GroupLayout(jPanelSelecciones);
        jPanelSelecciones.setLayout(jPanelSeleccionesLayout);
        jPanelSeleccionesLayout.setHorizontalGroup(
            jPanelSeleccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSeleccionesLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabelSelecciones)
                .addContainerGap(114, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSeleccionesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPaneSelecciones, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelSeleccionesLayout.setVerticalGroup(
            jPanelSeleccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSeleccionesLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabelSelecciones)
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneSelecciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelSubResultados.add(jPanelSelecciones, "card3");

        jPanelResultados.add(jPanelSubResultados, java.awt.BorderLayout.CENTER);

        jPanelCentral.add(jPanelResultados, "card4");

        jPanelAcciones.setName("Acciones"); // NOI18N
        jPanelAcciones.setLayout(new java.awt.BorderLayout());

        jPanelCambiarAcciones.setBackground(new java.awt.Color(255, 102, 102));
        jPanelCambiarAcciones.setPreferredSize(new java.awt.Dimension(466, 46));
        jPanelCambiarAcciones.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 40, 10));

        jLabelCambiarAccion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelCambiarAccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCambiarAccion.setText("Cambiar acciones:");
        jPanelCambiarAcciones.add(jLabelCambiarAccion);

        jComboBoxCambiarAccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Botones", "Opciones" }));
        jPanelCambiarAcciones.add(jComboBoxCambiarAccion);

        jPanelAcciones.add(jPanelCambiarAcciones, java.awt.BorderLayout.PAGE_START);

        jPanelSubAcciones.setLayout(new java.awt.CardLayout());

        jPanelBotones.setName("Botones"); // NOI18N
        jPanelBotones.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 25, 30));

        jButtonB1.setText("B1");
        jPanelBotones.add(jButtonB1);

        jButtonB3.setText("B3");
        jPanelBotones.add(jButtonB3);

        jButtonB2.setText("B2");
        jPanelBotones.add(jButtonB2);

        jButtonB4.setText("B4");
        jPanelBotones.add(jButtonB4);

        jPanelSubAcciones.add(jPanelBotones, "card2");

        jPanelOpciones.setName("Opciones"); // NOI18N

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
                .addContainerGap(139, Short.MAX_VALUE))
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
    private javax.swing.JComboBox<String> jComboBoxCambiarResultado;
    private javax.swing.JLabel jLabelCambiarAccion;
    private javax.swing.JLabel jLabelCambiarResultado;
    private javax.swing.JLabel jLabelPaneles;
    private javax.swing.JLabel jLabelPulsaciones;
    private javax.swing.JLabel jLabelSelecciones;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelAcciones;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JPanel jPanelCambiarAcciones;
    private javax.swing.JPanel jPanelCambiarResultados;
    private javax.swing.JPanel jPanelCentral;
    private javax.swing.JPanel jPanelOpciones;
    private javax.swing.JPanel jPanelOpcionesPaneles;
    private javax.swing.JPanel jPanelPulsaciones;
    private javax.swing.JPanel jPanelResultados;
    private javax.swing.JPanel jPanelSelecciones;
    private javax.swing.JPanel jPanelSubAcciones;
    private javax.swing.JPanel jPanelSubResultados;
    private javax.swing.JPanel jPanelVentanaPrincipal;
    private javax.swing.JRadioButton jRadioButtonAcciones;
    private javax.swing.JRadioButton jRadioButtonResultados;
    private javax.swing.JScrollPane jScrollPanePulsaciones;
    private javax.swing.JScrollPane jScrollPaneSelecciones;
    private javax.swing.JTable jTablePulsaciones;
    private javax.swing.JTextArea jTextAreaSelecciones;
    // End of variables declaration//GEN-END:variables
}
