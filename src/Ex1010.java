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

        //ATRIBUINDO TIPO E VARIAVEIS

        int cod1, numPec1, cod2, numPec2;
        double valorUni1, valorUni2;

        //PEDIR INFORMACOES PECA1

        cod1 = scanner.nextInt();
        numPec1 = scanner.nextInt();
        valorUni1 = scanner.nextDouble();

        //PEDIR INFORMACOES PECA1

        cod2 = scanner.nextInt();
        numPec2 = scanner.nextInt();
        valorUni2 = scanner.nextDouble();

        //CONTA FEITA PARA PEGAR O TOTAL A PAGAR

        double salario = (cod1*0+cod2*0)+(numPec1*valorUni1)+(numPec2*valorUni2);

        //SAIDA COM VALOR TOTAL FORMATADO

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", salario);

        //FECHAMENTO DO SCANNER ABERTO

        scanner.close();
    }
}
