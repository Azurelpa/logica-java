public class OperadoresComparacao {
    public static void main(String[] args) {
        // MENOR QUE
        boolean menorQue = 5 < 10;
        System.out.println("MENOR QUE -> " + menorQue);

        // MAIOR QUE
        System.out.println(5 > 10);

        // MENOR OU IGUAL A QUE
        System.out.println(10 <= 10);

        // MAIOR OU IGUAL A QUE
        System.out.println(5 >= 10);

        // IGUALDADE
        System.out.println(5 == 10);

        //DIFERENTE
        System.out.println(5 != 10);

        System.out.println("----------------------------------------");


        int x = 5;
        System.out.println(x>0);//TRUE
        System.out.println(x==3);//FALSE
        System.out.println(10 <= 30);//TRUE
        System.out.println(x != 2);//TRUE


        System.out.println("----------------OPERADORES LOGICOS--- AND ou E -------------");

        System.out.println( (x <= 20) && (x == 10));//FALSE
        System.out.println((x > 0 ) && (x != 3 ));//TRUE
        System.out.println((x <= 20) && (x == 10) && (x != 3));//FALSE


        System.out.println("----------------OPERADORES LOGICOS--- OR ou OU -------------");

        System.out.println((x <20) || (x == 10) );//TRUE
        System.out.println((x > 0) || (x != 3 ));//TRUE
        System.out.println((x <= 20) || (x == 10) || (x != 3));//TRUE

        System.out.println("----------------OPERADORES LOGICOS--- NÃO ou NOT -------------");

        System.out.println(!(x == 10));//TRUE
        System.out.println(!(x >= 2));//FALSE
        System.out.println(!(x <= 20) && (x == 10));//FALSE

    }
}
