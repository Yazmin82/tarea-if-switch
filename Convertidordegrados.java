/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convertidordegrados;

import java.util.Scanner;

/**
 *
 * @author alfa
 */
public class Convertidordegrados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try ( // TODO code application logic here
                Scanner Scanner = new Scanner(System.in)) {
            System.out.print("temperatura en grados Celsius: ");
        double celsius = Scanner.nextDouble();
         System.out.println("Selecciona la opción para convertir la temperatura:");
        System.out.println("1. Fahrenheit");
        System.out.println("2.  Kelvin");
        int opcion = Scanner.nextInt();
         switch (opcion) {
            case 1 -> {
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println(celsius + " grados Celsius es igual a " + fahrenheit + " grados Fahrenheit.");
                }
            case 2 -> {
                double kelvin = celsius + 273.15;
                System.out.println(celsius + " grados Celsius es igual a " + kelvin + " Kelvin.");
                }
            default -> System.out.println("Opción no válida. Por favor, selecciona 1 o 2.");
        }
          Scanner.close();
            }
        }
            
                
            }
         
    
    

