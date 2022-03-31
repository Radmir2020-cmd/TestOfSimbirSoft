package org.example.POTest;

import org.example.WebDr.CalcPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSS {
    WebDriver driver;
    @BeforeAll
    static void inputDriver() {
    }

    @BeforeEach
    void initDriver() {
        driver = new ChromeDriver();
    }

    @Test
    void clickButtons() throws InterruptedException {
        new CalcPage(driver).pushBut1.click();
        new CalcPage(driver).pushButMultiply.click();
        new CalcPage(driver).pushBut2.click();
        new CalcPage(driver).pushButMinus.click();
        new CalcPage(driver).pushBut3.click();
        new CalcPage(driver).pushButPlus.click();
        new CalcPage(driver).pushBut1.click();
        new CalcPage(driver).pushButEq.click();
        Thread.sleep(10);
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}
