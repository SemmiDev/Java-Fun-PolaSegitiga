package learn.pattern;

public class App10 {
    public static void main(String[] args) {
        int base = 1;
        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(base);
                base++;
            }
            System.out.println();
        }
    }
}
