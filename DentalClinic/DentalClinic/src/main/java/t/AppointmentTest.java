package t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;



public class AppointmentTest{
	private static final String ENTER_CORRECT_INPUT = "\n enter correct input..";
	static Logger l = Logger.getLogger(AppointmentTest.class.getName());
private static final String PLEASE_ENTER_YOUR_NAME = "Please enter your name";
private static final String YOU_ADDED_FEEDBACK_SUCCESSFUL = "\n You Added Feedback Successful..";
private static final String ENTER_YOUR_FEEDBACK = " Enter your Feedback: \t";
private static final String ENTER_YOUR_NAME2 = "\n Enter your name: \t";
private static final String WELCOME = "\n Welcome ";
private static final String BOOK_APPOINTMENT = "\t\t |     Book Appointment    |";
private static final String SAME_MOBILE_NUMEBR_IS_NOT_ALLOWED = "same mobile numebr is not allowed\n";
private static final String REGISTRATION_IS_SUCCESSFULL = "Registration is Successfull.";
private static final String ENTER_PASSWORD = "Enter password";
private static final String ADMINPASS123 = "adminpass123";
private static final String ADMIN = "admin";
private static final String ENTER_YOUR_PASSWORD = "Enter your Password";
private static final String ENTER_YOUR_NAME = "Enter your name";
private static final String T = "\t\t |_________________________|";
private static final String X = "\t\t |                         |";
private static final String S = "\t\t  _________________________";
private static final String R = "YOU LOG OUT FROM THE SYSTEM :) ";
static int count=0;
static Scanner sc=new Scanner(System.in);
ArrayList<String> doctorName = new ArrayList<String>();
ArrayList<String> doctorGender = new ArrayList<String>();
ArrayList<String> doctorPassword = new ArrayList<String>();
ArrayList<Integer> doctorAge = new ArrayList<Integer>();
ArrayList<Long> doctorMobileNumber = new ArrayList<Long>();
ArrayList<String> doctorCity = new ArrayList<String>();
ArrayList<Integer>patientAge = new ArrayList<Integer>();
ArrayList<String>patientName = new ArrayList<String>();
ArrayList<String>patientGender = new ArrayList<String>();
ArrayList<String>patientPassword = new ArrayList<String>();
ArrayList<String>patientConfirmPassword = new ArrayList<String>();
ArrayList<Long>patientMobileNumber = new ArrayList<Long>();
ArrayList<String>feedback= new ArrayList<String>();
ArrayList<String>companytName = new ArrayList<String>();
ArrayList<Long>companyMobileNumber = new ArrayList<Long>();
ArrayList<String>companyLocation= new ArrayList<String>();
ArrayList<String>servicetName = new ArrayList<String>();
ArrayList<Integer>disc = new ArrayList<Integer>();
ArrayList<Integer>cost = new ArrayList<Integer>();
ArrayList<Integer>costAfterDiscount = new ArrayList<Integer>();
ArrayList<String>serviceDescription= new ArrayList<String>();
ArrayList<Long>patientPhoneBooking = new ArrayList<Long>();
ArrayList<String>patientBookingDate = new ArrayList<String>();
ArrayList<String>patientNameBooking = new ArrayList<String>();
ArrayList<Byte>doctorID = new ArrayList<Byte>();
ArrayList<String>patientNameFeedback = new ArrayList<String>();
boolean flagn=false;
boolean flagp=false;
boolean fa=true;
boolean flag;
int choice;
String password;
String name;
String nameP;
String passwordP;
long mobileNumberP;	
int discount;
long mobileNumber;
long mobileNumberD;
String n;
String passwordD;
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
void admin() throws Exception {

	int choice22=0;
	
	boolean flag50=true;
	while(flag50)
	{
		
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

		l.info(S);
		l.info(X);
		l.info("\t\t | WELCOME TO ADMIN PAGE!  |");
		l.info(T);
		l.info(" ");
		

		 l.info("1.Login  \t 2.Exit");
		choice22=sc.nextInt();

		switch(choice22)
		{
		case 1:
			welcomeInLogin();
				flag50=false;
				 enteradmin();
				 adminTrue();
				 if(flagn && flagp) {
					 adminauthorities();
				 }
				 if(flagn && !flagp) 
					 l.info("Unsuccessful login, the  passwprd is not correct");
		    	 if(!flagn&&flagp)l.info("Unsuccessful login, the admin name is not associated with an account"); 
		    	 if(!flagp &&!flagn)l.info("Unsuccessful login, uncorrect admin name & passward"); 

			break;
		
		case 2:
			{l.info(R);
			System.exit(0);}
			break;
		default:
			l.info("Entered Wrong choice..");
			flag=true;
		}
	}	
	
}

public void welcomeInLogin() throws InterruptedException, IOException {
	new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	l.info(S);
	l.info(X);
	l.info("\t\t | Login |");
	l.info(T);
}

public void welcomeInAdminPage() throws InterruptedException, IOException {
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		l.info(S);
		l.info(X);
		l.info("\t\t | WELCOME TO ADMIN PAGE!  |");
		l.info(T);
		l.info(" ");
	}
	
void patient() throws InterruptedException, IOException {

		boolean flag77=true;
		while(flag77)
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			l.info(S);
			l.info(X);
			l.info("\t\t | Welcome to Patient Page!|");
			l.info(T);
			l.info(" ");
			l.info("1.Login \t 2.Registration\n  \t3.Exit");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					if(patientMobileNumber.isEmpty())
					{
						l.info("First register yourself then login..!");
						Thread.sleep(500);
						break;
					}
					else
					{
						welcomeInLogin();
						flag77=false;
						
					}
					patiententer();
					patientAuthorities();
					
					break;
				case 2:
					patientRegPage();
					patienInfo();
					patientcheck();
					flag77=false;
					break;
				
				case 3:{ l.info(R);
				System.exit(0);}
				break;
				default:
					l.info("\nYou entered wrong choice. enter your choice again....!!!");
					
					Thread.sleep(1000);
					break;
			}
		}
	}
	
