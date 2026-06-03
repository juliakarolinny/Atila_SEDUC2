//Aula 16 - MENU USANDO LOOPS
import static java.lang.IO.*;

void main() {

    String opcao;

    do {

        IO.println("Bem-Vindo ao Sistema de Cadastro!");
        IO.println("**MENU DE OPCÔES**");
        IO.println("1- CADASTRAR PACIENTE");
        IO.println("2- ALTERAR PACIENTE");
        IO.println("3- EXCLUIR PACIENTE");
        IO.println("4- SAIR");

        // int opcao = Integer.parseInt(readln("Digite a opcão desejada!"));

        opcao = readln("Digite a opcão desejada!");

        IO.println("Opção escolhida: " + opcao);

        if (opcao.equals("1")) {
            IO.println("Iniciando Cadastro!.....");
            // TODO: Implementar rotina de cadastro
            IO.println("Cadastro Finalizado!.....");
        }

        if (opcao.equals("2")) {
            IO.println("Iniciando Alteração Cadastro de Paciente!.....");
            // TODO: Implementar rotina de cadastro
            IO.println("Alteração Finalizado!.....");
        }

        if (opcao.equals("3")) {
            IO.println("Excluir Cadastro do Paciente!.....");
            // TODO: Implementar rotina de cadastro
            IO.println("Cliente Excluido!.....");
        }

        if (opcao.equals("4")) {
            IO.println("Finalização do Programa!!");
            break;
        }

    } while (!opcao.equals("4"));

}







