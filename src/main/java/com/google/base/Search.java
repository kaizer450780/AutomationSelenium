package com.google.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search extends Base{

    By input = By.name("q");
    By result  = By.xpath("//h3[contains(text(),'Boxeo - Wikipedia, la enciclopedia libre')]");
    By resultNotFound  = By.xpath("//div[@class='v3jTId']");
    By allSpan  = By.xpath("//div[@class='hdtb-mitem hdtb-msel']");

    public Search(WebDriver driver) {
        super(driver);
    }

    /**
     * Description: function in charge to type a word sent it from params
     * @param searchWord The Text that I want search*/
    public void searchWord(String searchWord){
        findElement(input).clear();
        type(searchWord,input);
        findElement(input).submit();
        waiting(10);
    }

    /**
     * Description: function overcharged, in charged to submit null*/
    public void searchWord(){
        findElement(input).submit();
        waiting(10);
    }

    /**
     * Description: function in charged to get title of the web page of result search
     * @return pageTitle page title*/
    public String getTitleSearch(){
        return pageTitle();
    }

    /**
     * Description: function in charged to get text of the object of the web page of result search
     * @return Text text from object of web page*/
    public String getTextResultField(){
        return getText(result);
    }

    /**
     * Description: function in charged to get text of the object of the web page of not found result search
     * @return Text text from object of web page*/
    public String getTextResultNotFound(){
        return getText(resultNotFound);
    }

    /**
     * Description: function in charged to get text of the one span of the web page of result search
     * @return Text text from object of web page*/
    public String getTextSpanAll(){
        return getText(allSpan);
    }
}
