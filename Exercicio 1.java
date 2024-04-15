import java.util.Scanner;
import java.util.ArrayList;

public class TemperaturasAnuais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> temperaturasMensais = new ArrayList<>();

        for (int mes = 0; mes < 12; mes++) {
            System.out.print("Digite a temperatura média de " + mesExtenso(mes + 1) + ": ");
            double temperatura = scanner.nextDouble();
            temperaturasMensais.add(temperatura);
        }

        double media = mediaAnual(temperaturasMensais);

        System.out.println("\nTemperaturas acima da média anual:");
        for (int mes = 0; mes < 12; mes++) {
            double temperatura = temperaturasMensais.get(mes);
            if (temperatura > media) {
                System.out.println(mesExtenso(mes + 1) + " - " + String.format("%.2f", temperatura) + "°C");
            }
        }
    }

    public static String mesExtenso(int mes) {
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        return meses[mes - 1];
    }

    public static double mediaAnual(ArrayList<Double> temperaturas) {
        double soma = 0;
        for (double temperatura : temperaturas) {
            soma += temperatura;
        }
        return soma / temperaturas.size();
    }
}