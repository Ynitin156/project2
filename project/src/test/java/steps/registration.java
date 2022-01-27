package steps;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class registration 
{

	WebDriver driver;

	@Given("Open CHROME BROSWER and URL of the application")
	public void open_chrome_broswer_and_url_of_the_application() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\nitin.yadav\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication");
		driver.manage().window().maximize();

		System.out.println("Given Stt");
	}
	@When("Enter Valid Email id and click the button")
	public void enter_valid_email_id_and_click_the_button() throws InterruptedException, AWTException, IOException  
	{
		driver.findElement(By.id("email_create")).sendKeys("Ynitin14790@gmail.com");
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//input[@name=\"id_gender\"])[1]")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("Nitin");
		driver.findElement(By.id("customer_lastname")).sendKeys("Yadav");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("Ynitin14790@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("Ynitin00@");
		driver.findElement(By.id("days")).sendKeys("7");
		driver.findElement(By.id("months")).sendKeys("March");
		driver.findElement(By.id("years")).sendKeys("1996");
		driver.findElement(By.id("optin")).click();

		driver.findElement(By.id("firstname")).sendKeys("Nitin");
		driver.findElement(By.id("lastname")).sendKeys("Yadav");
		driver.findElement(By.id("company")).sendKeys("HCL");
		driver.findElement(By.id("address1")).sendKeys("old panchwati ghaziabad");
		driver.findElement(By.id("address2")).sendKeys("panchwati");
		driver.findElement(By.id("city")).sendKeys("GHAZIABAD");
		driver.findElement(By.id("id_state")).sendKeys("Washington");
		driver.findElement(By.id("postcode")).sendKeys("00000");
		driver.findElement(By.id("id_country")).sendKeys("United States");
		driver.findElement(By.id("other")).sendKeys("9910183070");
		driver.findElement(By.id("phone")).sendKeys("9810262894");
		driver.findElement(By.id("phone_mobile")).sendKeys("9910305181");
		driver.findElement(By.id("alias")).sendKeys("84panchwati");

		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[4]/button[1]/span[1]")).click();
		
		
		
		  Robot robot = new Robot();
		  Dimension screenshot_size=Toolkit.getDefaultToolkit().getScreenSize();
		  Rectangle rect = new Rectangle(screenshot_size); 
		  BufferedImage Source=robot.createScreenCapture(rect);
		  File destination = new File("C:\\Users\\nitin.yadav\\Downloads\\screenshot\\screen21.png");
		  ImageIO.write(Source,"png", destination);

		System.out.println("When Done");
	}

	@Then("Successful in login registration page and enter Details")
	public void successful_in_login_registration_page_and_enter_details() 
	{
		System.out.println("Then done");
	}

	@When("Enter Valid Email id and Enter valid pass and click the button")
	public void enter_valid_email_id_and_enter_valid_pass_and_click_the_button() throws AWTException, IOException 
	{
		driver.findElement(By.id("email")).sendKeys("Ynitin156@gmail.com");
		driver .findElement(By.id("passwd")).sendKeys("Ynitin00@");
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]")).click();

		driver.findElement(By.id("search_query_top")).sendKeys("T-shirts");
		driver.findElement(By.name("submit_search")).click();

		driver.findElement(By.linkText("Printed Chiffon Dress")).click();

		driver.findElement(By.id("quantity_wanted")).click();
		driver.findElement(By.id("group_1")).click();
		driver.findElement(By.id("color_15")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
		WebDriverWait wdw = new WebDriverWait(driver,20);
		wdw.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/a[1]/span[1]"))).click();

		WebDriverWait wdw2 = new WebDriverWait(driver,20);
		wdw2.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]/span[1]"))).click();

		WebDriverWait wdw3 = new WebDriverWait(driver,20);
		wdw3.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]"))).click();

		driver.findElement(By.id("cgv")).click();

		WebDriverWait wdw4 = new WebDriverWait(driver,20);
		wdw4.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/p[1]/button[1]/span[1]"))).click();	
		
		
		
		  Robot robot = new Robot();
		  Dimension screenshot_size=Toolkit.getDefaultToolkit().getScreenSize();
		  Rectangle rect = new Rectangle(screenshot_size); 
		  BufferedImage Source=robot.createScreenCapture(rect);
		  File destination = new File("C:\\Users\\nitin.yadav\\Downloads\\screenshot\\screen22.png");
		  ImageIO.write(Source,"png", destination);

		System.out.println("When done");
	}

	@Then("Successful in login registration page and enter the product and add to the cart")
	public void successful_in_login_registration_page_and_enter_the_product_and_add_to_the_cart()
	{

		System.out.println("Then done");
	}








}