package tutorials.basic;

public class Scope { 
	//declaring variables outside of methods, to be used inside any methods
	static int x; //declaring variable x
	
	public static void main(String[] args) {
		x = 5; //assigning value to x
		System.out.println(x);
		
		doSomething();
		
		System.out.println(x);
	}
	
	static void doSomething() {
		x = 10; //assigning a value to x
	}
	
	static void doSomethingLocally() {
		//because y is declared inside of this method, it is local to this method
		//no other method has access to y
		int y = 100; //declaring and initializing the variable y
	}
}
