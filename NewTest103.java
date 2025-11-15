package Day4;

import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class NewTest103 {

  @Test(dataProvider = "dp")
  public void f(String n, String s) throws InterruptedException {
	  
	 WebDriver dr = new  ChromeDriver();
	 dr.manage().window().maximize();
     dr.get("https://practicetestautomation.com/practice-test-login/");
     dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     //dr.findElements(By.tagName("input"));
     List<WebElement> el = dr.findElements(By.tagName("a"));
     System.out.println("The No. of Text Box = "+el.size());
     
     for(WebElement link : el){
    	 System.out.println(link.getText());
     }
     
     WebElement we = dr.findElement(By.id("username"));
// 	 we.click();
 	 we.sendKeys(n);
 	 Thread.sleep(1000);
 	 
 	 WebElement we1 = dr.findElement(By.id("password"));
 	 we1.sendKeys(s);
 	 
 	 WebElement we2 = dr.findElement(By.id("submit"));
 	we2.click();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "sasa", "a" },
      new Object[] { "fdgfd", "b" },
      new Object[] { "student", "Password123" },
    };
  }
}
