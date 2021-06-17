package estruturarepeticao.para;

import java.util.Scanner;

public class ExUri1067 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor maximo que queira achar os numeros impar");
        int x = scanner.nextInt();

        System.out.println("Os numeros impares sao");
        if (x >= 1 && x <= 1000) {
            for (int i = 0; i <= x; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
        scanner.close();
    }
}
