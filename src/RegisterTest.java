import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
/*1. UserShouldNavigateToRegisterPageSuccessfully
* click on the ‘Register’ link
* Verify the text ‘Register’
2. userSholdRegisterAccountSuccessfully * click
on the ‘Register’ link
* Select gender radio button
* Enter First name
* Enter Last name
* Select Day Month and Year
* Enter Email address
* Enter Password
* Enter Confirm password
* Click on REGISTER button
* Verify the text 'Your registration completed*/

public class RegisterTest extends BaseTest {
    String baseurl = "https://demo.nopcommerce.com";

    @Before
    public void setup() {
        openBrowser(baseurl);
    }


    @Test
    public void userShouldNavigateRegisterAccountSuccessfully() {
        clickElement(By.linkText("Register"));
        String expectedM = "Register";
        Assert.assertEquals(expectedM, getTextFromElement(By.xpath("//div[@class='header-links']//a[contains(text(),'Register')]")));
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        //click on register link
        clickElement(By.linkText("Register"));

        //Select radio button
        clickElement(By.className("forcheckbox"));
        String expectedMessage = "Register";
        Assert.assertEquals(expectedMessage, getTextFromElement(By.xpath("//h1[contains(text(),'Register')]")));
        sendTextToElement(By.id("FirstName"), "manisha");
        sendTextToElement(By.id("LastName"), "Pray");

        //select day month and year
        sendTextToElement(By.name("DateOfBirthDay"), "12");
        sendTextToElement(By.name("DateOfBirthMonth"), "12");
        sendTextToElement(By.name("DateOfBirthYear"), "2000");
        sendTextToElement(By.id("Email"), "manisha@gmail.com");
        sendTextToElement(By.id("Company"), "Pray123");
        clickElement(By.id("Newsletter"));
        sendTextToElement(By.id("Password"), "Pray1234");
        sendTextToElement(By.id("ConfirmPassword"), "Pray1234");
        clickElement(By.id("register-button"));

        //verify registration is completed
        String expectmessage = "Your registration completed";
        Assert.assertEquals(expectedMessage,"Your registration completed')]");

    }

    public void closebrowser() {
      //  closebrowser();
    }
}

