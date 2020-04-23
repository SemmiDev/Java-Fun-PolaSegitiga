package learn.pattern;

public class App16 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            for(int j = 5; j >= i; j--){
                System.out.print(" ");
            }

            for(int m = 1; m <= i; m++){
                System.out.print(m + " ");
            }

            System.out.println();
        }


            int base = 5;
            
        for(int k = 1; k <= 5; k++){
            for(int l = 1; l <= k; l++){
                System.out.print(" ");
            }
            base = base - 1;

            for(int i = 1; i <= base; i++){
                System.out.print( " "+ i);
            }

            System.out.println();
        }
    }
}
