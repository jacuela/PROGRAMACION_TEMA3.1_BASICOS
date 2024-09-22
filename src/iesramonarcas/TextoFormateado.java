/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iesramonarcas;

/**
 *
 * @author jacuela
 */
public class TextoFormateado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int valor_entero=21;
        double valor_decimal=21.5;
        String minombre="Juan";
        
        System.out.printf("El número %d no tiene decimales.\n", valor_entero);
        System.out.printf("El número %f sale con decimales.\n",  valor_decimal);
        System.out.printf("Me llamo %s\n",minombre);
 
        System.out.printf("El %.3f sale \033[35mexactamente con 3 decimales.\n", valor_decimal);
        System.out.println();

        // Uso de columnas
        System.out.printf("%15s|%-15s\n","Texto1","Texto2");
        System.out.println("");

        //Tres columnas de 15 espacios y alineadas a la izquierda
        System.out.printf("%-15s %-15s %-15s\n","Artículo","Precio/caja", "Nº cajas");
        System.out.printf("%s\n","-----------------------------------------");
        System.out.printf("%-15s %-15.2f %-15d\n","manzanas", 4.5, 10);
        
        
        String nombre="Juan";
        String apellido1="Martinez";
        String apellido2="Garcia";
        String nombre2="PedroAntonio";
        String apellido3="Galvez";
        String apellido4="Mora";
        
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        System.out.printf("%-15s %-15s %-15s\n","Nombre","Apellido1", "Apellido2");
        System.out.printf("%s\n","-----------------------------------------");
        System.out.printf("%-15s %-15s %-15s\n",nombre,apellido1,apellido2 );
        System.out.printf("%-15s %-15s %-15s\n",nombre2,apellido3,apellido4 );
        
        
        
        
        
        
    }
    
}
