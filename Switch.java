package practice_java;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		int a,b;
		
		Scanner Scanner = new Scanner(System.in);
		System.out.println("enter a number");
		 a=Scanner.nextInt();
		System.out.println("enter b value");
		 b=Scanner.nextInt();
		char operator;
		System.out.println("enter a operator +,-,*,/ or %");
		operator=Scanner.next().charAt(0);
		
		switch(operator) {
		case'+':
			System.out.println(a + "+" + b + "="+ (a+b));
			break;
		case'-':
			System.out.println(a + "-" + b + "="+ (a-b));
			break;

		case'*':
			System.out.println(a + "*" + b + "="+ (a*b));
			break;

		case'%':
			System.out.println(a + "%" + b + "="+ (a%b));
			break;

		case'/':
			System.out.println(a + "/" + b + "="+ (a/b));
			break;
			
			default:
				System.out.println("invalid");
		}
	}


				




			
		

			
			
		
		
		
		
		// TODO Auto-generated method stub

	}

}

		// TODO Auto-generated method stub

	}

}
