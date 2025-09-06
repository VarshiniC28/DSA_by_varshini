package recursion.intro;

public class RecursionIntro {
	
	static void message() {
		System.out.println("Hello");
		message1();
	}
	
	static void message1() {
		System.out.println("Hello");
		message2();
	}
	
	static void message2() {
		System.out.println("Hello");
		message3();
	}
	
	static void message3() {
		System.out.println("Hello");
		message4();
	}
	
	static void message4() {  
		System.out.println("Hello");
	}
	
	
	public static void main(String[] args) {
		
		//to now print "Hello" 5 times
		message();
	}
}
