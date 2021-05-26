package com.company;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        /*
            Desarrollar un programa para mostrar por consola los primeros n números naturales que tienen al menos
            m dígitos d, siendo n, m y d valores que el usuario ingresará por consola.
            Por ejemplo: si el usuario ingresa n=5, m=2 y d=3, el programa deberá mostrar por consola los primeros
            5 números naturales que tienen, al menos, 2 dígitos 3. En este caso la salida será: 33, 133, 233, 303, 313.
         */

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int d = scanner.nextInt();

        // Se puede usar usando el operador % para ir obteniendo los digitos
        // Usar regex?

        int cont = 0;
        String ds = Integer.toString(d);

        for (int i = 0; cont < n; i++)
        {
            String ns = Integer.toString(i);
            int cantidadOcurrencias = 0;

            while (ns.indexOf(ds) > -1) {

                ns = ns.substring(ns.indexOf(ds) + ds.length());
                cantidadOcurrencias++;
            }

            if (cantidadOcurrencias >= m)
            {
                System.out.println(i);
                cont++;
            }
        }

        scanner.close();

    }
}
