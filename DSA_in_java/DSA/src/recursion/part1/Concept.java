package recursion.part1;

public class Concept {
	
	static void fun(int n) {
		if(n == 0) return;
		
		System.out.println(n);
//		fun(n--); //Keeps on printing 5 because we are first passing 5 then decrement - so this keeps repeating and every time we end up with 5 => //infinite
		
		//finite:
		fun(--n);
	}

	public static void main(String[] args) {

		fun(5);
	}

}
