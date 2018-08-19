import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class addUserDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_WD\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
        driver.get("http://www.way2automation.com/angularjs-protractor/webtables/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[@type='add']")).click();
        
       // Adding First User(user1 ) details
        
        driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("Fname1");
        driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys(Keys.TAB);
        driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("Lname1");
        driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys(Keys.TAB);
        driver.findElement(By.xpath("//input[@name='UserName']")).sendKeys("User1");
        driver.findElement(By.xpath("//input[@name='UserName']")).sendKeys(Keys.TAB);
        driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Pass1");
        driver.findElement(By.xpath("//input[@name='Password']")).sendKeys(Keys.TAB);
        driver.findElement(By.xpath("//td[@class='ng-scope']//label[1]")).click();
        driver.findElement(By.xpath("//td[@class='ng-scope']//label[1]")).sendKeys(Keys.TAB);
        driver.findElement(By.xpath("//select[@name='RoleId']")).sendKeys("Admin");
        driver.findElement(By.xpath("//select[@name='RoleId']")).sendKeys(Keys.TAB);
        driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("admin@mail.com");
        driver.findElement(By.xpath("//input[@name='Email']")).sendKeys(Keys.TAB);
        driver.findElement(By.xpath("//input[@name='Mobilephone']")).sendKeys("082555");
        driver.findElement(By.xpath("//input[@name='Mobilephone']")).sendKeys(Keys.TAB);
        driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
 
        driver.findElement(By.xpath("//button[@type='add']")).click();
        
     // Adding second User(user2 ) details
    
        driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys(Keys.chord(Keys.CONTROL,"a"));
        driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys(Keys.BACK_SPACE);
        driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("Fname2");
        driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys(Keys.TAB);
        
        
        driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys(Keys.chord(Keys.CONTROL,"a"));
        driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys(Keys.BACK_SPACE);
        driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("Lname2");
        driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys(Keys.TAB);
        
        driver.findElement(By.xpath("//input[@name='UserName']")).sendKeys(Keys.chord(Keys.CONTROL,"a"));
        driver.findElement(By.xpath("//input[@name='UserName']")).sendKeys(Keys.BACK_SPACE);
        driver.findElement(By.xpath("//input[@name='UserName']")).sendKeys("User2");
        driver.findElement(By.xpath("//input[@name='UserName']")).sendKeys(Keys.TAB);
        
        
        driver.findElement(By.xpath("//input[@name='Password']")).sendKeys(Keys.chord(Keys.CONTROL,"a"));
        driver.findElement(By.xpath("//input[@name='Password']")).sendKeys(Keys.BACK_SPACE);
        driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Pass2");
        driver.findElement(By.xpath("//input[@name='Password']")).sendKeys(Keys.TAB);
        
        driver.findElement(By.xpath("//td[@class='ng-scope']//label[2]")).click();
        driver.findElement(By.xpath("//td[@class='ng-scope']//label[2]")).sendKeys(Keys.TAB);
        driver.findElement(By.xpath("//select[@name='RoleId']")).sendKeys("Customer");
        driver.findElement(By.xpath("//select[@name='RoleId']")).sendKeys(Keys.TAB);
        
        driver.findElement(By.xpath("//input[@name='Email']")).sendKeys(Keys.chord(Keys.CONTROL,"a"));
        driver.findElement(By.xpath("//input[@name='Email']")).sendKeys(Keys.BACK_SPACE);
        driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("cusomter@mail.com");
        driver.findElement(By.xpath("//input[@name='Email']")).sendKeys(Keys.TAB);
        
        driver.findElement(By.xpath("//input[@name='Mobilephone']")).sendKeys(Keys.chord(Keys.CONTROL,"a"));
        driver.findElement(By.xpath("//input[@name='Mobilephone']")).sendKeys(Keys.BACK_SPACE);
        driver.findElement(By.xpath("//input[@name='Mobilephone']")).sendKeys("083444");
        driver.findElement(By.xpath("//input[@name='Mobilephone']")).sendKeys(Keys.TAB);
        
        driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
        
        
  
	}
        


}

