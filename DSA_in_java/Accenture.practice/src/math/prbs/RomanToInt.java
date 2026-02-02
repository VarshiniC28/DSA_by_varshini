package math.prbs;

import java.util.HashMap;
import java.util.Map;

//Leet code : 13

public class RomanToInt {
	
	//one way using switch:
	    //     static int value(char ch){
	    //     switch(ch){
	    //         case 'I' : return 1;
	    //         case 'V' : return 5;
	    //         case 'X' : return 10;
	    //         case 'L' : return 50;
	    //         case 'C' : return 100;
	    //         case 'D' : return 500; 
	    //         case 'M' : return 1000;
	    //     }
	    //     return 0;
	    // }

	    // public int romanToInt(String s) {
	        
	    //     int res = 0;

	    //     for(int i=0; i< s.length(); i++){
	    //         int curr = value(s.charAt(i));

	    //         if(i < s.length()-1 && curr < value(s.charAt(i+1))){
	    //             res-=curr;
	    //         }else{
	    //             res+=curr;
	    //         }
	    //     }

	    //     return res;
	    // }


	    //using map
	    public int romanToInt(String s) {
	        
	        Map<Character, Integer> map = new HashMap<>();

	        map.put('I', 1);
	        map.put('V', 5);
	        map.put('X', 10);
	        map.put('L', 50);
	        map.put('C', 100);
	        map.put('D', 500);
	        map.put('M', 1000);

	        int res = 0;

	        for(int i=0; i<s.length(); i++){
	            int curr = map.get(s.charAt(i));

	            if(i < s.length()-1 && curr < map.get(s.charAt(i+1))) res-=curr;
	            else res+=curr;
	        }

	        return res;
	    }

	public static void main(String[] args) {

		
	}

}