void doctor() throws Exception {
	
	boolean flag99=true;
	while(flag99)
	{

		
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

		l.info(S);
		l.info(X);
		l.info("\t\t | WELCOME TO DOCTOR PAGE! |");
		l.info(T);
		l.info(" ");
		

		l.info("1.Login  \t 2.Registration  3.Exit");
		choice=sc.nextInt();

		switch(choice)
		{
		case 1:
			welcomeInLogin();
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
			{l.info(R);
			System.exit(0);}
			break;
		default:
			l.info("Entered Wrong choice..");
			
		}
	}	

}
void adminauthorities() throws Exception {
			

		if(flagn&& flagp) {
			while(fa)
			{
				welcomeInAdminPage();
				l.info("\n\n1.Doctor list    2.Patients List    3.Pateints with Appointment \n\n "
				+ "4.Add Companies and drug providers    5.Companies List    6.Add a service or offer \n\n "
				+ "7.Service List    8.Report of the number times  of booking    9.Exit"
				+ "\n\n Enter Your Choice.");
				choice=sc.nextByte();
			
				switch(choice)
				{
				case 1:
					for(int i=0; i<=doctorName.size()-1; i++)
					{
						l.info("Name: \t "+doctorName.get(i));
					
					}
					byte menuCHoice;
					l.info("\n\n1. Main menu\t ");
					menuCHoice=sc.nextByte();
					if(menuCHoice==1)
					{
						fa=false;
						
					}
					else
					{
						break;
					}

					break;

				case 2:
						if(patientName.isEmpty())
						{
							l.info("No Registered Patients yet.");
							Thread.sleep(3000);
							break;
						}
						else 
						{
							for(int i=0; i<=patientName.size()-1; i++)
							{
								l.info((i+1)+".");
								l.info(" [ ");
								l.info("Name :"+patientName.get(i)+"   Phone : "+patientMobileNumber.get(i));
								l.info(" ]");
								l.info(" ");
							}

							l.info("\n\n1. Main menu");
							menuCHoice=sc.nextByte();
							if(menuCHoice==1)
							{
								fa=false;
								
							}
							else
							{
								break;
							}
						}
						
						break;
					
				case 3:
					if(patientNameBooking.isEmpty())
					{
						l.info("\nNo Appointments yet.");
						Thread.sleep(3000);
						break;
					}
					
					else
					{
						for(int i=0; i<=patientNameBooking.size()-1; i++)
						{
							l.info((i+1)+". "); 
					
							l.info("Patient "+patientNameBooking.get(i) +" was booked in :"+patientBookingDate.get(i));
						
							l.info(patientNameBooking.get(i) +"'s phone number: "+patientPhoneBooking.get(i) );
							l.info("");
						}

						Thread.sleep(5000);
						fa=false;

					}
					break;
				case 4:

					CompaniesRegistration();
					fa=false;
					break;
					
					
				case 5:
					if(companytName.isEmpty())
					{
						l.info("No Registered Companyt yet !!");
						Thread.sleep(3000);
						break;
					}
					else 
					{
						for(int i=0; i<=companytName.size()-1; i++)
						{System.err.println((i+1));
						l.info("Company Name    : "+companytName.get(i));
						l.info("Company Location: "+companyLocation.get(i));
							l.info("Mobile Number   : "+companyMobileNumber.get(i));
							l.info("");
						}

						l.info("\n\n1. Main menu");
						menuCHoice=sc.nextByte();
						if(menuCHoice==1)
						{
							fa=false;
							
						}
						else
						{
							break;
						}
					}
					
					break;
				

				case 6:

					serviceRegistration();
					fa=false;
					break;
					
					
				case 7:
					if(servicetName.isEmpty())
					{
						l.info("There are no registered services or offers  yet !!");
						Thread.sleep(3000);
						break;
					}
					else 
					{
						for(int i=0; i<=servicetName.size()-1; i++)
						{
							System.err.println((i+1));
						l.info("Service Name: "+servicetName.get(i));
						l.info("Description : "+serviceDescription.get(i));
						l.info("Discount    : "+disc.get(i));
						l.info("");
						l.info("cost Before Discount: "+cost.get(i));
							float cad=(cost.get(i) - ((float)(disc.get(i)/100.0) * cost.get(i) ) );
							l.info("cost After Discount : "+ cad );
							l.info("");
						}

						l.info("\n\n1. Main menu\t 2. Previous menu");
						menuCHoice=sc.nextByte();
						if(menuCHoice==1)
						{
							fa=false;
							
						}
						else
						{
							break;
						}
					}
					
					break;

				case 8 :
					
					if(count==0) {	l.info(" the number times  of booking in the clinic is: "+count + "\n\n No Appointments yet");}
					else {
						l.info(" the number times  of booking in the clinic  : ");
					System.err.println(count);}
					break;
				case 9:
				{l.info(R);
				System.exit(0);}
				break;
				default:
					l.info("Wrong choice");
						Thread.sleep(1000);
						fa=true;
				}
				Thread.sleep(1500);
				l.info("");l.info("");
				l.info("\n\n1. Main menu\t ");
				int tmenuCHoice=sc.nextByte();
				if(tmenuCHoice==1)
				{
					fa=false;
					
				}
				else
				{
					break;
				}
			
			}
		
		
			
			}
		
	}

