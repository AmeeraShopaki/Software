package t;
import java.util.*;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
public class AppointmentTest{
	
  
ArrayList<String> doctorName = new ArrayList<String>();
ArrayList<String> doctorGender = new ArrayList<String>();
ArrayList<String> doctorPassword = new ArrayList<String>();
ArrayList<Integer> doctorAge = new ArrayList<Integer>();
ArrayList<Long> doctorMobileNumber = new ArrayList<Long>();
ArrayList<String> doctorCity = new ArrayList<String>();

static int count=0;
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
ArrayList<Integer>Discount = new ArrayList<Integer>();
ArrayList<Integer>cost = new ArrayList<Integer>();
ArrayList<Integer>costAfterDiscount = new ArrayList<Integer>();
ArrayList<String>serviceDescription= new ArrayList<String>();

//500
ArrayList<Long>patientPhoneBooking = new ArrayList<Long>();
ArrayList<String>patientBookingDate = new ArrayList<String>();
//ArrayList<Integer>patientAgeBooking = new ArrayList<Integer>();
ArrayList<String>patientNameBooking = new ArrayList<String>();
//ArrayList<String>patientGengerBooking = new ArrayList<String>();
ArrayList<Byte>doctorID = new ArrayList<Byte>();

ArrayList<String>patientName_Feedback = new ArrayList<String>();
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

	

	void adminC() throws InterruptedException, IOException {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		
		boolean flag=true;
		while(flag)
		{
			
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

			System.out.println("\t\t  _________________________");
			System.out.println("\t\t |                         |");
			System.out.println("\t\t | WELCOME TO ADMIN PAGE! |");
			System.out.println("\t\t |_________________________|");
			System.out.println(" ");
			

			System.out.println("1.Login  \t 2.Exit");
			choice=sc.nextInt();

			switch(choice)
			{
			case 1:
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				System.out.println("\t\t  _________________________");
				System.out.println("\t\t |                         |");
				System.out.println("\t\t |         Login 		   |");
				System.out.println("\t\t |_________________________|");
					flag=false;

				break;
			
			case 2:
				{System.out.println("YOU LOG OUT FROM THE SYSTEM :) ");
				System.exit(0);}
			default:
				System.out.println("Entered Wrong choice..");
				flag=true;
			}
		}	
		
	}
	void patientC() throws Exception {
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		while(flag)
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println("\t\t  _________________________");
			System.out.println("\t\t |                         |");
			System.out.println("\t\t | Welcome to Patient Page!|");
			System.out.println("\t\t |_________________________|");
			System.out.println(" ");
			System.out.println("1.Login \t 2.Registration\n  \t3.Exit");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					if(patientMobileNumber.isEmpty())
					{
						System.out.println("First register yourself then login..!");
						Thread.sleep(500);
						break;
					}
					else
					{
						new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
						System.out.println("\t\t  _________________________");
						System.out.println("\t\t |                         |");
						System.out.println("\t\t |         Login 		   |");
						System.out.println("\t\t |_________________________|");
						flag=false;
						
					}
					
					break;
				case 2:
					//PatientInfo();
					patientRegistration();
					flag=false;
					break;
				
				case 3:{System.out.println("YOU LOG OUT FROM THE SYSTEM :) ");
				System.exit(0);}
				
				default:
					System.out.println("\nYou entered wrong choice. enter your choice again....!!!");
					flag= true;
					Thread.sleep(1000);
					break;
			}
		}
	}
	void doctorC() throws Exception {

		Scanner sc=new Scanner(System.in);
		int choice=0;
		
		boolean flag=true;
		while(flag)
		{
			
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

			System.out.println("\t\t  _________________________");
			System.out.println("\t\t |                         |");
			System.out.println("\t\t | WELCOME TO DOCTOR PAGE! |");
			System.out.println("\t\t |_________________________|");
			System.out.println(" ");
			

			System.out.println("1.Login  \t 2.Registration  3.Exit");
			choice=sc.nextInt();

			switch(choice)
			{
			case 1:
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				System.out.println("\t\t ----------------------------------------");
				System.out.println("\t\t|       This is doctor login page        |");
				System.out.println("\t\t ----------------------------------------");
					flag=false;

				break;
			case 2:
				doctorRegistration();
				flag= false;
				break;
			case 3:
				{System.out.println("YOU LOG OUT FROM THE SYSTEM :) ");
				System.exit(0);}
			default:
				System.out.println("Entered Wrong choice..");
				flag=true;
			}
		}	

	}
	boolean flagn;
	boolean flagp;
	boolean flag;
	Scanner sc=new Scanner(System.in);

	  public void adminauthorities() throws Exception {
		
		if(flagn==true && flagp==true) {
		
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				System.out.println("");System.out.println("");
				System.out.println("\t\t  _________________________");
				System.out.println("\t\t |                         |");
				System.out.println("\t\t |       WELCOME ADMIN     |");
				System.out.println("\t\t |_________________________|");
				System.out.println("");
		                 System.out.println("\n\n1.Doctor list    2.Patients List    3.Pateints with Appointment \n\n "
				+ "4.Add Companies and drug providers    5.Companies List    6.Add a service or offer \n\n "
				+ "7.Service List    8.Report of the number times  of booking    9.Exit"
				+ "\n\n Enter Your Choice.");
				
		
		
			
			}
		
	}
	  String password,name,nameP,passwordP;
	  public void enteradmin() {

		
		System.out.println("Enter your name");
		 name = sc.next();
		System.out.println("Enter your Password");
		  password  = sc.next();

	}
	  void adminTrue() throws Exception{
		  
		if((name).equals("admin"))
		{
		
				flagn=true;}

	if((password).equals("adminpass123")) {flagp=true;}
		


		
		}

	void wrongpass() throws Exception{
		if((name).equals("admin"))
		
				{flagn=true;}

	if((password)!="adminpass123") {flagp=false;}
		


		
		}
	void wrongname() throws Exception{
		if((name)!="admin")
		
				{flagn=false;}

	if((password).equals("adminpass123")) {flagp=true;}
		


		
		}
	void wronginf() throws Exception{
		if((name)!="admin")
		
				{flagn=false;}

	if((password)!=("adminpass123")) {flagp=false;}
		
		}
		
