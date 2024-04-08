import java.util.Scanner;

public class Atv5 {
    public static void main(String[] args) {
        int[] numeros = new int[20];
        int[] par = new int[20];
        int[] impar = new int[20];
        int contadorPar = 0;
        int contadorImpar = 0;

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite um número inteiro: ");
            numeros[i] = entrada.nextInt();

            if (numeros[i] % 2 == 0) {
                par[contadorPar] = numeros[i];
                contadorPar++;
            } else {
                impar[contadorImpar] = numeros[i];
                contadorImpar++;
            }
        }

        System.out.println("\nVetor original:");
        for (int i = 0; i < 20; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\nVetor PAR:");
        for (int i = 0; i < contadorPar; i++) {
            System.out.print(par[i] + " ");
        }

        System.out.println("\nVetor ímpar:");
        for (int i = 0; i < contadorImpar; i++) {
            System.out.print(impar[i] + " ");
        }
    }
}