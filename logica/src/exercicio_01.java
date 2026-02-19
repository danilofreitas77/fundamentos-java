/*
1. Crie um programa que realize a média de duas notas decimais e exiba o resultado.
*/
import java.util.Scanner;

public class exercicio_01 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double x = sc.nextDouble();

        System.out.println("Digite mais um número: ");
        double y = sc.nextDouble();

        double media = (x + y)/2;

        System.out.printf("A média é > %.2f%n", media);

    }
}