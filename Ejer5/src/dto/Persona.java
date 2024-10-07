/*
 * Jairo Gómez González
 */
package dto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jairo
 */
public class Persona {

// Se define el enum Sexo con las opciones Masculino, Femenino y Desconocido en caso de no marcar ninguna opción
    public enum Sexo {
        Masculino,
        Femenino,
        Desconocido
    }

    // Se define el enum Deportes con los distintos deportes que hay en la lista
    public enum Deportes {
        Fútbol, Baloncesto, Balonmano, Volleyball, Tenis, Atletismo, Natación, Otros
    }

    // Se declaran los atributos de la clase Persona
    private String profesion; // Se almacena la profesión de la persona
    private String edad; // Se almacena la edad de la persona
    private int numHermanos; // Se almacena el número de hermanos de la persona
    private Sexo sexo; // Se almacena el sexo de la persona
    private boolean practicaDeporte; // Se indica si la persona practica deporte
    private ArrayList<Deportes> deportes; // Se almacena la lista de deportes que practica la persona
    private int gradoAficionCompras; // Se almacena el grado de afición por las compras
    private int gradoAficionVerTV; // Se almacena el grado de afición por ver la TV
    private int gradoAficionIrAlCine; // Se almacena el grado de afición por ir al cine

    // Constructor por defecto de Persona
    public Persona() {
        this.edad = ""; // Se inicializa la edad como una cadena vacía
        this.numHermanos = 0; // Se inicializa el número de hermanos en 0
        this.sexo = Sexo.Desconocido; // Se inicializa el sexo como desconocido
        this.practicaDeporte = false; // Se inicializa la práctica de deporte como falsa
        this.deportes = null; // Se inicializa la lista de deportes como null
        this.gradoAficionCompras = 0; // Se inicializa el grado de afición por las compras en 0
        this.gradoAficionVerTV = 0; // Se inicializa el grado de afición por ver la TV en 0
        this.gradoAficionIrAlCine = 0; // Se inicializa el grado de afición por ir al cine en 0
    }

    // Constructor por parámetros de Persona para inicializar los atributos
    public Persona(String profesion, String edad, int numHermanos, Sexo sexo,
            boolean practicaDeporte, ArrayList<Deportes> deportes,
            int gradoAficionCompras, int gradoAficionVerTV, int gradoAficionIrAlCine) {
        this.profesion = profesion;
        this.edad = edad;
        this.numHermanos = numHermanos;
        this.sexo = sexo;
        this.practicaDeporte = practicaDeporte;
        this.deportes = deportes;
        this.gradoAficionCompras = gradoAficionCompras;
        this.gradoAficionVerTV = gradoAficionVerTV;
        this.gradoAficionIrAlCine = gradoAficionIrAlCine;
    }

    // Getter de la profesión de la persona
    public String getProfesion() {
        return profesion;
    }

    // Setter de la profesión de la persona
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    // Getter de la edad de la persona
    public String getEdad() {
        return edad;
    }

    // Setter de la edad de la persona
    public void setEdad(String edad) {
        this.edad = edad;
    }

    // Getter del número de hermanos de la persona
    public int getNumHermanos() {
        return numHermanos;
    }

    // Setter del número de hermanos de la persona
    public void setNumeroHermanos(int numHermanos) {
        this.numHermanos = numHermanos;
    }

    // Getter del sexo de la persona
    public Sexo getSexo() {
        return sexo;
    }

    // Setter del sexo de la persona
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    // Getter para saber si la persona practica deporte
    public boolean isPracticaDeporte() {
        return practicaDeporte;
    }

    // Setter para establecer si la persona practica deporte
    public void setPracticaDeporte(boolean practicaDeporte) {
        this.practicaDeporte = practicaDeporte;
    }

    // Getter de la lista de deportes que practica la persona en forma de cadena
    public String getDeportes() {
        List<String> listaDeportes = new ArrayList<>(); // Se crea una lista para almacenar los deportes que practique la persona

        for (Deportes deporte : this.deportes) { // Se itera sobre cada deporte que practique la persona
            listaDeportes.add(deporte.name()); // Se añade el deporte a la lista
        }

        return String.join(", ", listaDeportes); // Se devuelve la lista de deportes que practica separados por una coma
    }

    // Setter para establecer la lista de deportes que practica la persona
    public void setDeportes(ArrayList<Deportes> deportes) {
        this.deportes = deportes;
    }

    // Getter para saber el grado de afición de compras de la persna
    public int getGradoAficionCompras() {
        return gradoAficionCompras;
    }

    // Setter para establecer el grado de afición de compras de la persna
    public void setGradoAficionCompras(int gradoAficionCompras) {
        this.gradoAficionCompras = gradoAficionCompras;
    }

    // Getter para saber el grado de afición de ver la TV de la persona
    public int getGradoAficionVerTV() {
        return gradoAficionVerTV;
    }

    // Setter para establecer el grado de afición de ver la TV de la persona
    public void setGradoAficionVerTV(int gradoAficionVerTV) {
        this.gradoAficionVerTV = gradoAficionVerTV;
    }

    // Getter para saber el grado de afición de ir al cine de la persona
    public int getGradoAficionIrAlCine() {
        return gradoAficionIrAlCine;
    }

    // Setter para establecer el grado de afición de ir al cine de la persona
    public void setGradoAficionIrAlCine(int gradoAficionIrAlCine) {
        this.gradoAficionIrAlCine = gradoAficionIrAlCine;
    }

    // Se convierte los atributos de la persona a un array de tipo String
    public String[] toArrayString() {
        return new String[]{
            this.profesion,
            this.edad,
            this.sexo.name(),
            String.valueOf(this.numHermanos),
            this.isPracticaDeporte() ? "Sí" : "No", // Se indica si practica deporte mediante "Si" o "No" en lugar de true o false
            getDeportes(), // Se llama el método getDeportes para obtener los deportes que practique como una cadena
            String.valueOf(this.gradoAficionCompras),
            String.valueOf(this.gradoAficionVerTV),
            String.valueOf(this.gradoAficionIrAlCine)
        };

    }
}
