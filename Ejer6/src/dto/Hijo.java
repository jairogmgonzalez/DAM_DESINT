/*
 * Jairo Gómez González
 */
package dto;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author jairo
 */
public class Hijo {

    // Se declaran los atributos de la clase Hijo
    private String nombre; // Atributo para guardar el nombre
    private String apellidos; // Atributo para guardar los apellidos
    private String deporte; // Atributo para guardar el deporte seleccionado
    private String nivel; // Atributo para guardar el nivel seleccionado
    private Date fechaNacimiento; // Atributo para guardar la fecha de nacimiento

    // Constructor por parámetros de Hijo para inicializar los atributos
    public Hijo(String nombre, String apellidos, String deporte, String nivel, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.deporte = deporte;
        this.nivel = nivel;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Getter del nombre del hijo
    public String getNombre() {
        return nombre;
    }

    // Setter del nombre del hijo
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter de los apellidos del hijo
    public String getApellidos() {
        return apellidos;
    }

    // Setter de los apellidos del hijo
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    // Getter del deporte seleccionado para el hijo
    public String getDeporte() {
        return deporte;
    }

    // Setter del deporte para el hijo
    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    // Getter del nivel seleccionado para el hijo
    public String getNivel() {
        return nivel;
    }

    // Setter del nivel del hijo
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    // Getter de la fecha de nacimiento del hijo
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    // Setter de la fecha de nacimiento del hijo
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    // Método para obtener la fecha de nacimiento como un String
    public String obtenerFechaNacimientoStr(Date fechaNacimiento) {
        // Se establece el formato de la fecha de nacimiento
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");

        return formatoFecha.format(fechaNacimiento); // Se devuelve la fecha de nacimiento formateada a formatoFecha
    }

    // Método para obtener los atributos del hijo en un array tipo String
    public String[] toArrayString() {
        return new String[]{
            this.nombre,
            this.apellidos,
            this.deporte,
            this.nivel,
            obtenerFechaNacimientoStr(this.fechaNacimiento)
        };

    }

}
