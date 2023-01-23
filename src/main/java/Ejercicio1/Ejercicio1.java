package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        scanner.close();

        boolean esPar = numero % 2 == 0;

        if (esPar == true) {
            for (int i = numero; i >= 0; i--) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        } else {
            for (int i = numero; i >= 1; i--) {
                if (i % 2 > 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
