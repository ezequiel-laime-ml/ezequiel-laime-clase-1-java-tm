package com.company;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        /*
        Desarrollar un programa para mostrar los primeros n números pares, siendo n un valor que el usuario ingresará
        por consola.
        Recordá que un número es par cuando es divisible por 2.
         */

	    Scanner scanner = new Scanner(System.in);

	    int n = scanner.nextInt();
	    /*
	    int i = 0;

	    int cont = 0;

	    while (cont < n)
        {
            if (i % 2 == 0)
            {
                System.out.println(i);
                cont++;
            }
            i++;
        }
        */

	    for(int i = 0; i < n; i++)
	    {
            System.out.println(i * 2);
        }

	    scanner.close();
    }
}
