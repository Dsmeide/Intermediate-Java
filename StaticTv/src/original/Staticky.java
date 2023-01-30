package original;

public class Staticky {
	//Static keyword increases the scope to make a variable outside of the main method usable
	//alternative to static is remove the static keyword and use the commented part below
	static int a = 10;

	public static void main(String[] args) {
		int b = 1;
		
		//Staticky s = new Staticky();
		//System.out.println(s.a);
		System.out.println(a);
		
		

	}

}
