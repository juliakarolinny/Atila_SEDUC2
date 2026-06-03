import static java.lang.IO.*;

void main() {
    double[] numeros = new double[4];

    double maior= 0;

    for(int i = 0; i < 4; i++) {

        numeros[i] = Double.parseDouble(readln("digite o numero: "));

    if (numeros[i] > maior ) {
        maior = numeros[i];
       }
    }
    print("O maior numero é\n" + maior);
}