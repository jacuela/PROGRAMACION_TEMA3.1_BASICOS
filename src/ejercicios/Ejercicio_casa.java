/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

/**
 *
 * @author juanantoniocuelloalarcon
 */
public class Ejercicio_casa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre1="Celia";
        int edad1=23;
        double altura1=1.73;
        String nombre2="Juan Jesus";
        int edad2=18;
        double altura2=1.70;
        
        
        System.out.print("Datos de entrada 1: ");
        System.out.println(nombre1+","+edad1+","+altura1);
        System.out.print("Datos de entrada 2: ");
        System.out.println(nombre2+","+edad2+","+altura2);
        System.out.println("--------------------------------------------");
        
        System.out.printf("Nombre: %-15s Edad:%3d     Altura:%.2f\n",nombre1,edad1,altura1);
        System.out.printf("Nombre: %-15s Edad:%3d     Altura:%.2f\n",nombre2,edad2,altura2);
        
        
    }
    
}
