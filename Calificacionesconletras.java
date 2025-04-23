/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calificacionesconletras;

import java.util.Scanner;

/**
 *
 * @author alfa
 */
public class Calificacionesconletras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner Scanner = new Scanner(System.in);
         System.out.println("Ingrese la calificación numérica (0-100): ");
        int calificacion = Scanner.nextInt();
         if (calificacion < 0 || calificacion > 100) {
            System.out.println("Error: La calificación debe estar entre 0 y 100.");
        } else {
            // Evaluar la calificación y asignar la letra correspondiente
            char letra;
            if (calificacion >= 90) {
                letra = 'A';
            } else if (calificacion >= 80) {
                letra = 'B';
            } else if (calificacion >= 70) {
                letra = 'C';
            } else if (calificacion >= 60) {
                letra = 'D';
            } else {
                letra = 'F';
            }

            // Mostrar la letra asignada
            System.out.println("La calificación corresponde a la letra: " + letra);
        }

        Scanner.close();
    
    }
    
}
