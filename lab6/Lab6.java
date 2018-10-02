import java.util.Arrays;

public class Lab6{
	public static <E extends Comparable<E>> E Max(E[] lst){
		Arrays.sort(lst);
		return lst[lst.length - 1];
	}
	public static <E extends Comparable<E>> int binarySearch(E[] lst, E key){
		return Arrays.binarySearch(lst, key);
	}
	public static void main(String[] args){
		GenericStackExtendsArrayList<String> g = new GenericStackExtendsArrayList<String>(); 
		java.util.Scanner s = new java.util.Scanner(System.in);
		for(int i = 0 ; i < 5 ; i++){
			g.push(s.nextLine());
		}
		while(g.getSize() > 0){
			System.out.println(g.pop());
		}
	}
}