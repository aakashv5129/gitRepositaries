package Day4;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class NewTest111 {
  
	@Test (priority = 2)
  public void login() {
	  System.out.println("Im in Login");
  }
  
  @Test(priority = 1)
  public void reg() {
	  System.out.println("Im in Reg.");
  }
  
  @Test (priority = 3)
  public void home() {
	  System.out.println("Im in Home");
  }

  @Test (priority = 4)
  public void logout() {
	  throw new SkipException("we are working");
	 // System.out.println("Im in Logout");
  }
}