package learn.pattern;

public class App1 {

    public static void main(String[] args) {
        int num = 2;
        int l = 0;

        for(int i = 0; i <= num; i++){
            for(int j = 0; j <= i; j++){
                l++;
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
