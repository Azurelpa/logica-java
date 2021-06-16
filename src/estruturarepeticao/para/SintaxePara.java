package estruturarepeticao.para;

import java.util.Scanner;

public class SintaxePara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroDeVezeDoLaco = scanner.nextInt();

        for (int i = 1 ; i <= numeroDeVezeDoLaco ; i++ ){
            System.out.println(i);
        }
    }
}