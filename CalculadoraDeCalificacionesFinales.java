/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora.de.calificaciones.finales;

import java.util.Scanner;

/**
 *
 * @author alfa
 */
public class CalculadoraDeCalificacionesFinales {


  
    public static void main(String[] args) {
        
        try (Scanner Scanner = new Scanner(System.in)) {
           
            System.out.println(" calificación de los parciales (0-100): ");
            double calificacionParciales = Scanner.nextDouble();
            
            System.out.println(" calificación del proyecto (0-100): ");
            double calificacionProyecto = Scanner.nextDouble();
            
            System.out.println(" calificación del examen final (0-100): ");
            double calificacionExamenFinal = Scanner.nextDouble();
            
           
            if ((calificacionParciales < 0 || calificacionParciales > 100) ||
                    (calificacionProyecto < 0 || calificacionProyecto > 100) ||
                    (calificacionExamenFinal < 0 || calificacionExamenFinal > 100)) {
                System.out.println("Error: Todas las calificaciones deben estar entre 0 y 100.");
            } else {
             
                double notaFinal = (calificacionParciales * 0.40) +
                        (calificacionProyecto * 0.30) +
                        (calificacionExamenFinal * 0.30);
                
               
                System.out.println("El promedio final es: " + notaFinal);
            }
        }
        
    }
    
}


