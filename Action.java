package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver dr = new ChromeDriver();
	    dr.get("https://accounts.saucelabs.com/am/XUI/#login/");
	    dr.manage().window().maximize();
	    System.out.println(dr.getTitle());
	    Thread.sleep(2000);
	    WebElement txtbox=dr.findElement(By.id("idToken1"));
	    Actions a = new Actions(dr);
	    a.moveToElement(txtbox).contextClick().build().perform();
	    a.doubleClick(txtbox).build().perform();
	}

}
