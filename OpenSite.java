package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenSite {
	public static void main(String[] args) throws InterruptedException 
	{	
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.practicetestautomation.com/practice-test-login/");
		dr.manage().window().maximize();	
//		dr.findElement(By.id("username")).click();
//		dr.findElement(By.id("username")).sendKeys("tdhszt");
//		dr.findElement(By.id("username")).clear();
//		
//		dr.findElement(By.id("username")).sendKeys("student");
//		Thread.sleep(2000);
//		dr.findElement(By.id("password")).click();
//		dr.findElement(By.id("password")).sendKeys("fdhgzf23");
//		Thread.sleep(2000);
//		dr.findElement(By.id("password")).clear();
//		Thread.sleep(2000);
//		dr.findElement(By.id("password")).sendKeys("Password123");
//		Thread.sleep(2000);
//		dr.findElement(By.id("submit")).click();
//		Thread.sleep(2000);
//      dr.findElement(By.id("Log out")).click();
		WebElement we = dr.findElement(By.id("username"));
        we.click();
        Thread.sleep(1000);
        we.sendKeys("Welcome to");
//        Thread.sleep(1000);
//        we.clear();
//        Thread.sleep(1000);
//        we.sendKeys("student");
//        String s = we.getAttribute("value");
//        System.out.println(we.getLocation());
//        System.out.println(we.getSize());
//        System.out.println(we.getTagName());
//        System.out.println(we.getText());
//        System.out.println(s);
//        System.out.println(we.isDisplayed());
//        System.out.println(we.isEnabled());
//        System.out.println(we.isSelected());
        
		WebElement w = dr.findElement(By.id("submit"));
        w.click();
        Thread.sleep(1000);
        
        WebElement msg = dr.findElement(By.id("error"));
        System.out.println(msg.getText());
        
        we.sendKeys("student");
        WebElement we1= dr.findElement(By.id("password"));
		WebElement w1 = dr.findElement(By.id("submit"));
		w1.click();
        System.out.println(msg.getText());      
        }
}