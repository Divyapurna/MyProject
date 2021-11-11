package corejava;

public class Oops_inheritance_C {
 
	
	public static void mul() {
		int a = 10;
		int b = 50;
		System.out.println("The multiplication of the mumbers " +(a*b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Classname refernve name = new classname();
		Oops_Inheritance_B abc = new Oops_Inheritance_B();
		mul();
//		add();
//		sub();
		abc.add();
		abc.sub();
	}

}
