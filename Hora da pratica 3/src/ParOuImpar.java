import java.util.Scanner;

/**Crie um programa que solicite ao usuário
 * a entrada de um número inteiro. Verifique
 * se o número é par ou ímpar e exiba uma
 * mensagem correspondente.
 */
public class ParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("O número Zero é considerado Par porque ele pode ser dividido por dois sem deixar resto. ");
        }else if (num % 2 == 0) {
            System.out.println("Par");
        }else{
            System.out.println("Ímpar");
        }

    }
}
