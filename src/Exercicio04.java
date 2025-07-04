import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma nota entre 0 e 100");
        int nota = scanner.nextInt();

        if (nota < 60){
            System.out.println("Sua nota é F");
        } else if (nota < 70) {
            System.out.println("Sua nota é D");
        } else if (nota < 80) {
            System.out.println("Sua nota é C");
        } else if (nota < 90) {
            System.out.println("Sua nota é B");
        } else {
            System.out.println("Sua nota é A");
        }

    }
}
