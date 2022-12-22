package t;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddFeedBackSteps {
    AppointmentTest A=new AppointmentTest();


@Given("user in add FeedBack  Page1")
public void user_in_add_FeedBack_Page1() throws InterruptedException, IOException {
	new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	System.out.println("\t\t  _________________________");
	System.out.println("\t\t |                         |");
	System.out.println("\t\t |      Add Feedback       |");
	System.out.println("\t\t |_________________________|");
}

@When("This patient is not stored")
public void this_patient_is_not_stored() {
	 A.patiententer();
}

@Then("add FeedBack is not Successfull")
public void add_FeedBack_is_not_Successfull() throws InterruptedException, IOException {
	 A.patientAuthorities();
}

@Given("user in add FeedBack  Page")
public void user_in_add_FeedBack_Page() throws InterruptedException, IOException {
	new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	System.out.println("\t\t  _________________________");
	System.out.println("\t\t |                         |");
	System.out.println("\t\t |      Add Feedback       |");
	System.out.println("\t\t |_________________________|");
}

@When("this patient is  stored")
public void this_patient_is_stored() throws InterruptedException, IOException {
	System.out.println("to add FeedBack should Register...");
	A.patientRegPage();
	   A.patienInfo();
	   A.patientcheck();
	A.patiententer();
	 A.patientAuthorities();
}

@Then("add FeedBack is Successfull")
public void add_FeedBack_is_Successfull() throws InterruptedException, IOException {
   A.dataAdd();
   A.FeedBack();
}






}
