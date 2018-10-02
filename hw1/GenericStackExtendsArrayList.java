// Joey Colaizzo, 111554364
import java.util.ArrayList;
public class GenericStackExtendsArrayList<E> extends ArrayList<E> {
    public int getSize() {
        return size();
    }
    public E peek() {
        if(!isEmpty()){
            return get(getSize() - 1);
        } 
        return null;
    }
    public void push(E o) {
        add(o);
    }
    public E pop() {
        if(! isEmpty()){
            E o = remove(getSize() - 1);
            return o;
        }
        return null;
    }
    public boolean isEmpty() {
        return super.isEmpty();
    }
    @Override // Java annotation: also used at compile time to
    public String toString() { // detect override errors
        return "Stack: " + super.toString();
    }
}