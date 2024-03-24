import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de pessoas na turma: ");
        int quantidadePessoas = scanner.nextInt();

        if (quantidadePessoas <= 0) {
            System.out.println("A quantidade de pessoas deve ser um número positivo.");
        } else {
            int somaIdades = 0;

            for (int i = 1; i <= quantidadePessoas; i++) {
                System.out.print("Digite a idade da pessoa " + i + ": ");
                int idade = scanner.nextInt();
                somaIdades += idade;
            }

            double mediaIdade = (double) somaIdades / quantidadePessoas;

            System.out.println("A média de idade da turma é: " + mediaIdade);

            if (mediaIdade >= 0 && mediaIdade <= 25) {
                System.out.println("A turma é classificada como JOVEM.");
            } else if (mediaIdade >= 26 && mediaIdade <= 60) {
                System.out.println("A turma é classificada como ADULTA.");
            } else {
                System.out.println("A turma é classificada como IDOSA.");
            }
        }

        scanner.close();
    }
}
