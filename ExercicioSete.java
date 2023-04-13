import java.util.Scanner; // Exercício 7
public class ExercicioSete{
    public static void main(String[] args){;

    System.out.println("Programa para calcular o salário de um vendedor");

    Scanner scanner = new Scanner(System.in);
    System.out.println("\nInforme o salario fixo: ");
    double fixo = scanner.nextDouble();

    System.out.println("\nInforme o valor total arrecadado das vendas realizadas no mês: ");
    double total = scanner.nextDouble();

    System.out.println("\nInforme o percentual ganho sobre o total das vendas: ");
    double percentual = scanner.nextDouble();

    double vendas = total * (percentual/100);
    double salario = fixo + vendas;

    System.out.printf("\nSalário ao final do mês: R$ %.2f %n", (salario));

    System.out.println("\nFim do programa!");

    scanner.close();
    }
}