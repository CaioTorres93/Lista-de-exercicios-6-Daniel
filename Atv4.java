import java.util.Scanner;

public class Atv4 {
    public static void main(String[] args) {
        char[] caracteres = new char[10];
        int contadorConsoantes = 0;

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um caractere: ");
            caracteres[i] = entrada.next().charAt(0);
            if (ehConsoante(caracteres[i])) {
                contadorConsoantes++;
            }
        }

        System.out.println("\nQuantidade de consoantes lidas: " + contadorConsoantes);
        System.out.println("As consoantes digitadas foram:");
        for (int i = 0; i < 10; i++) {
            if (ehConsoante(caracteres[i])) {
                System.out.println(caracteres[i]);
            }
        }
    }

    public static boolean ehConsoante(char c) {
        c = Character.toUpperCase(c);
        return c >= 'B' && c <= 'Z' && c != 'E' && c != 'I' && c != 'O' && c != 'U';
    }
}