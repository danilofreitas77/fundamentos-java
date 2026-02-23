/*
3.Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2.
Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base
na opção selecionada.
 */


import java.util.Scanner;

public class exercicio_03 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a opção desejada:");
        System.out.println("1 - Calcular a área do Quadrado");
        System.out.println("2 - Calcular a área do Círculo");
        System.out.println("0 - Sair");
        System.out.print("> ");

        int resp = sc.nextInt();

        switch(resp) {
            case 1:
                System.out.println("Digite a medida do lado do quadrado (em cm): ");
                double ladoQuadrado = sc.nextDouble();
                System.out.printf("A área do quadrado é igual a %.2f cm", ladoQuadrado * ladoQuadrado);
                break;

            case 2:
                System.out.println("Digite o raio do círculo (em cm): ");
                double raio = sc.nextDouble();
                double areaCirculo = Math.PI * Math.pow(raio, 2);
                System.out.printf("A área do círculo é igual a %.2f cm", areaCirculo);
                break;

            case 0:
                System.out.println("Encerrando o programa...");
                break;

            default:
                System.out.println("Opção inválida!");
        }

        sc.close();

    }

}
