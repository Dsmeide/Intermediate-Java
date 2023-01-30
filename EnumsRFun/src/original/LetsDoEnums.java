package original;

//enum Levels {
//	LOW, MEDIUM, HIGH;
//}

public class LetsDoEnums {

	enum Flavor {
		CHOCOLATE, STRAWBERRY, VANILLA;
		
		//can have methods inside of an enum, too
		public static void getVanilla() {
			System.out.println(Flavor.VANILLA);
		}
	}
	
	public static void main(String[] args) {
		//enum if a class and an Array had a baby
		
		Flavor flav = Flavor.CHOCOLATE;
		flav.getVanilla();
		
		if(flav == flav.VANILLA) {
			System.out.println("It's Vanilla");
		} else if(flav == flav.CHOCOLATE) {
			System.out.println("It's Chocolate");
		} else if(flav == flav.STRAWBERRY) {
			System.out.println("It's Strawberry");
		}
		
//		Levels l = Levels.LOW;
//		System.out.println(l);
//		
//		switch(l) {
//		case LOW:
//			System.out.println("Low level");
//			break;
//		case MEDIUM:
//			System.out.println("Medium level");
//			break;
//		case HIGH:
//			System.out.println("High level");
//			break;
//		}
		
		

	}

}
