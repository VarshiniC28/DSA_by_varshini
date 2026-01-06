package maths.dsa;

public class SetRightMostUnsetBit {
	
	//set the rightmost unset bit - 0 to 1 and return the number resulted when its done
	//eg : 2 - 0010 - after unset is set - 0011 - 3
	static int setUnset(int n) {
		return n | (n + 1); //adds 1 to right most unset bit
	}

	public static void main(String[] args) {
		System.out.println(setUnset(2)); //3
		System.out.println(setUnset(6)); //7
		System.out.println(setUnset(3)); //7
	}
}
