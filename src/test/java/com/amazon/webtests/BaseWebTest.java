package com.amazon.webtests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.amazon.common.Constants;
import com.amazon.pazes.HomePage;
import com.amazon.pazes.SearchResultsPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class BaseWebTest {
	protected WebDriver driver = null;
	HomePage homePage;
	SearchResultsPage searchResultsPage;

	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(Constants.baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		intilizePageObjects();
	}

	private void intilizePageObjects() {
		homePage = new HomePage(driver);

		searchResultsPage = new SearchResultsPage(driver);

	}

	@After
	public void tearDown() {
		driver.quit();

	}

}

