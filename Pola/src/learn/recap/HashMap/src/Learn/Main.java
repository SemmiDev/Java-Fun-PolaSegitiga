package Learn;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer,String> employee = new HashMap<Integer,String>();
        Scanner scanner = new Scanner(System.in);
        boolean next = true;

        for(int i = 1; i <= 5; i++){
            System.out.print("Masukkan nama : ");
            String satu = scanner.nextLine();

            employee.put(i,satu);
//            System.out.print("lanjut tambahkan data / tidak (y/n) ? ");
//            String question = scanner.next();
//            if(question.equals("y")){
//                next = true;
//            }else{
//                next = false;
//            }
        }
        for(int i = 1; i <= 5; i++){
            System.out.println(employee.get(i));
        }

        System.out.println(employee.values());
    }
}
