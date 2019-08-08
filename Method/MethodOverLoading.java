package Method;

import java.util.Scanner;

class OverLoading{
	
	
	int  add() {
		int a=10,b=20;
		int add=a+b;
		//System.out.println(add);
		return add;
		
	}
	float  add(float a,int  b ) 
	{
		float c=a+b;
		//System.out.println(c);
		return c;
	}
}
public class MethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoading ov=new OverLoading();
		int x=ov.add();
		System.out.println(x);
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		float c=ov.add( a,b);
		System.out.println(c);
		
		
	}

}
