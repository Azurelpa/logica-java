import java.util.Scanner;

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