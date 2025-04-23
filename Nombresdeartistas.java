/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nombresdeartistas;



/**
 *
 * @author alfa
 */import java.util.Scanner;
public class Nombresdeartistas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Scanner = new Scanner(System.in);
        
        System.out.println("Que deseas buscar:");
        System.out.println("Selecciona una opción para obtener información sobre lo que elegiste:");
        System.out.println("The Beatles,The Matrix,Don quijote de la mancha,Albert Einstein,Frida Kahlo ");
        System.out.print( "Tu eleccion es:");
        
         int opcion = Scanner.nextInt();
          switch (opcion.()){
            case "The Beatles":
                 System.out.println("The Beatles fueron una banda británica de rock formada en Liverpool en 1960.");
                break;
            case "The Matrix":
                 System.out.println("The Matrix es una película de ciencia ficción dirigida por las hermanas Wachowski, estrenada en 1999.");
                break;
            case"Don Quijote":
                System.out.println("Don Quijote de la Mancha es una novela de Miguel de Cervantes, considerada una de las obras más importantes de la literatura española.");
               break;
            case"Albert Einstein":
                System.out.println("Albert Einstein fue un físico teórico alemán, conocido por desarrollar la teoría de la relatividad.");
                break;
            case"Frida Kahlo":        
                System.out.println("Frida Kahlo fue una pintora mexicana famosa por sus autorretratos y su relación con Diego Rivera.");
                break;
            default: 
            System.out.println("Opcion no encontrada.");
           Scanner.close();
          }
    }
    
}

    
