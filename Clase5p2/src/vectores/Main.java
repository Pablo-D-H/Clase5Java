package vectores;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int numeros[] = new int[5];

        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;
        numeros[5] = 51;

        int numeros2[] = {33,53,1,5,7,8,3};

        //System.out.println("Longitud de mi arreglo numeros2: "+numeros2.length );

        /*for (int i=0; i<numeros2.length; i++){
            System.out.println("Indice: "+ i + " Valor: " + numeros2[i]);
        }*/

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de posiciones para el arreglo: ");
        int palabra = teclado.nextInt();

        String palabras[] = new String[palabra];

        for (int i =0; i<palabras.length;i++){
            System.out.print("Ingrese la palabra del indice " + i +" : ");
            palabras[i] = teclado.next();
        }

        System.out.println("");
        for (int i=0; i<palabras.length; i++){
            System.out.println("Indice: "+ i + " Valor: " + palabras[i]);
        }


    }
}
