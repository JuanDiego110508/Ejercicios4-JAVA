import java.util.Scanner;

public class Capicua10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        String numero = scanner.nextLine(); 

        String invertido = "";

        for (int i = numero.length() - 1; i >= 0; i--) {
            invertido += numero.charAt(i);
        }

        if (numero.equals(invertido)) {
            System.out.println("El número " + numero + " es capicúa.");
        } else {
            System.out.println("El número " + numero + " NO es capicúa.");
        } scanner.close();
    }
}
