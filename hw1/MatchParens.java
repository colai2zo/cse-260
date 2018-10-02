// Joey Colaizzo, 111554364
import java.util.Stack;
import java.io.FileReader;
import java.io.IOException;
public class MatchParens{
	
	public static boolean matchedParens(String fileName){
		Stack<Character> parens = new Stack<>();
		try{
			FileReader reader = new FileReader(fileName);
			int c;
			boolean openSingle = false;
			boolean openDouble = false;
			while((c = reader.read()) != -1){
				char nextChar = (char) c;
				if(nextChar == (char) 39) openSingle = !openSingle;
				else if(nextChar == (char) 34) openDouble = !openDouble;
				if(!openDouble && !openSingle){
					switch(nextChar){
						case '(':
						case '[':
						case '{':
							parens.push(nextChar);
							break;
						case ')':
							if(parens.isEmpty() || parens.pop() != '(')
								return false;
							break;
						case ']':
							if(parens.isEmpty() || parens.pop() != '[')
								return false;
							break;
						case '}':
							if(parens.isEmpty() || parens.pop() != '{')
								return false;
					}
				}	
			}
			return parens.isEmpty();
		}
		catch(IOException exception){
			return false;
		}
	}

	public static void main(String[] args){
		if(args.length < 1){
			System.out.println("Need java file to check matching parentheses.");
		}
		else{
			System.out.println("Parentheses are " + (matchedParens(args[0]) ? "" : "not ") + "matched.");
		}
	}

}