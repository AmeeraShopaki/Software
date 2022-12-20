package t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;
public class Company {
	ArrayList<String>companytName = new ArrayList<String>();
	ArrayList<Long>companyMobileNumber = new ArrayList<Long>();
	ArrayList<String>companyLocation= new ArrayList<String>();
	
	private static final String REGISTRATION_IS_SUCCESSFULL = "Registration is Successfull.";
	
	
	static Scanner sc =new Scanner(System.in);

	static Logger l = Logger.getLogger(AppointmentTest.class.getName());

	void companiesRegPage() throws InterruptedException, IOException {
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		l.info("\n");
		l.info("\t\t | welcome admain in  ");
		l.info("\t\t | Companies and drug providers Registration Page!|");
		l.info("\n");
	}
	
	void companycheack() throws InterruptedException {

		int i=0;
		long mno;
		

		boolean flag1=true;
		
		Long mobileNumber;
		if(companyMobileNumber.isEmpty())
		{
		
			 l.info(REGISTRATION_IS_SUCCESSFULL);
			
			Thread.sleep(900);
			flag1=false;
						
		}
		else 
		{
			for(i=0;i<=companyMobileNumber.size()-1;i++)
			{
				mno=companyMobileNumber.get(i);
			
			}
			if(flag1==true)
			{
			
				l.info(REGISTRATION_IS_SUCCESSFULL);
			Thread.sleep(900);
			}
			else 
			{
				l.info("SAME_MOBILE_NUMEBR_IS_NOT_ALLOWED");
				Thread.sleep(500);
			}
		}
	}
	void companiesInfo() {
		l.info("Please enter Company name");
	companytName.add(sc.nextLine());
		l.info("enter Company location: ");
		companyLocation.add(sc.nextLine());
		l.info("Please enter Company Mobile number");
	
	}
	
}
