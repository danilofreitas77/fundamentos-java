import java.util.Scanner;

public class exercicio_06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("Fatorial não existe para números negativos.");
        } else {
            long fatorial = 1;

            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }

            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }

        sc.close();
    }
}