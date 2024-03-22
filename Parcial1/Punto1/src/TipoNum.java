// Se crea esta clase para la creación de los métodos de identificación de los números
// Cada tipo de número es hecho por un método diferente
public class TipoNum {
    private int numero;

    public TipoNum(int numero) {
        this.numero = numero;
    }

    public boolean esPerfecto() {
        int suma = 0;
        for (int i = numero - 1; i > 0; i--) {
            if (numero % i == 0) {
                suma += i;
            }
        }
        return numero == suma;
    }

    public boolean esDefectivo() {
        int suma = 0;
        for (int i = numero - 1; i > 0; i--) {
            if (numero % i == 0) {
                suma += i;
            }
        }
        return numero > suma;
    }

    public boolean esAbundante() {
        int suma = 0;
        for (int i = numero - 1; i > 0; i--) {
            if (numero % i == 0) {
                suma += i;
            }
        }
        return suma > 2 * numero;
    }
}
