/*
Leia dois valores inteiros.
A seguir, calcule o produto entre estes dois valores e atribua esta operação à variável PROD.
A seguir mostre a variável PROD com mensagem correspondente.

Exemplos de Entrada	            Exemplos de Saída
3                                   PROD = 27
9

-30                                 PROD = -300
10


0                                   PROD = 0
9
 */
import java.util.Scanner;
public class Ex1004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        int A = scanner.nextInt();

        System.out.println();
        int B = scanner.nextInt();

        int PROD = A * B;
        System.out.println("PROD = " + PROD);

        scanner.close();
    }
}
