package paquete01;

public class Ejemplo041 {

    public static void main(String[] args) {
        // Creación de arreglo bidimensionales

        // forma 1
        int[][] arreglo1 = {
            {10, 20, 40}, // fila 0

            {1, 2, 3} // fila 1
        };

        int suma = 0;

        for (int fila = 0; fila < arreglo1.length; fila++) { // 0<2 // 1<2
            for (int col = 0; col < arreglo1[fila].length; col++) { // arreglo1[0].length:3 
                // 0<3 // 1<3 // 2<3 // 3<3
                suma = suma + arreglo1[fila][col];
                // 0 + arreglo1[0][0] // 0 + 10 // 10
                // 10 + arreglo1[0][1] // 10 + 20 // 30
                // 30 + arreglo1[0][2] // 30 + 40 // 70
            }
        }
        System.out.printf("Suma de valores del arreglo: %d\n", suma);

    }

}
