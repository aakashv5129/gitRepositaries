package Day1;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver dr = new ChromeDriver();
	    dr.get("https://demo.automationtesting.in/Static.html");
	    dr.manage().window().maximize();
	    
	    File ss=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
	    Files.copy(ss, new File("C:\\Users\\CDAC\\Pictures\\Screenshots\\scr.png"));
	}
}