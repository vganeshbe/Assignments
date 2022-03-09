package Week3.Day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String text1 = "stops", text2 = "potss";
		Boolean anagram = false;

		if (text1.length() == text2.length()) {

			char[] charTextArray_01 = text1.toCharArray();
			char[] charTextArray_02 = text2.toCharArray();

			Arrays.sort(charTextArray_01);
			Arrays.sort(charTextArray_02);

			for (int i = 0; i < charTextArray_01.length; i++) {

				if (charTextArray_01[i] == charTextArray_02[i]) {
					anagram = true;
				} else {
					anagram = false;
				}
			}
		}

		if (anagram) {
			System.out.println("Given words '" + text1 + "' &  '" + text2 + "' are Anagram");
		} else {
			System.out.println("Given words are not Anagram");
		}

	}
}
