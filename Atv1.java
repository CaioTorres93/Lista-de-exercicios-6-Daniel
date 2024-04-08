import java.util.Scanner;

public class Atv1 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int soma = 0;

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Entre com um número: ");
            numeros[i] = entrada.nextInt();
            soma += numeros[i];
        }

        System.out.println("A soma dos números é: " + soma);
        System.out.println("\nOs números digitados foram:");
        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
        }
    }
}