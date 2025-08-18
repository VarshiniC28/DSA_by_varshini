package linear.search.algorithm;

public class RichestCustomerWealth {

	//Given mxn integer grid accounts, where accounts[i][j] is amount of money the ith customer has in jth bank	
	//return the wealth the richest customer has.
	//customer's wealth = amount of money they have in all their bank accs. richest customer - has max wealth
	
	static int richest(int[][] nums) {
		int max = 0;
		
		for(int i=0; i<nums.length; i++) {
			int row=0;
			for(int j=0; j<nums[i].length; j++) {
				row+=nums[i][j];
			}
			if(row>max) max=row;;
		}
		return max;
	}
	
	public static void main(String[] args) {

		int[][] arr = {{1,2,3},{2,3,4}};
		System.out.println(richest(arr)); //2+3+4 = 9
	}

}
