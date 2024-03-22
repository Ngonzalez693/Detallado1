public class Ordenamientos {
    /**
     * Método que realiza el ordenamiento por Burbuja para datos int.
     *
     * @param arreglo Arreglo de enteros a ordenar.
     */
    public static void metodoBurbujaInt(int[] arreglo) {
        for (int elemento : arreglo) {
            for (int j = 0; j < arreglo.length - 1 - elemento; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Método que realiza el ordenamiento por Burbuja para datos String.
     *
     * @param arreglo Arreglo de cadenas a ordenar.
     */
    public static void metodoBurbujaString(String[] arreglo) {
        for (String elemento : arreglo) {
            for (int j = 0; j < arreglo.length - 1 - elemento.length(); j++) {
                if (arreglo[j].compareTo(arreglo[j + 1]) > 0) {
                    String temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }
}
