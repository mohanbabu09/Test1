package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Democlass  {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("Webdriver.chrome.driver","C:\\Users\\easysolutions\\Desktop\\Mohan Babu\\software\\chromedriver.exe");  
	   	//Open Chrome Browser
		 WebDriver driver = new ChromeDriver();
	    //Open the application 
		 driver.get("http://www.fatcow.com/");
	    //Select the list box (drop down)
		 WebElement listbox = driver.findElement(By.id("countrySelect"));
		 Select S1= new Select(listbox);
		//Select option based on index value
		//S1.selectByIndex(2); or
		//Select option based on value
		//S1.selectByValue("EUR"); or
		//Select option based on visible Text(option name)
		 S1.selectByVisibleText("United Kingdom");
		/*//Select link by link text
		//driver.findElement(By.linkText("Control Panel")).click();   or
		//Select link by Partial link text
		 driver.findElement(By.partialLinkText("Panel")).click();
		//To display link
		//String s2= driver.findElement(By.partialLinkText("Panel")).click();
	    //System.out.println(s2);
		//Wait for 10 sec
		 Thread.sleep(10000);
		//close the browser
		 driver.close();*/
		// mouse over on menu
			WebElement f = driver.findElement(By.xpath("html/body/div[6]/div/div[2]/nav/ul/li[3]/a"));
			Actions a1 = new Actions(driver);
			a1.moveToElement(f).perform();
			Thread.sleep(1000);
			System.out.println("Test1");
			System.out.println("Test2");
			System.out.println("Welcome1");
 
		
	}

}
