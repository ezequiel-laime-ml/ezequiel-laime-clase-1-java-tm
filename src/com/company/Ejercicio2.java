package com.company;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
            Desarrollar un programa para mostrar los primeros n múltiplos de m, siendo n y m valores que el usuario
            ingresará por consola.
            Recordá que un número a es múltiplo de b si a es divisible por b.
         */
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for(int i = 1; i <= n; i++)
        {
            System.out.println(i*m);
        }

        scanner.close();
    }
}
