import static java.lang.IO.*;

void main() {

        String[] carros = new String[4];
        for(int i = 0; i < 4; i++) {
            carros[i] = readln("Digite o nome do carro: ");
        }
        println("-------------------------------");
        for(int i = 0; i < 4; i++) {
            println("Os carros são: " + carros[i]);
        }
    }

