package t;
import java.util.*;
import java.io.*;

public class main {

	public static void main(String[] args) throws Exception {
		System.out.println("           __________________________________________________________");
		System.out.println("          |                                                          |");
		System.out.println("          |         WELCOME TO AL AREEN DENTAL CENTER                |");
		System.out.println("          |                                                          |");
		System.out.println("          |__________________________________________________________|");
		System.out.println("");
		System.out.println("                 Your great smile begins with a great dentists       ");
		System.out.println("                       Special People For Special Smiles           ");
		 System.out.println(""); 

		 AppointmentBooking ap = new AppointmentBooking();
		 Scanner sc = new Scanner(System.in);
	 ap.dataAdd();
		 boolean flage = true ;
		 while(flage = true) {
			 new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
			 System.out.println("");
			 System.out.println("");		 
System.out.println("           __________________________________________________________");
System.out.println("          |                                                          |");
System.out.println("          |                 WELCOME IN HOME PAGE                     |");
System.out.println("          |                                                          |");
System.out.println("          |__________________________________________________________|");
System.out.println("");
System.out.println("");

System.out.println("          1.DOCTOR  2.PATIENT   3.ADMIN   4.ABOUT  5.CONTACT US  6.EXIT ");
int choises= sc.nextInt();
switch(choises) {
case 1:
	ap.doctor();
	flage=true;
	break;
case 2:
	ap.patient();
	flage=true;
	break;
case 3:
	ap.admin();
	flage=true;
	break;
case 4:
	System.out.println("");

System.out.println("");
System.out.println("                            Hi! We’re \"DENTALS CENTER\" …       ");
System.out.println("          This center was established by Dr. Sawsan, Dr. Haya and Dr. Ahmed");
System.out.println("          Our people set us apart. We’re passionate, dedicated, and friendly");
System.out.println("");
System.out.println("                                       The story");
System.out.println("                                        starts");
System.out.println("                                         here!");
System.out.println("");
System.out.println("                       Our Humble Beginnings was in 2017-2018");
System.out.println("                     Transition to Full Service in December 2019 ");
System.out.println("                           Phase Two Expansion July 2021");
System.out.println("");
System.out.println("                                        Be Part");
System.out.println("                                         Of Our");
System.out.println("                                         Story!");
System.out.println("");
			flage=true;
	break;
case 5:	System.out.println("");	System.out.println("");
	System.out.println("");
	System.out.println("");
System.out.println("           Let's Get In Touch!                 ");
System.out.println("          __________________________________________________________");
System.out.println("");
System.out.println("          Call us or send us an email ");
System.out.println("          we will get back to you as soon as possible!");
System.out.println("          Are you ready to start a great experience with us ?");
System.out.println("");
System.out.println("          - (972) 491-6663                  ");
System.out.println("          - Nablus, Al-Shuhada Street");
System.out.println("          - alaren_center@gmail.com");
System.out.println("");	System.out.println("");	System.out.println("");
	flage=true;
	break;
	
	default:
	{System.out.println("YOU LOG OUT FROM THE SYSTEM :) ");
		System.exit(0);}
		
}
		 }
		 
	}

}
