package pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://iq-body.ru/")
public class MainPage extends PageObject {

    @FindBy(xpath = "/html/body/div[2]/nav/div[1]/div/div[2]/div/div/div[3]/div/a")
    private WebElementFacade LoginButton;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div/div/div/div[2]/div/button")
    private WebElementFacade RegisterButton;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div/div/div/div[1]/div/form/div/button")
    private WebElementFacade LoginButton2;

    public void findRegisterButton () {
        LoginButton.click();
        RegisterButton.shouldBeVisible();
    }

    public void findLoginButton2() {
        LoginButton2.shouldBeVisible();
    }

}
