package t;
import java.util.*;
import java.io.*;
public class AppointmentBooking {
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

ArrayList<String>companytName = new ArrayList<String>();
ArrayList<Long>companyMobileNumber = new ArrayList<Long>();
ArrayList<String>companyLocation= new ArrayList<String>();

ArrayList<String>servicetName = new ArrayList<String>();
ArrayList<Integer>Discount = new ArrayList<Integer>();
ArrayList<Integer>cost = new ArrayList<Integer>();
ArrayList<Integer>costAfterDiscount = new ArrayList<Integer>();
ArrayList<String>serviceDescription= new ArrayList<String>();


ArrayList<Integer>patientAgeBooking = new ArrayList<Integer>();
ArrayList<String>patientNameBooking = new ArrayList<String>();
ArrayList<String>patientGengerBooking = new ArrayList<String>();
ArrayList<Byte>doctorID = new ArrayList<Byte>();


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
	doctorCity.add("nablus");
	doctorCity.add("salfet");
	doctorCity.add("nablus");
}

	

void admin() throws Exception
{
	Scanner sc=new Scanner(System.in);
	byte choice;
	boolean flag=true;

	while(flag)
	{
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("\t\t  _________________________");
		System.out.println("\t\t |                         |");
		System.out.println("\t\t |       WELCOME ADMIN     |");
		System.out.println("\t\t |_________________________|");
System.out.print("\n\n1.Doctor list\t2.Registered Patients\t3.Pateints with Appointment\t4.Add Companies and drug providers \n\n \t5.Companies List  \t6.Add a service or offer \t7.Service List \n\n Enter Your Choice.");
		choice=sc.nextByte();
		switch(choice)
		{
		case 1:
			for(int i=0; i<=doctorName.size()-1; i++)
			{
				System.out.println("Name: \t "+doctorName.get(i));
			
			}
			byte menuCHoice;
			System.out.println("\n\n1. Main menu\t 2. Previous menu");
			menuCHoice=sc.nextByte();
			if(menuCHoice==1)
			{
				flag=false;
				
			}
			else
			{
				break;
			}

			break;

		case 2:
				if(patientName.isEmpty())
				{
					System.out.println("No Registered Patients yet.");
					Thread.sleep(3000);
					break;
				}
				else 
				{
					for(int i=0; i<=patientName.size()-1; i++)
					{
						System.out.println(i+". "+patientName.get(i));
					}

					System.out.println("\n\n1. Main menu\t 2. Previous menu");
					menuCHoice=sc.nextByte();
					if(menuCHoice==1)
					{
						flag=false;
						
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
				System.out.println("\nNo Appointments yet.");
				Thread.sleep(3000);
				break;
			}
			
			else
			{
				for(int i=0; i<=patientNameBooking.size()-1; i++)
				{
					System.out.println(i+". "+patientNameBooking.get(i));
				}

				Thread.sleep(5000);
				flag=false;

			}
			break;
			//4. Add Companies and drug providers 
		case 4:

			CompaniesRegistration();
			flag=false;
			break;
			//4.Companies and drug providers 
			
			//5 company list
			
		case 5:
			if(companytName.isEmpty())
			{
				System.out.println("No Registered Companyt yet !!");
				Thread.sleep(3000);
				break;
			}
			else 
			{
				for(int i=0; i<=companytName.size()-1; i++)
				{System.out.println((i+1));
					System.out.println("Company Name    : "+companytName.get(i));
					System.out.println("Company Location: "+companyLocation.get(i));
					System.out.println("Mobile Number   : "+companyMobileNumber.get(i));
					System.out.println("");
				}

				System.out.println("\n\n1. Main menu\t 2. Previous menu");
				menuCHoice=sc.nextByte();
				if(menuCHoice==1)
				{
					flag=false;
					
				}
				else
				{
					break;
				}
			}
			
			break;
		
//		5 company list
		case 6:

			serviceRegistration();
			flag=false;
			break;
		case 7:
			if(servicetName.isEmpty())
			{
				System.out.println("There are no registered services or offers  yet !!");
				Thread.sleep(3000);
				break;
			}
			else 
			{
				for(int i=0; i<=servicetName.size()-1; i++)
				{System.out.println((i+1));
					System.out.println("Service Name: "+servicetName.get(i));
					System.out.println("Description : "+serviceDescription.get(i));
					System.out.println("Discount    : "+Discount.get(i));
					System.out.println("");
					System.out.println("cost Before Discount: "+cost.get(i));
					float cad=(float)(cost.get(i) - ((float)(Discount.get(i)/100.0) * cost.get(i) ) );
					System.out.println("cost After Discount : "+ cad );
					System.out.println("");
				}

				System.out.println("\n\n1. Main menu\t 2. Previous menu");
				menuCHoice=sc.nextByte();
				if(menuCHoice==1)
				{
					flag=false;
					
				}
				else
				{
					break;
				}
			}
			
			break;
		default:
				System.out.println("Wrong choice");
				Thread.sleep(1000);
				flag=true;
		}


	}
	
}

void patient() throws Exception
{
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
		System.out.println("1.Login \t 2.Registration\n");
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
					patientLogin();
					flag=false;
					
				}
				
				break;
			case 2:
				patientRegistration();
				flag=false;
				break;
			

			default:
				System.out.println("\nYou entered wrong choice. enter your choice again....!!!");
				flag= true;
				Thread.sleep(1000);
				break;
		}
	}
}


