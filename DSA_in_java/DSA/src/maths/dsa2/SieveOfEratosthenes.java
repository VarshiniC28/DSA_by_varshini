package maths.dsa2;

//Print sll primes till n

public class SieveOfEratosthenes {
	
	static void sieve(int n) {
		boolean [] primes = new boolean[n+1]; //to include n also
		
		for (int i = 2; i < n; i++) {
			if(!primes[i]) {
				for (int j = i*i; j <= n; j+=i) { //starting from the first multiple of i till n, and iterate to j+i that is multiples of i
					primes[j] = true;
				}
			}
		}
		
		for (int i = 2 ; i <= n; i++) {
			if(!primes[i]) { //false = prime
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {

		int n = 40;
		sieve(n);
	}

}
