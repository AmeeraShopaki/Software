package t;
  

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




public class AdminLoginSteps {
    AppointmentTest A=new AppointmentTest();

     @Given("admin should have name and password")
     public void admin_should_have_name_and_password() throws Exception {
    	A.admin();
    	

    		
     }

     @When("admin enter correct name and correct password")
     public void admin_enter_correct_name_and_correct_password() throws Exception {
    	 A.enteradmin();
 		A.adminTrue();
 		
     }

     @Then("give admin authorities")
     public void give_admin_authorities() throws Exception {
    
         A.adminauthorities();
  
     }

     @When("admin enter correct {string} and false {string}")
     public void admin_enter_correct_and_false(String string, String string2) throws Exception {
        A.enteradmin();
        A.wrongpass();
        
     }

     @Then("don't give admin authorities with wrong pass")
     public void don_t_give_admin_authorities_with_wrong_pass() {
    	 if(A.flagn==true && A.flagp==false) 
    			System.out.println("Unsuccessful login, the  passwprd is not correct");

     }

     @When("admin enter false {string} and correct {string}")
     public void admin_enter_false_and_correct(String string, String string2) throws Exception {
      A.enteradmin();
      A.wrongname();
      
     }

     @Then("don't give admin authorities with wrong name")
     public void don_t_give_admin_authorities_with_wrong_name() {
    	 if(A.flagn==false&&A.flagp==true)System.out.println("Unsuccessful login, the admin name is not associated with an account"); 

     }

     @When("admin enter false {string} and false {string}")
     public void admin_enter_false_and_false(String string, String string2) throws Exception {
      A.enteradmin();
      A.wronginf();
      
     }

     @Then("don't give admin authorities with wrong information")
     public void don_t_give_admin_authorities_with_wrong_information() {
    	 if(A.flagp==false &&A.flagn==false)System.out.println("Unsuccessful login, uncorrect admin name & passward"); 

     }


}
