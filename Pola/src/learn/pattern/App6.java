package learn.pattern;

public class App6 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            for(int j = 5; j >= i; j--){
                System.out.print(" ");
                }
            for(int a = 1; a <= i; a++){
                System.out.print(a + " ");
            }
//
//            for(int a = i; a <= 5; a++){
//                for(int j = 1; j <= a; j++){
//                    System.out.print(a);
//                }
//            }
            System.out.println();
        }
    }
}
