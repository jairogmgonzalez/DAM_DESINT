/*
 * Jairo Gómez González
 */
package Principal;

import gui.Principal.VentanaPrincipal;
import gui.Secundarias.Encuesta;
import gui.Secundarias.Informativa;
import lógica.Controlador;

/**
 *
 * @author jairo
 */
public class Main {

    public static void main(String[] args) {
        
        // Se crea una instancia de VentanaPrincipal, que es la ventana principal de la aplicación
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();

        // Se crea una instancia de Encuesta, que es la ventana donde se recogerán los datos del usuario
        Encuesta encuesta = new Encuesta(ventanaPrincipal, true);

        // Se crea una instancia de Informativa, que es la ventana para mostrar información adicional
        Informativa informativa = new Informativa(ventanaPrincipal, true);

        // Se crea una instancia del Controlador que enlaza el controlador con la vista
        Controlador controlador = new Controlador(ventanaPrincipal, encuesta, informativa);

        // Se hace visible la ventana principal
        ventanaPrincipal.setVisible(true);
    }
}
