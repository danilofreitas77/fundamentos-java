/*
2. Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.
 */


public class exercicio_02 {

    public static void main(String[] args){

        double valorDouble = 9.75;
        int valorInt;

        valorInt = (int) valorDouble;

        System.out.println("Double: " + valorDouble);
        System.out.println("Após o casting: " + valorInt);


    }

}
