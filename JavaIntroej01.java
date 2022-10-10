/*
 PARA PODER PROBAR EL CODIGO DE DESARROLLO SOLAMENTE BORRA EL DELIMITADOR (* /) DEL FINAL DEL EJERCICIO Y COLOCALO EN EL TITULO "EJERCICIO DE APRENDIZAJE"
     
    EJEMPLO / * EJERCICIO DE APRENDIZAJE * /
 */
//Este es el paquete//
package javaintroej01;
//import java.util.Random;
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
        System.out.println("MAYUSCULAS: " + frase.toUpperCase()); //RETORNA LA CADENA EN MAYUSCULAS
        System.out.println("minusculas: " + frase.toLowerCase()); */ //RETORNA LA CADENA EN MINUSCULAS
        
 /* EJERCICIO DE APRENDIZAJE 04
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
        raiz = (int) Math.sqrt(num); //SQRT -> DEVUELVE LA RAIZ CUADRADA REDONDEADA DE UN DOUBLE O INT
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
        if (contraseña.equals(ContraseñaCorrecta)) { //EQUALS COMPARA LAS CADENAS PARA VER SI TIENEN EL MISMO VALOR.
            System.out.println("La contraseña es correcta. ");
        } else {
            System.out.println("La contraseña ingresada es incorrecta. ");   
        } */
       
 /* EJERCICIO DE APRENDIZAJE 08
        String frase;
        System.out.println("Ingrese palabra o frase con 8 caracteres de largo: ");
        frase = leer.nextLine();
        if (frase.length() <= 8) { //LENGTH TOMA LAS LONGITUDES DE LAS CADENAS POR CADA CARACTER.
            System.out.println("CORRECTO.");
        } else {
            System.out.println("INCORRECTO.");
        }*/
        
 /*EJERCICIO DE APRENDIZAJE 09
        String frase; 
        System.out.println("Ingrese una frase o palabra que inicie con la letra A: ");
        frase = leer.nextLine();
        if (frase.equals(frase.substring(0)) != frase.substring(0).equals(0)) { //SUBSTRING TOMA EL VALOR DEL PRIMER CARACTER DE LA CADENA Y EQUALS LAS COMPARA CON VALOR ASIGNADO.
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
 
 /*EJERCICIO DE APRENDIZAJE 11
        int num1,num2,OpcionMenu,numAuxiliar;
        boolean salir = false;
        do {
        System.out.println("Ingrese dos numeros enteros para realizar las operaciones: ");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        System.out.print("Menu: " //SE PUEDE SIMPLIFICAR ESPACIO DE DESARROLLO SOLO DANDO ENTER CADA VEZ QUE SE CIERRA " ".
                + " 1.Sumar "
                + " 2.Restar "
                + " 3.Multiplicar "
                + " 4.Dividir "
                + " 5.Salir "
                + " Elija opcion: ");
        OpcionMenu = leer.nextInt();
        switch (OpcionMenu) {
            case 1:
                System.out.println("Suma de operandos: ");
                numAuxiliar = num1 + num2;
                System.out.println("La sumatoria de los numeros es: " + numAuxiliar);
                break;
            case 2:
                System.out.println("Resta de operandos: ");
                numAuxiliar = num1 - num2;
                System.out.println("La substraccion de los numeros es: " + numAuxiliar);
                break;
            case 3:
                System.out.println("Multiplicacion de los operandos: ");
                numAuxiliar = num1*num2;
                System.out.println("La multiplicacion de los numeros es: " + numAuxiliar);
                break;
            case 4: 
                System.out.println("Division de los operandos:");
                numAuxiliar = num1/num2;
                System.out.println("La division de los numeros es: " + numAuxiliar);
                break;
            case 5:
                System.out.println("¿Esta seguro que desea salir del programa? (S/N)");
                String opcion = leer.next();
                if (opcion.equals("s") || opcion.equals("S")) {
                    System.out.println("Adios.");
                salir = true;
                }else
                    System.out.println("Continuemos.");
                break;
            default:
                System.out.println("La opcion ingresada es incorrecta.");
        }
         } while (!salir);*/
 
 /*EJERCICIO DE APRENDIZAJE 12
        String cadena,PrimeraLetra= "X", UltimaLetra = "O";
        int lecturaCorrecta = 0, lecturaIncorrecta = 0;
        do {
            System.out.println("Ingrese una cadena de 5 caracteres que inicien en X y terminen en O.");
            cadena = leer.nextLine();
            while (cadena.length() <= 5){
                if (cadena.substring(0).equals(PrimeraLetra) || cadena.substring(4).equals(UltimaLetra)) {
                    lecturaCorrecta = lecturaCorrecta + 1;
                    System.out.println("Lecutra correcta.");
                    break;
                }else
                    lecturaIncorrecta=lecturaIncorrecta + 1;
                   System.out.println("Lectura incorrecta.");
                   break;
            }
            System.out.println("SU CADENA SUPERA LOS 5 CARACTERES. RESPETE LOS PARAMETROS.");
        } while (!"&&&&&".equals(cadena)) ; //SE COLOCA !(NO) PARA INDICAR QUE LA CADENA CORTE CUANDO SEA IGUAL
        System.out.println("La cantidad de lecturas correctas son: " + lecturaCorrecta);
        System.out.println("La cantidad de lecturas incorrectas son: " + lecturaIncorrecta);*/
 
 /*EJERCICIO DE APRENDIZAJE 13
        System.out.println("Ingrese el tamaño del cuadrado:");
        int n = leer.nextInt();
        if (n >= 0 && n <= 50) {
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();      
            
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
        }else
            System.out.println("El tamaño del cuadrado debe estar entre 0 y 50");
        }*/
 
 /*EJERCICIO DE APRENDIZAJE 14
        EXTERNA:  //SENTENCIA EXTERNA ES PARA DARLE UN CIERRE A SWITCH DE MANERA FORZADA
        while (true) {
            System.out.println("CONVERSOR DE MONEDAS");
            System.out.println("1. Dolares a euros. "
                    + " 2. Libras a euros. "
                    + " 3. Yenes a euros. "
                    + " 4. Salir. ");
            System.out.print("INGRESE UNA OPCION: ");
            int OpcionMenu = leer.nextInt();
            switch (OpcionMenu) {
                case 1:
                    conversion(1.28611, "dolares");
                    break;
                case 2:
                    conversion(0.86, "libras");
                    break;
                case 3:
                    conversion(129.852, "yenes");
                    break;
                case 4:
                    System.out.println("CERRANDO PROGRAMA...");
                    break EXTERNA;
                default:
                    System.out.println("OPCION INCORRECTA.");
                    break;  
            }
        }
    }

    static void conversion(double valorEuro, String MonedaConvertir) {
        Scanner leer = new Scanner(System.in);
        System.out.printf("Ingrese el valor a convertir: ");
        double CantidadEuros = leer.nextDouble();
        
        double Euros = CantidadEuros / valorEuro;
        Euros = (double) Math.round(Euros * 100d)/100;
        
        System.out.println("------------------------------------------------");
        System.out.println("|El resultado de la conversion es: " + Euros+" € |" );
        System.out.println("------------------------------------------------");
    }*/
 
 /*EJERCICIO DE APRENDIZAJE 15
        int [] vector = new int [100];
        for (int i = 0; i < 100; i++) { //ASCENDENTE 
            vector[i] = i + 1;
           System.out.println("[" + vector[i] +"]");           
        }
        System.out.println("==========================================================");
        
        for (int i = vector.length-1; i > 0; i--) { //DESCENDENTE
            System.out.println("[" + vector[i] +"]");     
        }*/
 
 /*EJERCICIO DE APRENDIZAJE 16 
        int[] vector = new int[20];
        int pos=-1, cont=0; //VARIABLE POS PARA ALMACENAR POSICION DE NUMERO A ENCONTRAR Y CONT PARA VER REPETICIONES
       
        System.out.println("Ingrese un numero entero a buscar dentro del vector: ");
        int numbusqueda = leer.nextInt();
        
            for (int i = 0; i < vector.length; i++) { //VECTOR.LENGTH ---> PARA QUE RECORRA HASTA EL LIMITE DEL VECTOR.
            vector[i] = new Random().nextInt(40);
                if (vector[i] == numbusqueda) {
                    pos = i; 
                    cont ++;
                }
        }
        if (pos==-1) {
            System.out.println("NO SE ENCUENTRA EL NUMERO DENTRO DEL ARRAY.");
        }else{
            System.err.println("LA POSICION DE " + numbusqueda + " EN EL ARRAY ES: " + pos);
            System.out.println("EL NUMERO SE ENCUENTRA REPETIDO: " + cont + " VECES.");
        }*/

 /*EJERCICIO DE APRENDIZAJE 17
        int [] vector = new int[100];
        String x;
        int Cont1=0, cont2=0,cont3=0, cont4=0,cont5=0, n=100000;
        
        for (int i = 0; i < vector.length; i++) {
            vector [i] = new Random().nextInt(n);
            x = Integer.toString(vector[i]); //PASAJE DE NUMEROS ENTEROS A CARACTER, ES DECIR DIMENSIONA LOS ENTEROS.
             System.out.println(vector[i] + " Tiene " + x.length() + " digitos"); //X.LENGTH TOMA DIMENSION DE LOS ENTEROS PARA VER CUANTOS DIGITOS POSEEN
             
             if (x.length() == 1){
                 Cont1++;
             }else if (x.length() == 2){
                 cont2++;
             }else if (x.length() == 3){
                 cont3++;
             }else if (x.length() == 4){
                 cont4++;
             }else if (x.length() == 5)
                 cont5++;
        }
        System.out.println("Los numeros de un digito son: " + Cont1);
            System.out.println("Los numeros de dos digitos son: " + cont2);
            System.out.println("Los numeros de tres digitos son: " + cont3);
            System.out.println("Los numeros de cuatro digitos son: " + cont4);
            System.out.println("Los numeros de cinco digitos son: " + cont5);*/
 
 /*EJERCICIO DE APRENDIZAJE 18
        int [][] matriz = new int [4][4];
        int [][] matrizT = new int [4][4];
        System.out.println("MATRIZ INICIALIZADA: "); 
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz [i][j] = new Random().nextInt(10)+1; //SE INICIALIZA MATRIZ CON VALORES AL AZAR CON VALOR HASTA 10 [.NEXTINT(10)] SE COLOCA +1 PARA QUE NO ABARQUE VALOR 0
                System.out.print("[" + matriz[i][j] + "]");
            }  
            System.out.println (" "); //UBICACION DE SALTO DE LINEA FUERA DEL SEGUNDO FOR
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizT [j][i] = matriz [i][j]; //TRANSPOSICION DE LAS MATRICES
            }
        }
         System.out.println("MATRIZ TRANSPUESTA:");
 
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + matrizT[i][j] + "]");
            }
            System.out.println(" "); //UBICACION DE SALTO DE LINEA FUERA DEL SEGUNDO FOR
        }*/

/*EJERCICIO DE APRENDIZAJE 19*/
        
 
 
        }
       
    }
