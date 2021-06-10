package estruturarepeticao;

public class Ex05 {
    public static void main(String[] args) {
        int x = 2;
        int y = 10;

        System.out.println("Olha");
        while(x<y){
            System.out.println(x+ "-"+y);
            x = y*2;
            y = y+1;
        }
    }
}
