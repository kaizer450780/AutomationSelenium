package com.google.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static com.google.constans.Constans.DRIVER;
import static com.google.constans.Constans.LOCATION_DRIVER;

public class Base {

    private WebDriver driver;

    public Base(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Description: function in charge of make the connection with chrome through the chromeDriver
     * @return driver The driver to manage the page Objects*/
    public WebDriver chromeConenection(){
        System.setProperty(DRIVER, LOCATION_DRIVER);
        driver = new ChromeDriver();
        return driver;
    }

    /**
     * Description: function in charge to find the elements in the Web Page
     * @param locator The location of the Object By
     * @return element The element Location*/
    public WebElement findElement(By locator){
        return driver.findElement(locator);
    }

    /**
     * Description: function in charge to get The Text of the elements in the Web Page
     * @param locator The location of the Object By
     * @return Text Text of the element located*/
    public String getText(By locator){
        return findElement(locator).getText();
    }

    /**
     * Description: function in charge to type in the element selected in the Web Page
     * @param inputText The text to type
     * @param locator The location of the Object By*/
    public void type(String inputText, By locator){
        driver.findElement(locator).sendKeys(inputText);
    }

    /**
     * Description: function in charge to maximize the Web Page and get the url
     * @param url The url of the web page*/
    public void visit(String url){
        driver.manage().window().maximize();
        driver.get(url);
    }

    /**
     * Description: function in charge to wait the time send it
     * @param time Wait time in seconds*/
    public void waiting(int time){
        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }

    /**
     * Description: function in charge to get the title of the web page
     * @return titlePage The title of the web page*/
    public String pageTitle(){
        return driver.getTitle();
    }

}
