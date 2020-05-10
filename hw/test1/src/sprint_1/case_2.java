package sprint_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class case_2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\maruf\\Desktop\\prac\\webdriver\\chromedriver.exe");
//        System.setProperty("webdriver.gecko.driver","C:\\Users\\maruf\\Desktop\\prac\\webdriver\\geckodriver.exe");
        WebDriver driver = new ChromeDriver();
        String exp_err_msg="Invalid email address.";
        driver.navigate().to("http://transfotech.online/");
        String url="http://automationpractice.com/index.php";
//        checking user navigates to correct email.
        if (url.equals(driver.getCurrentUrl())){
            System.out.println("User navigates to correct website");
            driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
            Thread.sleep(5000);
            driver.findElement(By.id("email_create")).sendKeys("asdfqw@a");
            driver.findElement(By.name("SubmitCreate")).click();
            Thread.sleep(5000);
            WebElement ele1=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/form/div/div[1]/ol/li"));
            if (ele1.getText().equals(exp_err_msg)){
//                checking error message.
                System.out.println("shows error message");
            }else {
                System.out.println("does not show error message");
            }
        }else {
            System.out.println("User cannot navigate to correct website");
        }


        driver.quit();
    }
}
