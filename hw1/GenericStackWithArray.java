// Joey Colaizzo, 111554364
public class GenericStackWithArray<E>{
    private Object[] arr = new Object[1];
    private int size = 0;
    public int getSize() {
        return size;
    }
    public E peek() {
        if(!isEmpty()){
            return (E)arr[size - 1];
        }
        else return null;
    }
    public void push(E o) {
        if(size == arr.length){
            Object[] expandedArr = new Object[arr.length * 2];
            System.arraycopy(arr, 0, expandedArr, 0, getSize());
            arr = expandedArr;
        }
        arr[size] = o;
        size++;
    }
    public E pop() {
        if(!isEmpty()){
            E o = (E)arr[getSize() - 1];
            arr[getSize() - 1] = null;
            size--;
            return o;
        }
        return null;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    @Override // Java annotation: also used at compile time to
    public String toString() { // detect override errors
        return "Stack: " + java.util.Arrays.toString(arr);
    }
}