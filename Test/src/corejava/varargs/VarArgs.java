package corejava.varargs;

public class VarArgs {
	
	public static void main(String[] args) {
		printStrings("ABC", "DEF");
		System.out.println("#########################################");
		printStrings("DEF");
	}
	
	
	public static void printStrings(String... strings)
	{
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
	}

}