public void enteradmin() {

	l.info(ENTER_YOUR_NAME);
		 name = sc.next();
		 l.info(ENTER_YOUR_PASSWORD);
		  password  = sc.next();

	}
void adminTrue() {
		  
		if((name).equals(ADMIN))
		{
		
				flagn=true;}

	if((password).equals(ADMINPASS123)) {flagp=true;}
		


		
		}

	void wrongpass() {
		if((name).equals(ADMIN))
		
				{flagn=true;}

	if(!(password).equals(ADMINPASS123)) {flagp=false;}
		


		
		}
	void wrongname() {
		if(!(name).equals(ADMIN))
		
				{flagn=false;}

	if((password).equals(ADMINPASS123)) {flagp=true;}
		


		
		}
	void wronginf() {
		if(!(name).equals(ADMIN))
		
				{flagn=false;}

	if(!(password).equals(ADMINPASS123)) {flagp=false;}
		
		}
		
void patiententer() {

	l.info(ENTER_YOUR_NAME);
	nameP=sc.next();
	l.info(ENTER_YOUR_PASSWORD);
	 passwordP=sc.next();
	}
boolean flag90=false;

void patientTrue() {
	int j;
	for(j=0; j<=patientName.size()-1;j++)
	{
	if((nameP).equals(patientName.get(j))&&(passwordP).equals(patientPassword.get(j)))
	{
		flag90=true;
break;
	}

	}
	}
