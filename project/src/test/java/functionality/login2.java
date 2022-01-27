package functionality;

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
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import objectrepository.elements2;

public class login2 
{
	@Test
	  public void loginfun() throws IOException, AWTException, InterruptedException
	  {
	  System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\nitin.yadav\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://automationpractice.com/index.php?controller=authentication");
	  driver.manage().window().maximize();
	  
	  PageFactory.initElements(driver,elements2.class);
	  
	  elements2.username2.sendKeys("Ynitin1566@gmail.com");
	  elements2.password2.sendKeys("Ynitin000@");
	  
	  WebDriverWait wdw = new WebDriverWait(driver,20);
	  wdw.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]")));
	  elements2.click2.click();
	  
	 
	  
	  elements2.search1.sendKeys("dress");
	  elements2.sumbit1.click();
	  
	  elements2.sumbit2.click();
	  elements2.sumbit3.click();
	  elements2.sumbit3.click();
	  elements2.submit4.click();
	  elements2.submit5.click();
	  elements2.submit6.click();
	  
	  //WebDriverWait wdw2 = new WebDriverWait(driver,20);
	  //wdw2.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/a[1]/span[1]"))).click();
	  //elements2.submit7.click();
	  
	  //WebDriverWait wdw3 = new WebDriverWait(driver,20);
	  //wdw3.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]/span[1]"))).click();
	  //elements2.submit8.click();
	  
	  //WebDriverWait wdw4 = new WebDriverWait(driver,20);
	  //wdw4.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/ul[1]/li[3]/span[1]"))).click();
	  //elements2.submit9.click();
	  
	  //elements2.submit10.click();
	  
	  //WebDriverWait wdw5 = new WebDriverWait(driver,20);
	  //wdw5.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/p[1]/button[1]/span[1]"))).click();
	  //elements2.submit11.click();
	  
	  
	  
	  
	  try
	  {
	  Robot robot = new Robot();
	  Dimension screenshot_size=Toolkit.getDefaultToolkit().getScreenSize();
	  Rectangle rect = new Rectangle(screenshot_size); 
	  BufferedImage Source=robot.createScreenCapture(rect);
	  File destination = new File("C:\\Users\\nitin.yadav\\Downloads\\screenshot\\screen5.png");
	  ImageIO.write(Source,"png", destination);
	  }
	  catch(Exception e)
	  {
		  System.out.println("Screnshot Not Genearted Succesfull");
	  }
	  }   
	







	
}
