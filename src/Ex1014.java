import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*
Calcule o consumo médio de um automóvel sendo fornecidos a distância total percorrida (em Km) e
o total de combustível gasto (em litros).

Exemplo de Entrada	            Exemplo de Saída
500                             14.286 km/l
35.0


2254                            18.119 km/l
124.4

4554                            9.802 km/l
464.6
 */
public class Ex1014 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        double y = scanner.nextDouble();

        double consumoMedio = x / y;

        System.out.printf("%.3f km/l%n", consumoMedio);
        scanner.close();
    }

}