package t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;


public class Doctor {
	   AppointmentTest A=new AppointmentTest();
	  Admin ad =new Admin();
	   Patient P=new Patient();
	   Company C = new Company();

	static Logger l = Logger.getLogger(AppointmentTest.class.getName());


static int count=0;
static Scanner sc=new Scanner(System.in);
ArrayList<String> doctorName = new ArrayList<String>();
ArrayList<String> doctorGender = new ArrayList<String>();
ArrayList<String> doctorPassword = new ArrayList<String>();
ArrayList<Integer> doctorAge = new ArrayList<Integer>();
ArrayList<Long> doctorMobileNumber = new ArrayList<Long>();
ArrayList<String> doctorCity = new ArrayList<String>();
ArrayList<Long>mobileNumberD = new ArrayList<Long>();
ArrayList<Byte>doctorID = new ArrayList<Byte>();

boolean flagn=false;
boolean flagp=false;
boolean fa=true;
boolean flag;
int choice;

String n;

void dataAdd() {
	doctorName.add("Dr.Sawsan");
	doctorName.add("Dr.Haya");
	doctorName.add("Dr.Ahmad");
	doctorGender.add("F");
	doctorGender.add("F");
	doctorGender.add("M");
	doctorPassword.add("s123");
	doctorPassword.add("h123");
	doctorPassword.add("a123");
	doctorAge.add(29);
	doctorAge.add(39);
	doctorAge.add(33);
	doctorMobileNumber.add(9726132L);
	doctorMobileNumber.add(9729642L);
	doctorMobileNumber.add(9721643L);
	doctorCity.add("ramallah");
	doctorCity.add("salfet");
	doctorCity.add("nablus");
}	

void doctor() throws Exception {
	
	boolean flag99=true;
	while(flag99)
	{

		
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

	
		l.info("\t\t | WELCOME TO DOCTOR PAGE! |");
		
		l.info(" ");
		

		l.info("1.Login  \t 2.Registration  3.Exit");
		choice=sc.nextInt();

		switch(choice)
		{
		case 1:
		
				flag99=false;
				doctorenter();
				doctorAuthorietes();

			break;
		case 2:
			 doctorRegPage();	
			doctorInfo();
			doctorCheck();
			 flag99= false;
			break;
		case 3:
			{
			System.exit(0);}
			break;
		default:
			l.info("Entered Wrong choice..");
			
		}
	}	

}


void doctorInfo() {

	doctorName.add(sc.next());


	
}
void doctorRegPage() throws InterruptedException, IOException {
	new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	l.info(""); l.info("");
	l.info("\t\t __________________________________");
	l.info("\t\t|                                  |");
	l.info("\t\t| This is doctor registration Page |");
	l.info("\t\t|__________________________________|");
	l.info("");
}
void doctorCheck() throws InterruptedException {
	int i=0;

	boolean  flag1=true;
				
		long mno;

			
			
				for(i=0;i<=doctorMobileNumber.size()-1;i++)
				{
					mno=doctorMobileNumber.get(i);
					
						
				}
				if(flag1==true)
				{

					
							l.info("Enter age:");
							doctorAge.add(sc.nextInt());
							l.info("Enter City: ");
							doctorCity.add(sc.next());
					
							doctorPassword.add(sc.next());
						
							l.info("Details: Name: "+doctorName+" number:"+doctorMobileNumber);
							Thread.sleep(900);

				}
				else {
				
					int index=doctorName.size()-1;
					doctorName.remove(index);
					Thread.sleep(500);

				}

}

void doctorcheck() {
	int i=0;
		


	for(i=0; i<=doctorName.size()-1;i++)
	{
		
		if((doctorName.get(i)).equals(n))
		{
			flag=true;
			break;
		}
	}
}

void doctorenter() {
	l.info("Enter your Username");
	n=sc.next();

	
}
void doctorAuthorietes() throws Exception {
	int i=0;
		boolean flag=false;
		byte choice;

	for(i=0; i<=doctorName.size()-1;i++)
	{
		
		if((doctorName.get(i)).equals(n))
		{
			flag=true;
			break;
		}
	}
	
		if(flag==true)
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			l.info("");	 l.info("");
			l.info("\t\t ________________________________________");
			l.info("\t\t|                                        |");
			l.info("\t\t| Welcome Doctor "+doctorName.get(i)+"        |");
			l.info("\t\t|________________________________________|");
			l.info("");
			l.info("\n\n 1.see your Appointments.   2.see your Patient Feedback.  3.EXIT \n");
			choice=sc.nextByte();
			byte j=0;
			switch(choice)
			{
			case 1:
				if((doctorID.isEmpty()!=true))
				{
					while(j<=doctorID.size()-1)
					{


						if( (i+1)== doctorID.get(j) )
						{ l.info((j+1)+". "); 
						
						l.info("Patient "+P.patientNameBooking.get(j) +" was booked in :"+P.patientBookingDate.get(j));
					
						l.info(P.patientNameBooking.get(j) +"'s phone number: "+P.patientPhoneBooking.get(j) );
						l.info("");
							j++;
							
						}
					}
					Thread.sleep(500);
					
				}
				if((doctorID.isEmpty()==true))
					{
					l.info("No Appointments...!");
						Thread.sleep(3000);
						
						
				
						break;	}break;
			
			
			case 2:
				if((doctorID.isEmpty()!=true))
				{
					while(j<=doctorID.size()-1)
					{


						if( (i+1)== doctorID.get(j) )
						{System.out.println(j);
						l.info("patient name: "+P.patientNameFeedback.get(j) );
							l.info(P.patientNameFeedback.get(j)+"Feedback :"+P.feedback.get(j) );
							l.info("");
							j++;
							
						}
					}
					Thread.sleep(4000);
					
				}
				if((doctorID.isEmpty()==true))
					{
					l.info("No Feedback Yet...!");
						Thread.sleep(3000);
						
				
						break;	}
				
			case 3 :
	
			System.exit(0);
			break;
			
			default :  l.info("wrong choice ! ");

			}
			}	else 
			{
				l.info("Login unsuccessfull..");
			Thread.sleep(900);
			
			}
			

			

