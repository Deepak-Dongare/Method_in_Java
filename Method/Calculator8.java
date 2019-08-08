package Method;

class calculator1
{
	
	int calculateSum( int a,int b){
		
		
		int c=a+b;
		return c;
			
	}
	
	int calculateDiff(int a,int b) {
		int c=a-b;
		return c;
		
	}
	
	} 
public class Calculator8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator1 c=new calculator1();
		int  s=c.calculateSum(20,30);
		System.out.println(s);
		int d=c.calculateDiff(50,40);
		System.out.println(d);
	

	}

}
