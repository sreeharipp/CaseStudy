package ramess;
import java.util.*;
public class viewbooking {
	int sdate;
	int edate;
	String ac=" ";
    String cot=" ";
    String cable=" ";
    String wifi=" ";
    String laundry=" ";
    int date=0;
    int count=0;
	Main1 o=new Main1();
	book b=new book();
void view()
{
	Scanner s=new Scanner(System.in);
	System.out.println("VIEW ALL BOOKINGS");
	System.out.println("Enter the start date");
	sdate=s.nextInt();
	System.out.println("Enter the last date");
	edate=s.nextInt();
	int i;
	System.out.println("ROOM NUMBER			CUSTOMER ID");
	for(i=0;i<25;i++)
	{
	if(book.d[i]>=sdate&&book.d[i]<=edate)
	{
		System.out.print(book.r[i]+" ");
		System.out.println(Main1.id[i]);
	}
	}
}
public static void main()
{
	
}
}
