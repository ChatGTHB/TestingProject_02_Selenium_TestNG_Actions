package TestingProject_02;


import utility.BaseDriver;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.support.ui.*;


import java.time.Duration;

public class TestingProject_02 extends BaseDriver {

    @Test
    public void test01() {

        driver.get("http://demowebshop.tricentis.com/");

        Actions actions = new Actions(driver);

        WebElement register = driver.findElement(By.linkText("Register"));
        Action action = actions.moveToElement(register).click().build();
        action.perform();

        WebElement gender = driver.findElement(By.id("gender-male"));
        action = actions.moveToElement(gender).click().build();
        action.perform();

        WebElement firstName = driver.findElement(By.id("FirstName"));
        action = actions.moveToElement(firstName).click().sendKeys("Name").build();
        action.perform();

        WebElement lastName = driver.findElement(By.id("LastName"));
        action = actions.moveToElement(lastName).click().sendKeys("Surname").build();
        action.perform();

        WebElement eMail = driver.findElement(By.id("Email"));
        // Random mail generation line to not change mail every time during the test
        action = actions.moveToElement(eMail).click().sendKeys("testing" + ((int) (Math.random() * 10000)) + "@testing.com").build();
        // The mail creation line that will remain fixed under normal conditions:
        // action = actions.moveToElement(eMail).click().sendKeys("testing@testing.com").build();
        action.perform();

        WebElement password = driver.findElement(By.id("Password"));
        action = actions.moveToElement(password).click().sendKeys("password").build();
        action.perform();

        WebElement confirmPassword = driver.findElement(By.id("ConfirmPassword"));
        action = actions.moveToElement(confirmPassword).click().sendKeys("password").build();
        action.perform();

        WebElement registerButton = driver.findElement(By.id("register-button"));
        action = actions.moveToElement(registerButton).click().build();
        action.perform();

        WebElement confirmation = driver.findElement(By.className("result"));

        Assert.assertEquals("Your registration completed", confirmation.getText());

        // Since re-registration will be done in Test 2, logout was made.
        WebElement logout = driver.findElement(By.linkText("Log out"));
        action = actions.moveToElement(logout).click().build();
        action.perform();

    }

    @Test
    public void test02() {
        driver.get("http://demowebshop.tricentis.com/");

        Actions actions = new Actions(driver);

        WebElement register = driver.findElement(By.linkText("Register"));
        Action action = actions.moveToElement(register).click().build();
        action.perform();

        WebElement gender = driver.findElement(By.id("gender-male"));
        action = actions.moveToElement(gender).click().build();
        action.perform();

        WebElement firstName = driver.findElement(By.id("FirstName"));
        action = actions.moveToElement(firstName).click().sendKeys("Name").build();
        action.perform();

        WebElement lastName = driver.findElement(By.id("LastName"));
        action = actions.moveToElement(lastName).click().sendKeys("Surname").build();
        action.perform();

        WebElement eMail = driver.findElement(By.id("Email"));
        action = actions.moveToElement(eMail).click().sendKeys("testing@testing.com").build();
        action.perform();

        WebElement password = driver.findElement(By.id("Password"));
        action = actions.moveToElement(password).click().sendKeys("password").build();
        action.perform();

        WebElement confirmPassword = driver.findElement(By.id("ConfirmPassword"));
        action = actions.moveToElement(confirmPassword).click().sendKeys("password").build();
        action.perform();

        WebElement registerButton = driver.findElement(By.id("register-button"));
        action = actions.moveToElement(registerButton).click().build();
        action.perform();

        WebElement confirmation = driver.findElement(By.xpath("//li[text()='The specified email already exists']"));

        Assert.assertEquals("The specified email already exists", confirmation.getText());
    }

    @Test
    public void test03() {
        driver.get("http://demowebshop.tricentis.com/");

        Actions actions = new Actions(driver);

        WebElement login = driver.findElement(By.linkText("Log in"));
        Action action = actions.moveToElement(login).click().build();
        action.perform();

        WebElement eMail = driver.findElement(By.id("Email"));
        action = actions.moveToElement(eMail).click().sendKeys("testing8567@testing.com").build();
        action.perform();

        WebElement password = driver.findElement(By.id("Password"));
        action = actions.moveToElement(password).click().sendKeys("password").build();
        action.perform();

        WebElement loginButton = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        action = actions.moveToElement(loginButton).click().build();
        action.perform();

        WebElement logout = driver.findElement(By.linkText("Log out"));

        Assert.assertTrue(logout.isDisplayed());

        // Since there will be a re-login process in Test 4, logout has been made.
        action = actions.moveToElement(logout).click().build();
        action.perform();
    }

    @Test
    public void test04() {
        driver.get("http://demowebshop.tricentis.com/");

        Actions actions = new Actions(driver);

        WebElement login = driver.findElement(By.linkText("Log in"));
        Action action = actions.moveToElement(login).click().build();
        action.perform();

        WebElement eMail = driver.findElement(By.id("Email"));
        // Random mail creation line because wrong mail entry is requested
        action = actions.moveToElement(eMail).click().sendKeys("testing" + ((int) (Math.random() * 10000)) + "@testing.com").build();
        action.perform();

        WebElement password = driver.findElement(By.id("Password"));
        action = actions.moveToElement(password).click().sendKeys("password" + ((int) (Math.random() * 10000))).build();
        action.perform();

        WebElement loginButton = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        action = actions.moveToElement(loginButton).click().build();
        action.perform();

        WebElement confirmation = driver.findElement(By.xpath("//span[text()='Login was unsuccessful. Please correct the errors and try again.']"));

        Assert.assertEquals("Login was unsuccessful. Please correct the errors and try again.", confirmation.getText());
    }

