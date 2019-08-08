package Method;
class DemoBox{
	
	int height, width, depth;
	
	double volume(){
		height=10;
		width=20;
		depth=30;
		double volume =height*width*depth;
		return volume;
		
		
	}
}

public class Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DemoBox bx=new DemoBox();
		double a=bx.volume();
		System.out.println(a);
		
	}

}
