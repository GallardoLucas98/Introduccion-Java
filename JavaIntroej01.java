/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Este es el paquete//
package javaintroej01;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
//esta es la clase//
public class JavaIntroej01 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        /* EJERCICIO DE APRENDIZAJE 01
        int a,b,suma;
        System.out.println("Ingrese dos valores enteros para realizar una suma: ");
        a = leer.nextInt();
        b = leer.nextInt();
        suma = a + b;
        System.out.println("El resultado de la suma es: " + suma);*/
    
        /* EJERCICIO DE APRENDIZAJE 02
        String nombre;
        System.out.println("Ingresa tu nombre: ");
        nombre = leer.nextLine();
        System.out.println("Hola " + nombre); */
        
        /* EJERCICIO DE APRENDIZAJE 03
        String frase;
        System.out.println("Ingresa una frase:");
        frase = leer.nextLine();
        System.out.println("MAYUSCULAS: " + frase.toUpperCase());
        System.out.println("minusculas: " + frase.toLowerCase()); */
        
        /* EKERCICIO DE APRENDIZAJE 04
        int fahrenheit, celsius;
        System.out.println("Ingrese los grados centigrados para mostrar su equivalente en Fahrenheit: ");
        celsius = leer.nextInt();
        fahrenheit = 32 + (9*celsius/5);
        System.out.println("Su equivalente en Fahrenheit es: " + fahrenheit); */
        
        /* EJERCICIO DE APRENDIZAJE 05
        int num,doble,triple,raiz;
        System.out.println("Ingrese un numero entero para calcular el doble, trile y raiz cuadrada del mismo: ");
        num = leer.nextInt();
        doble = num * 2 ;
        triple = num * 3;
        raiz = (int) Math.sqrt(num);
        System.out.println("El doble es: " + doble + " ,el triple es: " + triple + " y la raiz cuadrada es: " + raiz); */
        
        /* EJERCICIO DE APRENDIZAJE 06
        int num;
        System.out.println("Ingrese un valor entero para determinar si es par o no: ");
        num = leer.nextInt();
        if (num % 2 == 0) {
            System.out.println("El valor ingresado es par.");
        } else {
            System.out.println("El valor ingresado es impar.");
        }*/
        
        /* EJERCICIO DE APRENDIZAJE 07
        String contraseña,ContraseñaCorrecta;
        ContraseñaCorrecta = "eureka";
        System.out.println("Ingrese la contraseña asignada para continuar: ");
        contraseña = leer.nextLine();
        if (contraseña.equals(ContraseñaCorrecta)) {
            System.out.println("La contraseña es correcta. ");
        } else {
            System.out.println("La contraseña ingresada es incorrecta. ");   
        } */
       
        /* EJERCICIO DE APRENDIZAJE 08
        String frase;
        System.out.println("Ingrese palabra o frase con 8 caracteres de largo: ");
        frase = leer.nextLine();
        if (frase.length() <= 8) {
            System.out.println("CORRECTO.");
        } else {
            System.out.println("INCORRECTO.");
        }*/
        
        /*EJERCICIO DE APRENDIZAJE 09
        String frase; 
        System.out.println("Ingrese una frase o palabra que inicie con la letra A: ");
        frase = leer.nextLine();
        if (frase.equals(frase.substring(0)) != frase.substring(0).equals(0)) {
            System.out.println("CORRECTO.");
        } else {
            System.out.println("INCORRECTO.");
        }*/
        
        /*EJERCICIO DE APRENDIZAJE 10
        int num,suma,limite;
        suma = 0;
        System.out.println("Ingrese un valor limite: ");
        limite = leer.nextInt();
        do {
            System.out.println("Ingresa los numeros a sumar: ");
            num = leer.nextInt();
            suma = suma + num;        
        } while (limite >= suma);
        System.out.println("La sumatoria de los valores supera al limite asignado, el resultado es: " + suma); */
        
        //EJERCICIO DE APRENDIZAJE 11
        
    }

}
 
