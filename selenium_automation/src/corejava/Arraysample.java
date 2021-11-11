package corejava;

public class Arraysample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//array can store multiple values in containarised format
		
		String abc="Hi all";
		// array can store multiples values in a containerised format
		String[] bcd = {"Hi All","how are","you","automation"};
		//index count starts from 0,1,2,3....
		System.out.println(bcd[2]);
		for (int i=0 ;i< bcd.length; i++) {
			System.out.println(bcd[i]);
		}
		//display length of array
		System.out.println(bcd.length);
		//out of bound array exception
		System.out.println(bcd[5]);
		
	}

}
