package learn.pattern;

public class App2 {
    public static void main(String[] args) {
        clearScreen();
        System.out.println("\n\n\n\n\n\n+--------- TABEl ELEKTRON VALENSI ---------+");
        char s = 's';  int maxS = 2;   int add1 = 1;
        char p = 'p';  int maxP = 6;   int add2 = 2;
        char d = 'd';  int maxD = 10;  int add3 = 3;
        char f = 'f';  int maxF = 14;  int add4 = 4;

        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                if(j == 1){
                    System.out.print("|  |" + add1 + s + maxS + "|   ");
                    add1++;
                }else if(j == 2){
                    System.out.print("  |" + add2 + p + maxP + "|   ");
                    add2++;
                }else if(j == 3){
                    System.out.print("  |" + add3 + d + maxD + "|    ");
                    add3++;
                }else if(j == 4){
                    System.out.print("  |" + add4 + f + maxF + "|    ");
                    add4++;
                }else {
                    System.out.print("");
                }
            }
            System.out.println();
        }
        for(int i = 6; i <= 8 ; i++){
            for(int j = 8; j >= i; j--){
                if(j == 8){
                    System.out.print("|  |" + add1 + s + maxS + "|   ");
                    add1++;
                }else if(j == 7){
                    System.out.print("  |" + add2 + p + maxP + "|   ");
                    add2++;
                }else if(j == 6){
                    System.out.print("  |" + add3 + d + maxD + "|  ");
                    add3++;
                }else {
                    System.out.print("");
                }
            }
            System.out.println();
        }
        System.out.println("+------------------------------------------+\n\n\n\n\n");

    }

    public static void clearScreen(){
        try {
            if (System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033\143");
            }
        } catch (Exception ex) {
            System.out.println("tidak bisa clear screen");
        }
    }

}
