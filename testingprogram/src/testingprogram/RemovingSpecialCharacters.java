package testingprogram;

public class RemovingSpecialCharacters {

	public static void main(String[] args) {

		String s="Harish@#!";

		int count = 0;
		
		String nospecialcharacters="";

		for(int i=0;i<s.length();i++) {

			if (!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i)) && !Character.isWhitespace(s.charAt(i))) {
				count++;
			} else {
				
				nospecialcharacters=nospecialcharacters+s.charAt(i);
			}
		}
		
		if(count!=0)
			System.out.println(count);
		
		else {
			System.out.println("no special characters");
			}
		
		System.out.println(nospecialcharacters);
	}
}


