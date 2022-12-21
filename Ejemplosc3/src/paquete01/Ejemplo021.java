package paquete01;

public class Ejemplo021 {

    public static void main(String[] args) {
        // Creación de arreglo bidimensionales
        String cadenaFinal = "";

        // forma 1
        int[][] arreglo1 = new int[3][4];
        /*System.out.printf("Uso de la opción length: %d\n", arreglo1.length);
        System.out.println("-------------------------------------------------");

        System.out.printf("Valor en la posición [0][2]\n", arreglo1[0][2]);
        System.out.println("-------------------------------------------------");*/

        arreglo1[0][2] = 1000;

        for (int fila = 0; fila < arreglo1.length; fila++) {
            for (int col = 0; col < arreglo1[fila].length; col++) {
                cadenaFinal = String.format("%s\nfila [%s], columna [%s] = %d",
                        cadenaFinal,
                        fila,
                        col,
                        arreglo1[fila][col]);
                /*System.out.printf("fila[%d] columna[%d] = %d\n",
                        fila, col, arreglo1[fila][col]);*/
            }
        }
        System.out.printf("%s\n", cadenaFinal);

    }

}
