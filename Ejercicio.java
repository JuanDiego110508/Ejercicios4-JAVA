import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        System.out.println("Ingrese los numeros para la matriz 3x3: ");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print("Posicion [" + i + "] [" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < 3; i++) {
            int sumaFila = 0;
            for(int j = 0; j < 3; j++) {
                sumaFila += matriz[i][j];
            } System.out.println("La suma de la fila " + i + " es: " + sumaFila);
        }

        System.out.println("------------------------------------------");

        for(int j = 0; j < 3; j++) {
            int sumaColumna = 0;
            for(int i = 0; i < 3; i++) {
                sumaColumna += matriz[i][j];
            } System.out.println("La suma de la columna " + j + " es: " + sumaColumna);
        }
    }
}
