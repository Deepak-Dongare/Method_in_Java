package Method;
class Method2
{
	double add(int a,int b) {
		double c=a+b;
		return c;
	}
	double sub(int a,int b){
		double c=a-b;
		return c;
		
	}
	double mul(int a,int b){
		double c=a*b;
		return c;
		
	}
	double div(int a,int b) {
		double c=a/b;
		return c;
	}
	
	}
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method2 m=new Method2();
		double a=m.add(20,10);
		System.out.println(a);
		double b=m.sub(30,10);
		System.out.println(b);
		double c=m.mul(10,10);
		System.out.println(c);
		double d=m.div(40,10);
		System.out.println(d);
		

	}

}
