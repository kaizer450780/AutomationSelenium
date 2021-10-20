package com.google.base;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static com.google.constans.Constans.URL;
import static com.google.constans.Constans.STRING_NOT_FOUND;
import static com.google.constans.Constans.NOT_COINCIDENCE;
import static org.junit.Assert.assertEquals;

public class SearchResultNotFound {
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
        search.searchWord(STRING_NOT_FOUND);
        assertEquals(NOT_COINCIDENCE,search.getTextResultNotFound());
    }
}
