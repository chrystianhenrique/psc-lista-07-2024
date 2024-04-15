import java.util.Scanner;

public class ClassificacaoCriminosa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] perguntas = {
            "Telefonou para a vítima?",
            "Esteve no local do crime?",
            "Mora perto da vítima?",
            "Devia para a vítima?",
            "Já trabalhou com a vítima?"
        };

        String[] respostas = new String[5];

        for (int i = 0; i < perguntas.length; i++) {
            System.out.print(perguntas[i] + " (s/n): ");
            String resposta = scanner.nextLine().toLowerCase();
            while (!resposta.equals("s") && !resposta.equals("n")) {
                System.out.print("Por favor, responda com 's' para sim ou 'n' para não: ");
                resposta = scanner.nextLine().toLowerCase();
            }
            respostas[i] = resposta;
        }

        int numRespostasPositivas = 0;
        for (String resposta : respostas) {
            if (resposta.equals("s")) {
                numRespostasPositivas++;
            }
        }

        if (numRespostasPositivas == 2) {
            System.out.println("Suspeita");
        } else if (numRespostasPositivas >= 3 && numRespostasPositivas <= 4) {
            System.out.println("Cúmplice");
        } else if (numRespostasPositivas == 5) {
            System.out.println("Assassino");
        } else {
            System.out.println("Inocente");
        }
    }
}