boolean flag80=true;
	void patientcheck() throws InterruptedException {
	long mno;
	int i=0;

		
		
		if(patientMobileNumber.isEmpty())
		{
			patientMobileNumber.add((mobileNumberP));
			l.info(ENTER_PASSWORD);
			patientPassword.add(sc.next());
			l.info(REGISTRATION_IS_SUCCESSFULL);
			
			Thread.sleep(900);
			flag80=false;
						
		}
		else 
		{
			for(i=0;i<=patientMobileNumber.size()-1;i++)
			{
				mno=patientMobileNumber.get(i);
				
				if(mno==mobileNumberP)
				{
					
					flag80=false;
					break;
				}
					
			}
			if(flag80)
			{
			patientMobileNumber.add(mobileNumberP);
			l.info(ENTER_PASSWORD);
			patientPassword.add(sc.next());
			l.info(REGISTRATION_IS_SUCCESSFULL);
			Thread.sleep(900);
			}
			else 
			{
				l.info(SAME_MOBILE_NUMEBR_IS_NOT_ALLOWED);
				Thread.sleep(500);
			}
		}
	}	
	boolean flag44=true;

	  void patientAuthorities() throws InterruptedException, IOException {

		boolean flag1=false;
		byte choice4;

		int j;
	for(j=0; j<=patientName.size()-1;j++)
	{
	if((nameP).equals(patientName.get(j))&&(passwordP).equals(patientPassword.get(j)))
		{
			flag1=true;

			break;
		}
		
	}
	if (flag1) {
		l.info("    1.to Book Appointment   2.to View The Available Services and Offers   ");
		l.info("    3.feedback ");
		l.info("    Enter 1 or 2 or 3 : ");
		
		int select=sc.nextInt();
		switch (select) {
		case 1 :

			if(flag1)
			{		
				Thread.sleep(1000);
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				l.info(S);
				l.info(X);
				l.info(BOOK_APPOINTMENT);
				l.info(T);
				l.info(WELCOME+patientName.get(j)+", to book appointment, choose your doctor..");
				
				for(int i=0; i<=doctorName.size()-1; i++)
				{
					l.info((i+1)+". "+doctorName.get(i));
				}
				choice4=sc.nextByte();
				doctorID.add(choice4);
				

				
				while(flag44)
				{
					Thread.sleep(1000);

					new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
					l.info(S);
					l.info(X);
					l.info(BOOK_APPOINTMENT);
					l.info(T);
					
			
						if(choice<=doctorName.size() && choice>0)
						{l.info("[");
						l.info("Name: "+doctorName.get(choice-1)+" , Age: "+doctorAge.get(choice-1)+" , Mobile: "+doctorMobileNumber.get(choice-1)+" , City: "+doctorCity.get(choice-1));
						l.info("]");
						l.info("Note: We are not accepting any bookings on Fridays");

						l.info(ENTER_YOUR_NAME2);
							sc.nextLine();
							patientNameBooking.add(sc.nextLine());
							l.info(" Enter your phone number: \t");
							patientPhoneBooking.add(sc.nextLong());
						
						
							l.info("plz Enter The Date of Booking (yyyy-mm-dd): \t");
							patientBookingDate.add(sc.next());
							
							l.info("\n Booking Successfull..");
	count++;
							Thread.sleep(1000);
							flag44=false;
							break;
						}
						else 
						{
							l.info(ENTER_CORRECT_INPUT);
							flag44=true;
							Thread.sleep(1000);
						}
					
						
					
				}	

			}
			else 
			{
				l.info("Login unsuccessfull..");
				Thread.sleep(900);
				flag44=false;
			}
			break;			
		
		case 2 :
			if(servicetName.isEmpty())
			{
				l.info("There are no registered services or offers  yet !!");
				Thread.sleep(3000);
				break;
			}
			else 
			{
				for(int i=0; i<=servicetName.size()-1; i++)
				{System.err.println((i+1));
				l.info("Service Name: "+servicetName.get(i));
				l.info("Description : "+serviceDescription.get(i));
					float cad=(float)(cost.get(i) - ((float)(disc.get(i)/100.0) * cost.get(i) ) );
					l.info("cost After Discount : "+ cad );
					l.info("");
				}

				l.info("\n\n1. Main menu\t 2. Exit");
				byte menuCHoice=sc.nextByte();
				if(menuCHoice==1)
				{
					flag44=false;
					
				}
				else
				{ l.info(R);
				System.exit(0);}
			}
			
			break;
			
			
			

		case 3 :

			if(flag1==true)
			{		
				Thread.sleep(1000);
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				l.info(S);
				l.info(X);
				l.info("\t\t |      Add Feedback       |");
				l.info(T);
				l.info(WELCOME +patientName.get(j)+" in 'Add Feedback Page' , choose your doctor number..");
				
				for(int i=0; i<=doctorName.size()-1; i++)
				{
					l.info((i+1)+". "+doctorName.get(i));
				}
				byte choice2=sc.nextByte();
				doctorID.add(choice2);
				

				
				while(flag44)
				{
					Thread.sleep(1000);

					new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
					l.info(S);
					l.info(X);
					l.info("\t\t |       Add Feedback      |");
					l.info(T);
					l.info(" \n\n \t\t We strive to satisfy you");
					
				
						if(choice2<=doctorName.size() && choice2>0)
						{
							l.info("\n\nName: \t "+doctorName.get(choice2-1)+"\nAge: \t "+doctorAge.get(choice2-1)+"\nMobile:  "+doctorMobileNumber.get(choice2-1)+"\nCity: \t "+doctorCity.get(choice2-1));
							l.info(ENTER_YOUR_NAME2);
							sc.nextLine();
							patientNameFeedback.add(sc.nextLine());
							
							l.info(ENTER_YOUR_FEEDBACK);
							feedback.add(sc.next());
							l.info(YOU_ADDED_FEEDBACK_SUCCESSFUL);
							

							Thread.sleep(1000);
							flag44=false;
							break;
						}
						else 
						{
							l.info(ENTER_CORRECT_INPUT);
							flag44=true;
							Thread.sleep(1000);
						}
					
						
					
				}	

			}
			else 
			{
				l.info("Login unsuccessfull..");
				Thread.sleep(900);
				flag44=false;
			}
			break;
			
			
		default:
			l.info("Wrong choice");
				Thread.sleep(1000);
				flag44=true;
		
		}
	}
	else if (flag1==false) {l.info("Login unsuccessfull..");}

	}
	void patienInfo() {

		l.info(PLEASE_ENTER_YOUR_NAME);
		patientName.add(sc.nextLine());
		l.info("enter your age: ");
		patientAge.add(sc.nextInt());
		l.info("Please enter your Mobile number");
		 mobileNumberP=sc.nextLong();
	}
	void patientRegPage() throws InterruptedException, IOException {
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		l.info("\n");
		l.info("\t\t | Welcome to Patient Registration Page!|");
		l.info("\n");
	}

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
		
		if(companyMobileNumber.isEmpty())
		{
			companyMobileNumber.add((mobileNumber));
			 l.info(REGISTRATION_IS_SUCCESSFULL);
			
			Thread.sleep(900);
			flag1=false;
						
		}
		else 
		{
			for(i=0;i<=companyMobileNumber.size()-1;i++)
			{
				mno=companyMobileNumber.get(i);
				
				if(mno==mobileNumber)
				{
					
					flag1=false;
					break;
				}
					
			}
			if(flag1==true)
			{
				companyMobileNumber.add(mobileNumber);
			
				l.info(REGISTRATION_IS_SUCCESSFULL);
			Thread.sleep(900);
			}
			else 
			{
				l.info(SAME_MOBILE_NUMEBR_IS_NOT_ALLOWED);
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
		mobileNumber=sc.nextLong();
	}
	
	void servicecheck() throws InterruptedException {
		if(discount<=0){
			l.info("discount less than or rqual 0 is not allowed\n");
			Thread.sleep(500);
		}
		else{disc.add((discount));}
			
		l.info(REGISTRATION_IS_SUCCESSFULL);
			
			Thread.sleep(900);
		
		
	}
	
	
	void serviesRegPage() throws InterruptedException, IOException {
		welcomeInAdminPage();
	}

	void serviesInfo() {
		l.info("Please enter service name : ");
		servicetName.add(sc.nextLine());
		l.info("enter Service description : ");
		serviceDescription.add(sc.nextLine());
		l.info("Enter price before discount :");
		cost.add(sc.nextInt());
		l.info("Enter discount % : ");
		discount=sc.nextInt();
	}
	
	
	void doctorInfo() {
		l.info(PLEASE_ENTER_YOUR_NAME);
		doctorName.add(sc.next());

		l.info("Please enter your Mobile number");
		  mobileNumberD=(sc.nextLong());
		
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
						
						if(mno==mobileNumberD)
						{
							
							flag1=false;
							break;
						}
							
					}
					if(flag1==true)
					{

								doctorMobileNumber.add(mobileNumberD);
								l.info("Enter age:");
								doctorAge.add(sc.nextInt());
								l.info("Enter City: ");
								doctorCity.add(sc.next());
								l.info(ENTER_PASSWORD);
								doctorPassword.add(sc.next());
								l.info(REGISTRATION_IS_SUCCESSFULL);
								l.info("Details: Name: "+doctorName+" number:"+doctorMobileNumber);
								Thread.sleep(900);

					}
					else {
						l.info(SAME_MOBILE_NUMEBR_IS_NOT_ALLOWED);
						int index=doctorName.size()-1;
						doctorName.remove(index);
						Thread.sleep(500);

					}

	}
	
	void doctorcheck() {
		int i=0;
			


		for(i=0; i<=doctorName.size()-1;i++)
		{
			
			if((doctorName.get(i)).equals(n)&&(doctorPassword.get(i)).equals(passwordD))
			{
				flag=true;
				break;
			}
		}
	}
	
	void doctorenter() {
		l.info("Enter your Username");
		n=sc.next();
		l.info(ENTER_YOUR_PASSWORD);
		 passwordD=sc.next();
	}
	void doctorAuthorietes() throws Exception {
		int i=0;
			boolean flag=false;
			byte choice;

		for(i=0; i<=doctorName.size()-1;i++)
		{
			
			if((doctorName.get(i)).equals(n)&&(doctorPassword.get(i)).equals(passwordD))
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
							
							l.info("Patient "+patientNameBooking.get(j) +" was booked in :"+patientBookingDate.get(j));
						
							l.info(patientNameBooking.get(j) +"'s phone number: "+patientPhoneBooking.get(j) );
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
							l.info("patient name: "+patientNameFeedback.get(j) );
								l.info(patientNameFeedback.get(j)+"Feedback :"+feedback.get(j) );
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
					l.info(R);
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
		welcomeInHome();
		l.info("1.DOCTOR  2.PATIENT   3.ADMIN   4.EXIT ");
		int cho=sc.nextInt();
		switch(cho)
		{
			case 1:
				doctor();
				flag=true;
				break;
				case 2:
				patient();										
				flag=true;
				break;
				case 3:
				
				admin();
				flag= true;
				break;
			
					
					default:
					{l.info(R);
						System.exit(0);}

	}	
			}
			
	void patientRegistration() throws Exception
	{

		int i=0;
		long mobileNumber;
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		l.info(""); l.info("");
		l.info("\t\t  ______________________________________");
		l.info("\t\t |                                      |");
		l.info("\t\t | Welcome to Patient Registration Page!|");
		l.info("\t\t |______________________________________|");
		l.info("");
		l.info(PLEASE_ENTER_YOUR_NAME);
		patientName.add(sc.nextLine());
		l.info("enter your age: ");
		patientAge.add(sc.nextInt());
		l.info("Please enter your Mobile number");
		mobileNumber=sc.nextLong();
		long mno;
		
		boolean flag1=true;
		
		if(patientMobileNumber.isEmpty())
		{
			patientMobileNumber.add((mobileNumber));
			l.info(ENTER_PASSWORD);
			patientPassword.add(sc.next());
			l.info(REGISTRATION_IS_SUCCESSFULL);
			
			Thread.sleep(900);
			flag1=false;
						
		}
		else 
		{
			for(i=0;i<=patientMobileNumber.size()-1;i++)
			{
				mno=patientMobileNumber.get(i);
				
				if(mno==mobileNumber)
				{
					
					flag1=false;
					break;
				}
					
			}
			if(flag1==true)
			{
			patientMobileNumber.add(mobileNumber);
			l.info(ENTER_PASSWORD);
			patientPassword.add(sc.next());
			l.info(REGISTRATION_IS_SUCCESSFULL);
			Thread.sleep(900);
			}
			else 
			{
				 l.info(SAME_MOBILE_NUMEBR_IS_NOT_ALLOWED);
				Thread.sleep(500);
			}
		}
	}

	void CompaniesRegistration()throws Exception

	{

		int i=0;
		long mobileNumber;
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		l.info(""); l.info("");
		l.info("\t\t  welcome admain in  ");
		l.info("\t\t  Companies and drug providers addition Page!|");
		l.info("");
		l.info("Please enter Company name");
		companytName.add(sc.nextLine());
		l.info("enter Company location: ");
		companyLocation.add(sc.nextLine());
		l.info("Please enter Company Mobile number");
		mobileNumber=sc.nextLong();
		long mno;
		

				boolean flag1=true;
		
		if(companyMobileNumber.isEmpty())
		{
			companyMobileNumber.add((mobileNumber));
			l.info(REGISTRATION_IS_SUCCESSFULL);
			
			Thread.sleep(900);
			flag1=false;
						
		}
		else 
		{
			for(i=0;i<=companyMobileNumber.size()-1;i++)
			{
				mno=companyMobileNumber.get(i);
				
				if(mno==mobileNumber)
				{
					
					flag1=false;
					break;
				}
					
			}
			if(flag1==true)
			{
				companyMobileNumber.add(mobileNumber);
				l.info(REGISTRATION_IS_SUCCESSFULL);
			Thread.sleep(900);
			}
			else 
			{
				l.info("same mobile numebr is not allowed !! \n");
				Thread.sleep(500);
			}
		}
	}
	 
	void serviceRegistration()throws Exception

	{
		
		int discount;
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		l.info("");l.info("");
		l.info("\t\t  welcome admain in  ");
		l.info("\t\t  service and offer addition Page!|");
		l.info("");
		l.info("Please enter service name : ");
		servicetName.add(sc.nextLine());
		l.info("enter Service description : ");
		serviceDescription.add(sc.nextLine());
		l.info("Enter price before discount :");
		cost.add(sc.nextInt());
		l.info("Enter discount % : ");
		discount=sc.nextInt();
		
		
		if(discount<=0){
			l.info("discount less than or rqual 0 is not allowed\n");
			Thread.sleep(500);
		}
		else{disc.add((discount));}
			
		l.info(REGISTRATION_IS_SUCCESSFULL);
			
			Thread.sleep(900);
		
		
			 
			
		
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
			
			l.info(PLEASE_ENTER_YOUR_NAME);
			doctorName.add(sc.nextLine());

			l.info("Please enter your Mobile number");
			mobileNumber=(sc.nextLong());
			
			long mno;

				if(doctorMobileNumber.isEmpty())
					{
						doctorMobileNumber.add((mobileNumber));
						l.info(ENTER_PASSWORD);
							doctorPassword.add(sc.next());
							l.info(REGISTRATION_IS_SUCCESSFULL);
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
								l.info(ENTER_PASSWORD);
								doctorPassword.add(sc.next());
								l.info(REGISTRATION_IS_SUCCESSFULL);
								l.info("Details: Name: "+doctorName+" number:"+doctorMobileNumber);
								Thread.sleep(900);

					}
					else {
						 l.info(SAME_MOBILE_NUMEBR_IS_NOT_ALLOWED);
						int index=doctorName.size()-1;
						doctorName.remove(index);
						Thread.sleep(500);

					}

				}
	}


