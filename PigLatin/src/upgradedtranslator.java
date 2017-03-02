import java.util.Scanner;
public class upgradedtranslator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String input;
		String output="";
		String[] words;
		//Added stuff
		System.out.println("Enter a sentence");
		input= in.nextLine();
		words=input.split(" ");
		for (int x=0;x<words.length;x++){
			String currentWord=words[x];
			//This is where you do your work
			String LowercasecurrentWord = currentWord.toLowerCase();
			//Check if the first is a,e,i,o,u,y
			if (LowercasecurrentWord.charAt(0)=='a'||LowercasecurrentWord.charAt(0)=='e'
					||LowercasecurrentWord.charAt(0)=='i'||LowercasecurrentWord.charAt(0)=='o'
					||LowercasecurrentWord.charAt(0)=='u'||LowercasecurrentWord.charAt(0)=='y'){
				// If it is, add way to your word 
				currentWord= currentWord+ "way";
			}
			else {
				// substring after position 1 to get the rest of the string without the 1st letter
				String except1stletter= currentWord.substring(1);
				// Create a for loop to check for the vowel after position 0
				for (int y=0;y<except1stletter.length();y++){
					if(except1stletter.charAt(y)=='a'||except1stletter.charAt(y)=='e'
							||except1stletter.charAt(y)=='i'||except1stletter.charAt(y)=='o'
							||except1stletter.charAt(y)=='u'||except1stletter.charAt(y)=='y'){
						String stletter=currentWord.substring(0,1);
								if(stletter==stletter.toUpperCase()){
									String cutoffletter=currentWord.substring(0,y+1);
									String Uppercaseletter=currentWord.substring(y+1,y+2);
									currentWord= currentWord.substring(y+2);
									currentWord= Uppercaseletter.toUpperCase()+currentWord+cutoffletter.toLowerCase()+"ay";
								}else {
									String cutoffletter=currentWord.substring(0,y+1);
									currentWord= currentWord.substring(y+1);
									currentWord= currentWord+cutoffletter+"ay";
								}

						break;
					}
				}
			}
			output=output+currentWord+" ";
		}
		System.out.println(output);
	}


}


