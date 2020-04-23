public class App26 {
	public static void main(String[] args) {
		int row = 6;
		int temp = 1;
		for(int i = 1; i <= row/2+1; i++){
			for(int j = i; j <= i; j++ ){
				System.out.print(temp * i + " ");
			}
			System.out.println();
			temp++;
		}
	}
}