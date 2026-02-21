/*
2.Peça ao usuário para inserir dois números inteiros. Compare os números e imprima
uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é
maior.
 */

import java.util.Scanner;

public class exercicio_02 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double x = sc.nextDouble();

        System.out.println("Digite o segundo número: ");
        double y = sc.nextDouble();

        if(x > y){
            System.out.println("O primeiro número é maior do que o segundo.");
        } else if (y > x) {
            System.out.println("O segundo número é maior do que o primeiro");
        } else {
            System.out.println("Os dois números são iguais");
        }


    }

}
