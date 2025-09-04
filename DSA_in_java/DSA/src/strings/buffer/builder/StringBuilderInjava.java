package strings.buffer.builder;
public class StringBuilderInjava {

	public static void main(String[] args) {
		
		String series = "";
		for (int i = 0; i < 26; i++) {          // Loop runs 26 times, i = 0 → 25
		    char ch = (char)('a' + i);          // 'a' has ASCII value 97, so this becomes (97 + i)
//		    System.out.println(ch);             // Prints the character corresponding to that ASCII code
		    series = series+ch;
		}

		System.out.println(series);
		
		//here every time a letter is added to series , new objects re created , a ab, abc, abcd, abcde - like this since String is immutable these all are new objects , so this is memory wastage
		//and O(N^2)
		
		//So to make no new objects are created every time, we have to use String builder as below
		
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < 26; i++) {
			char ch = (char)('a'+i);
			builder.append(ch); //this doesnt create new object every time, instead changes the existing String - mutable
		}
		System.out.println(builder.toString()); //later we can change that into the String
		System.out.println(builder.reverse());
	}
}
