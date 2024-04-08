import java.util.Scanner;

public class Atv7 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int soma = 0;
        int multiplicacao = 1;

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número inteiro: ");
            numeros[i] = entrada.nextInt();
            soma += numeros[i];
            multiplicacao *= numeros[i];
        }

        System.out.println("\nA soma dos números é: " + soma);
        System.out.println("A multiplicação dos números é: " + multiplicacao);
        System.out.println("\nOs números digitados foram:");
        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
        }
    }
}