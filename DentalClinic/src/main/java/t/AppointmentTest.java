package t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;



public class AppointmentTest{
	static Doctor D =new Doctor();
	static Patient P=new Patient();
	static Admin a = new Admin();
	private static final String ENTER_CORRECT_INPUT = "\n enter correct input..";
	static Logger l = Logger.getLogger(AppointmentTest.class.getName());


static int count=0;
static Scanner sc=new Scanner(System.in);





void Appointment() throws InterruptedException, IOException {
	boolean flag1=false;
	int j;
for(j=0; j<=P.patientName.size()-1;j++)
{
if((P.nameP).equals(P.patientName.get(j))&&(P.passwordP).equals(P.patientPassword.get(j)))
	{
		flag1=true;

		break;
	}
	
}
	if(flag1==true)
	{		
		Thread.sleep(1000);
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	
	
		 l.info(P.patientName.get(j)+", to book appointment, choose your doctor..");
		
		for(int i=0; i<=D.doctorName.size()-1; i++)
		{
			 l.info((i+1)+". "+D.doctorName.get(i));
		}
		 byte choice=sc.nextByte();
		D.doctorID.add(choice);
		

		
			Thread.sleep(1000);

			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			
			
		
				if(choice<=D.doctorName.size() && choice>0)
				{ l.info("[");
l.info("Name: "+D.doctorName.get(choice-1)+" , Age: "+D.doctorAge.get(choice-1)+" , Mobile: "+D.doctorMobileNumber.get(choice-1)+" , City: "+D.doctorCity.get(choice-1));
				 l.info("]");
				 l.info("Note: We are not accepting any bookings on Fridays");
			
					sc.nextLine();
					P.patientNameBooking.add(sc.nextLine());
					 l.info(" Enter your phone number: \t");
					P.patientPhoneBooking.add(sc.nextLong());
				
				
					 l.info("plz Enter The Date of Booking (yyyy-mm-dd): \t");
					P.patientBookingDate.add(sc.next());
					
					 l.info("\n Booking Successfull..");
count++;
					Thread.sleep(1000);
					
				}
				else 
				{
					 l.info(ENTER_CORRECT_INPUT);
				
					Thread.sleep(1000);
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

