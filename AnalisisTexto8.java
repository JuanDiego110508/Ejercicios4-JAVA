import java.util.Scanner;

public class AnalisisTexto8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe una frase: ");
        String frase = scanner.nextLine();

        int cantidadPalabras = 0;
        int cantidadLetras = 0;
        int cantidadEspacios = 0;

        boolean dentroDePalabra = false;

        for(int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);

            if(letra != ' ') {
                cantidadLetras++;
                if(!dentroDePalabra) {
                    cantidadPalabras++;
                    dentroDePalabra = true;
                } else {
                    cantidadEspacios++;
                    dentroDePalabra = false;
                }
            }
        } System.out.println("La cantidad de palabras es: " + cantidadPalabras/2);
          System.out.println("La cantidad de letras es: " + cantidadLetras);
          System.out.println("La cantidad de espacios es: " + cantidadEspacios/2);
          scanner.close();
    }      
}
