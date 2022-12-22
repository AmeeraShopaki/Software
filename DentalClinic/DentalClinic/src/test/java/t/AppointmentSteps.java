package t;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AppointmentSteps {
    AppointmentTest A=new AppointmentTest();

	
	@Given("user in add Appointmaent  Page1")
	public void user_in_add_Appointmaent_Page1() throws InterruptedException, IOException {
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("\t\t  _________________________");
		System.out.println("\t\t |                         |");
		System.out.println("\t\t |     Book Appointment    |");
		System.out.println("\t\t |_________________________|");
	}

	@When("patient is not stored")
	public void patient_is_not_stored() throws InterruptedException, IOException {
	    A.patiententer();
	}

	@Then("add Appointment is not Successfull")
	public void add_Appointment_is_not_Successfull() throws InterruptedException, IOException {
		 A.patientAuthorities();
		 
	}

	@Given("user in add Appointmaent  Page")
	public void user_in_add_Appointmaent_Page() throws InterruptedException, IOException {
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("\t\t  _________________________");
		System.out.println("\t\t |                         |");
		System.out.println("\t\t |     Book Appointment    |");
		System.out.println("\t\t |_________________________|");
	}

	@When("patient is  stored")
	public void patient_is_stored() throws InterruptedException, IOException {
		System.out.println("to book an appointment should Register...");
		A.patientRegPage();
		   A.patienInfo();
		   A.patientcheck();

		
		A.patiententer();
		 A.patientAuthorities();

	}

	@Then("add Appointment is Successfull")
	public void add_Appointment_is_Successfull() throws InterruptedException, IOException {
	A.dataAdd();
		A.Appointment();
	}



}
