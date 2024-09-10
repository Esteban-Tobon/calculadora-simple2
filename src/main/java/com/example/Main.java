
package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar el primer dato en numero: ");
        double numero1 =
        scanner.nextDouble();


        System.out.println("ingrese el segundo dato numero: ");
        double numero2 = scanner.nextDouble();
       

        System.out.println("ingrese la operación a realizar (Suma +,Resta -,Multiplicacion *,Division /,Porcentaje %).");
        char operacion = scanner.next().charAt(0);
        double resultado = 0;

        if (operacion == '+') {
            resultado = numero1 + numero2;
        }
        else if (operacion == '-') {
            resultado = numero1 - numero2;
        }

        else if (operacion == '*') {
            resultado = numero1 * numero2;
        }


        // no me da la division todavia la tengo que investigar
        else if (operacion == '/') {
            resultado = numero1 / numero2;
            System.out.println("Quedo debiendo la division");
        }

        else if (operacion == '%') {
            resultado = numero1 % numero2;
            System.out.println("no se puere realizar esta operacion intente con otros valores");
        }

        System.out.println("Resultado: " + resultado);





    }
}