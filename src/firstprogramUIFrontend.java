import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class firstprogramUIFrontend{

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		System.out.print("welcome to java class\n");	
		int[] array=new int[5];
		array[0]=10;
		System.out.print(array[0]);
		
		
int age=15;
		
		if (age>=18)
		{
			System.out.print("eligible for voting");
		}
		
		else
			
		{
			System.out.print("person is not eligible for voting");
		}
	
		
		//ChromeDriver driver=new ChromeDriver();	
		WebDriver driver=new ChromeDriver();	
		
		driver.get("http://www.google.com");
		
		
	//driver.findElement(By.xpath("//input[@placeholder='Search Google or type a URL']")).sendKeys("HI Guna");
	
		driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys("hi guna");
		driver.findElement(By.xpath("//*[@class='gb_0']")).click();
		//driver.findElement(By.id("input")).sendKeys("hi guna");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.quit();
		
	
		
		

	}

}
