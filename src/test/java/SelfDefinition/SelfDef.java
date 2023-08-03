package SelfDefinition;

import org.openqa.selenium.By;

import BaseLayer.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class SelfDef extends BaseClass{
	
	@Given("User is on register page")
	public void user_is_on_register_page() {
		
		initialization();

	}

	@When("user enters firstname, lastname, phone, address,city,state,postalcode,country,username, password and confirmpassword.")
	public void user_enters_firstname_lastname_phone_address_city_state_postalcode_country_username_password_and_confirmpassword() {
	    driver.findElement(By.name("firstName")).sendKeys("Devansh");
	    driver.findElement(By.name("lastName")).sendKeys("Patil");
	    driver.findElement(By.name("phone")).sendKeys("8600");
	    driver.findElement(By.name("userName")).sendKeys("dev@gmail.com");
	    driver.findElement(By.name("address1")).sendKeys("Malkapur");
	    driver.findElement(By.name("city")).sendKeys("Karad");
	    driver.findElement(By.name("state")).sendKeys("Maharashtra");
	    driver.findElement(By.name("postalCode")).sendKeys("4110510");
	    driver.findElement(By.name("email")).sendKeys("dev@gmail.com");
	    driver.findElement(By.name("userName")).sendKeys("dev@gmail.com");
	    driver.findElement(By.name("password")).sendKeys("1234");
	    driver.findElement(By.name("confirmPassword")).sendKeys("1234");
	}

	@Then("click on submit")
	public void click_on_submit() {
	   driver.findElement(By.name("submit")).click();
	}


}
