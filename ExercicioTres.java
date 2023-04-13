import java.util.Scanner; //Exercicio 3 
public class ExercicioTres{
  public static void main(String[] args){
    System.out.println("Programa de conversão de °F para °C");     
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("\nInforme a temperatura em °F: ");
   
    double grausf = scanner.nextDouble();
    double numerador = grausf - 32;
    double resultado = numerador / 1.8;
   
    System.out.printf("\nResultado da conversão é: %.2f °C %n ", (resultado));

    System.out.println("\nFim do programa!");
 
    scanner.close();
  }
}