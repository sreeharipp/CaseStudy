package ramess;
import java.util.Scanner;
public class Sreehari
{
	private 
	 String name;
	 String address;
	 String contactNumber;
	 String email;
	 String proofType;
	 String proofID;
	 public Sreehari(String name,String address,String contactNumber,String email,String proofType, String proofID)
	 {
	   this.name=name;
	   this.address=address;
	   this.contactNumber=contactNumber;
	   this.email=email;
	   this.proofType=proofType;
	   this.proofID=proofID;
	 }
	 void Register()
	{
		int count=0;
	    System.out.print("Thank you for registering.your id is "+ ++count+"..");
	}
		
	public static void main(String args[])
	{
		String name;
		 String address;
		 String contactNumber;
		 String email;
		 String proofType;
		 String proofID;
		 Scanner s=new Scanner(System.in);
			System.out.println("Registration");
			System.out.println("Enter your name");
		     name=s.nextLine();
		     System.out.println("Enter your address");
		     address=s.nextLine();
		     System.out.println("Contact Number");
		     contactNumber=s.nextLine();
		     System.out.println("E-Mail ID");
		     email=s.nextLine();
		     System.out.println("Enter proof type");
		     proofType=s.nextLine();
		     System.out.println("Enter proof id");
		     proofID=s.nextLine();
		Sreehari  obj=new Sreehari(name,address,contactNumber,email,proofType,proofID);
		obj.Register();
		s.next();
		
		
	}

}
