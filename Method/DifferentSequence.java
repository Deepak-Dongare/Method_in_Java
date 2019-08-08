package Method;
class DemoDiee{
	
	void method(int a, char c ){
		
		System.out.println(a);
		System.out.println(c);
		
		
	}
	 void method (char c,int a){
		 System.out.println(c);
		 System.out.println(a);
		
		
	}
}

public class DifferentSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoDiee e=new DemoDiee();
		e.method(12,'c');
		e.method('c',12);

	}

}
