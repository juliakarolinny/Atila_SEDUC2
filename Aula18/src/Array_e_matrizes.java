import static java.lang.IO.*;
void main() {
 String nome = "anderson";
 
 print("\n -- Imprimir o conteudo de uma variavel");
 println("Nome" + nome);
 String[] nomes = {"anderson", "atila", "lucas"};
 
 println("\n -- Imprimindo conteudo de um array");
 println("Nome: " + nomes[0]);//ctrl + D = duplicar a linha println
    String s = "Nome: " + nomes[0];
    println("Nome: " + nomes[2]);
    println("\n -- Imprimindo conteudo de um array com loop FOR");

for (int i = 0 ; i < 5 ; i++) {
 println("Nome: " + nomes[i]);
}
}
