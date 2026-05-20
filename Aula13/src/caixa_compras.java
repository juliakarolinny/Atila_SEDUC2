import static java.lang.IO.*;
void main() {
    double totalCompra = 0.0;
    boolean continuar = true;

    println("--- CAIXA ELETRÔNICO DA LOJA ---");
    println("Insira o valor dos produtos. Digite 0 para finalizar a compra.\n");

    while (continuar) {
        print("Digite o valor do produto: R$ ");
        String entrada = readln().trim();


        if (entrada.isEmpty()) {
            println("Aviso: Você não digitou nenhum valor. Tente novamente.");
            continue;
        }


        entrada = entrada.replace(",", ".");


        double valorProduto = Double.parseDouble(entrada);


        if (valorProduto == 0) {
            continuar = false;
        } else if (valorProduto > 0) {
            totalCompra += valorProduto;
        } else {
            println("Aviso: Valor inválido! O preço não pode ser negativo.");
        }
    }


    println("\n--------------------------------");
    println("Compra finalizada com sucesso!");
    println("Valor total da compra: R$ " + String.format("%.2f", totalCompra));
    println("--------------------------------");
}