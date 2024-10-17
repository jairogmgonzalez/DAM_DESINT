/*
 * Jairo Gómez González
 */
package dto;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jairo
 */
public class ContadorPulsaciones {

    private Map<String, Integer> pulsacionesBoton = new HashMap<>(); // Atributo para almacenar el botón pulsado y las pulsaciones

    // Constructor sin parámetros de la Clase ContadorPulsaciones
    public ContadorPulsaciones() {
        pulsacionesBoton.put("1", 0);
        pulsacionesBoton.put("2", 0);
        pulsacionesBoton.put("3", 0);
        pulsacionesBoton.put("4", 0);
    }

    // Método para incrementar el contador de pulsaciones de un botón
    public void incrementarPulsaciones(String boton) {
        pulsacionesBoton.put(boton, this.pulsacionesBoton.get(boton) + 1);
    }
    
    // Getter para obtener el mapa de las pulsaciones de los botones
    public Map<String, Integer> getPulsacionesBoton() {
        return pulsacionesBoton;
    }

    // Método para obtener las pulsaciones de un botón específico
    public Integer getPulsacionesBoton(String boton) {
        return pulsacionesBoton.get(boton);
    }

}
