import java.util.Scanner;
/**Crie um programa que solicite ao usuário um número
 * e exiba a tabuada desse número de 1 a 10.
 */
public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para montar a tabuada: ");
        int n = sc.nextInt();

        System.out.println("A tabuada do " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }


    }
}
