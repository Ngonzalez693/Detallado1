import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numeros {
    public static void main(String[] args) throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        int opcion;

        // Se llama el método para mostrar el menú de selección
        Menu.mostrarMenu();

        entrada = bufer.readLine();
        opcion = Integer.parseInt(entrada);

        System.out.println("------------------------------------------------------");
        System.out.println("Escriba el número: ");
        entrada = bufer.readLine();
        int numero = Integer.parseInt(entrada);

        TipoNum tipoNumero = new TipoNum(numero);

        // En el Switch solo llamo los métodos y dejo los outputs
        switch (opcion) {
            case 1:
                if (tipoNumero.esPerfecto()) {
                    System.out.println("El número: " + numero + " es perfecto");
                } else {
                    System.out.println("El número: " + numero + " no es perfecto");
                }
                break;
            case 2:
                if (tipoNumero.esDefectivo()) {
                    System.out.println("El número: " + numero + " es defectivo");
                } else {
                    System.out.println("El número: " + numero + " no es defectivo");
                }
                break;
            case 3:
                if (tipoNumero.esAbundante()) {
                    System.out.println("El número: " + numero + " es abundante");
                } else {
                    System.out.println("El número: " + numero + " no es abundante");
                }
                break;
            default:
                System.out.println("Opción no válida");
        }
    }

}
