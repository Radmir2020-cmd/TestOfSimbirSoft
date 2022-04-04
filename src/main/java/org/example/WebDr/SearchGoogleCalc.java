package org.example.WebDr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchGoogleCalc {
    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
//        WebDriverWait webDriverWait = new WebDriverWait(driver, 5);
//        Actions actions = new Actions(driver);

        driver.get("https://google.com");
        Thread.sleep(5000);

        driver.findElement(By.xpath("div[@jsname='vdLsw']")).click();
        Thread.sleep(5000);



    }
}
