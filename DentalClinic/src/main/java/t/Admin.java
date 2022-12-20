package t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;



public class Admin {

	   AppointmentTest A=new AppointmentTest();
	   Doctor D =new Doctor();
	   Patient P=new Patient();
	   Company C = new Company();
	
		static Logger l = Logger.getLogger(AppointmentTest.class.getName());



	
	private static final String ADMINPASS123 = "adminpass123";
	private static final String ADMIN = "admin";


	
	static int count=0;
	static Scanner sc=new Scanner(System.in);

	ArrayList<String>feedback= new ArrayList<String>();

	ArrayList<String>servicetName = new ArrayList<String>();
	ArrayList<Integer>disc = new ArrayList<Integer>();
	ArrayList<Integer>cost = new ArrayList<Integer>();
	ArrayList<Integer>costAfterDiscount = new ArrayList<Integer>();
	ArrayList<String>serviceDescription= new ArrayList<String>();


	boolean flagn=false;
	boolean flagp=false;
	boolean fa=true;
	boolean flag;
	int choice;
	String password;
	String name;
	String nameP;

	int discount;
	long mobileNumber;
	long mobileNumberD;
	String n;
	String passwordD;
	void admin() throws Exception {

		int choice22=0;
		
		boolean flag50=true;
		while(flag50)
		{
			
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

			l.info("S");
			l.info("X");
			l.info("\t\t | WELCOME TO ADMIN PAGE!  |");
			l.info("T");
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
				{
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
		l.info("S");
		l.info("X");
		l.info("\t\t | Login |");
		l.info("T");
	}

	public void welcomeInAdminPage() throws InterruptedException, IOException {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			l.info("S");
			l.info("X");
			l.info("\t\t | WELCOME TO ADMIN PAGE!  |");
			l.info("T");
			l.info(" ");
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
					for(int i=0; i<=D.doctorName.size()-1; i++)
					{
						l.info("Name: \t "+D.doctorName.get(i));
					
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
						if(P.patientName.isEmpty())
						{
							l.info("No Registered Patients yet.");
							Thread.sleep(3000);
							break;
						}
						else 
						{
							for(int i=0; i<=P.patientName.size()-1; i++)
							{
								l.info((i+1)+".");
								l.info(" [ ");
								l.info("Name :"+P.patientName.get(i)+"   Phone : "+P.patientMobileNumber.get(i));
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
					if(P.patientNameBooking.isEmpty())
					{
						l.info("\nNo Appointments yet.");
						Thread.sleep(3000);
						break;
					}
					
					else
					{
						for(int i=0; i<=P.patientNameBooking.size()-1; i++)
						{
							l.info((i+1)+". "); 
					
							l.info("Patient "+P.patientNameBooking.get(i) +" was booked in :"+P.patientBookingDate.get(i));
						
							l.info(P.patientNameBooking.get(i) +"'s phone number: "+P.patientPhoneBooking.get(i) );
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
					
						for(int i=0; i<=C.companytName.size()-1; i++)
						{System.err.println((i+1));
						l.info("Company Name    : "+C.companytName.get(i));
						l.info("Company Location: "+C.companyLocation.get(i));
							l.info("Mobile Number   : "+C.companyMobileNumber.get(i));
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
				{
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

	
		 name = sc.next();
		
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
	
	
	
	void servicecheck() throws InterruptedException {
		if(discount<=0){
			l.info("discount less than or rqual 0 is not allowed\n");
			Thread.sleep(500);
		}
		else{disc.add((discount));}
			
		l.info("REGISTRATION_IS_SUCCESSFULL");
			
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
		C.companytName.add(sc.nextLine());
		l.info("enter Company location: ");
		C.companyLocation.add(sc.nextLine());
		l.info("Please enter Company Mobile number");
		mobileNumber=sc.nextLong();
		long mno;
		

				boolean flag1=true;
		
		if(C.companyMobileNumber.isEmpty())
		{
			C.companyMobileNumber.add((mobileNumber));
			l.info("REGISTRATION_IS_SUCCESSFULL");
			
			Thread.sleep(900);
			flag1=false;
						
		}
		else 
		{
			for(i=0;i<=C.companyMobileNumber.size()-1;i++)
			{
				mno=C.companyMobileNumber.get(i);
				
				if(mno==mobileNumber)
				{
					
					flag1=false;
					break;
				}
					
			}
			if(flag1==true)
			{
				C.companyMobileNumber.add(mobileNumber);
				l.info("REGISTRATION_IS_SUCCESSFULL");
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
			
		l.info("REGISTRATION_IS_SUCCESSFULL");
			
			Thread.sleep(900);
		
		
			 
			
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
