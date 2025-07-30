package producttest;

import java.time.Duration;

import org.testng.annotations.Test;

import genericlibrary.BaseConfig;
import pagerepository.CartPage;
import pagerepository.CheckoutOverviewPage;
import pagerepository.CheckoutPage;
import pagerepository.HomePage;

public class Example1Test extends BaseConfig {

	@Test
	public void orderProducts() {

		// Wait statement
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Create an object for Home page
		HomePage hpobj = new HomePage(driver);

		// Use the webElement from POM class

		// Click on the fourth product
		hpobj.getfourthproduct().click();
		// Click on Add To Cart button
		hpobj.getaddtocartbtn4().click();
		// Click on Back To Products
		hpobj.getbacktoproducts4().click();

		// Click on the Third product
		hpobj.getthirdproduct().click();
		// Click on Add To Cart button
		hpobj.getaddtocartbtn3().click();
		// Click on Back To Products
		hpobj.getbacktoproducts3().click();

		// Click on the Second product
		hpobj.getsecondproduct().click();
		// Click on Add To Cart button
		hpobj.getaddtocartbtn2().click();
		// Click on Back To Products
		hpobj.getbacktoproducts2().click();

		// Click on Cart Icon
		hpobj.getcarticon().click();

		// Create an object for Cart page
		CartPage cpobj = new CartPage(driver);

		// Use the webElement from POM class

		// Click on the CheckOut button
		cpobj.getcheckoutbtn().click();

		// Create an object for CheckOut page
		CheckoutPage chkobj = new CheckoutPage(driver);

		// Enter the First Name
		chkobj.getfirstname().sendKeys("Ramya");
		// Enter Last Name
		chkobj.getlastname().sendKeys("K");
		// Enter Zipcode
		chkobj.getzipcode().sendKeys("522002");
		// Click on Continue button
		chkobj.getcontinuebtn().click();

		// Create an object for CheckOut-Overview page
		CheckoutOverviewPage ckovobj = new CheckoutOverviewPage(driver);

		// Click on Finish button
		ckovobj.getfinishbtn().click();

	}

}