package com.amazon.pazes;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage extends BasePage {

	public SearchResultsPage(WebDriver driver) {
		super(driver);

		PageFactory.initElements(driver, this);

	}

	// page elements
	By productNameListElement = By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']");

	// page action keywords

	public ArrayList<String> getNamesOfProductFromSearchResultList() {

		return getAllTextByElement(productNameListElement);
	}

	private ArrayList<String> getAllTextByElement(By productNameListElement2) {
		// TODO Auto-generated method stub
		return null;
	}

}