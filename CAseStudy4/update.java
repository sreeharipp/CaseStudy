package ramess;
import java.util.*;

public class update {
	String name;
	String address;
	String contactnumber;
	String email;
	String prooftype;
	String proofid;

	update(String name,String address,String contactnumber,String email,String prooftype,String proofid)
	{
		this.name=name;
		this.address=address;
		this.contactnumber=contactnumber;
		this.email=email;
		this.prooftype=prooftype;
		this.proofid=proofid;
	}
	void updateemail()
	{
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("Update Email ID");
		System.out.println("Enter new Email ID");
		this.email=s.nextLine();
		System.out.println("Email updated");
		System.out.println("Your details are as follows");
		System.out.println("Name: "+this.name);
		System.out.println("Address: "+this.address);
		System.out.println("Contact Number: "+this.contactnumber);
		System.out.println("E-Mail ID: "+this.email);
		System.out.println("Proof type: "+this.prooftype);
		System.out.println("Proof id: "+this.proofid);
	}

	static public void main(String[] args)
	{
		
	}
}
