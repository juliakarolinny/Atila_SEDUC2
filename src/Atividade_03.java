import java.util.Scanner;
import java.util.Locale;
void main() {

  Scanner leitor = new Scanner(System.in);

  //Entrada e Processamento
  double consumo;
  double valorTotal;

  System.out.println("--- Sistema de Faturação Comercial ---");
  System.out.println("Introduza o consumo em m3: ");
  consumo = leitor.nextDouble();

  if (consumo <= 10) {
    valorTotal = 44.95;
  } else if (consumo <=20) {
    valorTotal = consumo * 8.75;
  } else if (consumo <= 50) {
    valorTotal = consumo * 16.76;
  } else {
    valorTotal = consumo * 17.46;
  }

  //Saída
  System.out.println("---------------------------------------");
  System.out.printf("O valor da conta comercial é: R$ %2f%n", valorTotal);
  System.out.println("---------------------------------------");

  leitor.close();

}