
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare rational numbers
		RationalNumber r1 = new RationalNumber(5,4);
		RationalNumber r2 = new RationalNumber(4,5);
		RationalNumber r3 = new RationalNumber(7,7);
		RationalNumber r4 = new RationalNumber(5,5);
		RationalNumber r5 = new RationalNumber(10,8);
		RationalNumber r6= new RationalNumber(164,57);
		RationalNumber r7 = new RationalNumber(164,57);
		
		
		//test rational numbers
		System.out.println(r1.compareTo(r2));
		System.out.println(r2.compareTo(r3));
		System.out.println(r3.compareTo(r2));
		System.out.println(r3.compareTo(r4));
		System.out.println(r1.compareTo(r5));
		System.out.println(r6.compareTo(r7));
		System.out.println(r4.compareTo(r7));
		
	}//end main

}//end application
