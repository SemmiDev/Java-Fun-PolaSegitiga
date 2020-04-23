public class App1 {
	public static void main(String[] args) {
		printFizz(10);
	}

	public static void printFizz(int num){
		for(int i = 1; i <= num; i++){
			if(i % 3 == 0){
				System.out.println("Fizz : " + i);
			}else if(i % 5 == 0){
				System.out.println("Buzz : " + i);
			}else if(i % 5 == 0 && i % 3 == 0){
				System.out.println("Fizz and Buzz : " + i);
			}else{
				System.out.println(i);
			}
		}
	}

}