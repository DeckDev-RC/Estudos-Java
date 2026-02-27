import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, vamos realizar uma soma\nDigite o primero número desta soma:");

        Integer a = scanner.nextInt();

        System.out.println("Agora digite o segundo número");

        Integer b = scanner.nextInt();

        System.out.println("Resultado para esta soma:" + (a+b));
        scanner.close();
    }
}
