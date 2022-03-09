package week1.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";
		int count = 0;
		
		String[] words = text.split("\\s+");
	
		for (int i = 0; i < words.length; i++) {
			
			for (int j = i + 1; j < words.length; j++) {
				
				if(words[i].equals(words[j])) {
					count = 1;
					words[j]="";
				}
			}
		}
		
		for (int j = 0; j < words.length; j++) {
			System.out.print(words[j] + " ");
		}
	}

}
