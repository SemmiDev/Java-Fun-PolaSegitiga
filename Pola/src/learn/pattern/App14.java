public class App12{
	public static void main(String[] args) {
		for (int a = 1; a <= 5; a++) {	
			int p = 0;

			for(int b = 1; b <= a; b++){
				System.out.print(b);	
				p = b - 1;				
			}

			for(int k = p; k >= 1; k--){
				System.out.print(k);
			}

			System.out.println();
		}
	}
}