package gitpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gitclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","c:\\Chromedriver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("http://operauat.softvision.com/Account/Login");
			driver.findElement(By.xpath(".//input[@id='UserName']")).sendKeys("name");
			driver.findElement(By.xpath(".//input[@id='Password'][@name='Password']")).sendKeys("password");
			driver.findElement(By.xpath("//input[@type='submit'][@value='Sign in']")).click();
			System.out.println("this is to check edit,commit and push to remote repository");
		}

	//this is second comment
	

}
