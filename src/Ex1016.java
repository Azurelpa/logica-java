import java.io.IOException;
import java.util.Scanner;


/*
Dois carros (X e Y) partem em uma mesma direção. O carro X sai com velocidade constante de
60 Km/h e o carro Y sai com velocidade constante de 90 Km/h.

Em uma hora (60 minutos) o carro Y consegue se distanciar 30 quilômetros do carro X,
ou seja, consegue se afastar um quilômetro a cada 2 minutos.

Leia a distância (em Km) e calcule quanto tempo leva (em minutos)
para o carro Y tomar essa distância do outro carro.

Exemplo de Entrada	            Exemplo de Saída
30                              60 minutos

110                             220 minutos

7                               14 minutos
 */
public class Ex1016 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int valor = scanner.nextInt();

        int resultado = (60 * valor) / 30;

        System.out.println(resultado + " minutos");

        scanner.close();

    }

}