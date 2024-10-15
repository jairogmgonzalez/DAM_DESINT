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
    }
    
    // Método para cambiar el panel central al de acciones
    private void mostrarAcciones(){
        ventanaPrincipal.mostrarPanelAcciones();
    }
}
