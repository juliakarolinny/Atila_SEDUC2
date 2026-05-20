package aula08;

import java.util.Scanner;

public class CalculoCircunferencia {
    void main(){
        Scanner sc = new Scanner(System.in);

        IO.println("Digite o  valor do raio: ");
        double raio = sc.nextDouble();

        double area = 3.1415 * Math.pow(raio,2);

        IO.println(" A area da circunferencia = "+ area);























    }
}
