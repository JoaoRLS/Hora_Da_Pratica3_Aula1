import java.util.Scanner;

/**Peça ao usuário para inserir dois números inteiros.
 * Compare os números e imprima uma mensagem indicando
 * se são iguais, diferentes, o primeiro é maior ou o
 * segundo é maior.
 */
public class CompararNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.printf("O primeiro e o segundo número digitados: %d e %d são iguais", num1, num2);
        }else if (num1 > num2) {
            System.out.printf("O primeiro número digitado: %d é maior do que o segundo número digitado: %d", num1, num2);
        }else {
            System.out.printf("O segundo número digitado: %d é maior do que o o primeiro número digitado: %d", num2, num1);
        }
    }
}
