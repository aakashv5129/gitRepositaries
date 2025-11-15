package Day4;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
public class NewTestBRW {
  WebDriver dr = new ChromeDriver();
  @Test
  public void f() throws InterruptedException {
	  //login
	 
	 WebElement we = dr.findElement(By.name("username"));
	 we.click();
	 we.sendKeys("Admin");
	 Thread.sleep(1000);
	 
	 WebElement we1 = dr.findElement(By.name("password"));
	 we1.click();
	 we1.sendKeys("admin123");
	 
	 WebElement we2 = dr.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
	 we2.click();
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  //site
	  dr.manage().window().maximize();
	  dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
	  Thread.sleep(2000);
  }
  @AfterTest
  public void afterTest() {
	  //close
	  //dr.close();
  }
}
