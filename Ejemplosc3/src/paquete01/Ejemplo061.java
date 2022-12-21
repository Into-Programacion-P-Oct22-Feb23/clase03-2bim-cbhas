package paquete01;

public class Ejemplo061 {

    public static void main(String[] args) {
        // Creación de arreglo bidimensionales

        int[][] arreglo1 = {{10, 41, 40}, {1, 2, 3}};
        /*
        10      41      40 
        1       2       3
         */
        int suma = 0;
        int valor;
        String mensaje = "";
        System.out.print("La suma de:\n");
        for (int fila = 0; fila < arreglo1.length; fila++) {
            for (int col = 0; col < arreglo1[fila].length; col++) {
                valor = arreglo1[fila][col];
                if (fila == col) {
                    suma = suma + valor;
                    mensaje = String.format("%s%d\n", mensaje, arreglo1[fila][col]);
                }

            }

        }
        System.out.printf("%sEs igual a %d\n", mensaje, suma);

    }

}
