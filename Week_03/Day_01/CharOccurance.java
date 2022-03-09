package Week3.Day1;

public class CharOccurance {
	
	public static void main(String[] args) {
		
		String str = "welcome to chennai";
		int count = 0;
		
		char[] charArray = str.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i] == 'e') {
				count++;
			}
		}
		
		System.out.println("'e' is occured " + count + " times in the gived string " + str);
		
	}

}
