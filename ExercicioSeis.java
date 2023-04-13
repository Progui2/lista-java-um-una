import java.util.Scanner; // Exercicio 6 
public class ExercicioSeis{
  public static void main(String[] arg){
    System.out.println("Programa para calcular logaritmo");
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("\nInforme o primeiro número (logaritmando): ");
    double numeroUm = scanner.nextDouble();

    System.out.println("\nInforme o segundo número (Base): ");
    double numeroDois = scanner.nextDouble();

    double resultado = (Math.log(numeroUm)) / (Math.log(numeroDois));
    
    System.out.printf("\nO resultado do cálculo é: %.2f %n", (resultado));

    System.out.println("\nFim do programa!");

    scanner.close();
  }
}