package sprint_2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class flightsearch {
    public static void main(String[] args) throws InterruptedException {
        load.load.chrome();
        WebDriver driver= new ChromeDriver();
        driver.get("http://makemytrip.com");
        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
//        driver.navigate().refresh();
//        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[2]/ul/li[2]")).click();
        driver.findElement(By.xpath("//li[contains(text(),'Round Trip')]")).click();
//        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[contains(@class,'fsw_inputBox searchCity inactiveWidget')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Dhaka,Bangladesh", Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div[1]/p[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input")).sendKeys("Barisal,Bangladesh");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div[1]")).click();
        driver.findElement(By.xpath("//div[contains(@class,'fsw_inputBox dates inactiveWidget')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='DayPicker-wrapper']//div[1]//div[3]//div[4]//div[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[1]/span[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[3]/div[4]")).click();
        Thread.sleep(1000);
//        traveller
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[5]/label[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/ul[1]/li[7]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[5]/div[1]/button")).click();


//        search
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/p/a")).click();
        Thread.sleep(15000);
//        next page
        String exp_text="No flights found";
                if(driver.findElement(By.xpath("//*[@id=\"fullpage-error\"]/div/p[1]")).getText().equals(exp_text)){
                    System.out.println("test passed");
                }else {
                    System.out.println("test failed");
                }




        driver.quit();

    }
}
