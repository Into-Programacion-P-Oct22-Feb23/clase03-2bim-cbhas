package paquete01;

public class Ejemplo01 {

    public static void main(String[] args) {
        // Creación de arreglo bidimensionales

        // forma 1
        int[][] arreglo1 = new int[3][4];

        // forma 2
        int[][] arreglo2 = {{10, 20, 30}, {100, 200, 300}};
        String[][] arreglo3 = {{"10", "20", "30"},
                               {"100", "200", "300"}};

        // forma 3
        int[][] arreglo4 = new int[3][];
        arreglo4[0] = new int[2];
        arreglo4[1] = new int[2];
        arreglo4[2] = new int[2];

        // forma 4
        int[][] arreglo5 = {{10, 20}, {100, 200, 300}};
    }

}
