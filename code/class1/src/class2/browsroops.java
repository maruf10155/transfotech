package class2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browsroops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\maruf\\Desktop\\prac\\webdriver\\chromedriver.exe");

		WebDriver b = new ChromeDriver();
		// b.get("http://automationpractice.com/index.php/");
		b.navigate().to("http://automationpractice.com/index.php/");
		System.out.println(b.getTitle());
		String url = b.getCurrentUrl();
		System.out.println(url);
		//b.manage().window().maximize();
		String source=b.getPageSource();
		System.out.println(source);
		b.close();

	}

}
