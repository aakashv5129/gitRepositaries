package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class practice 
{
	public static void main(String[] args) throws InterruptedException 
	{
		  WebDriver dr = new ChromeDriver();
	        dr.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
	        dr.manage().window().maximize();
	        
	        WebElement w = dr.findElement(By.id("name"));
	        w.click();
	        w.sendKeys("Kevin");
	        Thread.sleep(1000);
	        WebElement w2 = dr.findElement(By.id("email"));
	        w2.click();
	        w2.sendKeys("sha@gmail.com");
	        //WebElement w3 = dr.findElement(By.id("gender"));
	        //w3.click();
	        Thread.sleep(1000);
	        WebElement w4 = dr.findElement(By.xpath("//input[@id='name']//following::input[3]"));
	        w4.click();        
	        Thread.sleep(1000);
	        WebElement w5 = dr.findElement(By.id("mobile"));
	        w5.click();    
	        w5.sendKeys("9399999074");
	        Thread.sleep(1000);
	        WebElement dob= dr.findElement(By.id("dob"));
	        dob.click();    
	        dob.sendKeys("11-01-2000");
	        Thread.sleep(1000);
	        WebElement sub= dr.findElement(By.id("subjects"));
	        sub.click();    
	        
	        sub.sendKeys("MUSIC");
	        WebElement hobby= dr.findElement(By.xpath("//input[@id='name']//following::input[10]"));
	        hobby.click();    
	        
	        WebElement add= dr.findElement(By.xpath("//textarea[@placeholder='Currend Address']"));
	        add.click();    
	        add.sendKeys("Ohio");
	        
	        WebElement state = dr.findElement(By.xpath("//select[@id='state']"));
	        Select sr = new Select(state);
	        System.out.println(state.getText());
	        sr.selectByIndex(2);

	        WebElement city = dr.findElement(By.xpath("//select[@id='city']"));
	        Select sr2 = new Select(city);
	        sr2.selectByIndex(2);
	        
	        WebElement pic = dr.findElement(By.name("picture"));
	        pic.sendKeys("D:\\Pictures_S\\rony.webp");

	        WebElement login = dr.findElement(By.xpath("//a[@href='login.php']"));
	        login.click();
	        
	    }

	}