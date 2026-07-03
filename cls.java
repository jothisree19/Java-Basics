
package practice_java;

public class cls {
	int a;
	int b;
	
	int addition() {
		int add;
		add= a+b;
		return add;
	}
	
	int subtract() {
		int sub;
		sub=a-b;
		return sub;
	}
public static void main (String[] args) {
	cls c1 = new cls();
	c1.a=100;
	c1.b=20;
	int sum=c1.addition();
	int sub=c1.subtract();

	System.out.println("addition " + sum);
	System.out.println("subtraction " + sub);

	
	
	
	
}
}
