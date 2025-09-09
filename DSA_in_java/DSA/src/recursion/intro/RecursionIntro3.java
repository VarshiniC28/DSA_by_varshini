package recursion.intro;

public class RecursionIntro3 {
	
	static void print(int n) {
		System.out.println(n);
		
		//Base Condition
		if(n==5) {
			return; //If no base condition function call will keep happening and stack memory will be filled and overflow - stack overflow error
		}
		
		//recursion : function calling itself
//		Recursive call 
		print(n+1); //If we are calling a function again and again, we can treat it as a separate call in stack. i.e each call will take separate memory in stack
		//And this is called tail recursion i.e its the last function called unlike Fibonacci which is called 3 times.
	}
	
	//1 calls 2, 2 calls 3, 3 calls 4 , 4 calls 5, so it is n+!, 5 doesn't call any function
	
	public static void main(String[] args) {
		
		//print 1 to 5 but call only one function
		print(1);
		
		//Recursion - function calls itself
		//Base Condition in recursion is a condition where recursion will stop making new calls.
		
		//Why recursion? Helps us solving bigger and complex problems in simple way.
		//We can convert recursion solution into iteration and vice versa.
		
		//When to use? -
		/*
		 * => Space complexity : not constant because of recursive calls
		 * => Helps breaking down bigger problems to smaller problems
		 * 
		 * */
		
		//Types of Recurrence relations :
		//1. Linear Recurrence relations : Eg. Fiboncci
		//2. Divide & Conquer Recurrence relations ( relieved by c factor)
		
		
		
	}
} 
