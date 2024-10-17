/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import dto.ContadorPulsaciones;
import gui.VentanaPrincipal;

/**
 *
 * @author jairo
 */
public class Controlador {

    // Se inicializa un objeto de la clase ContadorPulsaciones
    private ContadorPulsaciones contadorPulsaciones = new ContadorPulsaciones();

    // Atributo que representa la Ventana Principal
    private VentanaPrincipal ventanaPrincipal;

    // Constructor por parámetros de la clase Controlador, se inicializa la ventana y se configuran los eventos
    public Controlador(VentanaPrincipal ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
        inicializarEventos();
    }

    // Método para configurar los eventos de las acciones de la ventana principal
    private void inicializarEventos() {
        // Se configura la acción de cambiar al panel Acciones
        ventanaPrincipal.addAccionesAction(e -> mostrarAcciones());
        // Se configura la acción de cambiar al panel Resultados
        ventanaPrincipal.addResultadosAction(e -> mostrarResultados());
        // Se configura la acción de intercambiar entre los subpaneles Botones u Opciones del panel Acciones
        ventanaPrincipal.addCambiarAccionAction(e -> cambiarAcciones());
        // Se configura la acción de intercambiar entre los subpaneles Pulsaciones o Selecciones del panel Resultados
        ventanaPrincipal.addCambiarResultadoAction(e -> cambiarResultados());
        // Se configura la acción para contar las pulsaciones del botón 1
        ventanaPrincipal.addButtonB1Action(e -> gestionarPulsaciones("1"));
        // Se configura la acción para contar las pulsaciones del botón 2
        ventanaPrincipal.addButtonB2Action(e -> gestionarPulsaciones("2"));
        // Se configura la acción para contar las pulsaciones del botón 3
        ventanaPrincipal.addButtonB3Action(e -> gestionarPulsaciones("3"));
        // Se configura la acción para contar las pulsaciones del botón 4
        ventanaPrincipal.addButtonB4Action(e -> gestionarPulsaciones("4"));
    }

    // Método para cambiar el panel central al de acciones
    private void mostrarAcciones() {
        ventanaPrincipal.mostrarPanelAcciones();
    }

    // Método para cambiar el panel central al de resultados
    private void mostrarResultados() {
        ventanaPrincipal.mostrarPanelResultados();

        /*
        Se llama al método obtenerSelecciones y actualizarTextPane de la clase VentanaPrincipal 
        para obtener las selecciones marcadas y actualizar el TextPane
         */
        String selecciones = ventanaPrincipal.obtenerSelecciones();
        ventanaPrincipal.actualizarTextPane(selecciones);
    }

    // Método para cambiar el panel Acciones entre los subpaneles Botones u Opciones
    private void cambiarAcciones() {
        ventanaPrincipal.mostrarSubPanelAcciones();
    }

    // Método para cambiar el panel Resultados entre los subpaneles Pulsaciones o Selecciones
    private void cambiarResultados() {
        ventanaPrincipal.mostrarSubPanelResultados();
    }

    // Método para incrementar las pulsaciones en la Tabla de Pulsaciones
    private void gestionarPulsaciones(String boton) {
        // Se llama al método incrementarPulsaciones de la clase ContadorPulsaciones para incrementar las pulsaciones del botón
        contadorPulsaciones.incrementarPulsaciones(boton);

        Integer pulsaciones = contadorPulsaciones.getPulsacionesBoton(boton); // Se obtiene las pulsaciones del botón
        System.out.println(pulsaciones);

        // Se llama al método actualizarPulsaciones de la clase VentanaPrincipal para actualizar la tabla con el nuevo valor
        ventanaPrincipal.actualizarPulsaciones(boton, pulsaciones);
    }

}
