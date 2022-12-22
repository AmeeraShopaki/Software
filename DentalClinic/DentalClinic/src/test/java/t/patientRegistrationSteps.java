package t;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class patientRegistrationSteps {
	
    AppointmentTest A=new AppointmentTest();

    
	@Given("user in Patient Registration Page")
	public void user_in_Patient_Registration_Page() throws InterruptedException, IOException {
	A.patientRegPage();
	
	}

	@When("{string} and {string} and {string} and {string} is filled")
	public void and_and_and_is_filled(String string, String string2, String string3, String string4) {
	   A.patienInfo();
	}

	@Then("Registration patient is Successfull")
	public void registration_patient_is_Successfull() throws Exception {
	   A.patientcheck();
	}



}
