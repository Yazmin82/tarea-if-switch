/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convermonedas;

/**
 *
 * @author alfa
 */import java.util.Scanner;
public class Convermonedas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Scanner = new Scanner(System.in);
        System.out.print(" pesos mexicanos: ");
        double pesos = Scanner.nextDouble();

        System.out.println("Elige la moneda:");
        System.out.println("1. D0lar");
        System.out.println("2. Euro");
        System.out.println("3. Bath");
        System.out.println("4. Yen");
        System.out.println("5. Won");
        System.out.println("6. D0lar Australiano");
        System.out.println("7. Sol");
        System.out.println("8. D0lar Canadiense");
        System.out.println("9. Bolivar");
        System.out.println("10. Peso Argentino");

          int opcion = Scanner.nextInt(); 
          double resultado = 0;
 

         switch (opcion) {
             case 1:
             resultado = pesos * 0.10; break;
             case 2:
             resultado = pesos * 0.054; break;
              case 3:
             resultado = pesos * 2.14; break;
             case 4:
             resultado = pesos * 8.83; break;
             case 5:
             resultado = pesos * 81.50; break;
             case 6:
             resultado = pesos * 0.091; break;
             case 7:
             resultado = pesos * 0.22; break;
             case 8:
             resultado = pesos * 0.080; break;
             case 9:
             resultado = pesos * 2.14; break;
             case 10:
             resultado = pesos * 51.3; break;
              default:
         System.out.println("Opcion no valida.");
         return;
}


     System.out.println("su conversion es: " + resultado);
}


}

       
    
    
            
       
    
    

