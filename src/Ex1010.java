/*
Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1,
o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
Após, calcule e mostre o valor a ser pago.

Exemplos de Entrada	                Exemplos de Saída

12 1 5.30                           VALOR A PAGAR: R$ 15.50
16 2 5.10


13 2 15.30                          VALOR A PAGAR: R$ 51.40
161 4 5.20


1 1 15.10                           VALOR A PAGAR: R$ 30.20
2 1 15.10
 */

import java.util.Scanner;
import java.util.Locale;

public class Ex1010 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        int cod1 = scanner.nextInt();
        
        int num1 = scanner.nextInt();
        
        double valorUni = scanner.nextDouble();
        
        int cod2 = scanner.nextInt();
        
        int num2 = scanner.nextInt();
        
        double valorUni2 = scanner.nextDouble();

        double total = num1 * valorUni + num2 * valorUni2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
        scanner.close();
    }
}
