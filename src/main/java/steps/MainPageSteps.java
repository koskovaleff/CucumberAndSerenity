package steps;

import net.thucydides.core.annotations.Step;
import pages.MainPage;


public class MainPageSteps {
MainPage page;

    @Step
    public void open_main_page() {
        page.open();

    }

    @Step
    public void click_login_button() {
        page.findRegisterButton();

    }

    @Step
    public void check_reg_button() {
        page.findLoginButton2();

    }

}
