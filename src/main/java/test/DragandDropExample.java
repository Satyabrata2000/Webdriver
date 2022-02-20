package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DragandDropExample {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\WebDriverProject\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

        WebElement From = driver.findElement(By.xpath("//li[@id='credit2']/a"));
        WebElement To = driver.findElement(By.xpath("//ol[@id='bank']/li"));

        Actions act = new Actions(driver);
        act.dragAndDrop(From, To).build().perform();

    }
}
