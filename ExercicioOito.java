import java.util.Scanner; // Exercicio 8
public class ExercicioOito{
  public static void main(String[] args){
    System.out.println("Programa para o cálculo de carros e motos no estacionamento");
      
    Scanner scanner = new Scanner(System.in);
  
    System.out.println("\nInforme o número de veículos: ");
    double veiculos = scanner.nextDouble();
    
    System.out.println("\nInforme o numero de rodas: ");
    double rodas = scanner.nextDouble();

    double valorUm = ((4* veiculos) - rodas)/2;
    double valorDois = ((rodas - (valorUm * 2))/4);
    
    System.out.printf("\nTotal de motos: %.0f motos %n", (valorUm));

    System.out.printf("\nTotal de carros: %.0f carros %n", (valorDois));

    System.out.println("\nFim do programa!");

    scanner.close();
  }
}