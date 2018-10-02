import java.util.*;
import java.util.stream.Collectors;
public class lab11{
	public static void main(String[] args){

		Set<String> sortedSet = new TreeSet<>(new Comparator<String>(){
			public int compare(String o1, String o2){
				return o1.toLowerCase().compareTo(o2.toLowerCase());
			}
		});
		for(String arg : args){
			sortedSet.add(arg);
		}

		sortedSet.stream().forEach(e -> System.out.println(e));

		List<String> r = Arrays.asList("ofij ", "   siodj   ", "SSS");
		trimList(r);
		System.out.println(r);

		List<Person> roster = new ArrayList<>();
		roster.add(new Person("Pat", Person.Sex.MALE));
		roster.add(new Person("Patty", Person.Sex.FEMALE));
		roster.add(new Person("Patrick", Person.Sex.MALE));
		roster.add(new Person("Patricia", Person.Sex.FEMALE));
		roster.stream().filter(e -> e.getGender() == Person.Sex.MALE).forEach(e -> System.out.println(e.getName()));
	}

	public static void trimList(List<String> strings){
		ListIterator<String> iter = strings.listIterator();
		while(iter.hasNext()){
			String curr = iter.next();
			iter.set(curr.trim());
		}
	}


}