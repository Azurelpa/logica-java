import java.util.Scanner;
/*

Uma operadora de telefonia cobra R$ 50.00 por um plano básico que
dá direito a 100 minutos de telefone. Cada minuto que exceder a
franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler a
quantidade de minutos que uma pessoa consumiu, daí mostrar o valor
a ser pago.

*/

public class Menor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if(a < b && a < c){
            System.out.println("Menor " + a);
        }else if (b < c){
            System.out.println("Menor " + b);
        }else{
            System.out.println("Menor " + c);
        }
        scanner.close();
    }
}