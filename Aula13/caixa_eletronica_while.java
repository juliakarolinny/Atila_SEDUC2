import static java.lang.IO.*;
void main() {
    String senha = "1234";
    String msg ="";

    int tentativas = 1;
    do{
        String senha_fornecida = readln("digite a senha: ");

        if(senha_fornecida.equals(senha)){
            msg = ("liberado");
            break;
        } else {
            msg = ("negado");
        }
        tentativas = tentativas +1;
    } while (tentativas <= 3 );
    IO.println("Acesso: " + msg);
    IO.print("Fim do programa!");




}