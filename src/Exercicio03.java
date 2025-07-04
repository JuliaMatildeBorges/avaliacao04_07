import java.util.Scanner;

/*
* A tarifa do transporte público depende dessas condições:
Se tiver menos de 6 anos ou mais de 65 → não paga nada
Se for estudante de até 25 anos → paga 50% da tarifa
Todos os outros pagam tarifa cheia (R$ 4,00)
Mostre a mensagem:
Valor a pagar: R$ X
*/
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorTarifa = 4;

        System.out.println("Qual a sua idade?");
        int idadeUsuario = scanner.nextInt();

        System.out.println("Você é estudade? Digite S para sim ou N para nao");
        String simOuNaoEstudante = scanner.next();

        if ((idadeUsuario < 6) || (idadeUsuario >65)){
            valorTarifa = 0;
            System.out.println("Valor a pagar: R$" + valorTarifa);
            return;
        }

        if ((simOuNaoEstudante.equals("S")) && (idadeUsuario <=25)){
            valorTarifa = valorTarifa * 0.50;
            System.out.println("Valor a pagar: R$" + valorTarifa);
            return;
        }

        System.out.println("Valor a pagar: R$" + valorTarifa);

    }
}
