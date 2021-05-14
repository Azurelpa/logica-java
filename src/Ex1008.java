/*
Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e
calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.


Exemplos de Entrada	                Exemplos de Saída
25
100                                 NUMBER = 25
5.50                                SALARY = U$ 550.00


1
200                                 NUMBER = 1
20.50                               SALARY = U$ 4100.00


6
145                                 NUMBER = 6
15.55                               SALARY = U$ 2254.75

 */
import java.util.Locale;
import java.util.Scanner;

public class Ex1008 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        int numero = scanner.nextInt();

        System.out.println("");
        int horasTrab = scanner.nextInt();

        System.out.println("");
        double salarioHora = scanner.nextDouble();

        System.out.println("NUMBER = " + numero);

        double salario = horasTrab*salarioHora;
        System.out.printf("SALARY = %.2f%n ", salario);


        scanner.close();
    }

}
