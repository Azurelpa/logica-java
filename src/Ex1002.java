/*
A fórmula para calcular a área de uma circunferência é:
area = π . raio2. Considerando para este problema que π = 3.14159:

- Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por πApresentar a mensagem "A="
seguido pelo valor da variável area, conforme exemplo abaixo, com 4 casas após o
ponto decimal. Utilize variáveis de dupla precisão (double). Como todos os problemas, não esqueça de imprimir
o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".
 */
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Ex1002 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double n = 3.14159;

        System.out.print("");
        double raio = scanner.nextDouble();


        double area  = n * (raio*raio);
        System.out.printf("A=%.4f%n", area);

        scanner.close();
    }

}