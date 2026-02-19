/*
5. Declare uma variável do tipo double (valorEmDolares). Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado.
 */

import java.util.Scanner;
public class exercicio_05 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor em dólar: ");
        double valorEmDolares = sc.nextDouble();
        double dolar = 4.94;

        System.out.printf("O valor em reais é: R$ %.2f", valorEmDolares * dolar);


    }


}
