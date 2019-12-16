package ramess;


import java.util.*;

public class Main1 {
	static int count=0;
	 static int id[]=new int[25];
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		 String name;
		 String address;
		 String contactNumber;
		 String email;
		 String proofType;
		 String proofID;
		 String ac=" ";
		 String cot=" ";
		 String cable=" ";
		 String wifi=" ";
		 String laundry=" ";
		 int date=0;
		
		 char c,ch;
		 Scanner s=new Scanner(System.in);
		 do
		 {
			System.out.println("Registration");
			s.nextLine();
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
		     System.out.println("Thank you for registering.Your Id is"+ ++count);
		     id[count-1]=count;
		     System.out.println("Do you want to book a room?(y/n)");
		     c=s.next().charAt(0);
		     switch(c) {
		     case 'y':
		    	 book obj=new book();
		    	 obj.booking(ac, cot, cable, wifi, laundry,date);
		    	 break;
		     case 'n':
		    	 break;
		     }
		     System.out.println("Do you want to continue registration?(y/n)");
		    	ch=s.next().charAt(0); 
		     }while(ch=='y');
		 viewbooking abc=new viewbooking();
		 abc.view();
	}

}
