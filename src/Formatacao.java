public class Formatacao {
    public static void main(String[] args) {

        double x = 10.35784;
        // imprime o texto SEM uma nova linha
        System.out.print(x);

        // imprime o texto COM uma nova linha;
        System.out.println(x);

        // imprime o valor e formata a saída
        System.out.printf("%.2f%n", x);
        System.out.printf("%.2f%n", x);
    }
}
