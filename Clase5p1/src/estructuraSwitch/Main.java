package estructuraSwitch;

public class Main {
    public static void main(String[] args) {

        int numero=18;
        String mensaje;

        switch (numero){
            case 7: case 8: case 9: case 10:
                mensaje = "Aprobado.";
                break;

            case 1: case 2: case 3:
                mensaje = "Desaprobado.";
                break;

            case 4: case 5: case 6:
                mensaje = "Recuperatorio.";
                break;

            default:
                mensaje = "Examen no dado.";
                break;
        }

        System.out.println(mensaje);

    }
}
