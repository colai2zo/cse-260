import java.util.Arrays;
public class SortArrayList{
    public static <E extends Comparable<E>> void sort(ArrayList<E> list){
        list = new ArrayList<E>(Arrays.asList(Arrays.sort(list.toArray())));
    }
    public static void main(String[] args){
        ArrayList<String> list = Arrays.asList(args);
		<String>sort(list);
        for(String s : sort(Arrays.asList(args))){
            System.out.println(s);
        }
    }
}