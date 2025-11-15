package Day4;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTestNG  { 
  @Test
  public void Reg() 
  {
      System.out.println("Im in Test");		  
  }
  @Test
  public void Reg1() 
  {
      System.out.println("Im in Test");		  
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("Im in Before Method");
  }
  @AfterMethod
  public void afterMethod() {
	  System.out.println("Im in After Method");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Im in Before Class");
  }
  @AfterClass
  public void afterClass() {
	  System.out.println("Im in After class");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Im in Before test");
  }
  @AfterTest
  public void afterTest() {
	  System.out.println("Im in After Test");
  }
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Im in Before Suite");
  }
  @AfterSuite
  public void afterSuite() {
	  System.out.println("Im in After Suite");
  }
}
