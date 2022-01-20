package estructuraIf;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = teclado.nextInt();

        if (numero<=50){
            System.out.println("El numero es menor o igual a 50.");
        }else {

            if(numero<100){
                System.out.println("El numero es mayor a 50 pero menor a 100.");
            }else {
                System.out.println("El numero es mayor a 100.");
            }

            System.out.println("Fin de todo el If");
        }

    }
}
