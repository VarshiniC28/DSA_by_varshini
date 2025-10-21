package recursion.part7.Backtracking.MazeProb;

import java.util.ArrayList;

public class MazeVerticalHorizontalDiagonal {
	
	//Given a m x n matrix list all possible ways to move from point A(First box - first row first column) to point B(Last Box) - last row last column
	//Directions : can only move vertical(Down), horizontal(Right) and diagonal
	
	static ArrayList<String> pathDiagonal(String p, int r , int c){
		if(r == 1 && c == 1) {
			ArrayList<String> li = new ArrayList<>();
			li.add(p);
			return li;
		}
		
		ArrayList<String> list = new ArrayList<>();
		
		if(r > 1 && c > 1) {
			list.addAll(pathDiagonal(p + 'D', r - 1, c - 1));
		}
		
		if(r > 1) {
			list.addAll(pathDiagonal(p + 'V', r - 1, c));
		}
		
		if(c > 1) {
			list.addAll(pathDiagonal(p + 'H', r, c - 1));
		}
		
		return list;
	}
	
	public static void main(String[] args) {

		System.out.println(pathDiagonal("", 3,3));
	}

}
