import java.util.Arrays;
import java.util.Scanner;

public class Utilidades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ListaNumeros = { 1, 9, 23, 4, 55, 100, 1, 1, 23 };
        String[] ListaNombres = { "Leon", "Chris", "Jill", "Wesker", "Ada" };

        while (true) {
            Menu.MenuSeleccion();
            int opcion = scanner.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Ingrese el número para verificar si es primo:");
                    int numeroPrimo = scanner.nextInt();
                    boolean esPrimo = VerificaPrimo.verificarPrimo(numeroPrimo);
                    System.out.println("El número " + numeroPrimo + " " + (esPrimo ? "es primo." : "no es primo."));
                    break;

                case 2:
                    System.out.println("Ingrese cuatro números para realizar la operación:");
                    double num1 = scanner.nextDouble();
                    double num2 = scanner.nextDouble();
                    double num3 = scanner.nextDouble();
                    double num4 = scanner.nextDouble();
                    double resultadoOperacion = Operaciones.calcularResultado(num1, num2, num3, num4);
                    System.out.println("El resultado de la operación es: " + resultadoOperacion);
                    break;

                case 3:
                    System.out.println("Antes del método de la burbuja: " + Arrays.toString(ListaNumeros));
                    Ordenamientos.metodoBurbujaInt(ListaNumeros);
                    System.out.println("Después del método de la burbuja: " + Arrays.toString(ListaNumeros));
                    break;

                case 4:
                    System.out.println("Antes del método de la burbuja: " + Arrays.toString(ListaNombres));
                    Ordenamientos.metodoBurbujaString(ListaNombres);
                    System.out.println("Después del método de la burbuja: " + Arrays.toString(ListaNombres));
                    break;

                case 5:
                    System.out.println("La ejecución ha terminado.");
                    return;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }
}