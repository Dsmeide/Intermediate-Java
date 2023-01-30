package Original;

final public class Finally {
	
	//global variables use final keyword
	//make final variable names ALL CAPS
	
	final int MAX = 5;
	
	public void sayHi() {
		System.out.println("hi!");
	}
	
	
	//use this if variable is not set
	
//	Finally() {
//		MAX = 5;
//	}
	
	
	

	public static void main(String[] args) {
		Finally f = new Finally();
		
		System.out.println(f.MAX);
		f.sayHi();
		
		

	
	
		
	}
	
	

}
