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
public class TiposDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //### PUEDO DECLARAR TODAS LAS VARIABLES AL PRINCIPIO
        //### O SEGÚN LAS NECESITE


        //****************************************
        //  Tipos numéricos
        
        int unEntero=5;      //Tipo entero corto de 32 bits
        System.out.println("Tipo int:"+unEntero);
        
        long unlong;     //Tipo entero largo de 64 bits  
        unlong=5;
        System.out.println("Tipo long:"+unlong);
        
        float unfloat=3.14f;    //Tipo real simple precision
        System.out.println("Tipo float:"+unfloat);
        
        double undouble;   //Tipo real doble precision
        undouble=3.1415;
        System.out.println("Tipo double:"+undouble);
        System.out.printf("Tipo double:%.5f\n",undouble); //5 decimales
        
        
        
        
        //***********************************+
        //  Cadenas y caracteres
                
        String cadena="hoy es viernes!!";
       
        char letra1='J';   //caracter. con comillas simples
        char letra2='U';
        char letra3='A';
        char letra4;
        letra4='N';
        
        
        System.out.println("Una cadena:"+cadena);
        System.out.println("Una letra:"+letra1);
        System.out.println("Mi nombre:"+letra1+letra2+letra3+letra4);
        
        
     
        
        //**********************************************
        // Booleanos (verdadero y falso)
        
        boolean esCorrecto=true;
        boolean esFalso=false;
       
        System.out.println(esCorrecto);
        System.out.println(esFalso);

        
        //**********************************************
        // Otros tipos primitivos
        
        byte unByte;          //entero de 8 bits
        short unShort;        //entero 16 bits 
        long unLong;       //entero 64 bits
        

        //**********************************************
        //OPERACIONES ARITMÉTICAS BASICAS
        int x=8;
        int y=6;
        int z=0;
        int resultado;
        
        resultado=x+y;
        System.out.println("Resultado de sumar x e y es:"+resultado);
        
        resultado=x*y;
        System.out.println("Resultado de multiplicar x e y es:"+resultado);
        
        resultado=(x+y-3)*2;
        System.out.println("Resultado de (x+y-3)*2 es:"+resultado);
        
        resultado=x+y*3;
        System.out.println("Resultado de x+y*3 es"+"---->"+resultado);
        
        //Mirar como trunca la división a entero
        resultado=x/y;
        System.out.println("[division con enteros] Si divido y/x sale:"+resultado);
        
        double resultadoDouble=x/y;
        System.out.println("[division con enteros y asigno a double] Si divido y/x en un double sale:"+resultadoDouble);
        
        resultadoDouble=(double)x/y;
        System.out.println("[division con doubles] Si divido y/x en un double sale:"+resultadoDouble);
        
        //Ojo a la división por cero
        System.out.println("Si divido y/z sale:"+y/z);
        
      
        //Los caracteres se pueden sumar. Las cadenas NO
        int suma_caracteres;
        char letraV='V';
        char letraX='X';        
        suma_caracteres=letraV+letraX;
        System.out.println("El carcter V y el X suman:"+suma_caracteres);
        
        
        System.out.println("El codifo ASCII de 'X' es:"+(int)letraX);
        System.out.println("El codifo ASCII de 'V' es:"+(int)letraV);
        
        

//        //***************************************************
//        //Si una variable no toma valor en ningun momento,
//        //nos da error. 
//        int numA;
//        String cadenaC;
//        
//        System.out.println("Valor por defecto de int:"+numA);
//        System.out.println("Valor por defecto de int:"+cadenaC);
//
//        



        
        //************************************************
        //CONVERSION DE TIPOS    
        
        int a = 9;
        int b = 2; 
        double division;
        division = (double) a / (double) b;
        
        // Descomenta la siguiente línea y observa cómo cambia el resultado.
        //division = a / b;
        System.out.println("El resultado de la división es " + division);
    
        
        
        
    }
    
}
