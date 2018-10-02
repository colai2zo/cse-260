// Joey Colaizzo
import java.io.*;
import java.util.*;
public class GuessCapitals{
	public static void main(String[] args){
		FileReader reader = null;
		try{
			reader = new FileReader("us-state-capitals.csv");
		}
		catch(IOException e){
			System.out.println("Could not find capitals csv file.");
		}
		if(reader != null){
			BufferedReader bReader = new BufferedReader(reader);
			String line = null;
			HashMap<String,String> capitals = new HashMap<>();
			try{
				while((line = bReader.readLine()) != null){
					String[] sep = line.split(",");
					capitals.put(sep[0].toLowerCase(),sep[1]);
				}
			}catch(IOException e){
				System.out.println("An error occured when reading the CSV file.");
				System.exit(1);
			}
			
			Scanner s = new Scanner(System.in);
			while(true){
				System.out.print("Enter the name of a state: ");
				String state = s.nextLine().toLowerCase();
				if(capitals.get(state) != null){
					System.out.println(capitals.get(state));
				}
				else{
					System.out.println("Please enter a valid state name.");
				}
			}
		}
		
	}
}