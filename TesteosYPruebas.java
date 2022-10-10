/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeos.y.pruebas;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class TesteosYPruebas {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

/* EJERCICIO 1 Y 2 INTRO JAVA 
        int numero;
        numero = 5;
        long numero2;
        numero2 = 45126;
        double decimal;
        decimal = 25.2;
        char letras;
        char l = 0;
        letras = l;
        boolean mama;
        mama = false;
        byte chiquito;
        chiquito = 1; */
/* EJERCICIO 3 Y 4 INTRO JAVA
       int num = 4;
        int num2 = 5;
        int edad = 24;
        double div = num / num2, mult;
        mult = num * num2;
        num++;
        --num2;
        boolean bandera = num > num2, perro;
        perro = num != num2;
        String nombre = "Lucas";
        System.out.print("Hola yo soy " + nombre); 
        System.out.print(" y tengo " + edad );
         */
/* EJERCICIO 5 INTRO JAVA 
        double numReal = leer.nextDouble();
       boolean logico = leer.nextBoolean();
       char letra = leer.next().charAt(0);
         */
/* EJERCICIO 6 INTRO JAVA
        System.out.println("Ingrese dos numeros enteros");
        int num = leer.nextInt();
        int num2 = leer.nextInt();
        
        if (num >= 25) {
            System.out.println("El primer numero ingresado es mayor a 25");
        } else if (num2 >= 25){
            System.out.println("El segundo numero ingresado es mayor a 25");
        } else {
            System.out.println("Los numeros ingresados no son mayores a 25");
        }
         */
/* EJERCICIO 7 INTRO JAVA
        int tipomotor;
        System.out.println("Bienvenido a la seleccion de motores." + " Ingrese una opcion: ");
        tipomotor = leer.nextInt();
 
        switch (tipomotor) {
            case 1:
                System.out.println("La bomba es una bomba de agua.");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina.");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigon.");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia.");
                break;
            default:
                System.out.println("No existe un valor valido para tipo de bomba.");
        } */
/* EJERCICIO 8 INTRO JAVA       
        System.out.println("Ingrese una nota entre 0 y 10:");
        int nota = leer.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("La nota ingresada es incorrecta, intente nuevamente.");
            nota = leer.nextInt();

        }
        System.out.println("Nota correcta."); 
 
         */
/*EJERCICIO 9 INTRO JAVA 
       int num, suma=0, cont=0;
        do {
            System.out.println("Ingrese un numero: ");
            num = leer.nextInt(); 
            
            while (cont < 20) {                
                cont = cont + 1; 
                System.out.println("valor n° " + cont);
                suma += num;
               break;
            }
            
        } while (num != 0 && cont < 20);
        System.out.println("Se detecto un numero con valor de 0.");
        System.out.println("La suma total da: " + suma);*/

/*EJERCICIO 10 INTRO JAVA
        int num;
            System.out.println("Ingrese 4 valores entre 1 y 20: ");       
        for (int i = 0; i < 4; i++) {
            num = leer.nextInt();
            if (num >= 1 && num <= 20) {
                System.out.print(num);
                for (int j = 0; j < num; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                System.out.println("El valor ingresado no es valido.");
            }
        }*/
/*EJERCICIO 11 INTRO JAVA
        String frase,x = null;
        System.out.println("Ingrese una frase finalizada en punto: ");
        frase = leer.next();
        int i = 0;
        System.out.println(ChangeCaracter(frase,x,i));       
 }   
    public static String ChangeCaracter(String frase, String x, int i){
        if (frase.substring(frase.length() - 1, frase.length()).equals(".")) {
            for (i = 0; i < frase.length(); i++) {
                x = frase.substring(i,i+1);
                switch (x) {
                    case "a":
                    case "A":
                        x = "@";
                        break;
                    case "e":
                    case "E":
                        x = "#";
                        break;
                    case "i":
                    case "I":
                        x = "$";
                        break;
                    case "o":
                    case "O":
                        x = "%";
                        break;
                    case "u":
                    case "U":
                        x = "*";
                        break;
                }
                System.out.print(x);
            }
        } else {
            System.out.println("Error, la frase o palabra debe finalizar con un punto. ");
        }
 
        return frase;*/ 
    
/*EJERCICIO 12 JAVA INTRO
        System.out.println("Ingrese dos numeros enteros para saber si son multiplos:");
        int a,b;
        a= leer.nextInt();
        b= leer.nextInt();
        EsMultiplo(a, b);
    } 
public static void EsMultiplo(int a, int b) {
    if (a % b == 0) {
        System.out.println("El numero: " + b + " es multiplo de: " + a);
    } else {
        System.out.println("El numero: " + b + " no es multiplo de: " + a);
    }*/
     
/* EJERCICIO 13 Y 14 JAVA INTRO
     String[] Equipo = new String[6];
     Equipo [0] = "Juan";
     Equipo [1] = "Pablo";
     Equipo [2] = "Macarena";
     Equipo [3] = "Esteban";
     Equipo [4] = "Camila";
     Equipo [5] = "Florencia"
        for (int i = 0; i < Equipo.length; i++) {
            System.out.println(Equipo[i] + " esta en mi equipo. ");
        } */
     
     
}

  }