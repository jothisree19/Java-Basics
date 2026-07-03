package practice_java;

public class arithmetic {

	public static void main(String[] args) {
		int a =10,b=10,c;
		b=a++ + ++a; //mixed increment
		
		
		int result=a++ + a++ + ++a; //tricky
		System.out.println(result);		
		
		
		int rose = a++ * 2 + ++a;
		System.out.println(rose);// TODO Auto-generated method stub

	}

}
