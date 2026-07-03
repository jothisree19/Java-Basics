package practice_java;

public class rec {
	int length;
	int bredth;
	
	 int cal() {
		int area;
		area=length * bredth;
		return area;
		
	}
public static void main(String args[]) {
	rec r = new rec();
	r.length=200;
	r.bredth=300;
	int val= r.cal();
	System.out.println("val of rec:"  + val);
}

}
