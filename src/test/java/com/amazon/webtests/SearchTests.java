package com.amazon.webtests;

import org.junit.Test;

public class SearchTests extends BaseWebTest {

	@Test
	public void searchProductAndVerifyResults() {

		String productName = "iphone 13";
		homePage.searchProduct(productName);

		System.out.println(searchResultsPage.getNamesOfProductFromSearchResultList());

	}
}
