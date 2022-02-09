package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayur\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//				
		System.setProperty("webdriver.gecko.driver","C:\\Users\\mayur\\OneDrive\\Desktop\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver ();
		
		
     	driver.navigate().to("https://www.youtube.com/msbtech");
		driver.navigate().refresh();
	    driver.manage().window().maximize();
		
		WebElement createacc = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		createacc.click();
		Thread.sleep(5000);
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select y = new Select (year);
     	y.selectByValue("1994");
		y.selectByIndex(4);
//		
//		String url = driver.getCurrentUrl();
//		System.out.println(url);
//		String url2 = driver.getTitle();
//		System.out.println(url2);
//		
//		Dimension d = new Dimension (400,800);
//		driver.manage().window().setSize(d);
//		Point p= new Point (500,600);
//		driver.manage().window().setPosition(p);
//		Thread.sleep(5000);
//		WebElement video = driver.findElement(By.xpath("(//div [@class='tab-content style-scope tp-yt-paper-tab'])[2])"));
//		Thread.sleep(5000);
//		video.click();
//		driver.quit();

	}
	

}
