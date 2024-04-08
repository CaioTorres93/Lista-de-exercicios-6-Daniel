import java.util.Scanner;

public class Atv6 {
    public static void main(String[] args) {
        double[] notas = new double[10];
        double[] medias = new double[10];
        int contadorAprovados = 0;

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite as quatro notas do " + (i + 1) + "º aluno (separadas por espaço): ");
            for (int j = 0; j < 4; j++) {
                notas[j] = entrada.nextDouble();
            }
            medias[i] = calcularMedia(notas);
        }

        System.out.println("\nMédias dos alunos:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Aluno " + (i + 1) + ": " + medias[i]);
            if (medias[i] >= 7.0) {
                contadorAprovados++;
            }
        }

        System.out.println("\nNúmero de alunos com média maior ou igual a 7.0: " + contadorAprovados);
    }

    public static double calcularMedia(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
}