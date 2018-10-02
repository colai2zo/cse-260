// Joey Colaizzo, 111554364
import java.util.Comparator;
public class SelectionSortWithComparator{

	public static <E> void selectionSort(E[] list, Comparator<? super E> comparator){
		for(int i = 0 ; i < list.length - 1 ; i++){
			int minIndex = i;
			for(int j = i + 1 ; j < list.length ; j++){
				if(comparator.compare(list[minIndex], list[j]) > 0)
					minIndex = j;
			}
			System.out.println(minIndex);
			E temp = list[i];
			list[i] = list[minIndex];
			list[minIndex] = temp;
		}
	}

	public static void main(String[] args){
		selectionSort(args, Comparator.naturalOrder());
		System.out.println(java.util.Arrays.toString(args));
	}

}