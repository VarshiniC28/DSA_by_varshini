package collectionFW.intro;

//An enum (short for enumeration) in Java is a special kind of class that represents a fixed set of named constants. 
//Enums are used when you have values that you know will not change, such as days of the week, months, colors, or status codes.


interface A{
	void hello();
}

public class Enums {
	
	enum Week implements A{ //enum can implement as many interfaces but cant extend classes
		Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
		//these are called as enum constants
		//every day is here public static and final
		//since its final we can't create child Enums
		//type of these all days is Week as we gave name (enum name)
		
		//Week constructor - not public or protected , only private default because we dont want to create new objects , this is not enum concept
		//internally it works like this : public static final Week Monday = new Week();
		Week() {
			System.out.println("Constructor called for " + this);
		}

		@Override
		public void hello() {
			System.out.println("Hello");
		}
	}

	public static void main(String[] args) {
		
		Week week;
		week = Week.Tuesday;
		
		week.hello(); // calling overriden method
		
		//looping over enum
		for(Week day : Week.values()) {
			System.out.println(day);
		}
		
		System.out.println("------------------------");
		
		System.out.println(week); //prints only Monday since thats we have assigned it above
		
		System.out.println(week.ordinal()); //prints index(position) of the stored day. Monday - 0, Tuesday - 1
		
		System.out.println(Week.valueOf("Monday")); //prints the same enum constant itself
		
	}

}
