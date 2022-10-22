package t;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;



public class addpatientSteps {
	 patient b=new patient();
	    Admin user=new Admin();
	    clinic x=new clinic();
	    boolean correct;


	    @Given("the admin is logged in")
	    public void theAdminIsLoggedIn() {
	        user.login(123,123);
	    }


	    @When("{string} and {string} and {string} is filled")
	    public void and_and_is_filled(String address, String Pname, String phone) {
	        b.setAddress(address);;
	        b.setPname(Pname);
	        b.setPhone(phone);
	    }
	    @When("{string} is filled ")
	    public void is_filled(String ISBN) {
	        
	            b.setISBN(ISBN);
	      
	    }
	    @Then("add the patient information to the clinic")
	    public void addThePatientInformationToTheClinic() {
	        if(correct){
	            x.addPatient(b,user);
	            x.getPatient(0);
	            assertFalse(x.empty());
	        }
	        else
	            assertTrue(false);
	    }

	    @Given("admin is not logged in")
	    public void adminIsNotLoggedIn() {
	        user.logOut();
	    }
	    @Then("show warning;")
	    public void showWarning() {
	        x.addPatient(b,user);
	        assertTrue(x.empty());
	    }
}
