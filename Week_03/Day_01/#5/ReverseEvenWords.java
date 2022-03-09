package Week3.Day1;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String ReverseEvenWords = "";

		String[] splitTest = test.split(" ");

		for (int i = 0; i < splitTest.length; i++) {
			if (i % 2 == 1) {

				char[] charArray = splitTest[i].toCharArray();
				for (int j = charArray.length - 1; j >= 0; j--) {
					ReverseEvenWords = ReverseEvenWords + charArray[j];
				}
				ReverseEvenWords = ReverseEvenWords + " ";

			} else {
				ReverseEvenWords = ReverseEvenWords + splitTest[i] + " ";
			}

		}

		System.out.println(ReverseEvenWords.trim());
	}
}
