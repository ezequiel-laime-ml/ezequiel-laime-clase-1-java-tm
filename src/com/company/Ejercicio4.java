package com.company;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        /*
            Desarrollar un programa para mostrar por consola los primeros n números primos, siendo n un valor que el
            usuario ingresará por consola.
        */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1;
        int cont = 0;

        while(cont <= n)
        {
            if ( esPrimo(i) )
            {
                System.out.println(i);
                cont++;
            }
            i++;
        }

        scanner.close();
    }

    public static boolean esPrimo(int n)
    {
        if (n == 0 || n == 1)
            return true;

        for (int i = 2; i <= n/2; i++)
        {
            if (n % i == 0){
                return false;
            }
        }

        return true;
    }
}
