package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner sc;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int ejercicio = 0;
        char continuar = 's';
        char control;
        while (continuar == 's') {

            System.out.println("Ingrese un ejercicio para realizar del 1 al 18");
            ejercicio = scanner.nextInt();

            switch (ejercicio) {
                case 1:
                    System.out.println("Problema 1: ");
                    problem1();
                    break;
                case 2:
                    System.out.println("Problema 2: ");
                    problem2();
                    break;
                case 3:
                    System.out.println("Problema 3: ");
                    problem3();
                    break;
                case 4:
                    System.out.println("Problema 4: ");
                    problem4();
                    break;
                case 5:
                    System.out.println("Problema 5: ");
                    problem5();
                    break;
                case 6:
                    System.out.println("Problema 6: ");
                    problem6();
                    break;
                case 7:
                    System.out.println("Problema 7: ");
                    problem7();
                    break;
                case 8:
                    System.out.println("Problema 8: ");
                    problem8();
                    break;
                case 9:
                    System.out.println("Problema 9: ");
                    problem9();
                    break;
                case 10:
                    System.out.println("Problema 10: ");
                    problem10();
                    break;
                case 11:
                    System.out.println("Problema 11: ");
                    problem11();
                    break;
                case 12:
                    System.out.println("Problema 12: ");
                    problem12();
                    break;
                case 13:
                    System.out.println("Problema 13: ");
                    problem13();
                    break;
                case 14:
                    System.out.println("Problema 14: ");
                    problem14();
                    break;
                case 15:
                    System.out.println("Problema 15: ");
                    problem15();
                    break;
                case 16:
                    System.out.println("Problema 16: ");
                    problem16();
                    break;
                case 17:
                    System.out.println("Problema 17: ");
                    problem17();
                    break;
                case 18:
                    System.out.println("Problema 17: ");
                    problem18();
                    break;
                default:
                    System.out.println("La opcion ingresada no es valida");
            }
                System.out.println("Desea continuar s/n\n");
                continuar = scanner.next().charAt(0);

        }
    }
    /*EJERCICIO 1*/
    private static void problem1 () {
        Scanner scanner = new Scanner(System.in);
        ///pedimos valores al usaurio
        System.out.println("Ingrese un valor entero para N");
        int N = scanner.nextInt();
        System.out.println("Ingrese un valor real para A");
        float A = scanner.nextFloat();
        System.out.println("Ingrese un valor de char para C");
        String C = scanner.next();
        System.out.println("VALORES INGRESADO: C= "+ C + " A= "+ A + " N= " + N);

        System.out.println("La suma de N y A" + (N + A));
        System.out.println("La dif de N y A" + (A - N));
        //System.out.println("Valor numerode C" + IntegerValueof(C));
    }

    /*EJERCICIO 2*/
    private static void problem2(){
        int X = 5;
        int Y = 6;
        double N = 4.3;
        double M = 8.5;
        System.out.println("VALORES DE LAS VARIABLES: X= " +  X +" Y = "+ Y + " N = " + N + " M = " + M);

        System.out.println("Operacion 1 X * Y = " + (X*Y));
        System.out.println("Operacion 2 Y / X = " + (Y/X));
        System.out.println("Operacion 3 N + M = "+ (N+M));
        System.out.println("Operacion 4 N * M = " + (N*M));

    }
    /*PROBLEMA 3*/
    private static void problem3(){
        int N = 5;
        N*=77;
        System.out.println("N multiplicado por 77 = " + N);
        N=3;
        System.out.println("N igual a 3 = " + N);
        N*=2;
        System.out.println("N por 2 = " + N);
        
    }

    /*Problema 4*/
    private static void problem4(){
        int A = 2, B = 6, C = 8, D = 10;
        System.out.println("A = " + A + " ,B=" + B + " ,C=" + C + " ,D= " + D);
        int aux;
        aux=B;
        B=C;
        System.out.println("B tomo el valor de C: " + B);
        C=A;
        System.out.println("C tomo el valor de A: " + C);
        A=D;
        System.out.println("A tomo el valor de D: " + A);
        D=aux;
        System.out.println("D tomo el valor de B: " + D);
    }

    /*Problema 5*/
    private static void problem5(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un valor entero: ");
        int A = scanner.nextInt();

        if(A%2==0){
            System.out.println("El numero ingresado es Par");
        }else{
            System.out.println("El numero ingresado es impar");
        }
    }

    /*Problema 6*/
    private static void problem6(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un valor entero: ");
        int B = scanner.nextInt();

        if(B>0){
            System.out.println("El numero ingresado es positivo");
        }else if(B<0){
            System.out.println("El numero ingresado es negativo");
        }else{
            System.out.println("El numero ingresado es 0");
        }
    }

    /*Problema 7*/
    private static void problem7(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un valor entero: ");
        int C = scanner.nextInt();
        String positivo = (C > 0) ? "positivo" : "negativo";
        String paridad = (C % 2 == 0) ? "par" : "impar";
        String multiplo5 = (C % 5 == 0) ? "multiplo de 5" : "no es multiplo de 5";
        String multiplo10 = (C % 10 == 0) ? "multiplo de 10" : "no es multiplo de 10";

        System.out.println("El numero es "+ positivo + ", " + paridad + ", " + multiplo5 + ", y " + multiplo10);
    }

    /*Problema 8*/
    private static void problem8(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un Nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Buenos dias, " + nombre);
    }
    /*Problema 9*/
    private static void problem9(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un valor entero: ");
        int C = scanner.nextInt();
        System.out.println("El valor ingresado es: = " + C);
        int aux1 = C*2;
        System.out.println("su doble = " + aux1);
        int aux2 = C*3;
        System.out.println("Su triple = " + aux2);
    }
    /*Problema 10*/
    private static void problem10(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una temperatura en FAHRENHEIT: ");
        double F = scanner.nextDouble();

        double C = ((F-32) * 5/9);

        System.out.println("En centigrados es: = " + C);
    }

    /*Problema 11*/
    public static void problem11(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el radio de una circunferencia: ");
        double R = scanner.nextDouble();

        double L = 2 * R * Math.PI;
        double A = Math.pow(R, 2) * Math.PI;/*preguntar que hace el pow*/

        System.out.println("La longitud es: "+ L + ", y su area de circunferencia" + A);
    }

    /*Problema 12*/
    public static void problem12(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una velocidad en kilometros: ");
        double KM = scanner.nextDouble();
        double MS = KM / 3.6;
        System.out.println("en metrosp or segundo es = " + MS);

    }

    /*Problema 13*/
    public  static void problem13(){
        Scanner scanner = new Scanner(System.in);
        double cat1, cat2, hipo;
        System.out.println("Ingrese el valor para el primer cateto");
        cat1 = scanner.nextDouble();

        System.out.println("Ingrese el valor para el segundo cateto");
        cat2 = scanner.nextDouble();
        hipo = Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2));
        System.out.println("La hipotenusa es: " + hipo);
    }

    /*Problema 14*/
    public static void problem14(){
        sc = new Scanner(System.in);

        System.out.println("Ingrese el radio de la esfera.");
        double radio = sc.nextDouble();
        double volumen;
        volumen= (4.0/3) * Math.PI * Math.pow(radio, 3);

        System.out.println("El volumende la esfera es = "+ volumen);

    }

    /*Problema 15*/
    public static void problem15(){
        sc = new Scanner(System.in);
        System.out.println("Ingrese Longitud del lado 1");
        double lado1 = sc.nextDouble();
        System.out.println("Ingrese Longitud del lado 2");
        double lado2 = sc.nextDouble();
        System.out.println("Ingrese Longitud del lado 3");
        double lado3 = sc.nextDouble();

        double sp = (lado1+lado2+lado3)/2;

        double area = Math.sqrt(sp * (sp -lado1) * (sp - lado2) * (sp - lado3));/*dudas con el sqrt*/

        System.out.println("El area es = " + area);

    }

    /*problema 16*/
    public static void problem16(){
        sc = new Scanner(System.in);
        System.out.println("Ingrese un numero de 3 cifras: ");
        int n = sc.nextInt();

        String sn = String.valueOf(n);
        char[] num = sn.toCharArray();
        int i=0;
        for(i=0; i<num.length; i++){
            System.out.println(num[i]);
        }
    }

    /*Problema 17*/
    public static void problem17(){
        sc = new Scanner(System.in);
        System.out.println("Ingrese un numero de 5 cifras: ");
        int n = sc.nextInt();

        String sn = String.valueOf(n);
        char[] num = sn.toCharArray();
        int i=0;
        for(i=0; i<num.length; i++){
            if(num[i]%2==0){
                System.out.println(num[i]);
            }
        }
    }

    /*Problema 18*/
    public static void problem18(){
        sc = new Scanner(System.in);
        System.out.println("Ingrese la hora");
        int hora = sc.nextInt();
        System.out.println("Ingrese la hora");
        int minutos = sc.nextInt();
        System.out.println("Ingrese la hora");
        int segundos = sc.nextInt();

        boolean valida = false;

        if(hora >= 0 && hora < 24){
            if(minutos>=0 && minutos<60){
                if(segundos>=0 && segundos<60){
                    valida = true;
                }
            }
        }
        if(valida){
            System.out.println("La hora es valida ");
        }else{
            System.out.println("La hora es invalida");
        }
    }

}




