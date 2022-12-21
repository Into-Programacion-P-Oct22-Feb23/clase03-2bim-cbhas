package paquete04;

// Sebastián Calderón
public class Ejemplo2 {

    public static void main(String[] args) {
        // Creación de arreglo bidimensionales

        int[][] dato1 = {{1, 2, 3}, {6, 8, 9}}; //
        int[][] arregloR = new int[2][3];
        /*
            1   4   3
            36  64  9
         */

        int fila;
        int columna;

        for (fila = 0; fila < dato1.length; fila++) {
            for (columna = 0; columna < dato1[fila].length; columna++) {
                if (dato1[fila][columna] % 2 == 0) {
                    arregloR[fila][columna] = dato1[fila][columna] * 
                            dato1[fila][columna];

                } else {
                    arregloR[fila][columna] = dato1[fila][columna];
                }

            }

        }
        for (fila = 0; fila < dato1.length; fila++) {
            for (columna = 0; columna < dato1[fila].length; columna++) {
                System.out.printf("%d\t", arregloR[fila][columna]);
            }
            System.out.println();

        }
    }
}
