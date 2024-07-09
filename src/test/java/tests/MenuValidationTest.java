package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.MenuValidation;
import utils.BaseClass;


public class MenuValidationTest extends BaseClass {

	public  MenuValidation menu;

	@Test(priority = 0)
	public void topLinkVerification() {
		menu = new MenuValidation(driver);
		menu.getTopLinksVerification("Top menu item title for: ");
		Assert.assertTrue(true);
	}

	@Test(priority = 1)
	public void bottomLinkVerification() {
		menu = new MenuValidation(driver);
		menu.getBottomLinksVerification("Bottom menu items: ");
		Assert.assertTrue(true);
	}

}
