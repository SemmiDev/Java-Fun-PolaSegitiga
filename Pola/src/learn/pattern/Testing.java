package learn.pattern;

public class Testing {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
                    for(int a = 1; a <= i; a++){
                        System.out.print("+");
                    }
            }
            System.out.println();
        }
    }
}
