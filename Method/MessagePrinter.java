package Method;

class Printer{
    
	void printMessage(String a){
	//String b;//local variable not be  Intialize
	//	a=b;
		
		System.out.println( a);
		
		
	}
}

public class MessagePrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Printer p=new Printer();
		p.printMessage("Deepak");

	}

}
