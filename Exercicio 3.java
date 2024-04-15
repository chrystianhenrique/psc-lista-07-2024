import java.util.ArrayList;
import java.util.Scanner;

public class AnaliseNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();

        System.out.println("Digite as notas (digite -1 para encerrar):");

        double nota;
        while ((nota = scanner.nextDouble()) != -1) {
            notas.add(nota);
        }

        System.out.println("Quantidade de valores lidos: " + notas.size());

        System.out.print("Valores na ordem informada: ");
        for (double n : notas) {
            System.out.print(n + " ");
        }
        System.out.println();

        System.out.println("Valores na ordem inversa:");
        for (int i = notas.size() - 1; i >= 0; i--) {
            System.out.println(notas.get(i));
        }

        double soma = 0;
        for (double n : notas) {
            soma += n;
        }
        double media = soma / notas.size();
        System.out.println("Soma das notas: " + soma);
        System.out.println("Média das notas: " + media);

        int acimaDaMedia = 0;
        for (double n : notas) {
            if (n > media) {
                acimaDaMedia++;
            }
        }
        System.out.println("Quantidade de valores acima da média: " + acimaDaMedia);

        int abaixoDeSete = 0;
        for (double n : notas) {
            if (n < 7) {
                abaixoDeSete++;
            }
        }
        System.out.println("Quantidade de valores abaixo de sete: " + abaixoDeSete);

        System.out.println("Programa encerrado.");
    }
}