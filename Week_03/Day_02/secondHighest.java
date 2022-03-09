package week1.day2;

import java.util.Arrays;

public class secondHighest {

	public static void main(String[] args) {

		
		int[] values = {10,20,30,50,40,70,90};
		
		Arrays.sort(values);
		
		System.out.println (values[values.length - 2]);

	}

}
