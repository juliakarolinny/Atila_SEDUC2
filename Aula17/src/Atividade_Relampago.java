import static java.lang.IO.*;

void main() {
    String[] carros = new String[4];

    IO.println("Digite o primeiro carro: ");
    IO.println("Digite o Segundo carro: ");
    IO.println("Digite o Terceiro carro: ");
    IO.println("Digite o Quarto carro: ");

    // DESAFIO: pedindo para o usuário digitar e gravando direto nas posições do Array
    print("Digite o 1º carro: ");
    carros[0] = readln(); // Grava na posição 0

    print("Digite o 2º carro: ");
    carros[1] = readln(); // Grava na posição 1

    print("Digite o 3º carro: ");
    carros[2] = readln(); // Grava na posição 2

    print("Digite o 4º carro: ");
    carros[3] = readln(); // Grava na posição 3

    println("------------");
    println("Lista de carros:");

    // Imprimindo a lista com a numeração de 1 a 4 puxando direto do Array
    println("1 - " + carros[0]);
    println("2 - " + carros[1]);
    println("3 - " + carros[2]);
    println("4 - " + carros[3]);

}