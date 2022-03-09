package week1.day2.classroom.arrays;

import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = { 3, 2, 11, 4, 6, 7 };

		List<String> list = new ArrayList<String>();

		for (int i = 0; i < data.length; i++) {
			list.add(data[i] + "");
		}

		list.sort(null);
		System.out.println(list.get(list.size() - 1));

	}

}
