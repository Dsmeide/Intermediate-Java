package main;

public class RecursionIsCool {

	public static void main(String[] args) {
		
		//method being called inside of itself
		//recursion NEEDS to know when to stop
		//needs a base case
		countBackwards(15);
		
		

	}
	
	public static void countBackwards(int n) {
		if(n == 0) {
			System.out.println("Done");
		} else {
			System.out.println(n);
			n--;
			countBackwards(n);
		}
	}

//	public static void sayHi(int n) {
//		if(n == 0) {
//			System.out.println("Done");
//		} else {
//			System.out.println("hi");
//			n--;
//			sayHi(n);
//		}
		
//	}
}
