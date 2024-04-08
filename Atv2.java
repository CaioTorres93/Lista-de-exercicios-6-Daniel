import java.util.Scanner;

public class Atv2 {
    public static void main(String[] args) {
        double[] numeros = new double[10];
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número real: ");
            numeros[i] = entrada.nextDouble();
        }

        System.out.println("\nNúmeros na ordem inversa:");
        for (int i = 9; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}