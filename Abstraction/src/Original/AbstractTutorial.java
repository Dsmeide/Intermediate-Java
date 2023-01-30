package Original;

//cannot have any implemented methods inside of an interface
//can have BOTH abstract methods and implemented methods inside an abstract class

abstract class Dog {
	
	public void bark() {
		System.out.println("Bark!");
	}
	
	public abstract void poop();

}

class Chihuahua extends Dog {

	@Override
	public void poop() {
		System.out.println("Dog Pooped!");
		
		}
	
}

public class AbstractTutorial {

	public static void main(String[] args) {
		
		Chihuahua c = new Chihuahua();
		
		c.bark();
		

	}

}
