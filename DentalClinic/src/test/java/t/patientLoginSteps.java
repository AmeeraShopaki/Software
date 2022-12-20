package t;


import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class patientLoginSteps {
	
    AppointmentTest A=new AppointmentTest();

	@Given("patient in login page")
	public void patient_in_login_page() throws Exception {
	   
	A.patient();
	}

	@When("patient enter correct name and correct password")
	public void patient_enter_correct_name_and_correct_password() throws Exception {
A.patiententer();

	}

	@Then("give patient authorities")
	public void give_patient_authorities() throws InterruptedException, IOException {
		A.patientAuthorities();

	}

	@When("patient enter false {string} or false {string}")
	public void patient_enter_false_or_false(String string, String string2) {
		A.patiententer();
		
	}
	

	@Then("don't give patient authorities with wrong info")
	public void don_t_give_patient_authorities_with_wrong_info() throws InterruptedException, IOException {
		A.patientAuthorities();
	}



}
