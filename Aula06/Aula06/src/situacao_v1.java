import static java.lang.IO.*;
void main() {
    IO.println("Situação escolar");
    IO.println("----------------");

    IO.print("Digite Nota 1°Bimestre: ");
    float n1 = Float.parseFloat(readln());

    IO.print("Digite Nota 2° Bimestre: ");
    float n2 = Float.parseFloat(readln());

    IO.print("Digite Nota 3° Bimestre:" );
    float n3 = Float.parseFloat(readln());

    IO.print("Digite Nota 4° Bimestre");
    float n4 = Float.parseFloat(readln());

    float mf = (n1 + n2 + n3 + n4 / 4);

    if(mf >= 5) {
        println("Aluno aprovado");
    } else {
        println("Aluno Reprovado");
    }
}