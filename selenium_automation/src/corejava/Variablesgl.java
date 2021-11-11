package corejava;

public class Variablesgl {
	//Global variables
	 static int a = 100;
	static int b = 50;
	public static void add() {
		//local variables
		byte a= 50;
		int b = 20;
		System.out.println(" The addition of numbers is " + ( a + b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The mitlipication of numbers is " + ( a * b));
		add() ;
	}

}
