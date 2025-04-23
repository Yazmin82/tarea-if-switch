/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package preciocondescuento;

import java.util.Scanner;


/**
 *
 * @author alfa
 */
public class Preciocondescuento {

    /**
     * @param args the command line arguments
     *
     */
    public static void main(String[] args) {
        try ( // TODO code application logic here
                Scanner Scanner = new Scanner(System.in)) {
            System.out.println("ingrese el Precio del producto:");
            double Precionormal = Scanner.nextDouble();
            double descuento = 0;
            if (Precionormal > 100){
                descuento = 0.10;
            }else if(Precionormal > 100 && Precionormal<= 150){
                descuento = 0.10;
            }else if(Precionormal > 200 && Precionormal<= 300){
                descuento = 0.20;
            }else if(Precionormal> 300){
                descuento = 0.25;
            }
            
            
            System.out.println("El descuento aplicado es:" + (descuento *100)+"%");
            
            
            Scanner.close();
            
        }
            
    }
            
        }

        
        

