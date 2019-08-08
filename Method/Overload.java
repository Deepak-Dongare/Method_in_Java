package Method;

import java.util.Scanner;

class OverloadDemo{
	
	void add() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		
		
	}
	void add(float a) {
		System.out.println( a);
		
	}
	int  add(int a) {
		//int a=10,
			int 	b=20;
		int c=a+b;
		return c;
	}
	void add(int a,int b) {
		
		
		int c=a+b;
		System.out.println(c);
		}
	float add(float a,float b) {
		
		float c=a+b;
		return c;
	}
	}
	

public class Overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner sc=new Scanner(System.in); System.out.println("Enter value"); int
		 * a=sc.nextInt(); System.out.println("Enter value"); float b=sc.nextInt();
		 * float c=sc.nextInt();
		 */
		OverloadDemo o=new OverloadDemo();
		o.add();
	//	int e=o.add(a);
		
	//	System.out.println(e);
		o.add(10,20);
	//	float f=o.add(b,c);
	//	System.out.println(f);
		
		
	}

}
