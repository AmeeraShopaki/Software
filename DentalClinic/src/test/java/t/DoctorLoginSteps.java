package t;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DoctorLoginSteps {
	
    AppointmentTest A=new AppointmentTest();

	
    @Given("Doctor in login page")
    public void doctor_in_login_page() throws Exception {
           A.doctorC();
    }

	@When("Doctor enter correct name and correct password")
	public void doctor_enter_correct_name_and_correct_password() {

		A.doctorenter();
	  
	}

	@Then("give Doctor authorities")
	public void give_Doctor_authorities() throws Exception {
	A.dataAdd();
		A.doctorAuthorietes();
	    
	}

	@When("Doctor enter false {string} or false {string}")
	public void doctor_enter_false_or_false(String string, String string2) {
		  A.doctorenter();

	}

	@Then("don't give Doctor authorities with wrong info")
	public void don_t_give_Doctor_authorities_with_wrong_info() throws Exception {
		A.dataAdd();

		A.doctorAuthorietes();

	}



}
