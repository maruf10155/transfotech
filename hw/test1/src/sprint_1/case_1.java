package sprint_1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class case_1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\maruf\\Desktop\\prac\\webdriver\\chromedriver.exe");
//        System.setProperty("webdriver.gecko.driver","C:\\Users\\maruf\\Desktop\\prac\\webdriver\\geckodriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://transfotech.online/");
        String url="http://automationpractice.com/index.php";
        String title ="My Store";
//        checking user navigates to correct website.
        if (url.equals(driver.getCurrentUrl())){
            System.out.println("User navigates to correct website");
            if (title.equals(driver.getTitle())){
//                checking website title
                System.out.println("Title is correct");
            }else {
                System.out.println("Title is incorrect");
            }

        }else {
            System.out.println("User cannot navigate to correct website");
        }

        driver.quit();
    }
}
