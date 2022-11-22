package testsuite;
/* userShouldNavigateToComputerPageSuccessfully
        * click on the ‘Computers’ Tab
        * Verify the text ‘Computers’
        2. userShouldNavigateToElectronicsPageSuccessfully
        * click on the ‘Electronics’ Tab
        * Verify the text ‘Electronics’
        3.userShouldNavigateToApparelPageSuccessfull
        * click on the ‘Apparel’ Tab
        * Verify the text ‘Apparel’
        4.userShouldNavigateToDigitalDownloadsPageSuccessfull
        * click on the ‘Digital downloads’ Tab
        * Verify the text ‘Digital downloads’
        5. userShouldNavigateToBooksPageSuccessfully
        * click on the ‘Books’ Tab
        * Verify the text ‘Books’
        6. userShouldNavigateToJewelryPageSuccessfully
        * click on the ‘Jewelry’ Tab
        * Verify the text ‘Jewelry’
        7. userShouldNavigateToGiftCardsPageSuccessfull
        * click on the ‘Gift Cards’ Tab
        * Verify the text ‘Gift Cards’*/

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    String baseurl = "https://demo.nopcommerce.com";

    @Before
    public void setup() {
        openBrowser(baseurl);
    }

    public void sendTextToElement(By by) {
        driver.findElement(by).sendKeys();

    }

    @Test
    public void verifyUserShouldNavigateToComputerPageSuccessfully() {
        WebElement ComputersTab = driver.findElement(By.linkText("Computers"));
        ComputersTab.click();
        String expectedMessage = "Computers";
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//div [@class = 'page-title']/h1 [text() = 'Computers']"));
        String actualMessage = actualTextMessageElement.getText();
        Assert.assertEquals("user should Navigate computer page sucessfully", expectedMessage, actualMessage);
    }

    public void userShouldNavigateToElectronicsPageSuccessfully() {
        clickElement(By.linkText("Electronics"));
        String expectedMessage = "Electronics";
        WebElement actualMessageElement = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']"));
        String actualMessage = actualMessageElement.getText();
        Assert.assertEquals("user should Navigate To Electronics Page Successfully", expectedMessage, actualMessage);
    }

    public void userShouldNavigateToApparelPageSuccessfull() {
        //click on Apparel tab
        clickElement(By.linkText("Apparel"));
        String expectedMessage = "Apparel";
        String actualMessage = getTextFromElement(By.xpath("//div [@class = 'page-title']/h1 [text() = 'Apparel']"));
        Assert.assertEquals("Apparel text is not displayed", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfull() {
        //click on 'digital downloads' tab
        clickElement(By.linkText("Digital downloads"));
        String expectedText = "Digital downloads";
        String actualText = getTextFromElement(By.xpath("//div [@class = 'page-title']/h1 [text() = 'Digital downloads']"));
        Assert.assertEquals("Digital downloads text is not displayed", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        //click on 'books' tab
        clickElement(By.linkText("Books"));
        String expectedText = "Books";
        String actualText = getTextFromElement(By.xpath("//div [@class = 'page-title']/h1 [text() = 'Books']"));
        Assert.assertEquals("Books text is not displayed", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        //click on jewelry tab
        clickElement(By.linkText("Jewelry"));
        String expectedText = "Jewelry";
        String actualText = getTextFromElement(By.xpath("//div [@class = 'page-title']/h1 [text() = 'Jewelry']"));
        Assert.assertEquals("Jewelry text is not displayed", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfull() {
        //click on giftcards tab
        clickElement(By.linkText("Gift Cards"));
        //verify header text 'gift cards'
        String expectedText = "Gift Cards";
        String actualText = getTextFromElement(By.xpath("//div [@class = 'page-title']/h1 [text() = 'Gift Cards']"));
        Assert.assertEquals("Gift Cards text is not displayed", expectedText, actualText);
    }

    @After
    public void closebroser() {
        closeBrowser();
    }
}

