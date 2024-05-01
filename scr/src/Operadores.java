public class Operadores {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("Numero1 é igual a Numero2? "+ simNao);

        simNao = numero1 != numero2;
        System.out.println("Numero1 é diferente a Numero2? "+ simNao);

        simNao = numero1 > numero2;
        System.out.println("Numero1 é maior a Numero2? "+ simNao);

        simNao = numero1 < numero2;
        System.out.println("Numero1 é menor a Numero2? "+ simNao);

        simNao = numero1 >= numero2;
        System.out.println("Numero1 é Maior ou igual a Numero2? "+ simNao);

        simNao = numero1 <= numero2;
        System.out.println("Numero1 é Menor ou igual a Numero2? "+ simNao);

    }
}