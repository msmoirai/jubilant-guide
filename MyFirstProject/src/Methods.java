
public class Methods {
	public static void main(String[] args) {  //main method
		sayHelloWorld(); //call method
		sayHelloTo("Charlie");
		sayHelloTo("my Little friend");
		int x = returnFive();
		
		System.out.println(x);
		
		int result = square(returnFive());
		System.out.println(result);
	}
	// this method both returns a value, and takes in data
	static int square(int x){
		return x * x;
	}
	
	// this method returns an int type with the value 5
	static int returnFive() {
		return 5;
	}
	// this method will say hello to whatever name is passed when called
	static void sayHelloTo(String name) {
		System.out.println("Hello, " + name);
	}
	//this method simply says "Hello, world!"
	static void sayHelloWorld() { //skeleton of method
		System.out.println("Hello, world!"); //what the method does
	}
}
