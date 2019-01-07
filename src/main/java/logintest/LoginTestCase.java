package logintest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTestCase {
	
	@Given("^User is at the homepage$")
	public void User_is_at_the_homepage() {
		System.out.println("User_is_at_the_homepage");
		
	}
	
	@When ("^user inserts username and password$")
		public void user_inserts_username_and_password() {
		System.out.println("user inserts username and password$");
	}
	
	
	@Then ("^user is able to login sucessfully$")
	public void user_is_able_to_login_sucessfully() {
		System.out.println("user is able to login sucessfully");
		
	}

}
