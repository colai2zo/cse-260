public class TestMatrix{
	public static void main(String[] args){
		Complex[][] c1 = { {new Complex(1,1), new Complex(2,2), new Complex(3,3)},
						   {new Complex(1,1), new Complex(2,2), new Complex(3,3)},
						   {new Complex(1,1), new Complex(2,2), new Complex(3,3)} };

		Complex[][] c2 = { {new Complex(1,2), new Complex(2,3), new Complex(3,4)},
						   {new Complex(1,0), new Complex(2,1), new Complex(3,2)},
						   {new Complex(0,0), new Complex(2,2), new Complex(4,4)} };

		ComplexMatrix c = new ComplexMatrix();
		c.printResult(c1,c2,c.addMatrix(c1,c2),'+');
		System.out.println("\n");
		c.printResult(c1,c2,c.multiplyMatrix(c1,c2),'*');

	}
}