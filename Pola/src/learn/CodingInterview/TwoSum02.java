public class TwoSum02 {
	public static void main(String[] args) {
		int[] num = {-11,-2,15,11};
		int result = 9;

		for(int i = 0; i < num.length; i++){
			for(int j = 0; j < num.length; j++){
				if(num[i] + num[j] == 9){
					System.out.print("indeks ke : [ " + i + ", " + j + " ]" );
					System.exit(0);
				}					
			}
		}
	}
}