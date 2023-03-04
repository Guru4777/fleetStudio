package testCases;

public class webElement {
// Load the webpage
driver.get("https://www.accessibility.com/digital-lawsuits");

    // Create a page object for the webpage
    AccessibilityLawsuitPage page = new AccessibilityLawsuitPage(driver);

    // Fetch the Plaintiff and Defendant information
    String plaintiff = page.getPlaintiff();
    String defendant = page.getDefendant();

// Assert the results with validation
Assert.assertEquals(plaintiff, "Plaintiff Name");
Assert.assertEquals(defendant, "Defendant Name");
}
