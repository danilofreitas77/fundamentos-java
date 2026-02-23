/*
4.Crie um programa que solicite ao usuário um número e exiba a tabuada desse número
de 1 a 10.
 */

import java.util.Scanner;

public class exercicio_04 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int x = sc.nextInt();

        int i = 0;
        for(i = 0; i < 11; i ++){

            System.out.printf("%d * %d = %d%n", x, i, x * i);

        }

        sc.close();

    }

}
