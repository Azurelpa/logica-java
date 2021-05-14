/*
Leia quatro valores inteiros A, B, C e D.
A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula:
DIFERENCA = (A * B - C * D).

Exemplos de Entrada	                Exemplos de Saída
5
6                                       DIFERENCA = -26
7
8


0
0                                       DIFERENCA = -56
7
8


5
6                                       DIFERENCA = 86
-7
8
 */
import java.util.Scanner;
import java.util.Locale;
public class Ex1007 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        int A = scanner.nextInt();

        System.out.println();
        int B = scanner.nextInt();

        System.out.println();
        int C = scanner.nextInt();

        System.out.println();
        int D = scanner.nextInt();

        int DIFERENCA = (A * B - C * D);
        System.out.println("DIFERENCA = " + DIFERENCA);

        scanner.close();

    }
}
