/*
 * Jairo Gómez González
 */
package logica;

import gui.VentanaPrincipal;
import java.awt.Color;

/**
 *
 * @author jairo
 */
public class Controlador {

    // Atributo que representa la ventana principal de la aplicación
    private VentanaPrincipal ventanaPrincipal;

    // Constructor por parámetros del controlador, se inicializa la ventana y se configuran los eventos
    public Controlador(VentanaPrincipal ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
        inicializarEventos();
    }

    // Método para inicializar los eventos de las acciones en la ventana principal
    private void inicializarEventos() {
        // Se configura la acción de restablecer la ventana principal
        ventanaPrincipal.addRestablecerAction(e -> restablecerVentana());
        // Se configura la acción de pulsar el botón Azul
        ventanaPrincipal.addButtonAzulAction(e -> botonAzul());
        // Se configura la acción de pulsar el botón Rojo
        ventanaPrincipal.addButtonRojoAction(e -> botonRojo());
        // Se configura la acción de pulsar el botón Verde
        ventanaPrincipal.addButtonVerdeAction(e -> botonVerde());
        // Se configura la acción de pulsar el botón Rosa
        ventanaPrincipal.addButtonRosaAction(e -> botonRosa());
    }

    // Método para restablecer la ventana a los colores por defecto
    private void restablecerVentana() {
        ventanaPrincipal.cambiarColorRejilla(new Color(0, 0, 0)); // Se restablece el color del Panel Rejilla
        ventanaPrincipal.cambiarColorFondo(new Color(242, 242, 242)); // Se restablece el color del Panel Fondo
        ventanaPrincipal.cambiarColorListado(new Color(204, 204, 204)); // Se restablece el color del Panel Listado
    }

    // Método para cambiar el fondo seleccionado a color Azul
    private void botonAzul() {
        // Se guarda en la variable zona la zona a cambiar seleccionada
        String zona = ventanaPrincipal.obtenerZona();

        // Se verifica la zona seleccionada y se cambiar su color a azul
        switch (zona) {
            case "Rejilla":
                ventanaPrincipal.cambiarColorRejilla(new Color(0, 0, 255));
                break;
            case "Fondo":
                ventanaPrincipal.cambiarColorFondo(new Color(0, 0, 255));
                break;
            default:
                ventanaPrincipal.cambiarColorListado(new Color(0, 0, 255));
                break;
        }
    }

    // Método para cambiar el fondo seleccionado a color Rojo
    private void botonRojo() {
        // Se guarda en la variable zona la zona a cambiar seleccionada
        String zona = ventanaPrincipal.obtenerZona();

        // Se verifica la zona seleccionada y se cambiar su color a rojo
        switch (zona) {
            case "Rejilla":
                ventanaPrincipal.cambiarColorRejilla(new Color(255, 0, 0));
                break;
            case "Fondo":
                ventanaPrincipal.cambiarColorFondo(new Color(255, 0, 0));
                break;
            default:
                ventanaPrincipal.cambiarColorListado(new Color(255, 0, 0));
                break;
        }
    }

// Método para cambiar el fondo seleccionado a color Verde
    private void botonVerde() {
        // Se guarda en la variable zona la zona a cambiar seleccionada
        String zona = ventanaPrincipal.obtenerZona();

        // Se verifica la zona seleccionada y se cambiar su color a verde
        switch (zona) {
            case "Rejilla":
                ventanaPrincipal.cambiarColorRejilla(new Color(0, 255, 0));
                break;
            case "Fondo":
                ventanaPrincipal.cambiarColorFondo(new Color(0, 255, 0));
                break;
            default:
                ventanaPrincipal.cambiarColorListado(new Color(0, 255, 0));
                break;
        }
    }

// Método para cambiar el fondo seleccionado a color Rosa
    private void botonRosa() {
        // Se guarda en la variable zona la zona a cambiar seleccionada
        String zona = ventanaPrincipal.obtenerZona();

        // Se verifica la zona seleccionada y se cambiar su color a rosa
        switch (zona) {
            case "Rejilla":
                ventanaPrincipal.cambiarColorRejilla(new Color(255, 192, 203));
                break;
            case "Fondo":
                ventanaPrincipal.cambiarColorFondo(new Color(255, 192, 203));
                break;
            default:
                ventanaPrincipal.cambiarColorListado(new Color(255, 192, 203));
                break;
        }
    }

}
