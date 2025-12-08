package oops;

public class WrapperClassExample {
	
	static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
	
	static void swap(Integer a,Integer  b) {
		Integer temp = a;
		a = b;
		b = temp;
	}

	public static void main(String[] args) {

		int a = 10;
		int b = 45;
		
		Integer num = 45;
		
		swap(a,b); //dosen't swap because Java is pass by value not pass by reference. We have to pass values directly instead
		System.out.println(a +" "+ b);
		
		
		Integer c = 10;
		Integer d = 20;
		swap(c,d); //Doesn't swap even though we do it like this because Integer class is final.	
		System.out.println(c +" "+ d);
		
	}

}
