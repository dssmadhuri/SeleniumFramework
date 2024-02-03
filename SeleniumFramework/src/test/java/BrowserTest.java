import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Satya Dvarakonda\\eclipse-workspace\\SeleniumFramework\\drivers\\geckodriver\\geckodriver.exe");
		
		
		WebDriver driver= new FirefoxDriver();
		
		
		driver.get("https://www.hilton.com/en/");
		String title=driver.getTitle();
		if (title.equals("Hotels by Hilton - Book the Best Rates Across All Brands"))
		{
			System.out.println("Pass: Title is matching"); 
			
		}
		else
		{
			System.out.println("Fail:Title is not matching, and the title is "+title);
		}
			String url = driver.getCurrentUrl();
			if(url.contains("hilton.com/en/"))
					{
				System.out.println("Pass: url  has hilton.com");
					}
			else {
				System.out.println("Fail: url doesnt have hilton");
			}
		}
		
		

}
