package learn.pattern;

public class App8 {
    public static void main(String[] args) {
        for(int i = 4; i >= 0; i--){
            for(int j = 5; j > i; j--){
                System.out.print(j);
            }
            System.out.println();
        }

        for(int i = 5; i >= 1; i--){
            for(int j = 5; j >= i; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
