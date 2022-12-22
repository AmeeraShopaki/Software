package t;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;

public class Patient {
	  AppointmentTest A=new AppointmentTest();
	   Doctor D =new Doctor();
	 Company C =new Company();
	 Admin ad = new Admin();
	private static final String ENTER_CORRECT_INPUT = "\n enter correct input..";
	static Logger l = Logger.getLogger(AppointmentTest.class.getName());

static int count=0;
static Scanner sc=new Scanner(System.in);
ArrayList<Integer>patientAge = new ArrayList<Integer>();
ArrayList<String>patientName = new ArrayList<String>();
ArrayList<String>patientGender = new ArrayList<String>();
ArrayList<String>patientPassword = new ArrayList<String>();
ArrayList<String>patientConfirmPassword = new ArrayList<String>();
ArrayList<Long>patientMobileNumber = new ArrayList<Long>();
ArrayList<String>feedback= new ArrayList<String>();


ArrayList<Long>patientPhoneBooking = new ArrayList<Long>();
ArrayList<String>patientBookingDate = new ArrayList<String>();
ArrayList<String>patientNameBooking = new ArrayList<String>();

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
	
	
	
	
	
	
	
	
void patient() throws InterruptedException, IOException {

		boolean flag77=true;
		while(flag77)
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		
			l.info("\t\t | Welcome to Patient Page!|");
		
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
			
						flag77=false;
						
					}
					patiententer();
			
					
					break;
				case 2:
					patientRegPage();
					patienInfo();
					patientcheck();
					flag77=false;
					break;
				
				case 3:{ 
				System.exit(0);}
				break;
				default:
					l.info("\nYou entered wrong choice. enter your choice again....!!!");
					
					Thread.sleep(1000);
					break;
			}
		}
	}

void patiententer() {

	l.info("ENTER_YOUR_NAME");
	nameP=sc.next();
	l.info("ENTER_YOUR_PASSWORD");
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
		
			patientPassword.add(sc.next());
		
			
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
	
			patientPassword.add(sc.next());
		
			Thread.sleep(900);
			}
			else 
			{
		
				Thread.sleep(500);
			}
		}
	}	
	boolean flag44=true;
//	public Object patientName;

	
	void patienInfo() {

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
			l.info("ENTER_PASSWORD");
			patientPassword.add(sc.next());
			l.info("REGISTRATION_IS_SUCCESSFULL");
			
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
	
			patientPassword.add(sc.next());
		
			Thread.sleep(900);
			}
			else 
			{
				
				Thread.sleep(500);
			}
		}
	}
	
	
	void FeedBackPage() throws InterruptedException, IOException {
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	
		l.info("\t\t |      Add Feedback       |");
	
	}

	void FeedBackInfo() throws InterruptedException, IOException {
		
		 l.info("\n Welcome  in 'Add Feedback Page'");
	
		
	
					sc.nextLine();
					patientNameFeedback.add(sc.nextLine());
					
					feedback.add(sc.next());
				
					Thread.sleep(1000);
					
			
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

		 l.info("\t\t |      Add Feedback       |");
		
	
		

		
		
		
			Thread.sleep(1000);

			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		
			 l.info("\t\t |       Add Feedback      |");
	
			
					sc.nextLine();
					patientNameFeedback.add(sc.nextLine());
			
					feedback.add(sc.next());
		

					Thread.sleep(1000);
				
				}
				else 
				{
					 l.info(ENTER_CORRECT_INPUT);
					flag=true;
					Thread.sleep(1000);
				}
			
				
			
			
		
		
	}



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
		
				l.info("BOOK_APPOINTMENT");
			
				l.info(patientName.get(j)+", to book appointment, choose your doctor..");
				
				for(int i=0; i<=D.doctorName.size()-1; i++)
				{
					l.info((i+1)+". "+D.doctorName.get(i));
				}
				choice4=sc.nextByte();
				D.doctorID.add(choice4);
				

				
				while(flag44)
				{
					Thread.sleep(1000);

					new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				
					l.info("BOOK_APPOINTMENT");
			
			
						if(choice<=D.doctorName.size() && choice>0)
						{l.info("[");
l.info("Name: "+D.doctorName.get(choice-1)+" , Age: "+D.doctorAge.get(choice-1)+" , Mobile: "+D.doctorMobileNumber.get(choice-1)+" , City: "+D.doctorCity.get(choice-1));
						l.info("]");
						l.info("Note: We are not accepting any bookings on Fridays");

						l.info("ENTER_YOUR_NAME2");
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
			if(ad.servicetName.isEmpty())
			{
				l.info("There are no registered services or offers  yet !!");
				Thread.sleep(3000);
				break;
			}
			else 
			{
				for(int i=0; i<=ad.servicetName.size()-1; i++)
				{System.err.println((i+1));
				l.info("Service Name: "+ad.servicetName.get(i));
				l.info("Description : "+ad.serviceDescription.get(i));
					
					l.info("");
				}

				l.info("\n\n1. Main menu\t 2. Exit");
				byte menuCHoice=sc.nextByte();
				if(menuCHoice==1)
				{
					flag44=false;
					
				}
				else
				{ 
				System.exit(0);}
			}
			
			break;
			
			
			

		case 3 :

			if(flag1==true)
			{		
				Thread.sleep(1000);
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			
				l.info("\t\t |      Add Feedback       |");
				l.info(patientName.get(j)+" in 'Add Feedback Page' , choose your doctor number..");
				
				for(int i=0; i<=D.doctorName.size()-1; i++)
				{
					l.info((i+1)+". "+D.doctorName.get(i));
				}
				byte choice2=sc.nextByte();
				D.doctorID.add(choice2);
				

				
				while(flag44)
				{
					Thread.sleep(1000);

					new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		
					l.info("\t\t |       Add Feedback      |");
					l.info(" \n\n \t\t We strive to satisfy you");
					
				
						if(choice2<=D.doctorName.size() && choice2>0)
						{
l.info("\n\nName: \t "+D.doctorName.get(choice2-1)+"\nAge: \t "+D.doctorAge.get(choice2-1)+"\nMobile:  "+D.doctorMobileNumber.get(choice2-1)+"\nCity: \t "+D.doctorCity.get(choice2-1));
							l.info("ENTER_YOUR_NAME2");
							sc.nextLine();
							patientNameFeedback.add(sc.nextLine());
							feedback.add(sc.next());
						
							

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










}
