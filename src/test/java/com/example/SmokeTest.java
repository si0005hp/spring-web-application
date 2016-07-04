package com.example;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

//@Ignore
public class SmokeTest {

	@Test
	public void testAppStarted() {
	    WebDriver driver = new HtmlUnitDriver();
	    driver.get("http://localhost:8080/spring-web-application/app/");
	    assertThat(driver.getPageSource(), is("Hello World!"));
	}

}
