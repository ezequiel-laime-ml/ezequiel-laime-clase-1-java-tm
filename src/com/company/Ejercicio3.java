package com.company;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        /*
        Desarrollar un programa para informar si un número n es primo o no, siendo n un valor que el usuario ingresará
        por consola.
        Recordá que un número es primo cuando sólo es divisible por sí mismo y por 1.
         */

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        boolean flag = true;

        if (n == 0 || n == 1)
            System.out.println(n + " es primo");

        for (int i = 2; i <= n/2; i++)
        {
            if (n % i == 0){
                flag = false;
                break;
            }
        }

        if (flag)
            System.out.println(n + " es primo");
        else
            System.out.println(n + " no es primo");


        /*
        if ( esPrimo(n, 2) )
            System.out.println(n + " es primo");
        else
            System.out.println(n + " no es primo");
         */

        scanner.close();
    }

    public static boolean esPrimo(int n, int divisor)
    {
        if (n <= 1)
            return true;

        if (n == divisor){
            return true;
        }
        else{
            if (n % divisor == 0)
                return false;

            return esPrimo(n, divisor++);
        }
    }
}