    @Test
    public void test05() {
        driver.get("http://demowebshop.tricentis.com/");

        Actions actions = new Actions(driver);

        Duration duration = Duration.ofSeconds(30);
        WebDriverWait wait = new WebDriverWait(driver, duration);

        WebElement login = driver.findElement(By.linkText("Log in"));
        Action action = actions.moveToElement(login).click().build();
        action.perform();

        WebElement eMail = driver.findElement(By.id("Email"));
        action = actions.moveToElement(eMail).click().sendKeys("testing8567@testing.com").build();
        action.perform();

        WebElement password = driver.findElement(By.id("Password"));
        action = actions.moveToElement(password).click().sendKeys("password").build();
        action.perform();

        WebElement loginButton = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        action = actions.moveToElement(loginButton).click().build();
        action.perform();

        WebElement computers = driver.findElement(By.linkText("COMPUTERS"));
        action = actions.moveToElement(computers).build();
        action.perform();

        WebElement notebooks = driver.findElement(By.linkText("Notebooks"));
        action = actions.moveToElement(notebooks).click().build();
        action.perform();

        WebElement notebook14Inch = driver.findElement(By.xpath("(//div[@class='details']//following::a)[1]"));
        action = actions.moveToElement(notebook14Inch).click().build();
        action.perform();

        WebElement laptopAddToCart = driver.findElement(By.id("add-to-cart-button-31"));
        action = actions.moveToElement(laptopAddToCart).click().build();
        action.perform();

        WebElement confirmation = driver.findElement(By.xpath("//p[text()='The product has been added to your ']"));

        Assert.assertTrue(confirmation.getText().contains("The product has been added to your"));

        WebElement shoppingCart = driver.findElement(By.xpath("//span[text()='Shopping cart']"));
        action = actions.moveToElement(shoppingCart).click().build();
        action.perform();

        WebElement notebook14InchControl = driver.findElement(By.xpath("(//a[text()='14.1-inch Laptop'])[2]"));

        Assert.assertTrue(notebook14InchControl.getText().contains("14.1-inch Laptop"));

        WebElement agree = driver.findElement(By.id("termsofservice"));
        action = actions.moveToElement(agree).click().build();
        action.perform();

        WebElement checkoutButton = driver.findElement(By.id("checkout"));
        action = actions.moveToElement(checkoutButton).click().build();
        action.perform();

        WebElement newAddressMenu = driver.findElement(By.id("billing-address-select"));
        Select newAdresSelectMenu = new Select(newAddressMenu);
        newAdresSelectMenu.selectByVisibleText("New Address");

        WebElement countryMenu = driver.findElement(By.name("BillingNewAddress.CountryId"));
        Select countrySelectMenu = new Select(countryMenu);
        countrySelectMenu.selectByValue("77");

        WebElement city = driver.findElement(By.id("BillingNewAddress_City"));
        action = actions.moveToElement(city).click().sendKeys("Ankara").build();
        action.perform();

        WebElement address1 = driver.findElement(By.id("BillingNewAddress_Address1"));
        action = actions.moveToElement(address1).click().sendKeys("Kavaklıdere").build();
        action.perform();

        WebElement zipCode = driver.findElement(By.name("BillingNewAddress.ZipPostalCode"));
        action = actions.moveToElement(zipCode).click().sendKeys("06000").build();
        action.perform();

        WebElement phoneNumber = driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
        action = actions.moveToElement(phoneNumber).click().sendKeys("060123456789").build();
        action.perform();

        WebElement continueButtonBillingAddress = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@title='Continue'])[1]")));
        action = actions.moveToElement(continueButtonBillingAddress).click().build();
        action.perform();

        WebElement continueButtonShippingAddress = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@onclick='Shipping.save()']")));
        action = actions.moveToElement(continueButtonShippingAddress).click().build();
        action.perform();

        WebElement continueButtonShippingMethod = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@onclick='ShippingMethod.save()']")));
        action = actions.moveToElement(continueButtonShippingMethod).click().build();
        action.perform();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        WebElement continueButtonPaymentMethod = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@onclick='PaymentMethod.save()']")));
        js.executeScript("arguments[0].click();", continueButtonPaymentMethod);

        WebElement continueButtonPaymentInformation = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@onclick='PaymentInfo.save()']")));
        action = actions.moveToElement(continueButtonPaymentInformation).click().build();
        action.perform();

        WebElement confirmOrderButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@onclick='ConfirmOrder.save()']")));
        action = actions.moveToElement(confirmOrderButton).click().build();
        action.perform();

        WebElement lastConfirmation = driver.findElement(By.xpath("//strong[text()='Your order has been successfully processed!']"));

        Assert.assertEquals("Your order has been successfully processed!", lastConfirmation.getText());

        waitAndClose();
    }
}
