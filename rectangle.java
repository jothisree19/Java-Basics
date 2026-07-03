package practice_java;

public class rectangle {
	int length;
	int bredth;


rectangle(){
	length=0;
	bredth=0;
}
rectangle(int length){
	this.length=length;
	this.bredth=length;
}
rectangle(int length,int bredth){
	this.length=length;
	this.bredth=bredth;
}
int area() {
	int rec;
	rec=length*bredth;
	return rec;
}
	
public static void main(String[]args) {
	rectangle r1 = new rectangle();
	rectangle r2 = new rectangle(10);
	rectangle r3 = new rectangle(10,20);
	
	System.out.println("Area r1: " + r1.area());
    System.out.println("Area r2: " + r2.area());
    System.out.println("Area r3: " + r3.area());
	
}
}
