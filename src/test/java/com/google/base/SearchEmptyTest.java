package com.google.base;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static com.google.constans.Constans.EMPTY;
import static com.google.constans.Constans.URL;
import static com.google.constans.Constans.GOOGLE_EMPTY;
import static org.junit.Assert.assertEquals;

public class SearchEmptyTest {
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
        search.searchWord(EMPTY);
        assertEquals(GOOGLE_EMPTY,search.getTitleSearch());
    }
}
