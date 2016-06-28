package tutorials.basic;

public class ReferenceAndValueTypes {
	public static void main(String[] args) {
		//Value Types: byte, short, int, long, float, double, boolean, char
		int x=5;
		addOneTo(x); // passing a value type, so we pass a copy of the value of x which is 5
		System.out.println(x);
		
		Person john;
		john = new Person("John"); //creating a new person object, and assigning John to refer to it
		john.setAge(20);
		celebrateBirthday(john); //passing that reference to a method,
								//so the method can use that reference to manipulate the object
		System.out.println(john.getAge());
	}
	
	private static void celebrateBirthday(Person john){
		john.setAge(john.getAge() +1);
	}
	
	// manipulate a copy of the value passed
	static void addOneTo(int number) {
		number = number + 1;
	}
}
