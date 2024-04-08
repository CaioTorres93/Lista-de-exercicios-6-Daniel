import java.util.Scanner;

public class Atv3 {
    public static void main(String[] args) {
        double[] notas = new double[4];
        double soma = 0;

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();
            soma += notas[i];
        }

        double media = soma / 4;

        System.out.println("\nAs notas digitadas foram:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }

        System.out.println("\nA média das notas é: " + media);
    }
}