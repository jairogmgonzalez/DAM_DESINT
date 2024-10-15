/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import gui.VentanaPrincipal;

/**
 *
 * @author jairo
 */
public class Controlador {
    
    // Atributo que representa la Ventana Principal
    private VentanaPrincipal ventanaPrincipal;
    
    // Constructor por parámetros de la clase Controlador, se inicializa la ventana y se configuran los eventos
    public Controlador(VentanaPrincipal ventanaPrincipal){
        this.ventanaPrincipal = ventanaPrincipal;
        inicializarEventos();
    }
    
    // Método para configurar los eventos de las acciones de la ventana principal
    private void inicializarEventos(){
        // Se configura la acción de cambiar al panel Acciones
        ventanaPrincipal.addAccionesAction(e -> mostrarAcciones());
        // Se configura la acción de cambiar al panel Resultados
        ventanaPrincipal.addResultadosAction(e -> mostrarResultados());
        // Se configura la acción de intercambiar entre los subpaneles Botones u Opciones del panel Acciones
        ventanaPrincipal.addCambiarAccionAction(e -> cambiarAcciones());
        // Se configura la acción de intercambiar entre los subpaneles Pulsaciones o Selecciones del panel Resultados
        ventanaPrincipal.addCambiarResultadoAction(e -> cambiarResultados());
    }
    
    // Método para cambiar el panel central al de acciones
    private void mostrarAcciones(){
        ventanaPrincipal.mostrarPanelAcciones();
    }
    
    // Método para cambiar el panel central al de resultados
    private void mostrarResultados(){
        ventanaPrincipal.mostrarPanelResultados();
    }
    
    // Método para cambiar el panel Acciones entre los subpaneles Botones u Opciones
    private void cambiarAcciones(){
        ventanaPrincipal.mostrarSubPanelAcciones();
    }
    
    // Método para cambiar el panel Resultados entre los subpaneles Pulsaciones o Selecciones
    private void cambiarResultados(){
        ventanaPrincipal.mostrarSubPanelResultados();
    }
    
}
