package maths.dsa;import java.util.Arrays;

/*
 * 832. Flipping an Image
 * Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
 * 
 * To flip an image horizontally means that each row of the image is reversed.
 * For example, flipping [1,1,0] horizontally results in [0,1,1].
 * 
 * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
 * For example, inverting [0,1,1] results in [1,0,0].
 * 
 * */

public class ZLeetCodeFlipImage {
	
	static int[][] flipAndInvertImage(int[][] image){
		
		for (int i = 0; i < image.length; i++) {
			for (int j = 0; j < (image[0].length+1)/2; j++) { //to reduce time of looping over all arrays when we can just loop over half since swapping will be done before we reach middle
				int temp = image[i][j] ^ 1;
				image[i][j] = image[i][image[i].length-j-1] ^ 1;
				image[i][image[i].length-j-1] = temp;
			}
		}
		
		return image;
	}

	public static void main(String[] args) {

		int[][] image = {{1,1,0},{1,0,1},{1,0,0}};
		System.out.println(Arrays.deepToString(flipAndInvertImage(image)));
	}

}
