/*
 * Jairo Gómez González
 */
package Principal;

import Dialogos.AddHijo;
import Dialogos.Exito;
import Dialogos.VentanaError;
import Ventanas.VentanaAcceso;
import Ventanas.VentanaRegistro;
import lógica.Logica;

/**
 *
 * @author jairo
 */
public class Main {

    public static void main(String[] args) {
        // Se crea una instancia de VentanaAcceso, que es la ventana de acceso a la matriculacón
        VentanaAcceso ventanaAcceso = new VentanaAcceso();

        // Se crea una instancia de VentanaError, que es el diálogo en caso de acceso incorrecto
        VentanaError ventanaError = new VentanaError(ventanaAcceso, true);

        // Se crea una instancia de VentanaRegistro, que es la ventana donde se realizará la matriculacón
        VentanaRegistro ventanaRegistro = new VentanaRegistro();

        // Se crea una instancia de AddHijo, que es el diálogo para registrar un hijo
        AddHijo ventanaRegistroHijo = new AddHijo(ventanaRegistro, true);

        // Se crea una instancia de Exito, que es el diálogo en caso de matriculación correcta
        Exito ventanaExito = new Exito(ventanaRegistro, true);

        // Se crea una instancia de Logica que enlaza el controlador con la vista
        Logica logica = new Logica(ventanaAcceso, ventanaRegistro, ventanaRegistroHijo, ventanaError, ventanaExito);

        // Se hace visible la ventana de acceso
        ventanaAcceso.setVisible(true);
    }

}
