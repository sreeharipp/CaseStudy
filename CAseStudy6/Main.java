package ramess;

import java.util.Scanner;

public class Main {
	 static int count=0;
	 String name;
	 String address;
	 String contactNumber;
	 String email;
	 String proofType;
	 String proofID;
	 static int id[]=new int[25];
		public static void main(String args[])
		{
			 
			 char ch;
			 Main obj[]=new Main[25];
			 int i=0;
			 @SuppressWarnings("resource")
			Scanner s=new Scanner(System.in);
				do{
					obj[i]=new Main();
				System.out.println("Registration");
				System.out.println("Enter your name");
			    obj[i].name=s.next();
			     System.out.println("Enter your address");
			     obj[i].address=s.next();
			     System.out.println("Contact Number");
			     obj[i].contactNumber=s.next();
			     System.out.println("E-Mail ID");
			     obj[i].email=s.next();
			     System.out.println("Enter proof type");
			     obj[i].proofType=s.next();
			     System.out.println("Enter proof id");
			     obj[i].proofID=s.next();
			     System.out.print("Thank you for registering.your id is "+ ++count+"..");
			     id[i]=count;
			System.out.println("Do you want to continue registration?(y/n)");
		  ch=s.next().charAt(0);
		  i++;
				}while(ch=='y');
				
		viewcustomer.viewc(obj,i);
		System.out.println("Thank You");

}
}