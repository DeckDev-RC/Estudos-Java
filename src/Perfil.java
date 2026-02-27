import java.util.Scanner; // Importar Classe - Ler entrada de usuário

public class Perfil {
    public static void main(String[] args) {
        // Criar o objeto scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o seu nome:");
        // Ler uma linha te texto
        String nome = scanner.nextLine();

        System.out.println("Olá " + nome + "\nTudo bem?" );
        // Fechar o scanner
        scanner.close();
    }
}