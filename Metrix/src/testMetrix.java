
public class testMetrix {

	public static void main(String[] args) {
		
		MetrixClass mt = new MetrixClass();
		mt.PrintMe();
		
		System.out.println();
		mt.RotateR();
		mt.PrintMe();
		
		System.out.println();
		mt.RotateL();
		mt.RotateL();
		mt.PrintMe();
	}
}
