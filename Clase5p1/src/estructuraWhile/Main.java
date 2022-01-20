package estructuraWhile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero = 10;

        while (numero!=10){
            System.out.print("Ingrese un numero: ");
            numero = teclado.nextInt();
        }

        System.out.println("\nEfectivamente numero fue igual a 10.");
    }
}
