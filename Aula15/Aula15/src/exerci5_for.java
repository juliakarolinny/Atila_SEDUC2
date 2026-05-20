import static java.lang.IO.*;
void main() {

//float soma = 0F;
//float media = 0F;
//    for(int i = 1; i <=10; i++){
//        int num = Integer.parseInt(readln("Digite um numero:"));
//
//  soma = soma + num;
//
//
//
//}
//    media = soma / 10;
//print("Soma = " + soma);
//println("Media = " + media);
    float soma = 0F;
    float media = 0F;

    int maior = Integer.MIN_VALUE;
    int menor = Integer.MAX_VALUE;

    int somaPares = 0;
    int somaImpares = 0;
    int num_Pares = 0;
    int num_Impares = 0;

    for(int i = 1; i <= 10; i++){
        int num = Integer.parseInt(readln("Digite um numero:"));

        soma = soma + num;

        if (num > maior) {
            maior = num;
        }

        if (num < menor) {
            menor = num;
        }

        if (num % 2 == 0) {
            somaPares += num;
            num_Pares++;
        } else {
            somaImpares += num;
            num_Impares++;
        }
    }

    media = soma / 10;

    println("\n--- RESULTADOS ---");
    println("Soma de todos: " + soma);
    println("Media: " + media);
    println("Maior numero: " + maior);
    println("Menor numero: " + menor);
    println("Soma dos pares: " + somaPares);
    println("Soma dos impares: " + somaImpares);
    println("Quantidade de pares: " + num_Pares);
    println("Quantidade de impares: " + num_Impares);
}
}







