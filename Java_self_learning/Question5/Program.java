package Question5;

import java.util.Scanner;

//Build a text analyzer that counts vowels, consonants, special characters, andgenerates statistics 
class TextAnalyzer{
	private String string;
	
	TextAnalyzer(String string){
		this.string = string;
	}
	
	public void analyzer() {
		int vowels = 0;
		int consonants=0;
		int special=0;
		int digits=0;
		int space=0;
		
		for(int i = 0;  i<string.length(); i++) {
			char ch = string.charAt(i);
			
			if(Character.isLetter(ch)) {
				if(isVowel(ch)) {
					vowels++;
				}else {
					consonants++;
				}
			}else if(Character.isWhitespace(ch)) {
				space++;
			}else if(Character.isDigit(ch))
			digits++;
			else special++;
		}
		
		int total = string.length();

        System.out.println("\n----- TEXT STATISTICS -----");
        System.out.println("Total Characters : " + total);
        System.out.println("Vowels           : " + vowels);
        System.out.println("Consonants       : " + consonants);
        System.out.println("Digits           : " + digits);
        System.out.println("Spaces           : " + space);
        System.out.println("Special Characters : " + special);
		
	}	
	
	public boolean isVowel(char ch) {
		ch=Character.toLowerCase(ch);
		return ch=='a' || ch=='u' ||ch=='i'||ch=='o'||ch=='e';
	}
}
public class Program {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter text: ");
	        String text = sc.nextLine();

	        TextAnalyzer analyzer = new TextAnalyzer(text);

	        analyzer.analyzer();

	        sc.close();
	}
}
