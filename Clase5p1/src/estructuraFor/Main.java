package estructuraFor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero=0;


        System.out.print("Ingrese un numero: ");

        numero = teclado.nextInt();
       int numeroMaximo = numero *10;
       int cont=0;

        System.out.println("La tabla de " + numero + " es: ");

        for (int i = 0; i<=numeroMaximo; i+=numero){

            System.out.println(numero +"*"+ cont +"="+ i );
            cont++;
        }
    }
}
