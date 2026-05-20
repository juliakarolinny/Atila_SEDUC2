import static java.lang.IO.*;

void main() {
    //Entrada

    IO.print("Digite o valor de nota1: ");
    float nota1 = Float.parseFloat(readln());

    IO.print("Digite o valor de nota2: ");
    float nota2 = Float.parseFloat(readln());

    IO.print("Digite o valor de nota3: ");
    float nota3 = Float.parseFloat(readln());

    IO.print("Digite o valor de nota4: ");
    float nota4 = Float.parseFloat(readln());

    IO.print("Digite o valor de faltas:");
    int faltas = Integer.parseInt(readln());

    //Processo + saida

    float mf =  (nota1 + nota2 + nota3 + nota4) / 4;

    if(mf >= 7 && faltas <= 25) {
        IO.print("aprovado!");
    } else if (mf < 5 && faltas > 25) {
        IO.print("reprovado");
    }else {
        IO.print("Recuperação");
    }
}