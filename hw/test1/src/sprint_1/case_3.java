package sprint_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class case_3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\maruf\\Desktop\\prac\\webdriver\\chromedriver.exe");
//        System.setProperty("webdriver.gecko.driver","C:\\Users\\maruf\\Desktop\\prac\\webdriver\\geckodriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://transfotech.online/");
        String url="http://automationpractice.com/index.php";
        String email="qwejk@asdl.com";
        String exp_title="My account - My Store";
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
        Thread.sleep(5000);
        url=driver.getCurrentUrl();
        driver.findElement(By.id("email_create")).sendKeys(email);
        driver.findElement(By.name("SubmitCreate")).click();
        Thread.sleep(5000);
//        check this email already has been used.
        if (driver.getCurrentUrl().equals(url)){
            System.out.println("an account is associated with this email");
        }else {
//            creating an account
            driver.findElement(By.id("id_gender2")).click();
            driver.findElement(By.id("customer_firstname")).sendKeys("maruf");
            driver.findElement((By.id("customer_lastname"))).sendKeys("amin");
            driver.findElement(By.id("email")).clear();
            driver.findElement(By.id("email")).sendKeys(email);
            driver.findElement(By.id("passwd")).sendKeys("123456789");
            Select ele1 = new Select(driver.findElement(By.id("days")));
            ele1.selectByValue("10");
            Select ele2 = new Select(driver.findElement(By.id("months")));
            ele2.selectByValue("11");
            Select ele3 = new Select(driver.findElement(By.id("years")));
            ele3.selectByValue("1973");
            driver.findElement(By.id("uniform-newsletter")).click();
            driver.findElement(By.id("uniform-optin")).click();
//        System.out.println(driver.findElement(By.id("firstname")).getAttribute("value"));
//        System.out.println(driver.findElement(By.id("conpany")).getAttribute("value"));

            if (driver.findElement(By.id("firstname")).getAttribute("value").equals("")){
                driver.findElement(By.id("firstname")).sendKeys("maruf");
            }

            if (driver.findElement(By.id("lastname")).getAttribute("value").equals("")){
                driver.findElement(By.id("lastname")).sendKeys("maruf");
            }
            driver.findElement(By.id("company")).sendKeys("none");
            driver.findElement(By.id("address1")).sendKeys("jamaica");
            driver.findElement(By.id("address2")).sendKeys("queens");
            driver.findElement(By.id("city")).sendKeys("jamaica");
            Select ele4 = new Select(driver.findElement(By.id("id_state")));
            ele4.selectByValue("32");
            driver.findElement(By.id("postcode")).sendKeys("11432");
            Select ele5 = new Select(driver.findElement(By.id("id_country")));
            ele5.selectByValue("21");
            driver.findElement(By.id("other")).sendKeys("123456789");
            driver.findElement(By.id("phone")).sendKeys("123123");
            driver.findElement(By.id("phone_mobile")).sendKeys("444444444");
            driver.findElement(By.id("alias")).clear();
            driver.findElement(By.id("alias")).sendKeys("home");
            driver.findElement(By.id("submitAccount")).click();
            Thread.sleep(5000);
//            checking a new account has created.
            if (driver.getTitle().equals(exp_title)){
                System.out.println("User registered successfully");
            }else {
                System.out.println("User could not register successfully");
            }

        }

        driver.quit();

    }
}
