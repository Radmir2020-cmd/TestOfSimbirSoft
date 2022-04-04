package org.example.WebDr;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestingForSS {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
       driver = new ChromeDriver();
//       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebDriverWait webDriverWait = new WebDriverWait(driver, 5);

        driver.get("https://google.com");
        Thread.sleep(5000);

        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='gLFyf gsfi']")));
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).click();
//        Thread.sleep(3000);

        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='gLFyf gsfi']")));
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Калькулятор");
//        Thread.sleep(5000);

        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='gNO89b']")));
        driver.findElement(By.xpath("//input[@class='gNO89b']")).click();
//        Thread.sleep(10000);

        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@jsname='N10B9']")));
        driver.findElement(By.xpath("//div[@jsname='N10B9']")).click();

        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@jsname='YovRWb']")));
        driver.findElement(By.xpath("//div[@jsname='YovRWb']")).click();

        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@jsname='lVjWed']")));
        driver.findElement(By.xpath("//div[@jsname='lVjWed']")).click();

        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@jsname='pPHzQc']")));
        driver.findElement(By.xpath("//div[@jsname='pPHzQc']")).click();

        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@jsname='KN1kY']")));
        driver.findElement(By.xpath("//div[@jsname='KN1kY']")).click();

        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@jsname='XSr6wc']")));
        driver.findElement(By.xpath("//div[@jsname='XSr6wc']")).click();

        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@jsname='N10B9']")));
        driver.findElement(By.xpath("//div[@jsname='N10B9']")).click();

        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@jsname='Pt8tGc']")));
        driver.findElement(By.xpath("//div[@jsname='Pt8tGc']")).click();
        Thread.sleep(5000);

        driver.quit();

    }

}
