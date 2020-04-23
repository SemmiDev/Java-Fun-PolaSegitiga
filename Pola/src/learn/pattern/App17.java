package learn.pattern;

public class App17 {
    public static void main(String[] args) {
        int base = 0;
       for(int i = 1; i <= 6; i++){
            for(int k = 1; k <= i; k++){
                System.out.print(" ");
            }
            String a = "";
            base++;
            for(int j = base; j <= 5; j++){
                System.out.print(j);
            }
            if( i == 6){
                System.out.print(a);
            }else{
                 System.out.println();
            }
        }

       int base2 = 6;
       for(int l = 1; l <= 5; l++){
            for(int m = 5; m >= l; m--){
                System.out.print(" ");
            }

            base2--;
            for(int n = base2; n <= 5; n++){
                System.out.print(n);
            }
            System.out.println();
       }
    }
}
