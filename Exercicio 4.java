import java.util.ArrayList;
import java.util.Scanner;

public class CalculoSalarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> vendasBrutas = new ArrayList<>();

        System.out.println("Digite as vendas brutas dos vendedores (-1 para encerrar):");

        double vendas;
        while ((vendas = scanner.nextDouble()) != -1) {
            vendasBrutas.add(vendas);
        }

        int[] contadores = new int[9];

        for (double venda : vendasBrutas) {
            double salario = 200 + (0.09 * venda);
            int indice = (int) ((salario - 200) / 100);
            if (indice >= 0 && indice < contadores.length) {
                contadores[indice]++;
            }
        }

        for (int i = 0; i < contadores.length; i++) {
            int inicioIntervalo = 200 + (i * 100);
            int fimIntervalo = inicioIntervalo + 99;
            if (i == contadores.length - 1) {
                System.out.println("$" + inicioIntervalo + " em diante: " + contadores[i]);
            } else {
                System.out.println("$" + inicioIntervalo + " - $" + fimIntervalo + ": " + contadores[i]);
            }
        }
    }
}