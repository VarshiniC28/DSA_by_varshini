package recursion.part1;

public class CountOperationsToObtainZero {

	static int countOperations(int num1, int num2) {
	    // ================= RECURSIVE SOLUTION =================
	    // TC: O(max(num1, num2))
	    // SC: O(max(num1, num2))  (recursion stack)

	        // if (num1 == 0 || num2 == 0) return 0;

	        // if (num1 >= num2) return 1 + countOperations(num1 - num2, num2);
	        // else return 1 + countOperations(num1, num2 - num1);

	        //or
		
		int count = 0;
		while(num1 != 0 && num2 != 0) {
			if(num1 > num2) {
				count+=num1/num2;
				num1%=num2;
			}else {
				count+=num2/num1;
				num2%=num1;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {

		System.out.println(countOperations(10, 3));
	}

}
