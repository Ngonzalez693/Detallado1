public class VerificaPrimo {
    /**
     * Verifica si un número es primo.
     *
     * @param numero Número a verificar
     * @return true si es primo, false si no lo es
     */
    public static boolean verificarPrimo(int numero){
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}