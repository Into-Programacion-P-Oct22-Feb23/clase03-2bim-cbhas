package paquete01;

public class Ejemplo05 {

    public static void main(String[] args) {
        // Creación de arreglo bidimensionales

        int[][] arreglo1 = {{10, 41, 40}, {1, 2, 3}};
        /*
        10      41      40
        1       2       3
         */
        int suma = 0;
        int valor;
        for (int fila = 0; fila < arreglo1.length; fila++) {
            for (int col = 0; col < arreglo1[fila].length; col++) {
                valor = arreglo1[fila][col];
                if (fila == col) {
                    suma = suma + valor;
                }

            }
        }
        System.out.printf("Suma de valores del arreglo: %d\n", suma);
    }

}
