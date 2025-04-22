import java.util.Scanner;

/**Crie um programa que solicite ao usuário digitar um número.
 * Se o número for positivo, exiba "Número positivo", caso
 * contrário, exiba "Número negativo".
 */
public class NumberPositivoNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num = sc.nextInt();

        if (num == 0){
            System.out.printf("Você digitou o número: %d zero que não é positivo e nem negativo, ele é um número neutro que representa o nada", num);
        }else if (num > 0){
            System.out.printf("Número %d é positivo", num);
        }else{
            System.out.printf("O número %d é negativo", num);
        }
    }
}
