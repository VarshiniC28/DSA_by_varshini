package binarysearchin2D.array;

import java.util.Arrays;

public class BSin2DSorted {
	
	static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
		while(cStart<=cEnd) {
			int mid = cStart + (cEnd - cStart)/2;
			
			if(matrix[row][mid]==target) {
				return new int[] {row, mid};
			}else if(matrix[row][mid]<target) {
				cStart = mid+1;
			}else if(matrix[row][mid]>target) {
				cEnd=mid-1;
			}
		}
		return new int[] {-1,-1};
	}
	
	static int[] search(int[][] matrix, int target) {
		
		int rows = matrix.length; //no of rows
		int cols = matrix[0].length; // no of columns
		
		if(rows==1) {
			return binarySearch(matrix, 0, 0, cols-1, target);
		}
		
		int rStart=0, rEnd=rows-1;
		int cMid=cols/2;
		
		//run loop till 2 rows are remaining
		while(rStart<rEnd-1) {
			int rMid = rStart + (rEnd - rStart)/2;
			if(matrix[rMid][cMid]==target) return new int[] {rMid, cMid};
			
			else if(matrix[rMid][cMid]<target) {
				rStart= rMid;
			}
			else if(matrix[rMid][cMid]>target) {
				rEnd=rMid;
			}
		}
		
		//now we have two rows
		//now to check if target is in the col of those 2 rows
		if(matrix[rStart][cMid]==target) {
			return new int[] {rStart, cMid};
		}
		else if(matrix[rStart+1][cMid]==target) {
			return new int[] {rStart+1, cMid};
		}
		
		//search in 1st Half
		else if(target<=matrix[rStart][cMid-1]) {
			return binarySearch(matrix, rStart, 0, cMid-1, target);
		}
		//search in 2nd Half
		else if(target>=matrix[rStart][cMid+1] && target<matrix[rStart][cols-1]) {
			return binarySearch(matrix, rStart, cMid+1, cols-1, target);
		}
		
		//search in 3rd half
		else if(target<=matrix[rStart+1][cMid-1]) {
			return binarySearch(matrix, rStart+1, 0, cMid-1, target);
		}
		
		//search in 4th half
		else {
			return binarySearch(matrix, rStart+1, cMid+1, cols-1, target);
		}
		
	}

	public static void main(String[] args) {
		
		int[][] arr = {
				{1,2,3,4},
				{4,5,6,7},
				{8,9,10,11},
				{12,13,14,15}
		};

		System.out.println(Arrays.toString(search(arr, 15)));
	}

}
