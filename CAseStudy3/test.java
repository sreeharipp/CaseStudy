package ramess;

 
import java.util.Scanner;
public class test {
	static test2 obj=new test2();
	Scanner s=new Scanner(System.in);
	void checkstatus()
	{
		System.out.println("Check Status.");
		System.out.println("Enter room number");
		int k=s.nextInt();
		if(obj.a[k-1]==1)
		{
			System.out.println("Room number "+k+" is booked");
		}
		else
			System.out.println("Room number "+k+" is not booked");
	}
	public static void main(String args[])
	{
		test o=new test();
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		int c;
		do
		{
		System.out.println("Menu");
		System.out.println("1.Booking");
		System.out.println("2.Check Status");
		System.out.println("3.Exit");	
	     c=s.nextInt();
		switch(c)
		{
		case 1:
			String ac=" ";
			String cot=" ";
			String cable=" ";
			String wifi=" ";
			String laundry=" ";
			obj.booking(ac,cot,cable,wifi,laundry);
			break;
		case 2:
			o.checkstatus();
			break;
		case 3:
			System.exit(0);
			break;
			default:
				System.out.print("Invalid Input");
		}
		}while(c!=3);
		
	}
		
			
			
		}

	



