import java.util.Scanner;

/**Crie um programa que solicite ao usuário
 * um número e calcule o fatorial desse número.
 */
public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n = sc.nextInt();

        double fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial = fatorial * i;
        }
        System.out.printf("O fatorial de %d é %f", n, fatorial);

    }
}
