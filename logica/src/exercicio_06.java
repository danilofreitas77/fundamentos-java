/*
6. Declare uma variável do tipo double (precoOriginal). Atribua um valor em reais a essa variável, representando o preço original de um produto. Em seguida, declare uma variável do tipo double (percentualDesconto) e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.
 */


public class exercicio_06 {

    public static void main(String[] args){

        double precoOriginal = 5.76;
        double percentualDesconto = 10;

        double valorDesconto = precoOriginal * (percentualDesconto / 100);
        double precoFinal = precoOriginal - valorDesconto;

        System.out.printf("Preço original: R$ %.2f%n", precoOriginal);
        System.out.printf("Desconto (%.0f%%): R$ %.2f%n", percentualDesconto, valorDesconto);
        System.out.printf("Preço final: R$ %.2f%n", precoFinal);

    }
}
