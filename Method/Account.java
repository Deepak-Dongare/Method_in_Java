package Method;

import java.util.Scanner;

class AccountDemo{ 
	int acc_no; 
	String name;
	float amount; 
	
	void insert() {
		
		System.out.println("Eneter Acc_holder name");
		Scanner sc=new Scanner(System.in);
		String acc_no =sc.next();
		System.out.println("Enter Acc_Number");
		int name=sc.nextInt();
		System.out.println("Enter Amount ");
		int amount=sc.nextInt();
		
		
	}
	void display() {
		
		System.out.println( acc_no);
		System.out.println(name);
		System.out.println(amount);
		
		
	}
	 void deposit(){
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter mony ");
		  long deosit=sc.nextLong();
		float deposit=amount+deosit;
		
		
		
		
		
	} 
	
	
	
}


public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountDemo ad=new AccountDemo();
	//	ad.insert();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("insert amount");
		float u=sc.nextInt();
	//	ad.insert(u);

	}

}
