import static java.lang.IO.*;
void main() {
    int votosJoao = 0;
    int votosMaria = 0;
    int votosNulos = 0;


    for (int i = 1; i <= 10; i++) {
        IO.print("Digite o voto " + i + " (1 = Joao, 2 = Maria, outro = Nulo): ");
        int voto = IO.readInt();


        if (voto == 1) {
            votosJoao++;
        } else if (voto == 2) {
            votosMaria++;
        } else {
            votosNulos++;
        }
    }


    IO.println("\n--- RESULTADO DA ELEIÇÃO ---");
    IO.println("Joao: " + votosJoao + " voto(s)");
    IO.println("Maria: " + votosMaria + " voto(s)");
    IO.println("Nulos: " + votosNulos + " voto(s)");
    IO.println("----------------------------");


    if (votosJoao > votosMaria) {
        IO.println("Vencedor: Joao!");
    } else if (votosMaria > votosJoao) {
        IO.println("Vencedora: Maria!");
    } else {
        IO.println("Houve um empate entre Joao e Maria!");
    }
}