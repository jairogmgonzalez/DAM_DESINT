/*
 * Jairo Gómez González
 */
package lógica;

import GUI.VentanaPrincipal;
import java.util.ArrayList;

/**
 *
 * @author jairo
 */
public class Controlador {

    // Atributo que representa a la Ventana Principal
    private VentanaPrincipal ventanaPrincipal;

    // Constructor por parámetros del controlador, se inicializa la ventana principal y eventos
    public Controlador(VentanaPrincipal ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
        inicializarEventos();
    }

    // Método para inicializar los eventos de las acciones en la ventana principal
    public void inicializarEventos() {
        // Se configura la acción de mezclar los nombres
        ventanaPrincipal.addMezclarAction(e -> Mezclar());
        // Se configura la acción de reiniciar los nombres
        ventanaPrincipal.addReiniciarAction(e -> Reiniciar());
    }

    // Método para mezclar los nombres
    public void Mezclar() {
        // Se crean las variables para almacenar los nombres
        String nombre1 = ventanaPrincipal.getPrimerNombre();
        String nombre2 = ventanaPrincipal.getSegundoNombre();

        // Se crea un boolean para saber si cumplen con la longitud mínima
        boolean longitudValida = comprobarNombres(nombre1, nombre2);

        // Si no cumple con la longitud válida se mostrará un mensaje de error y se limpiará la ventana
        if (!longitudValida) {
            ventanaPrincipal.mostrarMensajeError();
            ventanaPrincipal.limpiarVentana();
            return;
        }

        // Se activa la zona de resultados y el botón de reiniciar
        ventanaPrincipal.activarResultadoYReiniciar();

        // Se crea un ArrayList para almacenar la lista de mezclas de nombres
        ArrayList<String> mezclasNombres = mezclarNombres(nombre1, nombre2);

        // Se llama al método para mostrar los resultados de mezclar ambos nombres
        ventanaPrincipal.mostrarResultados(mezclasNombres);
    }
    
    // Método para reiniciar la Ventana Principal
    public void Reiniciar(){
        // Se llama al método limpiarVentana de Ventana Principal
        ventanaPrincipal.limpiarVentana();
    }

    // Método para mezclar los nombres de distintas maneras
    public static ArrayList mezclarNombres(String nombre1, String nombre2) {
        // Se crea un ArrayList con todas las mezclas de nombres
        ArrayList<String> mezclasNombres = new ArrayList<>();

        // Se añaden las distintas mezclas de nombres a la lista
        mezclasNombres.add(nombre1.substring(0, 3).toUpperCase() + nombre2.substring(0, 2).toUpperCase() + " ");
        mezclasNombres.add(nombre1.substring(0, 2).toUpperCase() + nombre2.substring(0, 3).toUpperCase() + " ");
        mezclasNombres.add(nombre2.substring(0, 4).toUpperCase() + nombre1.substring(0, 2).toUpperCase() + " ");
        mezclasNombres.add(nombre2.substring(0, 2).toUpperCase() + nombre1.substring(0, 4).toUpperCase() + " ");

        return mezclasNombres; // Se devuelve la lista con todas las mezclas de nombres

    }

    // Método para comprobar si la longitud de los nombres es válida (4)
    public static boolean comprobarNombres(String nombre1, String nombre2) {
        // Se verifica si ambos nombres tienen una longitud mínima de 4 caracteres
        if (nombre1.length() < 4 || nombre2.length() < 4) {
            return false; // Se devuelve falso si no cumplen con la longitud válida
        }

        return true; // Se devuelve true si cumplen con la longitud válida
    }

}
