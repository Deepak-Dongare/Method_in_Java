package Method;

class method{
	int height=10, length=20, breadth=30;
	 void calculate(){
		
		 int volume=length*breadth*height;
		 System.out.println("::"+volume);
	 }
	 
}
public class calculatevolumwithvoidreturntype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method m=new method();
		m.calculate();

	}

}
