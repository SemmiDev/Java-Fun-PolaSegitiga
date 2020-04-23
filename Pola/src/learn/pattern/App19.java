public class App19 {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++){
			for(int j = 1; j <= i; j++){
					int base = 0;
					int base2 = 1;
				if(j % 2 == 0){
					System.out.print(base);
				}else{
					System.out.print(base2);
				}
			}
			System.out.println();
		}
	}
}