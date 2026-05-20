import static java.lang.IO.*;
void main() {
//entradas

    IO.print("Digite as horas");
    float horas = Float.parseFloat(readln());
//Processo + Saida

    if (horas >= 6 && horas <= 11) {
        IO.print("Bom Dia!");
    } else if (horas >= 12 && horas < 18) {
        IO.print("Boa Tarde!");
    } else if (horas >= 18 && horas < 24) {
        IO.print("Boa Noite!");
    } else IO.print("Hora Invalida");



}