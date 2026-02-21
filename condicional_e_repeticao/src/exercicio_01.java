/*
1.Crie um programa que solicite ao usuário digitar um número. Se o número for positivo,
exiba "Número positivo", caso contrário, exiba "Número negativo".
 */

import java.util.Scanner;

public class exercicio_01 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int x = sc.nextInt();

        if (x > 0){
            System.out.printf("O número %d é Positivo", x);
        } else if (x == 0) {
            System.out.println("O número digitado é zero, ou seja, NULO");
        } else {
            System.out.printf("O número %d é negativo", x);
        }


    }

}