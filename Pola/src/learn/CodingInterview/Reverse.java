import java.util.Scanner;
public class Reverse {
	public static void main(String[] args) {
		// String base = "Sammi ALdhiyanto";
		// StringBuilder str = new StringBuilder();
		// str.append(base);
		// str.reverse();
		// System.out.println(str);
		

		// String base2 = "Aditya Andika Putra";
		// char[] pecahan = base2.toCharArray();
		// for(int i = pecahan.length - 1; i >= 0; i--){
		// 	System.out.print(pecahan[i]);
		// }	



		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan text yang akan di reverse : ");
		String next = scanner.nextLine();

		String[] tokenizer = next.split("");
		for(int i = tokenizer.length - 1; i >= 0; i--){
			System.out.print(tokenizer[i]);
		}
		
	}
}