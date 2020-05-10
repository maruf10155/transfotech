package sprint_2;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.security.Key;
import java.util.Scanner;

public class test_search {
    public static void main(String[] args) throws InterruptedException {
        load.load.chrome();
//        Scanner input= new Scanner(System.in);
//        String url =input.next();
        String url="http://automationpractice.com/index.php";
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.findElement(By.xpath("//*[@id=\"search_query_top\"]")).sendKeys("s");
//        driver.findElement(By.xpath("//*[@id=\"search_query_top\"]")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button[1]")).click();
        Thread.sleep(3000);
        String cur_url = driver.getCurrentUrl();
        String text=driver.findElement(By.className("heading-counter")).getText();
        if (cur_url.contains("submit_search") & text.contains("been found")){
            System.out.println("test passed");
        }else {
            System.out.println("test failed");
        }


        driver.quit();
    }
}
