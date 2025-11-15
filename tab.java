package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class tab 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		String pw=d.getWindowHandle();
		d.get("https://www.google.com");
	    Thread.sleep(2000);
	    
		d.switchTo().newWindow(WindowType.TAB);
		String cw=d.getWindowHandle();
		d.get("https://www.gmail.com");
		Thread.sleep(2000);
		
		d.switchTo().newWindow(WindowType.TAB);
		String cw2=d.getWindowHandle();
		d.get("https://www.youtube.com");
		Thread.sleep(2000);
		
		d.switchTo().window(cw);
		Thread.sleep(2000);
		d.switchTo().window(pw);
		Thread.sleep(2000);
	}

}
