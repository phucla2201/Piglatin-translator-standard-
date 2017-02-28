import java.util.*;
public class translator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String input;
		String output="";
		String[] words;
		System.out.println("Enter a sentence");
		input= in.nextLine();
		words=input.split(" ");
		for (int x=0;x<words.length;x++){
			String currentWord=words[x];
			//This is where you do your work
			currentWord.toLowerCase();
			//Check if the first is a,e,i,o,u,y
			if (currentWord.charAt(0)=='a'||currentWord.charAt(0)=='e'
					||currentWord.charAt(0)=='i'||currentWord.charAt(0)=='o'
					||currentWord.charAt(0)=='u'||currentWord.charAt(0)=='y'){
				// If it is, add way to your word 
				currentWord= currentWord+ "way";
			}
			else {
				// If it isn't, take off the first letter,add it to the end of the word and add "ay"
				String cutoffletter=currentWord.substring(0,1);
			}
				output=output+currentWord+"";
		}
		System.out.println(output);
	}

}
