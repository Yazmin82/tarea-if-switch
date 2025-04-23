/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estaciondelaño;
import java.util.Scanner;
public class Estaciondelaño {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try ( // TODO code application logic here
                Scanner Scanner = new Scanner(System.in)) {
            System.out.print(" ingrese un número de mes (1-12): ");
            int mes = Scanner.nextInt();
            String estacion;
            
            estacion = switch (mes) {
                case 12, 1, 2 -> "Invierno";
                case 3, 4, 5 -> "Primavera";
                case 6, 7, 8 -> "Verano";
                case 9, 10, 11 -> "Otoño";
                default -> "mes incorrecgto. ingresa un número entre 1 y 12.";
            };
            System.out.println("La estación del año es: " + estacion);
        }
    }
}
