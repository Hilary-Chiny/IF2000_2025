/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quiz;

/**
 *
 * @author Lenovo
 */


import javax.swing.JOptionPane;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Quiz_RegistroPersona {

    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre completo:");
        String cedula = JOptionPane.showInputDialog("Ingrese la identificación (ID):");
        String correo = JOptionPane.showInputDialog("Ingrese el correo electrónico:");
        String fecha = java.time.LocalDate.now().toString();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("registro_personas.txt", true))) {
            bw.write("Nombre: " + nombre);
            bw.newLine();
            bw.write("Cédula: " + cedula);
            bw.newLine();
            bw.write("Correo: " + correo);
            bw.newLine();
            bw.write("Fecha de registro: " + fecha);
            bw.newLine();
            bw.newLine();
            JOptionPane.showMessageDialog(null, "Registro guardado correctamente.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar el archivo.");
        }
    }
}
