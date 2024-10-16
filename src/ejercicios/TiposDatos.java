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
        System.out.println(unEntero);
        System.out.println("Tipo int-> "+unEntero);
        
        
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
        System.out.println("-------------------------------------------");        
        String nombre="Juan";
        String apellido="Cuello";
       
        char sexo='M';   //caracter. con comillas simples
        
        
        System.out.println("Mi nombre es :"+nombre);
        System.out.println("Mi apellido es:"+apellido);
        System.out.println("Mi nombre es: "+nombre+" "+apellido+" SEXO:"+sexo);
        //Observa como con printf es mas sencillo conseguir el formato
        System.out.printf("Mi nombre es: %s %s SEXO:%c\n",nombre,apellido,sexo);
        
        System.out.println("-------------------------------------------");        

        //No puedo definir variables 2 veces
        //String nombre="Alicia";
        //Pero sí puedo usarlas más adelante
        nombre="Alicia";
        //Ojo con los tipos de las variables
        nombre="45";
        

        //**********************************************
        // Booleanos (verdadero y falso)
        System.out.println("-------------------------------------------");
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
//        System.out.println("-------------------------------------------");
//
        int x=8;
        int y=6;
        int z=0;
        int resultado;
        
        System.out.println("x:"+x);System.out.println("y:"+y);
        
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
        System.out.println("[division con enteros] Si divido "+x+"/"+y+" sale:"+resultado);
        
        double resultadoDouble=(double)x/y;
        System.out.println("[division con casting a double] Si divido "+x+"/"+y+" y ha"
                + "go casting sale:"+resultadoDouble);
        
        //Ojo a la división por cero
       // System.out.println("Si divido y/z sale:"+y/z);
        
        
    //***************************************************
        //Si una variable no toma valor en ningun momento,
        //nos da error. 
        int numA;   
        String cadenaC;   
        
    //    System.out.println("Valor por defecto de numA:"+numA);
    //    System.out.println("Valor por defecto de cadenaC:"+cadenaC);
        


//        //Los caracteres se pueden sumar. Las cadenas NO
        System.out.println("-------------------------------------------");
        int suma_caracteres;
        char letraV='V';
        char letraX='X';        
        suma_caracteres=letraV+letraX;
        System.out.println("El carcter V y el X suman:"+suma_caracteres);
        
        
        System.out.println("El codifo ASCII de 'X' es:"+(int)letraX);
        System.out.println("El codifo ASCII de 'V' es:"+(int)letraV);
//        
//        

//    
//
//        


        
        
    }
    
}
