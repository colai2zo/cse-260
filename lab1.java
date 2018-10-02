import java.util.HashSet;
import java.util.Scanner;
public class lab1{
	public static void main(String[] args){
		HashSet<Integer> numbers = new HashSet<Integer>();
		Scanner s = new Scanner(System.in);
		for(int i = 0 ; i < 10 ; i++){
			numbers.add(s.nextInt());
		}
		for(int num : numbers){
			System.out.println(num);
		}
		System.out.println(howManyCollatzIterations(100));
	}

	public static int howManyCollatzIterations(int n){
		int count;
		for(count = 0; n > 0 ; count++){
			n = n % 2 == 0 ? n / 2 : 3 * n + 1;
		}
		return count;
	}
}