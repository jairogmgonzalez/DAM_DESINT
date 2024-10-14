/*
 * Jairo Gómez González
 */
package lógica;

import Dialogos.AddHijo;
import Dialogos.Exito;
import Dialogos.VentanaError;
import Ventanas.VentanaAcceso;
import Ventanas.VentanaRegistro;
import dto.Hijo;
import java.util.Date;

/**
 *
 * @author jairo
 */
public class Logica {

    // Atributo para saber si la tabla se está mostrando o no en el momento
    private boolean esTablaVisible = false;

    // Atributos que representan las ventanas de la aplicación
    private VentanaAcceso ventanaAcceso; // Ventana principal
    private VentanaRegistro ventanaRegistro; // Ventana del registro
    private AddHijo ventanaAddHijo; // Diálogo para registrar un hijo
    private VentanaError ventanaError; // Diálogo para mostrar un error
    private Exito ventanaExito; // Diálogo para mostrar que la matrícula se ha realizado correctamente

    // Constructor por parámetros de la lógica, se inicializan las ventanas y se configuran los eventos
    public Logica(VentanaAcceso ventanaAcceso, VentanaRegistro ventanaRegistro, AddHijo ventanaAddHijo, VentanaError ventanaError, Exito ventanaExito) {
        this.ventanaAcceso = ventanaAcceso;
        this.ventanaRegistro = ventanaRegistro;
        this.ventanaAddHijo = ventanaAddHijo;
        this.ventanaError = ventanaError;
        this.ventanaExito = ventanaExito;
        inicializarEventos(); // Se configuran los eventos de las acciones de la interfaz
    }

    // Método para inicializar los eventos de las acciones en la ventana principal
    private void inicializarEventos() {
        // Se configura la acción de acceder al registro
        ventanaAcceso.addAccederAction(e -> acceder());
    }

    // Método para acceder a la ventana de matriculación
    public void acceder() {
        System.out.println("Accediendo...");
        // Se verifica si el usuario y la contraseña son correctos
        if (ventanaAcceso.getUsuario().equals("a") && ventanaAcceso.getContraseña().equals("a")) {
            ventanaRegistro = new VentanaRegistro(); // Se inicializa la ventana de registro
            ventanaRegistro.addAñadirHijoAction(e -> añadirHijo()); // Se configura la acción de añadir hijos
            ventanaRegistro.addVerOcultarTablaAction(e -> mostrarOcultarTabla()); // Se configura la acción de Ver/Ocultar la tabla de hijos
            ventanaRegistro.addMatricularAction(e -> matricular()); // Se configura la acción de matricular
            ventanaRegistro.setVisible(true); // Se muestra la ventana de registro
            ventanaAcceso.dispose(); // Se cierra la ventana de acceso
        } else { // Si el usuario o contraseña no son correctos
            ventanaAcceso.limpiarContraseña(); // Se limpia el campo de la contraseña
            ventanaError = new VentanaError(ventanaAcceso, true); // Se inicializa el diálogo de error
            ventanaError.addVolverAction(e -> volverError()); // Se configura la acción de volver
            ventanaError.setVisible(true); // Se muestra el diálogo de error
        }
    }

    // Método para volver a la ventana de acceso
    public void volverError() {
        ventanaError.dispose(); // Se cierra la ventana de error
    }

    // Método para mostrar la ventana de registro de hijo
    public void añadirHijo() {
        ventanaAddHijo = new AddHijo(ventanaRegistro, true); // Se inicializa el diálogo de registro de hijo
        ventanaAddHijo.addAñadirAction(e -> registrarHijo()); // Se configura la acción de añadir
        ventanaAddHijo.setVisible(true); // Se muestra el diálogo de registro de hijo
    }

    // Método para registrar el hijo
    public void registrarHijo() {

        String nombre = ventanaAddHijo.getNombre(); // Variable para guardar el nombre del hijo
        String apellidos = ventanaAddHijo.getApellidos(); // Variable para guardar los apellidos del hijo
        String deporte = ventanaAddHijo.getDeporte(); // Variable para guardar el deporte seleccionado para el hijo
        String nivel = ventanaAddHijo.getNivel(); // Variable para guardar el nivel seleccionado para el hijo
        Date fechaNacimiento = ventanaAddHijo.getFechaNacimiento(); // Variable para guardar la fecha de nacimiento del hijo

        // Se verifica si los campos no están vacios
        if (!nombre.trim().isEmpty()
                && !apellidos.trim().isEmpty()
                && deporte != null && !deporte.trim().isEmpty()
                && nivel != null && !nivel.trim().isEmpty()
                && fechaNacimiento != null) {
            Hijo hijo = new Hijo(nombre, apellidos, deporte, nivel, fechaNacimiento); // Se inicializa un objeto de tipo Hijo con el constructor por parámetros
            ventanaRegistro.añadirHijo(hijo); // Se llama al método añadirHijo de VentanaRegistro para añadir el hijo a la tabla
            ventanaAddHijo.dispose(); // Se cierra el diálogo de registro de hijo
            ventanaRegistro.mostrarTabla(); // Se muestra la tabla de VentanaRegistro
            this.esTablaVisible = true; // Se cambia el valor de esTablaVisible a true
        } else { // Se verifica si los campos están vacios
            ventanaError = new VentanaError(ventanaRegistro, true); // Se inicializa el diálogo de error
            ventanaError.addVolverAction(e -> volverError()); // Se configura la acción de volver
            ventanaError.setVisible(true); // Se muestra el diálogo de error
        }
    }

    // Método para mostrar u ocultar la tabla
    public void mostrarOcultarTabla() {
        // Se verifica si la tabla está visible en el momento
        if (esTablaVisible) {
            ventanaRegistro.ocultarTabla(); // Se llama al método de ventanaRegistro ocultarTabla para ocultar la tabla
            esTablaVisible = false; // Se establece esTablaVisible como false
        } else {
            ventanaRegistro.mostrarTabla(); // Se llama al método de ventanaRegistro ocultarTabla para mostrar la tabla
            esTablaVisible = true; // Se establece esTablaVisible como true
        }
    }

    // Método para realizar la matriculación
    public void matricular() {
        String deporte = ventanaRegistro.getDeporte(); // Variable para guardar el deporte seleccionado
        String nivel = ventanaRegistro.getNivel(); // Variable para guardar el nivel seleccionado
        String turno = ventanaRegistro.getTurno(); // Variable para guardar el turno seleccionado
        String renovacion = ventanaRegistro.getRenovacion(); // Variable para guardar el tipo de renovación

        // Se verifica que todos los campos esten rellenos
        if (deporte != null && nivel != null && turno != null && renovacion != null) {
            ventanaExito = new Exito(ventanaRegistro, true);
            ventanaExito.addTerminarAction(e -> terminarExito()); // Se configura la acción de terminar
            ventanaExito.setVisible(true); // Se muestra la ventana de éxito al realizar la matrícula
        } else {
            ventanaError = new VentanaError(ventanaRegistro, true); // Se inicializa el diálogo de error
            ventanaError.addVolverAction(e -> volverError()); // Se configura la acción de volver
            ventanaError.setVisible(true); // Se muestra el diálogo de error
        }
    }

    // Método para cerrar el diálogo de éxito en la matriculación
    public void terminarExito() {
        ventanaExito.dispose(); // Se cierra la ventana de éxito
        System.exit(0); // Se cierra la aplicación
    }
}
