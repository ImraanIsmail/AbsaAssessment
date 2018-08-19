import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddUserButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_WD\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
        driver.get("http://www.way2automation.com/angularjs-protractor/webtables/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // Add user button
        driver.findElement(By.xpath("//button[@type='add']")).click();
        // List of Fields on new user dialog box
        String txt=driver.findElement(By.xpath("//div[@class='modal ng-scope']")).getText();
        System.out.println(txt);
        // closing new user dialog box
        driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
        
        

	}

}
