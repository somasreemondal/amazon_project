package com.amazon.pazes;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

	protected WebDriver driver2 = null;

	protected WebDriverWait wait = null;
	protected WebDriverWait shortWait = null;

	public BasePage(WebDriver driver) {
		this.driver2 = driver;
		wait = new WebDriverWait(driver2, 10);
		shortWait = new WebDriverWait(driver2, 1);

	}

	protected final void clickElement(By element) {

		wait.until(ExpectedConditions.elementToBeClickable(element));
		driver2.findElement(element).click();

	}

	protected final void setText(By element, String value) {
		shortWait.until(ExpectedConditions.visibilityOfElementLocated((element)));

		driver2.findElement(element).sendKeys(value);

	}

	protected final String getText(By element) {

		return driver2.findElement(element).getText();

	}

	protected final String getCurrentUrl() {

		return driver2.getCurrentUrl();

	}

	protected final void runJavaScript(String scipt) {

		JavascriptExecutor jsDriver = (JavascriptExecutor) driver2;

		jsDriver.executeScript(scipt);

	}

	protected final void handleAlert(boolean isAccept) {
		if (isAccept) {
			driver2.switchTo().alert().accept();
		} else {
			driver2.switchTo().alert().dismiss();

		}

	}

	protected final void openWebPage(String url) {
		driver2.get(url);

	}

	protected final void switchWindow(int index) {

		ArrayList<String> windows = new ArrayList<>(driver2.getWindowHandles());

		driver2.switchTo().window(windows.get(index));

	}

}
