package org.example.WebDr;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingForSS {
    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
       driver = new ChromeDriver();
//        WebDriverWait webDriverWait = new WebDriverWait(driver, 5);

//        driver.get("https://google.com");

//        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.name("div[@jsname='vdLsw']")));
//        driver.findElement(By.id("div[@jsname='vdLsw']")).click();
//        Thread.sleep(5000);

//        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.id("div[@jsname='vdLsw']")));
 //       driver.findElement(By.name("div[@jsname='vdLsw']")).sendKeys("Калькулятор");

//        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.id("div[@class='CcAdNb']")));
//        driver.findElement(By.id("div[@class='CcAdNb']")).click();




//        driver.quit();

    }

//    public static void transToCalc() throws InterruptedException {
//        driver.get("https://google.com");
//        Thread.sleep(5000);
//        driver.findElement(By.id("input[@class='gLFyf gsfi']")).sendKeys("Калькулятор");
//        driver.findElement(By.xpath("span[@class='QCzoEc z1asCe MZy1Rb']")).click();
//    }


}
