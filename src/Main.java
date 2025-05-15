public class Main {

    public static void main(String[] args) {
        int[] numeros = {2, 5, 8, 13, 21};

        System.out.println("Números no array:");
        for (int numero : numeros) {
            System.out.println(numero + " é " + verificaParOuImpar(numero));
        }
    }

    public static String verificaParOuImpar(int numero) {
        if (numero % 2 == 0) {
            return "par";
        } else {
            return "ímpar";
        }
    }
}
