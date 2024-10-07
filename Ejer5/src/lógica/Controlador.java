/*
 * Jairo Gómez González
 */
package lógica;

import dto.Persona;
import gui.Principal.VentanaPrincipal;
import gui.Secundarias.Encuesta;
import gui.Secundarias.Informativa;

/**
 *
 * @author jairo
 */
public class Controlador {

    // Atributos que representan las ventanas de la aplicación
    private VentanaPrincipal ventanaPrincipal; // Ventana principal donde se muestra la tabla
    private Encuesta encuesta; // Ventana de la encuesta para recoger los datos del usuario
    private Informativa informativa; // Ventana para mostrar información adicional

    // Constructor por parámetros del controlador, se inicializan las ventanas y se configuran los eventos
    public Controlador(VentanaPrincipal ventanaPrincipal, Encuesta encuesta, Informativa informativa) {
        this.ventanaPrincipal = ventanaPrincipal; // Se asigna la ventana principal
        this.encuesta = encuesta; // Se asigna la ventana de encuesta
        this.informativa = informativa; // Se asigna la ventana informativa
        inicializarEventos(); // Se configuran los eventos de las acciones de la interfaz
    }

    // Método para inicializar los eventos de las acciones en la ventana principal
    private void inicializarEventos() {
        // Se configura la acción de salir de la aplicación
        ventanaPrincipal.addSalirAction(e -> salirAplicacion());
        // Se configura la acción de realizar la encuesta
        ventanaPrincipal.addRealizarEncuestaAction(e -> abrirEncuesta());
        // Se configura la acción de abrir la ventana de información
        ventanaPrincipal.addAcercaDeAction(e -> abrirAcercaDe());
    }

    // Método para salir de la aplicación
    private void salirAplicacion() {
        ventanaPrincipal.dispose(); // Cierra la ventana principal
    }

    // Método para abrir la ventana de la encuesta
    private void abrirEncuesta() {
        encuesta = new Encuesta(ventanaPrincipal, true); // Se crea una nueva ventana de encuesta
        encuesta.addAceptarAction(e -> aceptarEncuesta()); // Se configura la acción de aceptar la encuesta
        encuesta.addCancelarAction(e -> cancelarEncuesta()); // Se configura la acción de cancelar la encuesta
        encuesta.addCheckBoxDeporteListener(e -> { // Se configura el listener para el checkbox de deportes
            activarListaDeportes(encuesta.getPracticaDeporte()); // Activa o desactiva la lista de deportes
        });
        encuesta.setVisible(true); // Muestra la ventana de encuesta
    }

    // Método para aceptar la encuesta
    private void aceptarEncuesta() {
        // Se valida que se haya rellenado la profesión
        if (validarProfesion()) {
            // Se crea un objeto Persona con los datos recogidos de la encuesta para añadirlo a la tabla
            Persona persona = new Persona(
                    encuesta.getProfesion(),
                    encuesta.getEdad(),
                    encuesta.getNumHermanos(),
                    encuesta.getSexo(),
                    encuesta.getPracticaDeporte(),
                    encuesta.getDeportes(),
                    encuesta.getCompras(),
                    encuesta.getVerTV(),
                    encuesta.getIrCine()
            );

            ventanaPrincipal.añadirPersona(persona); // Se añade la persona a la tabla de la ventana principal
            encuesta.dispose(); // Se cierra la ventana de encuesta
        } else {
            encuesta.mostrarMensajeError(); // Se muestra un mensaje de error si falta información
        }
    }

    // Método para validar que se haya ingresado la profesión
    private boolean validarProfesion() {
        return !encuesta.getProfesion().isEmpty(); // Devuelve verdadero si la profesión no está vacía
    }

    // Método para cancelar la encuesta
    private void cancelarEncuesta() {
        encuesta.dispose(); // Cierra la ventana de encuesta
    }

    // Método para activar o desactivar la lista de deportes
    private void activarListaDeportes(boolean practicaDeporte) {
        if (practicaDeporte) {
            encuesta.activarListaDeportes(); // Activa la lista de deportes si se practica deporte
        } else {
            encuesta.desactivarListaDeportes(); // Desactiva la lista de deportes si no se practica
        }
    }

    // Método para abrir la ventana informativa
    private void abrirAcercaDe() {
        informativa = new Informativa(ventanaPrincipal, true); // Se crea una nueva ventana informativa
        informativa.addCerrarAction(e -> cerrarAcercaDe()); // Se configura la acción de cerrar la ventana
        informativa.setVisible(true); // Se muestra la ventana informativa
    }

    // Método para cerrar la ventana informativa
    public void cerrarAcercaDe() {
        informativa.dispose();
    }
}
