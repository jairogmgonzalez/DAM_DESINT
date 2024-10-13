/*
 * Jairo Gómez González
 */
package gui.Secundarias;

import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author jairo
 */
public class Informativa extends javax.swing.JDialog {

    // Consctructor de la clase Informativa
    public Informativa(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
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

// Método para colocar la imagen en el jLabel ajustándola a su tamaño actual
    private void ponerImagen() {
        // Se obtienen las dimensiones actuales del JLabel
        int anchoLabel = jLabelImagen.getWidth();
        int alturaLabel = jLabelImagen.getHeight();

        // Se ajusta la imagen a las dimensiones del JLabel y se coloca en jLabelImagen
        jLabelImagen.setIcon(ajustarImagen("/gui/Secundarias/Imagenes/CulturaYDeportes.png", anchoLabel, alturaLabel));
    }

    // Se añade un Listener a jButtonCerrar
    public void addCerrarAction(ActionListener listener) {
        jButtonCerrar.addActionListener(listener);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonCerrar = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelDescripcion = new javax.swing.JLabel();
        jLabelVersion = new javax.swing.JLabel();
        jLabelVendor = new javax.swing.JLabel();
        jLabelVendorDescripcion = new javax.swing.JLabel();
        jLabelHomepage = new javax.swing.JLabel();
        jLabelHomepageEnlance = new javax.swing.JLabel();
        jLabelImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sobre nosotros");

        jButtonCerrar.setBackground(new java.awt.Color(153, 153, 153));
        jButtonCerrar.setText("Cerrar");

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelTitulo.setText("Ministerio de Deportes y Cultura");

        jLabelDescripcion.setText("<html>  Bienvenido a la aplicación oficial del Ministerio de Deportes y Cultura.<br>  Desde deporte, cine, hasta compras... <br>  nuestro objetivo es conocerte más a fondo. </html>");

        jLabelVersion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelVersion.setText("Product version 1.1");

        jLabelVendor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelVendor.setText("Vendor:");

        jLabelVendorDescripcion.setText("Ministerio de Cultura y Deporte");

        jLabelHomepage.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelHomepage.setText("Homepage:");

        jLabelHomepageEnlance.setText("http://www.educacion.gob.es");

        jLabelImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jLabelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelHomepage)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelHomepageEnlance)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTitulo)
                            .addComponent(jLabelDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelVersion)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelVendor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelVendorDescripcion)))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonCerrar)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelVersion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelVendor)
                            .addComponent(jLabelVendorDescripcion))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelHomepage)
                            .addComponent(jLabelHomepageEnlance))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jButtonCerrar)))
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
            java.util.logging.Logger.getLogger(Informativa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Informativa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Informativa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Informativa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Informativa dialog = new Informativa(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButtonCerrar;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelHomepage;
    private javax.swing.JLabel jLabelHomepageEnlance;
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelVendor;
    private javax.swing.JLabel jLabelVendorDescripcion;
    private javax.swing.JLabel jLabelVersion;
    // End of variables declaration//GEN-END:variables
}
