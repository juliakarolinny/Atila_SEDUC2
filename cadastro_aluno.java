import static java.lang.IO.*;

void main() {
IO.println("Cadastro de Alunos ");
IO.println("-------------------");

IO.print("Digite seu nome: ");
String nome = readln();

IO.print("Digite seu e-mail: ");
String email = readln();

IO.print("Digite seu telefone");
String telefone = readln();

IO.print("Digite seu registro acadêmico - RA: ");
String ra = readln();

IO.print("Digite seu cadastro de pessoa fisica - CPF: ");
String cpf = readln();

IO.print("Digite seu Registro Geral - RG: ");
String rg = readln();

println("Seus dados");
println("----------");

println(" Seu nome:" + nome);
println("seu e-mail:" + email);
println("Seu telefone:" + telefone);
println("Seu RA:"+ ra );
println("Seu CPF:" + cpf);
println("Seu RG:" + rg);



}