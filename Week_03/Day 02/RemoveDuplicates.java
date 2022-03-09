package week1.day2.assignments.mandatory;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";

		String[] word = text.split(" ");

		for (int i = 0; i < word.length; i++) {
			for (int j = i + 1; j < word.length; j++) {
				if (word[i].equals(word[j])) {
					word[j] = "";
				}
			}
		}

		for (int i = 0; i < word.length; i++) {
			if (!(word[i] == "")) {
				System.out.print(word[i] + " ");
			}
		}
	}
}
