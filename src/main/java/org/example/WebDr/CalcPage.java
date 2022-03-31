package org.example.WebDr;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalcPage {
    WebDriver driver;

    @FindBy(id = "div[@jsname='N10B9']")
    public WebElement pushBut1;

    @FindBy(id = "div[@jsname='YovRWb']")
    public WebElement pushButMultiply;

    @FindBy(id = "div[@jsname='lVjWed']")
    public WebElement pushBut2;

    @FindBy(id = "div[@jsname='pPHzQc']")
    public WebElement pushButMinus;

    @FindBy(id = "div[@jsname='pPHzQc']")
    public WebElement pushBut3;

    @FindBy(id = "div[@jsname='XSr6wc']")
    public WebElement pushButPlus;

    @FindBy(id = "div[@jsname='Pt8tGc']")
    public WebElement pushButEq;

    public void pushButtons(){
        pushBut1.click();
        pushButMultiply.click();
        pushBut2.click();
        pushButMinus.click();
        pushBut3.click();
        pushButPlus.click();
        pushButEq.click();
    }



    public CalcPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


}
