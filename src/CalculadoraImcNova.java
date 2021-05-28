import java.util.Locale;
import java.util.Scanner;
public class CalculadoraImcNova {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual sexo?");
        String sexo = scanner.next();

        System.out.println("Qual sua idade?");
        int idade = scanner.nextInt();

        System.out.println("Qual sua altura?");
        double altura = scanner.nextDouble();

        System.out.println("Qual seu peso?");
        double peso = scanner.nextDouble();

        double imc = peso / Math.pow(altura, 2);


        if(imc < 17.2 && peso < 57.6){
            System.out.println("Obesidade");
        }else if (imc >= 17.2 && imc <= 24.5 && peso >= 57.6 && peso <= 82 ){
            System.out.println("Normal");
        }else if (imc >24.5 && imc <= 28 && peso >= 82 && peso <= 93.9){
            System.out.println("Sobrepeso");

        }else {
            System.out.println("Obesidade");
        }

    }
}
