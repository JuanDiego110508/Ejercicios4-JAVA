import java.util.Random;

public class ContraseñaAleatoria9 {
    public static void main(String[] args) {
        String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String minusculas = "abcdefghijklmnopqrstuvwxyz";
        String numeros = "0123456789";
        String simbolos = "&()$%^!*?_#+<>-=@";

        String caracteres = mayusculas + minusculas + numeros + simbolos;

        String contraseña = "";
        Random random = new Random();

        for (int i = 0; i < 8; i++) {
            int indice = random.nextInt(caracteres.length());
            contraseña += caracteres.charAt(indice);
        }
        System.out.println("Contraseña generada: " + contraseña);
    }
}
