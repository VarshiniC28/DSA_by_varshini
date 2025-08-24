package sorting;

import java.util.Arrays;

public class BubbleSorting { 
	
    static void sort(int[] arr) { 
        
        boolean swapped; // A flag to track if any swap happened in the current pass
        
        for (int i = 0; i < arr.length; i++) { // Outer loop runs 'n' times (n = arr.length); after each pass, the largest element is placed at the end
            
            swapped = false; // Initially assume no swaps will happen in this pass
            
            for (int j = 1; j < arr.length - i; j++) { // Inner loop compares adjacent elements, reducing range each time as last i elements are already sorted
                if (arr[j] < arr[j - 1]) { // Check if the current element is smaller than the previous one (out of order)
                    
                    int temp = arr[j]; // Store the current element temporarily
                    arr[j] = arr[j - 1]; // Move the previous element one position ahead
                    arr[j - 1] = temp; // Place the smaller element at the previous position
                    
                    swapped = true; // A swap occurred, so mark swapped as true
                }
            }
            
            if (!swapped) { // If no swaps happened in this pass, array is already sorted
                break; // Exit the outer loop early to save unnecessary passes
            }
        }
    }

    public static void main(String[] args) { // Main method: program entry point

    	int [] arr = {5,3,4,2,6,1};
    	sort(arr);
    	System.out.println(Arrays.toString(arr));
    }

}
