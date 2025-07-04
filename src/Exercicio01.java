import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String usuario = "admin";
        int senha = 1234;

        System.out.println("Digite o nome do usuário");
        String entradaUsuario = scanner.next();

        System.out.println("Digite a senha");
        int entradaSenha = scanner.nextInt();

        if ((entradaUsuario.equals(usuario)) && (entradaSenha == senha)){
            System.out.println("Login bem-sucedido.");
        } else {
            System.out.println("Login inválido. Conta bloqueada.");
        }


    }
}
