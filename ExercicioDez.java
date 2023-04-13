import java.util.Scanner; // Exercício 10
public class ExercicioDez{
  public static void main(String[] arg){
    System.out.println("Médias Aritimética, Harmônica e Geométrica");

    Scanner scanner = new Scanner(System.in);
    System.out.println("\nInforme o primeiro número: ");
    double numeroUm = scanner.nextDouble();

    System.out.println("\nInforme o segundo número: ");
    double numeroDois = scanner.nextDouble();

    System.out.println("\nInforme o terceiro número: ");
    double numeroTres = scanner.nextDouble();

    double mediaUm = (numeroUm + numeroDois + numeroTres)/3;
    double mediaDois = 3/((1/numeroUm) + (1/numeroDois) + (1/numeroTres));
    double mediaTres = Math.cbrt(numeroUm * numeroDois * numeroTres);

    System.out.printf("\nMédia Aritimética: %.2f %n", (mediaUm));
    
    System.out.printf("\nMédia Harmônica: %.2f %n", (mediaDois));

    System.out.printf("\nMédia Geométrica: %.2f %n", (mediaTres));

    System.out.println("\nFim do programa!");

    scanner.close();
  }
}