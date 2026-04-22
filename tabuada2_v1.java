import static java.lang.IO.*;
void main() {
    int num = Integer.parseInt(readln("digite o número da tabuada: "));
    int i = 1;
    while (i <= 10){
        IO.println(i + "X" + num + "=" + (i*num));
        i += 1;
    }
}