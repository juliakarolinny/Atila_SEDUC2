import static java.lang.IO.*;

void main() {

    //Entrada

    IO.print("Digite a temperatura: ");
    float temperatura = Float.parseFloat(readln());


  //  Processamenmto + saida

if (temperatura < 15) {
    IO.print("Desligue o ar condicionado");
} else if (temperatura > 25) {
    IO.print("Ligue o ar condicionado");
} else {
    IO.print("Sistema Standby");
}










    
}