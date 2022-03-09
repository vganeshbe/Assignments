package Week3.Day2;

public class Palindrome {

	public static void main(String[] args) {

		String name = "madam";
		
		String revName = "";
		
		String[] split = name.split("");
//		System.out.println(split.length);
		
		for (int i = split.length-1; i >= 0; i--) {
			
//			System.out.println(split[i]);
			revName = revName + split[i];
		}

		if (revName.equals(name)) {
			System.out.println("The given word '" + name + "' is a Palindrome.");
		} else {
			System.out.println("The given word '" + name + "' is not a Palindrome.");
		}
	}

}
