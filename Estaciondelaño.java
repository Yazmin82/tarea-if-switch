/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estacion;

/**
 *
 * @author alfa
 */import java.util.Scanner;
public class Estacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner Scanner = new Scanner(System.in);
            System.out.print("Ingresa el numero del mes (1-12): ");
            int mes = Scanner.nextInt();
          String estacion;
 
         switch (mes) { case 12:
         case 1:
         case 2:
         estacion = "Invierno"; break;
         case 3:
         case 4:
         case 5:
         estacion = "Primavera"; break;
         case 6:
         case 7:
         case 8:
         estacion = "Verano"; break;
         case 9:
         case 10:
         case 11:
         estacion = "Otoño";
 
           break; default:
           estacion = "Mes invalido";
}


           System.out.println("La estacion del año es: " + estacion);
}


}


