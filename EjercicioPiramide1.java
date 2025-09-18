import java.util.Scanner;

public class EjercicioPiramide1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un numero para la altura de la piramide: ");
        int numeroAltura = scanner.nextInt();

        for(int i = 1; i <= numeroAltura; i++) {

            for(int j = 1; j <= numeroAltura - i; j++) {
                System.out.print(" ");
            }

            for(int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            } System.out.println();
        } scanner.close();
    }
}