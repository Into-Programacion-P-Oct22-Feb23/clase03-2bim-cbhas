package paquete02;

import java.util.Scanner;

public class Ejemplo01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valorIngresado;
        int[][] arreglo1 = new int[2][2];
        // i = fila
        // j = columna
        System.out.println("Presentación de valores iniciales del arreglo");
        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1[i].length; j++) {
                System.out.printf("%d\t", arreglo1[i][j]);
            }
            System.out.println(); // salto de línea
        }
        
        System.out.println("Ingreso de datos al arreglo");
        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1[i].length; j++) {
                System.out.printf("Ingrese valor para la posición [%d][%d]: ",
                        i, j);
                valorIngresado = entrada.nextInt();
                arreglo1[i][j] = valorIngresado;
            }
            System.out.println(); // salto de línea
        }
        
        System.out.println("Presentación de valores del arreglo");
        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1[i].length; j++) {
                System.out.printf("%d\t", arreglo1[i][j]);
            }
            System.out.println(); // salto de línea
        }

    }
}
