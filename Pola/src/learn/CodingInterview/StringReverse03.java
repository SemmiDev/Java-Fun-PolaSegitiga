public class StringReverse03 {
	public static void main(String[] args) {
		String base = "Hello World";
		String base2 = "dlroW olleH";
		System.out.println(reverseWithStringBuilder(base));
		System.out.println(reverseWithManually(base));
		System.out.println(normally(base2));
		System.out.println(normally(reverseWithManually(base)));
		
	}

	public static String reverseWithStringBuilder(String base){
		return new StringBuilder(base)
					.reverse().toString();	
	}

	public static String reverseWithManually(String base){
		StringBuilder stringBuild = new StringBuilder();
		for(int i = base.length() - 1; i >= 0; i--){
			stringBuild.append(base.charAt(i));
		}
		return stringBuild.toString();
	}

	public static String normally(String base){
		StringBuilder stringBuild = new StringBuilder();
		for(int i = base.length() - 1; i >= 0; i--){
			stringBuild.append(base.charAt(i));
		}
		return stringBuild.toString();
	}


}