	new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

	l.info("1.DOCTOR  2.PATIENT   3.ADMIN   4.EXIT ");
	int cho=sc.nextInt();
	switch(cho)
	{
		case 1:
			doctor();
			flag=true;
			break;
			case 2:
			P.patient();										
			flag=true;
			break;
			case 3:
			
			ad.admin();
			flag= true;
			break;
		
				
				default:
				{
					
					System.exit(0);}

}	
		}


void doctorRegistration() throws Exception
{

	int i=0;
	long mobileNumber;
		
			boolean flag1=true;
				
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		l.info("");l.info("");
		l.info("\t\t __________________________________");
		l.info("\t\t|                                  |");
		l.info("\t\t| This is doctor registration Page |");
		l.info("\t\t|__________________________________|");
		l.info("");
		
	
		doctorName.add(sc.nextLine());

		l.info("Please enter your Mobile number");
		mobileNumber=(sc.nextLong());
		
		long mno;

			if(doctorMobileNumber.isEmpty())
				{
					doctorMobileNumber.add((mobileNumber));
				
						doctorPassword.add(sc.next());
						
						Thread.sleep(900);
						flag1=false;
			
					
				}
			else 
			{
				for(i=0;i<=doctorMobileNumber.size()-1;i++)
				{
					mno=doctorMobileNumber.get(i);
					
					if(mno==mobileNumber)
					{
						
						flag1=false;
						break;
					}
						
				}
				if(flag1==true)
				{

							doctorMobileNumber.add(mobileNumber);
							l.info("Enter age:");
							doctorAge.add(sc.nextInt());
							l.info("Enter City: ");
							doctorCity.add(sc.next());
					
							doctorPassword.add(sc.next());
						
							l.info("Details: Name: "+doctorName+" number:"+doctorMobileNumber);
							Thread.sleep(900);

				}
				else {
			
					int index=doctorName.size()-1;
					doctorName.remove(index);
					Thread.sleep(500);

				}

			}
}


}
