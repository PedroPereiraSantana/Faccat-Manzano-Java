package Faccat.exercicio14ao26;
import java.util.Scanner;

public class Exercicio015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número");
        int numero = scanner.nextInt();

        if (numero > -1) {
            System.out.println("O número é positivo");
        } else {
            System.out.println("O número é negativo");
        }
    }
}
