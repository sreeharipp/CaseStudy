package ramess;

public class viewcustomer {
public static void viewc(Main obj[],int n)
{    int i;
	System.out.println("Customers list");
	System.out.println("The registered customers are");
	System.out.println("Customer ID	    Customer name");
	for(i=0;i<n;i++)
	{
		System.out.print(Main.id[i]+"\t\t\t");
		System.out.println(obj[i].name);
	}
}
}
