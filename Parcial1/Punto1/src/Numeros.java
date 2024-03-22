import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numeros {
    public static void main(String[] args) throws Exception {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        int opcion = 0;
        int numero, suma = 0, i;

        System.out.println("Sistema que detecta los siguientes tipos de números: ");
        System.out.println("1 Perfecto");
        System.out.println("2. Defectivo");
        System.out.println("3. Abundante");
        System.out.println("Seleccione la opción 1, 2 o 3: ");

        entrada = bufer.readLine();
        numero = Integer.parseInt(entrada);

        switch ( opcion ) {
            case 1:
                for (i = numero; i >= 1; i--)
                    if (numero % i == 0)
                        suma += i;
                if (numero == suma)
                    System.out.println("El número: " + numero + "es perfecto");
                else
                    System.out.println("El número: " + numero + "No es perfecto");
                break;

            case 2:
                for (i = numero; i >= 1; i--)
                    if (numero % i == 0)
                        suma += i;
                if (numero > suma)
                    System.out.println("El número: " + numero + "es perfecto");
                else
                    System.out.println("El número: " + numero + "No es perfecto");
                break;

            case 3:
                for (i = numero; i >= 1; i--)
                    if (numero % i == 0)
                        suma += i;
                if (suma > 2 * numero)
                    System.out.println("El número: " + numero + "es perfecto");
                else
                    System.out.println("El número: " + numero + "No es perfecto");
                break;
            
            default: System.out.println("Opción no válida");

        }
    }
}
