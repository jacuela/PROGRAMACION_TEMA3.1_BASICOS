/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iesramonarcas;

import java.util.Scanner;






/**
 *
 * @author jacuela
 */
public class EntradaBasica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Usando la clase Scanner leyendo linea a linea
        Scanner teclado = new Scanner(System.in); 
        
        String nombre;
        int edad;
        double estatura;

        
        //**** RECOGIENDO VALORES EN VARIAS LINEAS
//        System.out.print("Introduce tu nombre: ");
//        nombre = teclado.nextLine();
//
//        System.out.print("Introduce tu edad: ");
//        edad = Integer.parseInt(teclado.nextLine());
//
//        System.out.print("Estatura (con decimales .): ");
//        estatura = Double.parseDouble(teclado.nextLine());
//        
//        System.out.println("Tu nombre es " + nombre + ", tiens " + edad + "años y mides "+estatura);    
//        System.out.printf("Tu nombre es %s, tienes %d años y mides %.2f m\n",nombre,edad,estatura);


        // ********    Usando la clase Scanner leyendo varios elementos por linea
        System.out.print("Introduce nombre, edad, altura (decimales con coma) separados por un espacio: "); 
        nombre = teclado.next();
        edad = teclado.nextInt();
        estatura = teclado.nextDouble();
        System.out.println("Tu nombre es " + nombre + ", tu edad es " + edad + " y mides "+estatura);
        System.out.printf("Tu nombre es %s, tu edad es %d y mides %.2f\n", nombre,edad,estatura);

        

//        //Leyendo varios valores de tipo double
//        System.out.println("Introduce tres números "
//                            + "(pueden contener decimales, usando ',') "
//                            + "separados por espacios: ");
//        double x1 = s.nextDouble(); 
//        double x2 = s.nextDouble(); 
//        double x3 = s.nextDouble();
//
//        System.out.println("Has introducido los siguientes valores:");
//        System.out.println(x1);
//        System.out.println(x2);
//        System.out.println(x3);
//
//        double media = (x1 + x2 + x3) / 3;
//        System.out.println("La media de esos tres números es " + media);
//
//      
//        //El error de mezclar nextInt / nextDouble con nextLine()
//        System.out.print("Introduce tu nombre y tu edad separados por un espacio: "); 
//        nombre = teclado.next();
//        edad = teclado.nextInt();
//        System.out.println("Tu nombre es " + nombre + " y tu edad es " + edad);
//
//        //Para evitar el error, descomentar despues de ver el error
//        //teclado.nextLine(); //limpiamos el buffer
//        
//        
//        // .....mas tarde en otra parte del programa
//        System.out.print("Introduce un dato: ");
//        String dato=teclado.nextLine();  //recojo otro dato
//        System.out.println("Dato:"+dato);
//        
        

  
    }
    
}
