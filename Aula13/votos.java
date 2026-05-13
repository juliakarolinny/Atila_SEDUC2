import static java.lang.IO.*;
void main() {
    int votosJoao = 0;
    int votosMaria = 0;
    int votosNulos = 0;

    for (int i = 1; i <= 10; i++) {
        String entrada = System.console().readLine("Digite o " + i + "º voto (1 para João, 2 para Maria, outro para nulo): ");
        int voto = Integer.parseInt(entrada);

        if (voto == 1) {
            votosJoao = votosJoao + 1;
        } else {
            if (voto == 2) {
                votosMaria = votosMaria + 1;
            } else {
                votosNulos = votosNulos + 1;
            }
        }
    }

    System.out.println("\n--- RESULTADO DA ELEIÇÃO ---");
    System.out.println("João: " + votosJoao + " voto(s)");
    System.out.println("Maria: " + votosMaria + " voto(s)");
    System.out.println("Votos Nulos: " + votosNulos + " voto(s)");
    System.out.println("----------------------------");

    if (votosJoao > votosMaria) {
        System.out.println("Vencedor: João!");
    } else {
        if (votosMaria > votosJoao) {
            System.out.println("Vencedora: Maria!");
        } else {
            System.out.println("Resultado: Empate!");
        }
    }
}

