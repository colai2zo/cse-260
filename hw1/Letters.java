// Joey Colaizzo, 111554364
import java.util.HashSet;
import java.util.Scanner;
import java.util.Arrays;
import java.io.*;
public class Letters{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Please enter a file name: ");
		FileReader reader = null;
		HashSet<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
		try{
			reader = new FileReader(s.next());
		}
		catch(IOException e){
			System.out.println("The file name entered was invalid.");
		}
		if(reader != null){
			int c;
			int numVowels = 0;
			int numCons = 0;
			try{
				while((c = reader.read()) != -1){
					if(Character.isLetter((char)c)){
						if(vowels.contains((char)c)){
							numVowels++;
						}
						else{
							numCons++;
						}
					}
				}
				System.out.println("The file contains " + numVowels + " vowels and " + numCons + " consonants.");
			}
			catch(IOException e){
				System.out.println("There was an error reading the txt file.");
			}
		}
	}
}