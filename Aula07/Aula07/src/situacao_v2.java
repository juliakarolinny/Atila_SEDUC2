import static java.lang.IO.*;

void main() {
    //Entradas

    IO.println("Situação escolar");

    IO.print("Digite a nota 1: ");
    float nota1 = Float.parseFloat(readln());

    IO.print("Digite a nota 2: ");
    float nota2 = Float.parseFloat(readln());

    IO.print("Digite a nota 3: ");
    float nota3 = Float.parseFloat(readln());

    IO.print("Digite a nota 4: ");
    float nota4 = Float.parseFloat(readln());


    // Processamento

    float mf =  (nota1 + nota2 + nota3 + nota4) / 4;

    if(mf >= 7) {
        IO.print("Voce esta aprovado!");
    }else if(mf < 5) {
        IO.print("Voce esta reprovado!");
    } else {
        IO.print("Voce esta de recuperação!");
    }
    //Saida



}