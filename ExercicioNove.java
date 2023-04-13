import java.util.Scanner; // Atividade 9
public class ExercicioNove{
  public static void main(String[] args){
    System.out.println("Programa de conversão de segundos para horas e minutos");
    Scanner scanner = new Scanner(System.in);

    System.out.println("\nInforme a quantidade de segundos que deseja converter: ");
    double segundos = scanner.nextDouble();

    double minutos = segundos / 60;
    double horas = minutos / 60;

    System.out.printf("\nQuantidade de segundos informados: %.0f segundos %n", (segundos));

    System.out.printf("\nSegundos tranformados em minutos:%.0f minutos %n", (minutos));

    System.out.printf("\nSegundos transformados em horas: %.2f horas %n", (horas));

    System.out.println("\nFim do programa!");

    scanner.close();
  }
}