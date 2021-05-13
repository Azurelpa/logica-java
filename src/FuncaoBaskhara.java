import java.util.Locale;
import java.util.Scanner;

public class FuncaoBaskhara {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do seu A");
        double a = scanner.nextDouble();

        System.out.println("Digite o valor do seu B");
        double b = scanner.nextDouble();

        System.out.println("Digite o valor do C");
        double c = scanner.nextDouble();

        double delta = Math.pow(b, 2.0)-4*a*c;
        System.out.println("Valor de delta é " + delta);

        double x1 = (-b + Math.sqrt(delta))/(2.0*a);
        System.out.println("Valor de X1 é " + x1);

        double x2 = (-b - Math.sqrt(delta))/(2.0*a);
        System.out.println("Valor de X2 é "+x2);

        scanner.close();

    }
}
