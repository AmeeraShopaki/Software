package t;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddCompaniesSteps {

    AppointmentTest A=new AppointmentTest();

	@Given("user in company Registration Page")
	public void user_in_company_Registration_Page() throws InterruptedException, IOException {
	 A.companiesRegPage();
	}

	@When("{string} and {string} and {string}  is filled")
	public void and_and_is_filled(String string, String string2, String string3) {
	  A.companiesInfo();
	}


	@Then("Registration comany is Successfull")
	public void registration_comany_is_Successfull() throws InterruptedException {
		 A.companycheack();	    
	}


}
