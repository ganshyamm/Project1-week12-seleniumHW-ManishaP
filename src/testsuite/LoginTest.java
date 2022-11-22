package testsuite;
/*1. userShouldNavigateToLoginPageSuccessfully
        * click on the ‘Login’ link
        * Verify the text ‘Welcome, Please Sign In!’
        2. userShouldLoginSuccessfullyWithValidCredentials
        * click on the ‘Login’ link
        * Enter valid username
        * Enter valid password
        * Click on ‘LOGIN’ button
        * Verify the ‘Log out’ text is display
        3. verifyTheErrorMessage
        * click on the ‘Login’ link
        * Enter invalid username
        * Enter invalid password
        * Click on Login button
        * Verify the error message ‘Login was unsuccessful.
        Please correct the errors and try again. No customer account found’*/

import browserfactory.BaseTest;
import com.google.common.base.Verify;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseurl = "https://demo.nopcommerce.com";

    @Before
    public void setup() {
        openBrowser(baseurl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){

        //Find log in link and click on login link
        WebElement loginlink = driver.findElement(By.linkText("Log in"));
        loginlink.click();
        String expectmessage = "Welcome, Please Sign In!";

        //Find the welcome text element and get the text
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        String actualmessage = actualTextMessageElement.getText();

        Assert.assertEquals("Not navigate to login page", expectmessage, actualmessage);
    }
    public void sendTextToElement(By by, String text){

    }

    public void userShouldLoginSuccessfullyWithValidCredentials(){
        clickElement(By.linkText("ico-login"));

        //Find the email field and enter valid Email Address
        sendTextToElement(By.id("Email"),"test123@gmail.com");
        //Find the password field and valid Password
        sendTextToElement(By.name("Password"),"password123");

        // Click on ‘LOGIN’ button
        clickElement(By.xpath("Log in"));

    }
    public void verifytheerrormessage(By by){
        WebElement loginlink = driver.findElement(by);
        loginlink.click();
        //Enter invalid email
        sendTextToElement(By.id("Email"),"test@gmail.com");
        //Enter Invalid Password
        sendTextToElement(By.name("Password"),"password13");

        // Click on ‘LOGIN’ button
        clickElement(By.xpath("//button[contains(text(),'Log in')]"));

    }
    public void VerifytheerrormessageLoginwasunsuccessful(){
        System.out.println("Please correct the errors and try again. No customer account found");


    }
    public void closebroser(){
        closebroser();
    }


}

