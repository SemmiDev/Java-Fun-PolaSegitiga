public class App21 {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++){
			for(int j = i; j < 5; j++){
				System.out.print("1 ");
			}

			for(int k = 1; k <= i; k++){
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}