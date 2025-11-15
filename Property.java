package Day4;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Property {
  @Test
  public void f() throws IOException 
  {
	  WebDriver dr = new  ChromeDriver();
		 dr.manage().window().maximize();
		 Properties p = new Properties();
		 FileReader fr=new FileReader("C:\\Users\\CDAC\\Videos\\Test\\src\\Day4\\input.properties");
		 p.load(fr);
		 dr.get(p.getProperty("url"));
		 
		 WebElement we1 = dr.findElement(By.id("username"));
		 we1.click();
	 	 we1.sendKeys(p.getProperty("Username"));
	 	 
	 	 WebElement we2 = dr.findElement(By.id("password"));
	 	 we2.sendKeys(p.getProperty("Password"));
	 	 we2.click();
	 	 
	 	WebElement we3  = dr.findElement(By.id("submit"));
	 	we2.click();
	 	 
  }
}