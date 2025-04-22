import java.util.Scanner;

/**Crie um menu que oferece duas opções ao usuário:
 *  "1. Calcular área do quadrado" e "2. Calcular
 *  área do círculo". Solicite a escolha do usuário
 *  e realize o cálculo da área com base na opção
 *  selecionada.
 */
public class CalculaArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int escolha = 0;

        while (escolha != 3) {
            System.out.println("----MENU-----");
            System.out.println("1 - Calcular área do círculo em cm");
            System.out.println("2 - Calcular área do quadrado em cm");
            System.out.println("3 - Sair");
            System.out.println("Escolha uma opção:");
            escolha = sc.nextInt();

            if (escolha == 1) {
                System.out.println("Digite o valor do raio: ");
                double raio = sc.nextDouble();
                double area = Math.PI * Math.pow(raio, 2);
                System.out.printf("A área do círculo é de %.2fcm quadrados%n: ", area);
            }else if (escolha == 2) {
                System.out.println("Digite o valor do lado: ");
                double lado = sc.nextDouble();
                double area = lado * lado;
                System.out.printf("A área do quadrado é de: %.2fcm quadrados%n: ", area);
            }else if (escolha == 3) {
                System.out.println("Programa encerrado!");
            }else{
                System.out.println("Opção inválida. Escolha uma opção de 1 a 3. Tente novamente.");
            }

        }
    }
}
