package GitHub;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App 
{
	@Test
    public void testMaven()
    {
        System.out.println( "Hello World!" );
        System.out.println("***$$$$$**** My first Maven Project test ***$$$$$****");
		//WebDriver driver=new FirefoxDriver();
        WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		String s=driver.getTitle();
		System.out.println("Title is "+s);
    }
}
