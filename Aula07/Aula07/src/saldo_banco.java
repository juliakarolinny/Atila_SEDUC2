import static java.lang.IO.*;
void main() {
    IO.print("Digite o valor saldo: ");
    float saldo = Float.parseFloat(readln());

    IO.print("Digite o valor do saque: ");
    float saque = Float.parseFloat(readln());


    if (saque <= saldo) {
        saldo = saldo - saque;
        IO.print("Saque suficiente");

        IO.print("saldo atual: " + saldo);
    }else
    {
        IO.print("Saldo insuficiente");
    }




}