void FeedBackPage() throws InterruptedException, IOException {
	new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	l.info(S);
	l.info(X);
	l.info("\t\t |      Add Feedback       |");
	l.info(T);
}

void FeedBackInfo() throws InterruptedException, IOException {
	
	 l.info("\n Welcome  in 'Add Feedback Page'");
	
	
	
	 l.info(ENTER_YOUR_NAME2);
				sc.nextLine();
				patientNameFeedback.add(sc.nextLine());
				
				 l.info(ENTER_YOUR_FEEDBACK);
				feedback.add(sc.next());
				 l.info(YOU_ADDED_FEEDBACK_SUCCESSFUL);
				

				Thread.sleep(1000);
				
		
}

void Appointment() throws InterruptedException, IOException {
	boolean flag1=false;
	int j;
for(j=0; j<=patientName.size()-1;j++)
{
if((nameP).equals(patientName.get(j))&&(passwordP).equals(patientPassword.get(j)))
	{
		flag1=true;

		break;
	}
	
}
	if(flag1==true)
	{		
		Thread.sleep(1000);
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		 l.info(S);
		 l.info(X);
		 l.info(BOOK_APPOINTMENT);
		 l.info(T);
		 l.info(WELCOME+patientName.get(j)+", to book appointment, choose your doctor..");
		
		for(int i=0; i<=doctorName.size()-1; i++)
		{
			 l.info((i+1)+". "+doctorName.get(i));
		}
		 byte choice=sc.nextByte();
		doctorID.add(choice);
		

		
			Thread.sleep(1000);

			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			 l.info(S);
			 l.info(X);
			 l.info(BOOK_APPOINTMENT);
			 l.info(T);
			
		
				if(choice<=doctorName.size() && choice>0)
				{ l.info("[");
				 l.info("Name: "+doctorName.get(choice-1)+" , Age: "+doctorAge.get(choice-1)+" , Mobile: "+doctorMobileNumber.get(choice-1)+" , City: "+doctorCity.get(choice-1));
				 l.info("]");
				 l.info("Note: We are not accepting any bookings on Fridays");
				 l.info(ENTER_YOUR_NAME2);
					sc.nextLine();
					patientNameBooking.add(sc.nextLine());
					 l.info(" Enter your phone number: \t");
					patientPhoneBooking.add(sc.nextLong());
				
				
					 l.info("plz Enter The Date of Booking (yyyy-mm-dd): \t");
					patientBookingDate.add(sc.next());
					
					 l.info("\n Booking Successfull..");
count++;
					Thread.sleep(1000);
					
				}
				else 
				{
					 l.info(ENTER_CORRECT_INPUT);
					flag=true;
					Thread.sleep(1000);
				}
			
				
			
			

	}
}

