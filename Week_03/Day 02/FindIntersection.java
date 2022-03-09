package week1.day2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import lombok.ToString;

public class FindIntersection {

	public static void main(String[] args) {

		int[] array_01 = {3,2,11,4,6,7};
		int[] array_02 = {1,2,8,4,9,7};
		List<String> intersectArray = new ArrayList<String>();
		
		for (int i = 0; i < array_01.length; i++) {
			
			for (int j = 0; j < array_02.length; j++) {
				if (array_01[i] == array_02[j]) {
//					System.out.println(array_01[i]);
					intersectArray.add(array_01[i]+"");
				}
			}
		}
		System.out.println("Intersection of Two arrays");
		System.out.println("**************************");
		System.out.println(intersectArray);
	}

}
