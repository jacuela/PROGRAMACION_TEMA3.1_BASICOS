/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author juanantoniocuelloalarcon
 */
public class ResumenBasicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        
        
        
//        System.out.println("Datos en codigo");
//        System.out.println("===============");
//        int edad;    //int edad=18;
//        edad=18;
//        
//        double altura;
//        altura=1.73;
//        
//        String nombre="Juan Antonio Cuello";
//        
//        char sexo='M';     //M de masculino
//        
//        System.out.println("Tu edad es-->"+edad);
//        System.out.println(altura);
//        System.out.println(nombre);
//        System.out.println(sexo);
//        
//        
//        System.out.println("Datos por teclado");
//        System.out.println("=================");
//        
//        
//        //Entero
//        System.out.print("Dime tu edad:");
//        int edad2=Integer.parseInt(teclado.nextLine());
//        
//        System.out.print("Dime tu altura:");
//        double altura2=Double.parseDouble(teclado.nextLine());
//        
//        System.out.print("Dime tu nombre:");
//        String nombre2=teclado.nextLine();
//        
//        
//        System.out.println("Tu edad2 es "+edad2);
//        System.out.println("Tu altura2 es "+altura2);
//        System.out.println("Tu nombre2 es "+nombre2);
//        
        
        //Operaciones
        System.out.print("Dime num1:");
        int num1=Integer.parseInt(teclado.nextLine());
        
        System.out.print("Dime num2:");
        int num2=Integer.parseInt(teclado.nextLine());
        
        int suma;
        suma=num1+num2;
        System.out.println("La suma es:"+suma);
        
        double division;
        division=(double)num1/num2;
        System.out.println("La division es:"+division);
        
        
        
        
        
        
        
    }
    
}