void doctor() throws Exception
{
	
	
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
		

		System.out.println("1. Login \t 2.Registration");
		choice=sc.nextInt();

		switch(choice)
		{
		case 1:
//			if(doctorName.isEmpty())
//			{
//				System.out.println("Register first...!");
//				flag=false;
//				Thread.sleep(500);
//				break;
//
//			}
//			else
//			{
				doctorLogin();
				flag=false;
//			}
			break;
		case 2:
			doctorRegistration();
			flag= false;
			break;

		default:
			System.out.println("Entered Wrong choice..");
			flag=true;
		}
	}	

}


void patientLogin()throws Exception
{

	Scanner sc=new Scanner(System.in);
	boolean flag=true;
	String name;
	byte choice;
	new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	System.out.println("\t\t  _________________________");
	System.out.println("\t\t |                         |");
	System.out.println("\t\t |         Login 		   |");
	System.out.println("\t\t |_________________________|");

	System.out.println("Enter your name");
	name=sc.next();
	System.out.println("Enter your Password");
	String password=sc.next();

		
		boolean flag1=false;
		int j;
	for(j=0; j<=patientName.size()-1;j++)
	{
		
		if((patientName.get(j)).equals(name)&&(patientPassword.get(j)).equals(password))
		{
			flag1=true;

			break;
		}
		
	}
	
	System.out.println("select 1.to book appointment   2.to View the available services and offers ");
	int select=sc.nextInt();
	switch (select) {
	case 1 :
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
		choice=sc.nextByte();
		doctorID.add(choice);
		

		
		while(flag)
		{
			Thread.sleep(1000);

			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println("\t\t  _________________________");
			System.out.println("\t\t |                         |");
			System.out.println("\t\t |     Book Appointment    |");
			System.out.println("\t\t |_________________________|");
			
			
			//for(int i=0; i<=doctorName.size()-1;i++)
			//{
				if(choice<=doctorName.size() && choice>0)
				{
					System.out.println("\n\nName: \t "+doctorName.get(choice-1)+"\nAge: \t "+doctorAge.get(choice-1)+"\nMobile:  "+doctorMobileNumber.get(choice-1)+"\nCity: \t "+doctorCity.get(choice-1));
					System.out.println("\n Enter your name: \t");
					sc.nextLine();
					patientNameBooking.add(sc.nextLine());
					System.out.println(" Enter your age: \t");
					patientAgeBooking.add(sc.nextInt());
					System.out.println(" Enter your gender: \t");
					patientGengerBooking.add(sc.next());

					System.out.println("\n Booking Successfull..");

					Thread.sleep(1000);
					flag=false;
					break;
				}
				else 
				{
					System.out.println("\n enter correct input..");
					flag=true;
					Thread.sleep(1000);
				}
			
				
			//}
		}	

	}
	else 
	{
		System.out.println("Login unsuccessfull..");
		Thread.sleep(900);
		flag=false;
	}
	break;
	case 2 :
		if(servicetName.isEmpty())
		{
			System.out.println("There are no registered services or offers  yet !!");
			Thread.sleep(3000);
			break;
		}
		else 
		{
			for(int i=0; i<=servicetName.size()-1; i++)
			{System.out.println((i+1));
				System.out.println("Service Name: "+servicetName.get(i));
				System.out.println("Description : "+serviceDescription.get(i));
				
				System.out.println("");
				
				float cad=(float)(cost.get(i) - ((float)(Discount.get(i)/100.0) * cost.get(i) ) );
				System.out.println("cost After Discount : "+ cad );
				System.out.println("");
			}

			System.out.println("\n\n1. Main menu\t 2. Previous menu");
			byte menuCHoice=sc.nextByte();
			if(menuCHoice==1)
			{
				flag=false;
				
			}
			else
			{
				break;
			}
		}
		
		break;
	default:
			System.out.println("Wrong choice");
			Thread.sleep(1000);
			flag=true;
	
		}
}
	

