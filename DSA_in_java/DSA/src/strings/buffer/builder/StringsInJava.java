package strings.buffer.builder;

import java.util.ArrayList;
import java.util.Arrays;

public class StringsInJava {

	public static void main(String[] args) {
		
		String a = "Varsha";
		String b = "Varsha";
		
		//Above the Varsha object in created in SCP and since they are same, both a b ref vars are pointing to same object, both have that objcts same address
		
		System.out.println(a==b);
		
		//
		String c = "ammu";
		System.out.println(c);
		c = "varsha";
		System.out.println(c); //here even though String is immutable , ammu changed to varsha because , varsha is creating new object and c starts pointing to that obj, old ammu is collected by garbage collector
		
		String name1 = new String("ammu");
		String name2 = new String("ammu");
		
		System.out.println(name1==name2); //checks ref vars
		System.out.println(a.equals(b)); //checks value
		
		System.out.println(name1.charAt(0)); //prints char at index 0
		
		System.out.println(); //here println is a method from class PrintStream which calls toString method to print  
		
		
		//------------------------------------------------------------------------------------------------------------------
		
		//Pretty formatting:
		
		float d = 453.1234f;
		//to print till only 2 decimals
//		System.out.printf("Formatted number is %.2f",d); //.2f - means 2 numbers after decimal
		
		System.out.println(Math.PI);
		System.out.printf("Formatted PI: %.3f", Math.PI);
		
		System.out.println();
		
		System.out.printf("My name is %s and I'm %s","Varsha","cool"); //maintains order
		System.out.println();
		
		//---------------------------------------------------------------------------------------------------------------------------
		
		//Operators
		
		System.out.println('a'+'b'); //adds Ascii value 195
		System.out.println("a"+"b"); //ab
		System.out.println('a'+3); //100
		System.out.println("a"+3); //a3 //integer will be converted into Integer that will call toString() - "a" + "1"
		System.out.println("varsha"+ new ArrayList<>()); //varsha[]
		System.out.println("ammu"+ new Integer(43)); 
		
		//+ in Java can be used only with primitives or atleast one should be string
//		System.out.println( new Integer(43) +  new ArrayList<>()); //error, since both are non primitive and there is no string
		System.out.println( new Integer(43) + " " +new ArrayList<>()); //this will work since there is a string
		
		
		//In java Operator overloading is only for + but wth above conditions only 
		
		//--------------------------------------------------------------------------------------------------------------------------
		
		//Performance of strings
		
		String series = "";
		
		for (int i = 0; i < 26; i++) {          // Loop runs 26 times, i = 0 → 25
		    char ch = (char)('a' + i);          // 'a' has ASCII value 97, so this becomes (97 + i)
//		    System.out.println(ch);             // Prints the character corresponding to that ASCII code
		    series = series+ch;
		}

		System.out.println(series);
		
		//here every time a letter is added to series , new objects re created , a ab, abc, abcd, abcde - like this since String is immutable these all are new objects , so this is memory wastage
		//and O(N^2)
		
		//So to make no new objects are created every time, we have to use String builder 
		
		//----------------------------------------------------------
		
		String name = "varsha c";
		System.out.println(Arrays.toString(name.toCharArray()));
		System.out.println(name.toUpperCase());
		System.out.println(name);
		System.out.println(name.indexOf('a'));
		System.out.println("       varsha       ".strip());
		System.out.println(Arrays.toString(name.split(" ")));
		
	}
}
