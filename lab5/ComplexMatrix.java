public class ComplexMatrix extends GenericMatrix<Complex>{
	protected Complex add(Complex o1, Complex o2){
		return new Complex(o1.a + o2.a, o1.b + o2.b);
	}

	protected Complex multiply(Complex o1, Complex o2){
		return new Complex(o1.a * o2.a - o1.b * o2.b, o1.b * o2.a + o1.a * o2.b);
	}

	protected Complex zero(){
		return new Complex(0,0);
	}
}