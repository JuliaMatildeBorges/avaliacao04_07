import java.util.Scanner;


public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o valor você deseja pegar emprestado?");
        double valorEmprestimo = scanner.nextDouble();

        System.out.println("Em quantas parcelas você deseja pagar?");
        int numeroParcelas = scanner.nextInt();

        System.out.println("Qual o seu salário mensal?");
        double salarioUsuario = scanner.nextDouble();

        double valorParcela = valorEmprestimo / numeroParcelas;

        if ((numeroParcelas < 1) || (numeroParcelas > 24)){
            System.out.println("Empréstimo reprovado. Número de parcelas inválido.");
            return;
        }

        if (valorParcela < salarioUsuario) {
            System.out.println("Empréstimo aprovado. Valor de cada parcela: R$" + valorParcela);
        } else {
            System.out.println("Empréstimo reprovado. Parcela muito alta");
        }

    }
}
