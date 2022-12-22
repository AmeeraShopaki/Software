package t;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddServiceSteps {
    AppointmentTest A=new AppointmentTest();

    @Given("user in servies add Page")
    public void user_in_servies_add_Page() throws InterruptedException, IOException {
		A.serviesRegPage();
		
	}

	@When("{string} and {string} and {string} and {string} is enter")
	public void and_and_and_is_enter(String string, String string2, String string3, String string4) {
	   A.serviesInfo();
	}

	@Then("add service and offer is Successfull")
	public void add_service_and_offer_is_Successfull() throws Exception {
	   A.servicecheck();
	}


}
