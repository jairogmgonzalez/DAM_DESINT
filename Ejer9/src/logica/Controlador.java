/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import gui.VentanaPrincipal;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author jairo
 */
public class Controlador {

    // Atributo para representar la Ventana Principal
    private VentanaPrincipal ventanaPrincipal;

    // Constructor por parámetros de la Clase Controlador, se inicializa la ventanaPrincipal y se configura los eventos
    public Controlador(VentanaPrincipal ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
        inicializarEventos();
    }

    // Método para inicializar los eventos de las acciones
    private void inicializarEventos() {
        // Se configura los eventos para los radioButtons
        ventanaPrincipal.addRadioButtonOriginal1(e -> actualizarRadioButtons());
        ventanaPrincipal.addRadioButtonOriginal2(e -> actualizarRadioButtons());
        ventanaPrincipal.addRadioButtonOriginal3(e -> actualizarRadioButtons());
        
        // Se configura los eventos para los checkBoxs
        ventanaPrincipal.addCheckBoxOriginal4(e -> actualizarCheckboxs());
        ventanaPrincipal.addCheckBoxOriginal5(e -> actualizarCheckboxs());
        ventanaPrincipal.addCheckBoxOriginal6(e -> actualizarCheckboxs());
        
        // Se configura el evento para el TextField con un DocumentListener con 3 métodos abstractos
        ventanaPrincipal.addTextFieldOriginal(new DocumentListener() {
            // Método para actualizar el textFieldEspejo al insertar texto en el textFieldOriginal
            @Override
            public void insertUpdate(DocumentEvent e) {
                ventanaPrincipal.textFieldEspejoActualizar();
            }
            
            // Método para actualizar el textFieldEspejo al borrar texto en el textFieldOriginal
            @Override
            public void removeUpdate(DocumentEvent e) {
                ventanaPrincipal.textFieldEspejoActualizar();
            }

            // Método para actualizar el textFieldEspejo al cambiar el estilo del texto en el textFieldOriginal
            @Override
            public void changedUpdate(DocumentEvent e) {
                ventanaPrincipal.textFieldEspejoActualizar();
            }
        });
        
        // Se configura el evento para el comboBox
        ventanaPrincipal.addComboBoxOriginal(e -> actualizarComboBox());
        
        // Se configura el evento para el spinner
        ventanaPrincipal.addSpinnerOriginal(e -> actualizarSpinner());
    }

    // Método para actualizar los radioButtonsEspejo
    private void actualizarRadioButtons() {
        ventanaPrincipal.radioButtonEspejo1Cambiar();
        ventanaPrincipal.radioButtonEspejo2Cambiar();
        ventanaPrincipal.radioButtonEspejo3Cambiar();
    }

    // Método para actualizar los checkBoxsEspejo
    private void actualizarCheckboxs() {
        ventanaPrincipal.checkBoxEspejo4Cambiar();
        ventanaPrincipal.checkBoxEspejo5Cambiar();
        ventanaPrincipal.checkBoxEspejo6Cambiar();
    }

    // Método para actualizar el comboBoxEspejo
    private void actualizarComboBox() {
        ventanaPrincipal.comboBoxEspejoActualizar();
    }

    // Método para actualizar en spinnerEspejo
    private void actualizarSpinner() {
        ventanaPrincipal.spinnerEspejoActualizar();
    }
}
