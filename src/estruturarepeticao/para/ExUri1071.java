package estruturarepeticao.para;

import java.util.Scanner;

/*
https://www.urionlinejudge.com.br/judge/pt/problems/view/1071
        Soma de Impares Consecutivos I

        Leia 2 valores inteiros X e Y.
        A seguir, calcule e mostre a soma dos números impares entre eles.

        Entrada
        O arquivo de entrada contém dois valores inteiros.

        Saída
        O programa deve imprimir um valor inteiro.
        Este valor é a soma dos valores ímpares que estão entre os valores fornecidos na
        entrada que deverá caber em um inteiro.

        Exemplo de Entrada              	Exemplo de Saída
        6                                   5
       -5
             6 5 4 3 2 1 0 -1 -2 -3 -4 -5
        15                                  13
        12

        12                                  0
        12

     */

public class ExUri1071 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int menor, maior;

        if (x < y) { // crescente.
            menor = x;
            maior = y;
        }else{ //decrescente.
            menor = y;
            maior = x;
        }
        int soma = 0;
        //Codigo para achar a soma.
        for (int i = menor + 1; i < maior; i++){
            //Pegar o resto que sobrar de i(Ex: 1 / 5 --- ele vai pegar do 1 ao 6 e fazer o mod adicionando i+1 na soma.
            if (i % 2 != 0){
                soma += i;
            }
        }
        System.out.println(soma);
        scanner.close();
    }
}
