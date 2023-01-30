package Original;
//encapsulation 
//make a set and get method for the variables because they are private
public class Main {

	public static void main(String[] args) {
		
		Student s = new Student();
//		s.name = "Tommy";
//		s.age = 17;
//		System.out.println(s.name);
//		System.out.println(s.age);
		s.setName("Suzie");
		System.out.println(s.getName());
		s.setAge(25);
		System.out.println(s.getAge());

	}

}
