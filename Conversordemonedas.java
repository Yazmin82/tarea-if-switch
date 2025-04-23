/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversordemonedas;



/**
 *
 * @author alfa
 */import java.util.Scanner;
public class Conversordemonedas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
                Scanner Scanner = new Scanner(System.in);
            System.out.print("Elige la moneda en pesos Mexicanos: ");
            double pesos = Scanner.nextDouble();
            
            System.out.println("Selecciona la moneda a la que deseas convertir:");
            System.out.println("1. Dólar (USD)");
            System.out.println("2. Euro (EUR)");
            System.out.println("3. Bath (THB)");
            System.out.println("4. Yen (JPY)");
            System.out.println("5. Won (KRW)");
            System.out.println("6. Dólar Australiano (AUD)");
            System.out.println("7. Sol (PEN)");
            System.out.println("8. Dólar Canadiense (CAD)");
            System.out.println("9. Bolívar (VES)");
            System.out.println("10. Peso Argentino (ARS)");
            
            int opcion = Scanner.nextInt();
            double resultado = 0;
            switch(opcion){
                case 1:
                    resultado = pesos * 0.20;
                    break;
                case 2:
                    resultado = pesos * 0.15;
                    break;
                case 3:
                    resultado = pesos * 0.10;
                    break;
                case 4:
                    resultado = pesos * 1.20;
                    break;
                case 5:
                    resultado = pesos * 2.0;
                    break;
                case 6:
                    resultado = pesos * 5.10;
                    break;
                case 7:
                    resultado = pesos * 18.20;
                    break;
                case 8:
                    resultado = pesos * 20.00;
                    break;
                case 9:
                    resultado = pesos * 11.50;
                    break;
                case 10:
                    resultado = pesos * 10.00;
                    break;  
                
                    default:
                    System.out.println("Error."); 
return;
}
         System.out.println("la cantidad convertida es:"+ resultado);
    }
}
       
    
    
            
       
    
    

