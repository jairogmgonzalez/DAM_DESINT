/*
 * Jairo Gómez González
 */
package lógica;

import dto.Persona;
import dto.Persona.Deportes;
import dto.Persona.Sexo;
import gui.Principal.VentanaPrincipal;
import gui.Secundarias.Encuesta;
import gui.Secundarias.Informativa;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author jairo
 */
public class Controlador {

    //Atributo para guardar la ruta donde se guardardá y/o cargará los datos de la tabla
    private String ruta;

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
        // Se configura la acción de guardar los datos de la tabla en un fichero
        ventanaPrincipal.addGuardarAction(e -> guardarDatos());
        // Se configura la acción de cargar los datos de la tabla de un fichero
        ventanaPrincipal.addCargarAction(e -> cargarDatos());
        // Se configura la acción de pulsar el botón de configuración
        ventanaPrincipal.addConfiguracionAction(e -> configurarRuta());
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
    private void cerrarAcercaDe() {
        informativa.dispose();
    }

    // Método para guardar los datos de la tabla
    private void guardarDatos() {
        // Se obtiene el número de filas de la tabla
        int numFilas = ventanaPrincipal.getNumFilas();

        // Se verifica si la tabla tiene algún registro para guardar
        if (numFilas <= 0) {
            JOptionPane.showMessageDialog(null, "No hay datos para guardar", "Error", JOptionPane.ERROR_MESSAGE); // Se muestra un mensaje de error
        } else {
            // Se crea un objeto tipo File para acceder a la ruta
            File fichero = new File(this.ruta);

            // Se verifica si el archivo tiene contenido
            if (fichero.length() > 0) {
                // Se pregunta si se desea sobrescribir el archivo existente
                int respuesta = JOptionPane.showConfirmDialog(null,
                        "El archivo que has seleccionado contiene datos. ¿Deseas sobrescribirlos?",
                        "Confirmar Sobrescritura",
                        JOptionPane.YES_NO_OPTION);
                // Se verifica si la respuesta no es Sí
                if (respuesta != JOptionPane.YES_OPTION) {
                    return; // Se sale del método
                }
            }

            // Se abre un try and catch para los flujos de escritura de los registros de la tabla
            try (PrintWriter pw = new PrintWriter(new FileWriter(ruta))) {
                // Bucle para recorrer las filas de la tabla
                for (int i = 0; i < numFilas; i++) {
                    // Variable para guardar un registro de la tabla
                    String registro = ventanaPrincipal.obtenerRegistro(i);

                    // Se escribe el registro en el fichero
                    pw.print(registro);
                    pw.println(); // Se pasa a la siguien línea
                }
            } catch (IOException e) {
                System.out.println("Error: " + e);
            }
        }
    }

    private void cargarDatos() {
        // Se obtiene el número de filas de la tabla
        int numFilas = ventanaPrincipal.getNumFilas();

        // Se verifica si la tabla tiene algún registro para guardar
        if (numFilas <= 0) {
            JOptionPane.showMessageDialog(null, "No hay datos para guardar", "Error", JOptionPane.ERROR_MESSAGE); // Se muestra un mensaje de error
        } else {
            // Se crea un objeto tipo File para acceder a la ruta
            File fichero = new File(this.ruta);

            // Se abre un try and catch para los flujos de lectura de los registros de la tabla
            try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
                // Variable que almacenará las lineas del fichero
                String linea;
                // Bucle para recorrer todo el contenido del fichero
                while ((linea = br.readLine()) != null) {
                    // Se separan los datos de la línea en un array
                    String[] datos = linea.split("/");

                    // Se obtiene la profesión del registro
                    String profesion = datos[0];

                    // Se obtiene la edad del registro
                    String edad = datos[1];

                    // Se obtiene el sexo del registro
                    Sexo sexo = Sexo.valueOf(datos[2]); // Se convierte el valor del registro en el enum Sexo

                    // Se obtiene el número de hermanos del registro
                    int numHermanos = Integer.parseInt(datos[3]);

                    // Se obtiene si practica deporte
                    boolean practicaDeporte = "Sí".equals(datos[4]);

                    // Se crea un ArrayList de los deportes practicados
                    ArrayList<Persona.Deportes> listaDeportes = new ArrayList<>();

                    // Se verifica si el registro de los deportes practicados no está vacío
                    if (!datos[5].isEmpty()) {
                        String[] deportesArray = datos[5].split(", "); // Se separan los deportes del registro en un array

                        // Se recorre cada deporte del array
                        for (String deporte : deportesArray) {
                            Deportes deportePracticado = Deportes.valueOf(deporte); // Se convierte el valor del deporte en el enum Deportes
                            listaDeportes.add(deportePracticado); // Se añade el deporte al ArrayList
                        }
                    }

                    // Se obtiene el grado de afición a las compras
                    int gradoAficionCompras = Integer.parseInt(datos[6]);

                    // Se obtiene el grado de afición a ver la TV
                    int gradoAficionTV = Integer.parseInt(datos[7]);

                    // Se obtiene el grado de afición a ir al cine
                    int gradoAficionCine = Integer.parseInt(datos[8]);

                    // Se crea un objeto de tipo Persona con el constructor de parámetros
                    Persona p = new Persona(profesion, edad, numHermanos, sexo, practicaDeporte, listaDeportes, gradoAficionCompras, gradoAficionTV, gradoAficionCine);

                    // Se añade el registro a la tabla
                    ventanaPrincipal.añadirPersona(p);

                }

            } catch (IOException e) {
                System.out.println("Error: " + e);
            }
        }
    }

    // Método para obtener la ruta donde se quiere guardar y/o cargar los registros de la tabla
    private void configurarRuta() {
        // Se crea el JFileChooser para seleccionar el fichero
        JFileChooser jf = new JFileChooser();

        jf.setFileSelectionMode(JFileChooser.FILES_ONLY); // Se establece el JFileChooser a solo archivos
        jf.setDialogTitle("Selecciona el archivo donde deseas guardar y/o cargar los datos de la tabla"); // Se establece el título del JFileChooser
        jf.showDialog(ventanaPrincipal, "Aceptar"); // Se muestra el diálogo del JFileChooser

        File archivo = jf.getSelectedFile(); // Se crea un objeto tipo File para almacenar el archivo seleccionado

        // Se verifica si ha elegido un archivo
        if (archivo != null && archivo.isFile()) {
            this.ruta = archivo.getAbsolutePath(); // Se guarda en la variable ruta la ruta del archivo seleccionado
            System.out.println("Bien");
        }
    }
}
