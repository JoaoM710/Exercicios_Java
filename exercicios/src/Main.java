
public class Main {
    public static void main(String[] args) {

        //Crie um programa que realize a média de duas notas decimais e exiba o resultado.
        System.out.println("-Exercicio 1");
        double nota1 = 8.5;
        double nota2 = 7.9;
        double media = (nota1 + nota2) /2;
        System.out.println("A média é: " +media);

        //Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.
        System.out.println("-Exercicio 2");
        double valor1 = 10.5;
        int casting = (int) valor1;
        System.out.println(casting);

        //Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem.
        System.out.println("-Exercicio 3");
        char letra = 'A';
        String palavra = "marelo";
        System.out.println("A letra é: " + letra + ", e a palavra é: " + letra + palavra);

        //Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.
        System.out.println("-Exercicio 4");
        double precoProduto = 99.90;
        int quantidade = 15;
        double total = quantidade * precoProduto;
        System.out.println("O valor total é; R$" + total);

        //Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado.
        System.out.println("-Exercicio 5");
        double valorEmDolares = 100.00;
        double conversao = valorEmDolares * 4.94;
        System.out.println(String.format("O valor convertido é: R$ %2f", conversao));

        //Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.
        System.out.println("-Exercicio 6");
        double precoOriginal = 75.0;
        double percentualDesconto = 10.0;
        double valorDesconto = (percentualDesconto / 100.0) * precoOriginal;
        double novoPreco = precoOriginal - valorDesconto;
        System.out.println("O novo preço com desconto é: R$" + novoPreco);

    }
}