import java.util.Scanner;

public class Subtracao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá vamos realizar uma subtração\nDigite aqui abaixo o primeiro número:");

        Integer a = scanner.nextInt();

        System.out.println("Abaixo escreva o próximo número:");

        Integer b = scanner.nextInt();

        System.out.println("Este é o resultado desta subtração: " + (a-b));

        scanner.close();
    }
}
