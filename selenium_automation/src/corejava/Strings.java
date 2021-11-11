package corejava;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String abc;
		abc = "Hil everyone, are you all fine?";
		String a;
		a = "1595656 ";
		
		String b = " SeleNiuM";
		String c = " Atomation";
		
		String d = abc+ c ;
		
		System.out.println(d);
		System.out.println(" Uppercase of these is " + d.toUpperCase());
		System.out.println(  " Lowercase is " + d.toLowerCase());
		
		// length starts from 1 count
		// index starts count from 0 count
		System.out.println(b.length());
		System.out.println(b.charAt(5));
		
		String e = "Apple" ;
		String f = "apple" ;
		//equals compares two stings length wise, decimal wise, upper and lower case wise
		if (e.equals(f)) { 
			System.out.println(" both are matching");
		}else { 
			System.out.println("both are not matching");
		}
		// equalsIgnore case onlu compares length wise and decimal wise// and skip checking upper and lower case
		//system will convert upper case into lower case while comparing strings
		}
	}
