import java.util.Locale;
import java.util.Scanner;
public class CalculadoraImc {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        // ENTRADA DE DADOS
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();

        // PROCESSAMENTO
        double imc = peso/altura/altura;
        String valoresConcatenados = ", seu IMC é "+imc;

        // SAIDA DE DADOS
        printf("%s %d %f %f",nome, altura, peso, valoresConcatenados);
        scanner.close();
    }

}