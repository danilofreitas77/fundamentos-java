/*
4. Declare uma variável do tipo double (precoProduto) e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.
 */

import java.util.Scanner;

public class exercicio_04 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double precoProduto = 4.50;
        System.out.println("Digite a quantidade de itens que você quer comprar: ");
        int quantidade = sc.nextInt();

        System.out.printf("O valor da sua compra é: R$ %.2f", quantidade * precoProduto);

    }


}
