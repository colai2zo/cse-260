public class MyInteger{
	int value;
	MyInteger(int val){
		value = val;
	}
	int value(){
		return value;
	}
	boolean isEven(){
		return value %2 == 0;
	}
	boolean isOdd(){
		return !isEven();
	}
	boolean isPrime(){
		for(int i = 0 ; i <= Math.sqrt(value) ; i++)
			if((double)(value / i) == value / i)
				return true;
		return false;
	}
	static boolean isEven(int i){
		return (new MyInteger(i)).isEven();
	}
	static boolean isOdd(int i){
		return (new MyInteger(i)).isOdd();
	}
	static boolean isPrime(int i){
		return (new MyInteger(i)).isPrime();
	}
	public boolean equals(MyInteger other){
		return value == other.value;
	}
	public static int ParseInt(String i){
		int j;
		for(j = 0; i.length() > 0; j += Math.pow(10, i.length()) * (i.charAt(0) - 48),  i = i.substring(1, i.length()));
		return j;
	}
	public static void main(String[] args){
		System.out.println(MyInteger.ParseInt("283573"));
	}
}