void patiententer() {

	System.out.println("Enter your name");
	nameP=sc.next();
	System.out.println("Enter your Password");
	 passwordP=sc.next();
	}

void patientTrue() {
		
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
	}
Long mobileNumberP;
	void patientcheck() throws InterruptedException {
	long mno;
	int i=0;

		boolean flag=true, flag1=true;
		
		if(patientMobileNumber.isEmpty())
		{
			patientMobileNumber.add((mobileNumberP));
			System.out.println("Enter password");
			patientPassword.add(sc.next());
			System.out.println("Registration is Successfull.");
			
			Thread.sleep(900);
			flag1=false;
						
		}
		else 
		{
			for(i=0;i<=patientMobileNumber.size()-1;i++)
			{
				mno=patientMobileNumber.get(i);
				
				if(mno==mobileNumberP)
				{
					
					flag1=false;
					break;
				}
					
			}
			if(flag1==true)
			{
			patientMobileNumber.add(mobileNumberP);
			System.out.println("Enter password");
			patientPassword.add(sc.next());
			System.out.println("Registration is Successfull.");
			Thread.sleep(900);
			}
			else 
			{
				System.out.println("same mobile numebr is not allowed\n");
				Thread.sleep(500);
			}
		}
	}	
	void patientAuthorities() throws InterruptedException, IOException {
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
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
	if (flag1==true) {
	System.out.println("login successfull");

	
	}
	else if (flag1==false) {System.out.println("Login unsuccessfull..");}

	}
	void PatientInfo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your name");
		patientName.add(sc.nextLine());
		System.out.println("enter your age: ");
		patientAge.add(sc.nextInt());
		System.out.println("Please enter your Mobile number");
		 mobileNumberP=sc.nextLong();
	}
	void patientRegPage() throws InterruptedException, IOException {
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("\n");
		System.out.println("\t\t | Welcome to Patient Registration Page!|");
		System.out.println("\n");
	}

	void companiesRegPage() throws InterruptedException, IOException {
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("\n");
		System.out.println("\t\t | welcome admain in  ");
		System.out.println("\t\t | Companies and drug providers Registration Page!|");
		System.out.println("\n");
	}
	long mobileNumber;
	void companycheack() throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		int i=0;
		long mno;
		
		boolean flag=true, flag1=true;
		
		if(companyMobileNumber.isEmpty())
		{
			companyMobileNumber.add((mobileNumber));
			System.out.println("Registration is Successfull.");
			
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
			
			System.out.println("Registration is Successfull.");
			Thread.sleep(900);
			}
			else 
			{
				System.out.println("same mobile numebr is not allowed\n");
				Thread.sleep(500);
			}
		}
	}
	void companiesInfo() {
		System.out.println("Please enter Company name");
		companytName.add(sc.nextLine());
		System.out.println("enter Company location: ");
		companyLocation.add(sc.nextLine());
		System.out.println("Please enter Company Mobile number");
		mobileNumber=sc.nextLong();
	}
	

	
	void servicecheck() throws InterruptedException {
		if(discount<=0){
			System.out.println("discount less than or rqual 0 is not allowed\n");
			Thread.sleep(500);
		}
		else{Discount.add((discount));}
			
			System.out.println("Registration is Successfull.");
			
			Thread.sleep(900);
		
		
	}
	
	
	void serviesRegPage() throws InterruptedException, IOException {
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("\n");
		System.out.println("\t\t | welcome admain in  ");
		System.out.println("\t\t | service and offer Registration Page!|");
		System.out.println("\n");
	}
	int discount;
	void serviesInfo() {
		System.out.println("Please enter service name : ");
		servicetName.add(sc.nextLine());
		System.out.println("enter Service description : ");
		serviceDescription.add(sc.nextLine());
		System.out.println("Enter price before discount :");
		cost.add(sc.nextInt());
		System.out.println("Enter discount % : ");
		discount=sc.nextInt();
	}
	
	
	
	
	
	long mobileNumberD;
	void doctorInfo() {
		System.out.println("Please enter your name");
		doctorName.add(sc.nextLine());

		System.out.println("Please enter your Mobile number");
		  mobileNumberD=(sc.nextLong());
		
	}
	void doctorRegPage() throws InterruptedException, IOException {
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("");System.out.println("");
		System.out.println("\t\t __________________________________");
		System.out.println("\t\t|                                  |");
		System.out.println("\t\t| This is doctor registration Page |");
		System.out.println("\t\t|__________________________________|");
		System.out.println("");
	}
	void doctorCheck() throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		int i=0;
		boolean flag=true, flag1=true;
					
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
								System.out.println("Enter age:");
								doctorAge.add(sc.nextInt());
								System.out.println("Enter City: ");
								doctorCity.add(sc.next());
								System.out.println("Enter password");
								doctorPassword.add(sc.next());
								System.out.println("Registration is Successfull.");
								System.out.println("Details: Name: "+doctorName+" number:"+doctorMobileNumber);
								Thread.sleep(900);

					}
					else {
						System.out.println("same mobile numebr is not allowed\n");
						int index=doctorName.size()-1;
						doctorName.remove(index);
						Thread.sleep(500);

					}

	}
	

	void doctorcheck() {
		int i=0;
			
			boolean flag=false;

		for(i=0; i<=doctorName.size()-1;i++)
		{
			
			if((doctorName.get(i)).equals(n)&&(doctorPassword.get(i)).equals(passwordD))
			{
				flag=true;
				break;
			}
		}
	}
	String n,passwordD;
	void doctorenter() {
		System.out.println("Enter your Username");
		n=sc.next();
		System.out.println("Enter your Password");
		 passwordD=sc.next();
	}
	void doctorAuthorietes() throws Exception {
		int i=0;
			boolean flag=false;

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
					System.out.println("");	System.out.println("");
					System.out.println("\t\t ________________________________________");
					System.out.println("\t\t|                                        |");
					System.out.println("\t\t| Welcome Doctor "+doctorName.get(i)+"   |");
					System.out.println("\t\t|________________________________________|");
					System.out.println("");
				
			}
			else if(flag==false){
					System.out.println("Login unsuccessfull..");
					Thread.sleep(900);
					
					
					

			}

			

			
			
	}

	void patientRegistration() throws Exception
	{
		Scanner sc=new Scanner(System.in);
		int i=0;
		long mobileNumber;
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("");System.out.println("");
		System.out.println("\t\t  ______________________________________");
		System.out.println("\t\t |                                      |");
		System.out.println("\t\t | Welcome to Patient Registration Page!|");
		System.out.println("\t\t |______________________________________|");
		System.out.println("");
		System.out.println("Please enter your name");
		patientName.add(sc.nextLine());
		System.out.println("enter your age: ");
		patientAge.add(sc.nextInt());
		System.out.println("Please enter your Mobile number");
		mobileNumber=sc.nextLong();
		long mno;
		
		boolean flag=true, flag1=true;
		
		if(patientMobileNumber.isEmpty())
		{
			patientMobileNumber.add((mobileNumber));
			System.out.println("Enter password");
			patientPassword.add(sc.next());
			System.out.println("Registration is Successfull.");
			
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
			System.out.println("Enter password");
			patientPassword.add(sc.next());
			System.out.println("Registration is Successfull.");
			Thread.sleep(900);
			}
			else 
			{
				System.out.println("same mobile numebr is not allowed\n");
				Thread.sleep(500);
			}
		}
	}

	void CompaniesRegistration()throws Exception

	{
		Scanner sc=new Scanner(System.in);
		int i=0;
		long mobileNumber;
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("");System.out.println("");
		System.out.println("\t\t  welcome admain in  ");
		System.out.println("\t\t  Companies and drug providers addition Page!|");
		System.out.println("");
		System.out.println("Please enter Company name");
		companytName.add(sc.nextLine());
		System.out.println("enter Company location: ");
		companyLocation.add(sc.nextLine());
		System.out.println("Please enter Company Mobile number");
		mobileNumber=sc.nextLong();
		long mno;
		
		boolean flag=true, flag1=true;
		
		if(companyMobileNumber.isEmpty())
		{
			companyMobileNumber.add((mobileNumber));
			System.out.println("Registration is Successfull.");
			
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
			
			System.out.println("Registration is Successfull.");
			Thread.sleep(900);
			}
			else 
			{
				System.out.println("same mobile numebr is not allowed !! \n");
				Thread.sleep(500);
			}
		}
	}
	 
	void serviceRegistration()throws Exception

	{
		Scanner sc=new Scanner(System.in);
		
		int discount;
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("");System.out.println("");
		System.out.println("\t\t  welcome admain in  ");
		System.out.println("\t\t  service and offer addition Page!|");
		System.out.println("");
		System.out.println("Please enter service name : ");
		servicetName.add(sc.nextLine());
		System.out.println("enter Service description : ");
		serviceDescription.add(sc.nextLine());
		System.out.println("Enter price before discount :");
		cost.add(sc.nextInt());
		System.out.println("Enter discount % : ");
		discount=sc.nextInt();
		
		
		if(discount<=0){
			System.out.println("discount less than or rqual 0 is not allowed\n");
			Thread.sleep(500);
		}
		else{Discount.add((discount));}
			
			System.out.println("Registration is Successfull.");
			
			Thread.sleep(900);
		
		
			 
			
		
	}

	void doctorRegistration() throws Exception
	{
		Scanner sc=new Scanner(System.in);
		int i=0;
		long mobileNumber;
		boolean flag=true, flag1=true;
					
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println("");System.out.println("");
			System.out.println("\t\t __________________________________");
			System.out.println("\t\t|                                  |");
			System.out.println("\t\t| This is doctor registration Page |");
			System.out.println("\t\t|__________________________________|");
			System.out.println("");
			
			System.out.println("Please enter your name");
			doctorName.add(sc.nextLine());

			System.out.println("Please enter your Mobile number");
			mobileNumber=(sc.nextLong());
			
			long mno;

				if(doctorMobileNumber.isEmpty())
					{
						doctorMobileNumber.add((mobileNumber));
						System.out.println("Enter password");
							doctorPassword.add(sc.next());
							System.out.println("Registration is Successfull.");
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
								System.out.println("Enter age:");
								doctorAge.add(sc.nextInt());
								System.out.println("Enter City: ");
								doctorCity.add(sc.next());
								System.out.println("Enter password");
								doctorPassword.add(sc.next());
								System.out.println("Registration is Successfull.");
								System.out.println("Details: Name: "+doctorName+" number:"+doctorMobileNumber);
								Thread.sleep(900);

					}
					else {
						System.out.println("same mobile numebr is not allowed\n");
						int index=doctorName.size()-1;
						doctorName.remove(index);
						Thread.sleep(500);

					}

				}
	}

	
	
	
	
	