void FeedBack() throws InterruptedException, IOException {
	
	boolean flag1=false;
	int j;
for(j=0; j<=patientName.size()-1;j++)
{
if((nameP).equals(patientName.get(j))&&(passwordP).equals(patientPassword.get(j)))
	{
		flag1=true;

		break;
	}
	
}
	
if(flag1==true)
{		
	Thread.sleep(1000);
	new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	 l.info(S);
	 l.info(X);
	 l.info("\t\t |      Add Feedback       |");
	 l.info(T);
	 l.info(WELCOME+patientName.get(j)+" in 'Add Feedback Page' , choose your doctor number..");
	
	for(int i=0; i<=doctorName.size()-1; i++)
	{
		 l.info((i+1)+". "+doctorName.get(i));
	}
	byte choice2=sc.nextByte();
	doctorID.add(choice2);
	

	
	
	
		Thread.sleep(1000);

		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		 l.info(S);
		 l.info(X);
		 l.info("\t\t |       Add Feedback      |");
		 l.info(T);
		 l.info(" \n\n \t\t We strive to satisfy you");
			
			if(choice2<=doctorName.size() && choice2>0)
			{
				 l.info("\n\nName: \t "+doctorName.get(choice2-1)+"\nAge: \t "+doctorAge.get(choice2-1)+"\nMobile:  "+doctorMobileNumber.get(choice2-1)+"\nCity: \t "+doctorCity.get(choice2-1));
				 l.info(ENTER_YOUR_NAME2);
				sc.nextLine();
				patientNameFeedback.add(sc.nextLine());
				
				 l.info(ENTER_YOUR_FEEDBACK);
				feedback.add(sc.next());
				 l.info(YOU_ADDED_FEEDBACK_SUCCESSFUL);
				

				Thread.sleep(1000);
			
			}
			else 
			{
				 l.info(ENTER_CORRECT_INPUT);
				flag=true;
				Thread.sleep(1000);
			}
		
			
		
		
	
	
}

}

