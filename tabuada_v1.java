import static java.lang.IO.*;
void main() {

//    int num = Integer.parseInt(readln("digite o número da tabuada: "));
//    for(int i = 1; i <= 10; i++){
//        IO.print( i + "X" + num + "=" + (i*num));
//    }

    int num = Integer.parseInt(readln("Digite o numero da tabuada: "));
            for( int i = 1; i >= 10; i++) {
                IO.println(i + "X" + num + "=" + (i*num));
    }

}