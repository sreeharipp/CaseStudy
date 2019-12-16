package ramess;
import java.util.Scanner;
public class Sreehari2 {
	 String name;
	 String address;
	 String contactNumber;
	 String email;
	 String proofType;
	 String proofID;
	 static int count=0;
	public static void main(String args[])
	{
		 String name;
		 String address;
		 String contactNumber;
		 String email;
		 String proofType;
		 String proofID;
		 char ch,c;
		 @SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
			do{
				
			System.out.println("Registration");
			System.out.println("Enter your name");
		    name=s.next();
		     System.out.println("Enter your address");
		     address=s.next();
		     System.out.println("Contact Number");
		     contactNumber=s.next();
		     System.out.println("E-Mail ID");
		     email=s.next();
		     System.out.println("Enter proof type");
		     proofType=s.next();
		     System.out.println("Enter proof id");
		     proofID=s.next();
		     System.out.print("Thank you for registering.your id is "+ ++count+"..");
		System.out.println("Do you want to continue registration?(y/n)");
	  ch=s.next().charAt(0);
			}while(ch=='y');
		update ob=new update(name,address,contactNumber,email,proofType,proofID);
		System.out.println("Do you want to update E mail Id(y/n)");
		c=s.next().charAt(0);
		switch(c) {
		case 'y':
		ob.updateemail();
		break;
		case 'n':
			break;
		}
	}

}
