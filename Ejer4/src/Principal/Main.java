/*
 * Jairo Gómez González
 */
package Principal;

import GUI.VentanaPrincipal;
import lógica.Controlador;

/**
 *
 * @author jairo
 */
public class Main {

    public static void main(String[] args) {
        // Se crea una instancia de VentanaPrincipal, que es la ventana principal de la aplicación
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();

        // Se crea una instancia del Controlador que enlaza el controlador con la vista
        Controlador controlador = new Controlador(ventanaPrincipal);

        // Se hace visible la ventana principal
        ventanaPrincipal.setVisible(true);
    }
}
