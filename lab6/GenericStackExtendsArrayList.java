import java.util.ArrayList;
public class GenericStackExtendsArrayList<E> extends ArrayList<E>{
	public boolean isEmpty(){
		return super.isEmpty();
	}
	public int getSize(){
		return size();
	}
	public Object peek(){
		return get(getSize() - 1);
	}
	public Object pop(){
		Object o = peek();
		remove(o);
		return o;
	}
	public E push(E o){
		super.add(o);
		return(o);
	}
	public int search(E o){
		return indexOf(o);
	}
	public String toString(){
		return "Stack: " + super.toString();
	}
}