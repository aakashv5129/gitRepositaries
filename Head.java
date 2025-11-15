package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Head {

	public static void main(String[] args) {
//		ChromeOptions cc = new ChromeOptions();
//		cc.addArguments("headless");
//		WebDriver dr=new ChromeDriver(cc);
//		dr.get("https://www.google.com");
//		System.out.println(dr.getTitle());
//		
//		FirefoxOptions c = new FirefoxOptions();
//		c.addArguments("--headless");
//		WebDriver d=new FirefoxDriver(c);
//		d.get("https://www.gmail.com");
//		System.out.println(d.getTitle());
		ChromeOptions cc = new ChromeOptions();
		cc.addArguments("incognito");
		WebDriver dr=new ChromeDriver(cc);
		dr.get("https://www.google.com");
		System.out.println(dr.getTitle());
		
		FirefoxOptions c = new FirefoxOptions();
		c.addArguments("incognito");
		WebDriver d=new FirefoxDriver(c);
		d.get("https://www.gmail.com");
		System.out.println(d.getTitle());

	}

}
