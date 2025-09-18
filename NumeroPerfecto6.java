import java.util.Scanner;

public class NumeroPerfecto6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = scanner.nextInt();

        int suma = 0;

        for(int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }

        if(suma == numero) {
            System.out.println("El numero " + numero + " es perfecto. ");
        } else {
            System.out.println("El numero " + numero + " NO es perfecto. ");
        }
    }
}
