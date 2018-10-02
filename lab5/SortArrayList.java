import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
public class SortArrayList{
	public static <E extends Comparable<E>> void sort(ArrayList<E> list){
		Collections.sort(list);
	}
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(args));
		sort(list);
		for(String l : list){
			System.out.println(l);
		}
	}
}