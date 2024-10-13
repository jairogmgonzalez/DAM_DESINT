/*
 * Jairo Gómez González
 */
package gui.Principal;

import dto.Persona;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
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
        ponerImagen(); // Se llama al método para poner la imagen en jLabelImagen
    }

    // Método para ajustar el tamaño de la imagen al tamaño del JLabel
    private ImageIcon ajustarImagen(String rutaImagen, int anchoLabel, int alturaLabel) {
        try {
            // Se carga la imagen desde los recursos
            BufferedImage img = ImageIO.read(getClass().getResource(rutaImagen));

            // Se obtiene la anchura y altura originales de la imagen
            double anchuraImagen = img.getWidth();
            double alturaImagen = img.getHeight();

            // Se calcula el aspecto ratio de la imagen
            double aspectoRatio = anchuraImagen / alturaImagen;

            // Se ajustan las dimensiones de la imagen manteniendo la proporción
            if (anchoLabel / (double) alturaLabel > aspectoRatio) { // Se verifica si el ancho del jLabel es mayor que el necesario para mantener la proporción
                anchoLabel = (int) (alturaLabel * aspectoRatio); // Se ajusta el ancho proporcionalmente al alto
            } else {
                // Si el alto del JLabel es mayor que el necesario, ajusta el alto proporcionalmente al ancho
                alturaLabel = (int) (anchoLabel / aspectoRatio);
            }

            // Se escala la imagen al nuevo tamaño calculado, manteniendo la calidad de imagen (SCALE_SMOOTH)
            Image imagenAjustada = img.getScaledInstance(anchoLabel, alturaLabel, Image.SCALE_SMOOTH);

            // Se devuelve la imagen ajustada como un ImageIcon
            return new ImageIcon(imagenAjustada);
        } catch (IOException e) {
            // En caso de error al cargar la imagen, imprime el error en la consola
            e.printStackTrace();
            return null; // Se devuelve null si ocurre un error al cargar la imagen
        }
    }

    // Método para colocar la imagen en el jButton ajustándola a su tamaño actual
    private void ponerImagen() {
        // Se obtienen las dimensiones actuales del JButton
        int anchoLabel = jButtonConfiguracion.getWidth();
        int alturaLabel = jButtonConfiguracion.getHeight();

        // Se ajusta la imagen a las dimensiones del JButton y se coloca en jButton
        jButtonConfiguracion.setIcon(ajustarImagen("/gui/Principal/Imagenes/Configuracion.png", anchoLabel, alturaLabel));
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

    // Se añade un Listener a jMenuItemGuardar
    public void addGuardarAction(ActionListener listener) {
        jMenuItemGuardar.addActionListener(listener);
    }

    // Se añade un Listener a jMenuItemCargar
    public void addCargarAction(ActionListener listener) {
        jMenuItemCargar.addActionListener(listener);
    }

    // Se añade un Listener a jButtonConfiguracion
    public void addConfiguracionAction(ActionListener listener) {
        jButtonConfiguracion.addActionListener(listener);
    }

    // Método para obtener el número de filas actuales de la tabla
    public int getNumFilas() {
        return jTablePersonas.getRowCount();
    }

    // Método para obtener un registro de la tabla en formato cadena 
    public String obtenerRegistro(int fila) {
 
        // Se crea un ArrayList de tipo String para guardar los datos del registro
        ArrayList<String> registro = new ArrayList<>();
        
        // Se obtiene la profesión y se añade a la lista registro
        String profesion = (String) jTablePersonas.getValueAt(fila, 0);
        registro.add(profesion);
        
        // Se obtiene la edad y se añade a la lista registro
        String edad = (String) jTablePersonas.getValueAt(fila, 1);
        registro.add(edad);
        
        // Se obtiene el sexo y se añade a la lista registro
        String sexo = (String) jTablePersonas.getValueAt(fila, 2);
        registro.add(sexo);
        
        // Se obtiene el número de hermanos y se añade a la lista registro
        String numHermanos = (String) jTablePersonas.getValueAt(fila, 3);
        registro.add(numHermanos);
        
        // Se obtiene si practica deporte y se añade a la lista registro
        String practicaDeporte = (String) jTablePersonas.getValueAt(fila, 4);
        registro.add(practicaDeporte);
        
        // Se obtiene los deportes practicados y se añaden a la lista registro
        String deportes = (String) jTablePersonas.getValueAt(fila, 5);
        registro.add(deportes);
        
        // Se obtiene el grado de afición a las compras y se añade a la lista registro
        String aficCompras = (String) jTablePersonas.getValueAt(fila, 6);
        registro.add(aficCompras);
        
        // Se obtiene el grado de afición a ver la TV y se añade a la lista registro
        String aficTV = (String) jTablePersonas.getValueAt(fila, 7);
        registro.add(aficTV);
        
        // Se obtiene el grado de afición a ir al cine y se añade a la lista registro
        String aficCine = (String) jTablePersonas.getValueAt(fila, 8);
        registro.add(aficCine);
        
        // Se crea una cadena con los datos de la fila
        String registroStr = String.join("/", registro);
        
        return registroStr; // Se devuelve el registro en forma de cadena

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPaneTablePersonas = new javax.swing.JScrollPane();
        jTablePersonas = new javax.swing.JTable();
        jButtonConfiguracion = new javax.swing.JButton();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuArchivo = new javax.swing.JMenu();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenuEncuesta = new javax.swing.JMenu();
        jMenuItemRealizarEncuesta = new javax.swing.JMenuItem();
        jMenuAyuda = new javax.swing.JMenu();
        jMenuItemAcercaDe = new javax.swing.JMenuItem();
        jMenuFichero = new javax.swing.JMenu();
        jMenuItemGuardar = new javax.swing.JMenuItem();
        jMenuItemCargar = new javax.swing.JMenuItem();

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

        jMenuFichero.setText("Fichero");

        jMenuItemGuardar.setText("Guardar");
        jMenuFichero.add(jMenuItemGuardar);

        jMenuItemCargar.setText("Cargar");
        jMenuFichero.add(jMenuItemCargar);

        jMenuBar.add(jMenuFichero);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneTablePersonas, javax.swing.GroupLayout.DEFAULT_SIZE, 991, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneTablePersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
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
    private javax.swing.JButton jButtonConfiguracion;
    private javax.swing.JMenu jMenuArchivo;
    private javax.swing.JMenu jMenuAyuda;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuEncuesta;
    private javax.swing.JMenu jMenuFichero;
    private javax.swing.JMenuItem jMenuItemAcercaDe;
    private javax.swing.JMenuItem jMenuItemCargar;
    private javax.swing.JMenuItem jMenuItemGuardar;
    private javax.swing.JMenuItem jMenuItemRealizarEncuesta;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JScrollPane jScrollPaneTablePersonas;
    private javax.swing.JTable jTablePersonas;
    // End of variables declaration//GEN-END:variables
}
