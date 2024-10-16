/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author jacuela
 */
public class SalidaBasica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Imprimo sin saltar de linea.");
        System.out.println("Continuo en la linea anterior.");
        System.out.println("Esto ya va en otra linea");
        
        System.out.println(""); //meto un salto de linea
        System.out.println("\033[35mTexto en magenta");
        System.out.println("Cruz en UNICODE:\u2020");
        
        
        //Esto es un comentario de 1 linea
        
        /* Esto es un comentario de
           varias lineas.
        */
        
        //Esto es un comentario de
        //varias lineas.
        
        
    }
    
}