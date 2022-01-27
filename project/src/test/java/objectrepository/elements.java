package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class elements 
{
	@FindBy(id="email_create")    
	public static WebElement username1;
	
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div/div/div[1]/form/div/div[3]/button/span")
	public static WebElement login1;
	
	
	
	@FindBy(xpath="(//input[@name='id_gender'])[1]")
	public static WebElement click1;
	
	@FindBy(id="customer_firstname")    
	public static WebElement customer1;
	
	@FindBy(id="customer_lastname")    
	public static WebElement customer2;
	
	@FindBy(id="email")    
	public static WebElement clear1;

	@FindBy(id="email")    
	public static WebElement email1;
	
	@FindBy(id="passwd")    
	public static WebElement email2;
	
	@FindBy(id="days")    
	public static WebElement days1;
	
	@FindBy(id="months")    
	public static WebElement month1;
	
	@FindBy(id="years")    
	public static WebElement years1;
	
	@FindBy(id="optin")    
	public static WebElement click2;
	
	@FindBy(id="firstname")    
	public static WebElement firstname1;
	
	@FindBy(id="lastname")    
	public static WebElement lastname2;
	
	@FindBy(id="company")    
	public static WebElement company;
	
	@FindBy(id="address1")    
	public static WebElement address3;
	
	@FindBy(id="address2")    
	public static WebElement address4;
	
	@FindBy(id="city")    
	public static WebElement city;
	
	@FindBy(id="id_state")    
	public static WebElement state;
	
	@FindBy(id="postcode")    
	public static WebElement postcode;
	
	@FindBy(id="id_country")    
	public static WebElement country1;
	
	@FindBy(id="other")    
	public static WebElement other;
	
	@FindBy(id="phone")    
	public static WebElement phone1;
	
	@FindBy(id="phone_mobile")    
	public static WebElement phone2;
	
	@FindBy(id="alias")    
	public static WebElement alias;
	
	@FindBy(xpath="//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[4]/button[1]/span[1]")    
	public static WebElement click3;

}
