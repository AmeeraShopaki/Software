package t;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DoctorRegesterationSteps {
	
    AppointmentTest A=new AppointmentTest();

	
	@Given("user in doctor Registration Page")
	public void user_in_doctor_Registration_Page() throws InterruptedException, IOException {
	    A.doctorRegPage();
	}

	@When("information for doctor is filled")
	public void information_for_doctor_is_filled() {
	    A.doctorInfo();
	}

	@Then("Registration doctor is Successfull")
	public void registration_doctor_is_Successfull() throws Exception {
	   A.doctorCheck();
	}



}
