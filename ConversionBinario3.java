import java.util.Scanner;

public class ConversionBinario3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un numero entero positivo: ");
        int numero = scanner.nextInt();

        if(numero == 0) {
            System.out.print("El numero binario es 0. ");
        } else {
            String binario = "";

            while(numero > 0) {
                int residuo = numero % 2;
                binario += residuo;
                numero /= 2;
            } System.out.print("El numero en binario es: " + binario);
        }
    }
}