public static void main(String[] args) throws Exception   
{
	AppointmentTest ap=new AppointmentTest();

	ap.dataAdd();
	boolean flagmain=true;
	while(flagmain=true)
	{
		
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	
		welcomeInHome();

		 l.info("1.DOCTOR  2.PATIENT   3.ADMIN   4.ABOUT  5.CONTACT US  6.EXIT ");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:
				ap.doctor();
				flagmain=true;
				break;
				case 2:
				ap.patient();										
				flagmain=true;
				break;
				case 3:
				
				ap.admin();
				flagmain= true;
				break;
				case 4:
					 l.info("");
					 l.info("");
					 l.info("                 Get to Know Us We Are Like Family.                                      ");
					 l.info(" __________________________________________________________");
					 l.info("");
					 l.info("                  Hi! We’re \"DENTALS CENTER\" …       ");
					 l.info("Our people set us apart. We’re passionate, dedicated, and friendly. ");
					 l.info("");
					 l.info("                             The story");
					 l.info("                              starts");
					 l.info("                               here!");
					 l.info("");
					 l.info("             Our Humble Beginnings was in 2017-2018");
					 l.info("           Transition to Full Service in December 2019 ");
					 l.info("                 Phase Two Expansion July 2021");
					 l.info("");
					 l.info("                              Be Part");
					 l.info("                               Of Our");
					 l.info("                               Story!");
					 l.info("");
				flagmain=true;
					break;
				case 5:
					 l.info("");
					 l.info("");
					 l.info("                       Let's Get In Touch!                 ");
					 l.info(" __________________________________________________________");
					 l.info("");
					 l.info("      Are you ready to start a great experience with us ?");
					 l.info(" Call us or send us an email or contact us on our WhatsApp account ");
					 l.info("        we will get back to you as soon as possible!");
					 l.info("                     (972) 491-6663                  ");
					 l.info("               Oh yeah, and we’re great at what we do!");
					 l.info("");
				flagmain=true;
					break;
					
					default:
					{ l.info(R);
						System.exit(0);}

	}	
	}
}


public static void welcomeInHome() {
	 l.info(" __________________________________________________________");
	 l.info("|                                                          |");
	 l.info("|                 WELCOME IN HOME PAGE                     |");
	 l.info("|                                                          |");
	 l.info("|__________________________________________________________|");
	 l.info("");
}

}

