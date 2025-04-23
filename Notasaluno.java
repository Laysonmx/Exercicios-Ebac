package mod10;


   import java.util.Scanner;

public class Notasaluno {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double soma = 0;

            for (int i = 1; i <= 4; i++) {
                System.out.print("Digite a nota " + i + ": ");
                double nota = scanner.nextDouble();
                soma += nota;
            }

            double media = soma / 4;
            System.out.printf("Média: %.2f\n", media);

            if (media > -1 && media < 5) {
                System.out.println("Reprovado");
            } else if (media >= 5 && media < 7) {
                System.out.println("Recuperação");
            } else if (media >= 7 && media <= 10) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Média inválida");
            }

            scanner.close();
        }
    }
