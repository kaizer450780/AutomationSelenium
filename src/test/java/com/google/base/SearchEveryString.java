package com.google.base;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static com.google.constans.Constans.URL;
import static com.google.constans.Constans.STRING;
import static com.google.constans.Constans.RESULT_STRING;
import static org.junit.Assert.assertEquals;

public class SearchEveryString {
    private WebDriver driver;
    Search search;

    @Before
    public void setUp(){
        search = new Search(driver);
        driver = search.chromeConenection();
        search.visit(URL);
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void test(){
        search.searchWord(STRING);
        assertEquals(RESULT_STRING,search.getTitleSearch());
    }
}
