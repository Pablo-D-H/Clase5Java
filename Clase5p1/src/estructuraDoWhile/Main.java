package estructuraDoWhile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero = 0;
        String palabra;

        /*do {
            System.out.print("Ingrese un numero: ");
            numero = teclado.nextInt();

        }while (numero!=10);

        System.out.println("\nEfectivamente numero fue igual a 10.");*/

        do {
            System.out.print("Ingrese una palabra: ");
            palabra = teclado.next();

        }while (!palabra.equals("exito"));

        System.out.println("\nEfectivamente fue un exito.");

    }
}
