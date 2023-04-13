import java.util.Scanner; // Exercício 1 
public class ExercicioUm {
  public static void main(String[] arg){
    System.out.println("Média Aritmética");
    Scanner scanner = new Scanner(System.in);
      
    System.out.println("\nInforme o primeiro número: ");
    double numeroUm = scanner.nextDouble();
      
    System.out.println("\nInforme o segundo número: ");
    double numeroDois = scanner.nextDouble();
      
    double resultado = (numeroUm + numeroDois) / 2;
      
    System.out.printf("\nO resultado da média aritimética é: %.2f %n ", (resultado));

    System.out.println("\nFim do progrma!");
      
    scanner.close();
  }
}