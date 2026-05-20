import static java.lang.IO.*;
void main() {

    int votosJoao = 0;
    int votosMaria = 0;
    int votosNulos = 0;


    for (int i = 1; i <= 10; i++) {
        print("Digite o voto " + i + " \n(1-João,\n 2-Maria,\n 3-Nulo): ");
        String entrada = readln();


        switch (entrada) {
            case "1" -> votosJoao++;
            case "2" -> votosMaria++;
            default -> votosNulos++;
        }
    }


    println("\n--- RESULTADO DA ELEIÇÃO ---");
    println("João: " + votosJoao + " voto(s)");
    println("Maria: " + votosMaria + " voto(s)");
    println("Nulos: " + votosNulos + " voto(s)");
    println("----------------------------");


    if (votosJoao > votosMaria) {
        println("Vencedor: João!");
    } else if (votosMaria > votosJoao) {
        println("Vencedor: Maria!");
    } else {
        println("Resultado: Empate!");
    }}