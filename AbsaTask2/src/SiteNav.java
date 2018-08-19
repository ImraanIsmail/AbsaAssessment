import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SiteNav {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_WD\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
        driver.get("http://www.way2automation.com/angularjs-protractor/webtables/");
        String c;
        c = driver.getCurrentUrl();
        System.out.println(c);
        if (!c.contentEquals("http://www.way2automation.com/angularjs-protractor/webtables/"))
        {
        System.out.println("True");
        }
        driver.close();
        }
}
 
