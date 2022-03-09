package week1.day2.classroom.arrays;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {

		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		int arrLength = arr.length;
		int count;

		for (int i = 0; i < arrLength - 1; i++) {

			count = 0;

			for (int j = i; j < arrLength; j++) {

				if (arr[j] == arr[i]) {
					count++;
				}
			}
			if (count > 1) {
				System.out.println(arr[i]);
			}
		}
	}

}
