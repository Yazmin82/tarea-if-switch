/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package verificar.edad.para.votar;

/**
 *
 * @author alfa
 */import java.util.Scanner;
public class VerificarEdadParaVotar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Scanner = new Scanner(System.in);
        System.out.print("ingresa tu edad: ");
        int edad = Scanner.nextInt();
         if (edad >= 18) {
            System.out.println("Eres elegible para votar.");
        } else {
            System.out.println("No eres elegible para votar.");
             Scanner.close();
        }
          }          
        
    }

    