void patientRegistration() throws Exception
{
	Scanner sc=new Scanner(System.in);
	int i=0;
	long mobileNumber;
	new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	System.out.println("\n");
	System.out.println("\t\t | Welcome to Patient Registration Page!|");
	System.out.println("\n");
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
	System.out.println("\n");
	System.out.println("\t\t | welcome admain in  ");
	System.out.println("\t\t | Companies and drug providers Registration Page!|");
	System.out.println("\n");
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
			System.out.println("same mobile numebr is not allowed\n");
			Thread.sleep(500);
		}
	}
}
 
void serviceRegistration()throws Exception

{
	Scanner sc=new Scanner(System.in);
	
	int discount;
	new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	System.out.println("\n");
	System.out.println("\t\t | welcome admain in  ");
	System.out.println("\t\t | service and offer Registration Page!|");
	System.out.println("\n");
	System.out.println("Please enter service name : ");
	servicetName.add(sc.nextLine());
	System.out.println("enter Service description : ");
	serviceDescription.add(sc.nextLine());
	System.out.println("Enter price before discount %");
	cost.add(sc.nextInt());
	System.out.println("Enter discount %");
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

		System.out.println("\t\t ----------------------------------");
		System.out.println("\t\t| This is doctor registration Page |");
		System.out.println("\t\t ----------------------------------");
		System.out.println("\n");
		
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

void doctorLogin() throws Exception
{
	Scanner sc=new Scanner(System.in);
	String n;

	new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	System.out.println("\t\t ----------------------------------------");
	System.out.println("\t\t|       This is doctor login page        |");
	System.out.println("\t\t ----------------------------------------");
	System.out.println("Enter your Username");
	n=sc.next();
	System.out.println("Enter your Password");
	String password=sc.next();
	int i=0;
	byte choice;
		
		boolean flag=false;
		boolean flag11=true;

	for(i=0; i<=doctorName.size()-1;i++)
	{
		
		if((doctorName.get(i)).equals(n)&&(doctorPassword.get(i)).equals(password))
		{
			flag=true;
			break;
		}
	}
	
		if(flag==true)
		{
			while(flag11)
			{
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				System.out.println("\t\t ----------------------------------------");
				System.out.println("\t\t| Welcome Doctor "+doctorName.get(i)+"   |");
				System.out.println("\t\t ----------------------------------------");
				System.out.println("\n\nPress 1 to see your Appointments. \n");
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
							{
								System.out.println("patient name: "+patientNameBooking.get(j) );
								j++;
								
							}
						}
						Thread.sleep(4000);
						
					}
					if((doctorID.isEmpty()==true))
						{
							System.out.println("No Appointments...!");
							Thread.sleep(3000);
							flag11=true;
						}

					break;
				}
			}
		}
		else {
				System.out.println("Login unsuccessfull..");
				Thread.sleep(900);
				
		}
			
}

public static void main(String[] args) throws Exception   
{
	AppointmentBooking ap=new AppointmentBooking();
	Scanner sc=new Scanner(System.in);
	ap.dataAdd();
	boolean flag=true;
	while(flag=true)
	{
		
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	
		System.out.println("---------------------------------------------------------------------");
		System.out.println("\t\t | Welcome to Doctor AppointmentBooking |");
		System.out.println("----------------------------------------------------------------------\n\n");
			System.out.println("\n1. Doctor \t 2. Patient \t 3. Admin \t 4. Exit");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:
				ap.doctor();
				flag=true;
				break;
				case 2:
				ap.patient();										
				flag=true;
				break;
				case 3:
				
				ap.admin();
				flag= true;
				//Thread.sleep(1000);
				break;
				default:
				System.exit(0);

	}	}
}
}