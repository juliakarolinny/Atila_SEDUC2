import static java.lang.IO.*;
void main() {
    println("*** Calculador de Reajuste Salarial ***");

    double salarioAtual = Double.parseDouble(readln("Digite o salário atual do funcionário: R$ "));

    int percentual = 0;
    double valorAumento = 0;

    if (salarioAtual <= 1000.00) {
        percentual = 20;
    } else if (salarioAtual <= 1700.00) {
        percentual = 15;
    } else if (salarioAtual <= 2300.00) {
        percentual = 10;
    } else {
        percentual = 5;
    }

    valorAumento = salarioAtual * (percentual / 100.0);
    double novoSalario = salarioAtual + valorAumento;

    // Exibindo os resultados na tela
    println("\n--- RESULTADO DO REAJUSTE ---");
    println("Salário antes do reajuste : R$ " + salarioAtual);
    println("Percentual de aumento     : " + percentual + "%");
    println("Valor do aumento          : R$ " + valorAumento);
    println("Novo salário, após aumento: R$ " + novoSalario);
}