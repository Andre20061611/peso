import java.util.Scanner;

public class peso {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double somaNotas = 0;

        for ( int i = 1; i <= 10; i++) {
            System.out.print("Digite o seu nome: ");
            String nome = scanner.next();

            System.out.print("Digite a sua nota " + i + ": ");
            double nota = scanner.nextDouble();

            somaNotas = somaNotas + nota;

        }
        double media = somaNotas / 10;

        System.out.print("A média das notas é: " + media);
    }
}