void FeedBackPage() throws InterruptedException, IOException {
	new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	System.out.println("\t\t  _________________________");
	System.out.println("\t\t |                         |");
	System.out.println("\t\t |      Add Feedback       |");
	System.out.println("\t\t |_________________________|");
}

void FeedBackInfo() throws InterruptedException, IOException {
	
	System.out.println("\n Welcome  in 'Add Feedback Page'");
	
	
	
				System.out.println("\n Enter your name: \t");
				sc.nextLine();
				patientName_Feedback.add(sc.nextLine());
				
				System.out.println(" Enter your Feedback: \t");
				feedback.add(sc.next());
				System.out.println("\n You Added Feedback Successful..");
				

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
			System.out.println("\t\t  _________________________");
			System.out.println("\t\t |                         |");
			System.out.println("\t\t |     Book Appointment    |");
			System.out.println("\t\t |_________________________|");
		System.out.println("\n Welcome "+patientName.get(j)+", to book appointment, choose your doctor..");
		
		for(int i=0; i<=doctorName.size()-1; i++)
		{
			System.out.println((i+1)+". "+doctorName.get(i));
		}
		 byte choice=sc.nextByte();
		doctorID.add(choice);
		

		
			Thread.sleep(1000);

			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println("\t\t  _________________________");
			System.out.println("\t\t |                         |");
			System.out.println("\t\t |     Book Appointment    |");
			System.out.println("\t\t |_________________________|");
			
//		
				if(choice<=doctorName.size() && choice>0)
				{System.out.print("[");
					System.out.print("Name: "+doctorName.get(choice-1)+" , Age: "+doctorAge.get(choice-1)+" , Mobile: "+doctorMobileNumber.get(choice-1)+" , City: "+doctorCity.get(choice-1));
					System.out.print("]");
					System.out.println("Note: We are not accepting any bookings on Fridays");
//					System.out.println("");
					System.out.println("\n Enter your name: \t");
					sc.nextLine();
					patientNameBooking.add(sc.nextLine());
					System.out.println(" Enter your phone number: \t");
					patientPhoneBooking.add(sc.nextLong());
				
				
					System.out.println("plz Enter The Date of Booking (yyyy-mm-dd): \t");
					patientBookingDate.add(sc.next());
					
					System.out.println("\n Booking Successfull..");
count++;
					Thread.sleep(1000);
					
				}
				else 
				{
					System.out.println("\n enter correct input..");
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
		System.out.println("\t\t  _________________________");
		System.out.println("\t\t |                         |");
		System.out.println("\t\t |      Add Feedback       |");
		System.out.println("\t\t |_________________________|");
	System.out.println("\n Welcome "+patientName.get(j)+" in 'Add Feedback Page' , choose your doctor number..");
	
	for(int i=0; i<=doctorName.size()-1; i++)
	{
		System.out.println((i+1)+". "+doctorName.get(i));
	}
	byte choice2=sc.nextByte();
	doctorID.add(choice2);
	

	
	
	
		Thread.sleep(1000);

		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("\t\t  _________________________");
		System.out.println("\t\t |                         |");
		System.out.println("\t\t |       Add Feedback      |");
		System.out.println("\t\t |_________________________|");
		System.out.println(" \n\n \t\t We strive to satisfy you");
		
//	
			if(choice2<=doctorName.size() && choice2>0)
			{
				System.out.println("\n\nName: \t "+doctorName.get(choice2-1)+"\nAge: \t "+doctorAge.get(choice2-1)+"\nMobile:  "+doctorMobileNumber.get(choice2-1)+"\nCity: \t "+doctorCity.get(choice2-1));
				System.out.println("\n Enter your name: \t");
				sc.nextLine();
				patientName_Feedback.add(sc.nextLine());
				
				System.out.println(" Enter your Feedback: \t");
				feedback.add(sc.next());
				System.out.println("\n You Added Feedback Successful..");
				

				Thread.sleep(1000);
			
			}
			else 
			{
				System.out.println("\n enter correct input..");
				flag=true;
				Thread.sleep(1000);
			}
		
			
		
		
	
	
}

}

}

