package com.google.base;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static com.google.constans.Constans.BOXING;
import static com.google.constans.Constans.URL;
import static com.google.constans.Constans.TODOS;
import static org.junit.Assert.assertEquals;

public class AllResultTextTest {
    private WebDriver driver;
    Search search;

    @Before
    public void setUp(){
        search = new Search(driver);
        driver = search.chromeConenection();
        search.visit(URL);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void test(){
        search.searchWord(BOXING);
        assertEquals(TODOS,search.getTextSpanAll());
    }
}
