import java.util.Scanner; // Exercício 2
public class ExercicioDois{
  public static void main(String[] arg){
    System.out.println("Produto acrescido de 10%");
    Scanner scanner = new Scanner(System.in);
      
    System.out.println("\nInforme o valor do produto: ");
    double valorUm = scanner.nextDouble();
      
    double resultado = ((valorUm * 10)/100) + valorUm;

    System.out.printf("\nO novo valor do produto é: R$ %.2f %n ", (resultado));

    System.out.println("\nFim do programa!");
      
    scanner.close();
    }
}