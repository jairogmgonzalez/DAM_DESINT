/*
 * Jairo Gómez González
 */
package gui.Principal;

import dto.Persona;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jairo
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    
    // Constructor de la clase VentanaPrincipal
    public VentanaPrincipal() {
        initComponents();
        inicializarTabla(); // Se inicaliza la tabla que mostrará los datos de la encuesta
    }

    // Método para inicializar la tabla que contendra los datos de cada registro de la encuesta
    private void inicializarTabla() {
        DefaultTableModel modeloTabla = new DefaultTableModel(); // Se crea un modelo de tabla por defecto
        modeloTabla.setColumnIdentifiers(new String[]{ // Se establecen las columnas que tendra la tabla
            "Profesión", "Edad", "Sexo", "Hermanos", "¿Deporte?",
            "Deportes", "Afic. Compras", "Afic. TV", "Afic. Cine"
        });
        jTablePersonas.setModel(modeloTabla); // Se aplica el modelo de tabla creado al componente jTablePersonas
    }

    // Método para añadir un registro de la encuesta a la tabla
    public void añadirPersona(Persona p) {
        DefaultTableModel modeloTabla = (DefaultTableModel) jTablePersonas.getModel();
        modeloTabla.addRow(p.toArrayString()); // Se añade un nuevo registro a la tabla
    }
    
    // Se añade un Listener a jMenuItemSalir
    public void addSalirAction(ActionListener listener) {
        jMenuItemSalir.addActionListener(listener);
    }
    
    // Se añade un Listener a jMenuItemRealizarEncuesta
    public void addRealizarEncuestaAction(ActionListener listener) {
        jMenuItemRealizarEncuesta.addActionListener(listener);
    }
    
    // Se añade un Listener a jMenuItemAcercaDe
    public void addAcercaDeAction(ActionListener listener) {
        jMenuItemAcercaDe.addActionListener(listener);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPaneTablePersonas = new javax.swing.JScrollPane();
        jTablePersonas = new javax.swing.JTable();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuArchivo = new javax.swing.JMenu();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenuEncuesta = new javax.swing.JMenu();
        jMenuItemRealizarEncuesta = new javax.swing.JMenuItem();
        jMenuAyuda = new javax.swing.JMenu();
        jMenuItemAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("App Ministerio");

        jTablePersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9"
            }
        ));
        jTablePersonas.setEnabled(false);
        jScrollPaneTablePersonas.setViewportView(jTablePersonas);

        jMenuArchivo.setText("Archivo");

        jMenuItemSalir.setText("Salir");
        jMenuArchivo.add(jMenuItemSalir);

        jMenuBar.add(jMenuArchivo);

        jMenuEncuesta.setText("Encuesta");

        jMenuItemRealizarEncuesta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemRealizarEncuesta.setText("Realizar Encuesta");
        jMenuItemRealizarEncuesta.setToolTipText("Abre el menú para realizar la encuesta...");
        jMenuEncuesta.add(jMenuItemRealizarEncuesta);

        jMenuBar.add(jMenuEncuesta);

        jMenuAyuda.setText("Ayuda");

        jMenuItemAcercaDe.setText("Acerca de...");
        jMenuAyuda.add(jMenuItemAcercaDe);

        jMenuBar.add(jMenuAyuda);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneTablePersonas, javax.swing.GroupLayout.DEFAULT_SIZE, 991, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneTablePersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    private javax.swing.JMenu jMenuArchivo;
    private javax.swing.JMenu jMenuAyuda;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuEncuesta;
    private javax.swing.JMenuItem jMenuItemAcercaDe;
    private javax.swing.JMenuItem jMenuItemRealizarEncuesta;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JScrollPane jScrollPaneTablePersonas;
    private javax.swing.JTable jTablePersonas;
    // End of variables declaration//GEN-END:variables
}
