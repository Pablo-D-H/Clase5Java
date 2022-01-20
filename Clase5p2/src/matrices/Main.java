package matrices;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numeros[][] = new int[3][3];

        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[0][2] = 3;

        numeros[1][0] = 4;
        numeros[1][1] = 5;
        numeros[1][2] = 6;

        numeros[2][0] = 7;
        numeros[2][1] = 8;
        numeros[2][2] = 9;

        int matriz2[][] = {{1,2,3}, {9,8,7}, {4,5,6}, {0,0,0}};

        /*for (int i=0; i<4 ;i++){
            for (int j=0; j<3; j++){
                System.out.println("Fila: " +i+ " Columna: "+j+ " = " + matriz2[i][j]);
            }
        }*/

        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de filas: ");
        int filas = teclado.nextInt();
        System.out.print("Ingrese la cantidad de columnas: ");
        int columnas = teclado.nextInt();

        int matrizTeclado[][] = new int[filas][columnas];

        for (int i=0; i<filas;i++){
            for (int j =0; j<columnas; j++){
                System.out.print("Ingrese un valor para la fila "+i+ "columna " +j +" : ");
                matrizTeclado[i][j] = teclado.nextInt();
            }
        }

        System.out.println("");

        for (int i=0; i<filas;i++){
            for (int j =0; j<columnas; j++){
                System.out.println("Fila: " +i+ " Columna: "+j+ " = " + matrizTeclado[i][j]);
            }
        }






    }
}
