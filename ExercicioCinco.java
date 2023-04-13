import java.util.Scanner; // Exercicio 5 
public class ExercicioCinco{
  public static void main(String[] arg){
    System.out.println("Programa para calcular o salário bruto");
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("\nInforme o número de horas trabalhadas: ");
    double horas = scanner.nextDouble();

    System.out.println("\nInforme o valor recebido por hora: ");
    double valor = scanner.nextDouble();

    System.out.println("\nInforme o número de dias trabalhados: ");
    double diastrab = scanner.nextDouble();

    System.out.println("\nInforme o valor do salário família: ");
    double familia = scanner.nextDouble();

    System.out.println("\nInforme o número de filhos menores de 14 anos: ");
    double filhos = scanner.nextDouble();

    double salario = horas * valor;
    double salariomes = salario * diastrab;
    double salariofam = filhos * familia;
    double salariobru = salariofam + salariomes;

    System.out.printf("\nSalário bruto no mês: R$ %.2f %n", (salariobru));
    
    System.out.println("\nFim do programa!");

    scanner.close();
  }
}