import java.util.Scanner;

public class SumaDiagonalMatriz4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        System.out.println("Ingresa los numeros para la matriz 3x3: ");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print("Posicion [" + i + "] [" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        int sumaPrincipal = 0;
        int sumaSecundaria = 0;

        for(int i = 0; i < 3; i++) {
            sumaPrincipal += matriz[i][i];
            sumaSecundaria += matriz[i][2 - i];
        }
        System.out.println("Suma diagonal Principal: " + sumaPrincipal);
        System.out.print("Suma diagonal Secundaria: " + sumaSecundaria);
    }
}
