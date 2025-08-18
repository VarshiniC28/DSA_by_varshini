package math.programs;

public class PythagoreanTriplet {
	
	static boolean isTriplet(int a, int b, int c) {
        int x = Math.max(a, Math.max(b, c));
        int y, z;
        if (x == a) { y = b; z = c; }
        else if (x == b) { y = a; z = c; }
        else { y = a; z = b; }

        return x * x == y * y + z * z;
    }

	public static void main(String[] args) {
		  System.out.println(isTriplet(3, 4, 5)); // true
	}

}
