import static java.lang.IO.*;
void main() {
    IO.println("Login");
    IO.println("-------------------------");

    print("Digite seu nome: ");
    String nome = readln();

    print("Digite seu e-mail: ");
    String email = readln();

     print("Digite sua senha: ");
    String senha = readln();

    print("Digite sua data de Cadastro: ");
    String data = readln();

    print(" Qual seu perfil de usuario");
    String perfil =  readln();

    println("------------");
    println(" Seus Dados ");
    println("-----------");


    println("Seu Nome" + nome);
    println("Seu e-mail"  + email);
    println("Sua senha" + senha);
    println("Data do Cadastro" + data);

    if(perfil.equals("perfil1")) {
        println("Você é um professor!");
    } else {
        println("Você é um aluno!");
    }





}