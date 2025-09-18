import java.util.Scanner;

public class EjercicioContador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int numero = scanner.nextInt();

        if(numero < 0) {
            numero *= -1;
        }

        if(numero == 0) {
            System.out.print("El numero tiene 1 solo digito. ");
        } else {
            int contador = 0;
            while (numero > 0) {
                numero /= 10;
                contador++;
            } System.out.print("El numero tiene: " + contador + " digitos. ");
        }
    }
}