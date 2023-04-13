import java.util.Scanner; // Exercicio 4 
public class ExercicioQuatro{
  public static void main(String[] args){
    System.out.println("Programa para o cálculo de juros compostos");
      
    Scanner scanner = new Scanner(System.in);
  
    System.out.println("\nInforme o valor do capital a ser aplicado: ");
    double capital = scanner.nextDouble();
    
    System.out.println("Informe o prazo de aplicação (em meses): ");
    double prazo = scanner.nextDouble();

    System.out.println("Informe a taxa de juros mensal: ");
    double taxaUm = scanner.nextDouble();
    
    double taxa = taxaUm / 100;
    double montante = capital * (Math.pow((1 + taxa), prazo));
    double valort = (double) capital + montante;
    
    System.out.printf("Valor total recebido: R$ %.2f %n", (valort)) ;

    System.out.println("\nFim do programa!");
    
    scanner.close();
  }
}