import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
public class LargestInArrayList{
	public static <E extends Comparable<E>> E max(ArrayList<E> list){
		return Collections.max(list);
	}
	public static void main(String[] args){
		System.out.println(max(new ArrayList<String>(Arrays.asList(args))));
	}
}