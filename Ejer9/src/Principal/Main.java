/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import gui.VentanaPrincipal;
import logica.Controlador;

/**
 *
 * @author jairo
 */
public class Main {
    
    public static void main(String[] args) {
        
        // Se crea una instancia de VentanaPrincipal, que es la ventana principal de la aplicación
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();

        // Se crea una instancia del Controlador que enlaza el controlador con la vista
        Controlador controlador = new Controlador(ventanaPrincipal);

        // Se hace visible la ventana principal
        ventanaPrincipal.setVisible(true);
    }
    
}
