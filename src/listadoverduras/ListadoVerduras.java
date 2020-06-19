/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadoverduras;

import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class ListadoVerduras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         String[] Verduras = new String[3];
             float[]  Precios = new float[3];
             Scanner leer = new Scanner(System.in);
             
             for(int i=0 ;i < 3;i++ ){
                 
                 System.out.print("Ingrese una verdura: ");
                 Verduras[i] = leer.next();
                 System.out.print("Ingrese el precio: ");
                 Precios[i] = leer.nextFloat();
             
             }
             
            System.out.println(Verduras[0] + "Precio -> " + Precios[0]);
             System.out.println(Verduras[1] + "Precio -> " + Precios[1]);
              System.out.println(Verduras[2] + "Precio -> " + Precios[2]);
    }
    
}
