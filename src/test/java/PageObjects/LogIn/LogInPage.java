package PageObjects.LogIn;

import DTO.LogInDTO;

import com.codeborne.selenide.SelenideElement;

import org.openqa.selenium.support.FindBy;

/**
 * Страница логина
 */
public class LogInPage {

    @FindBy( id="Login")
    public SelenideElement userLogin;

    @FindBy( id="Password")
    public SelenideElement userPassword;

    @FindBy (xpath ="//*[@id='RememberMe' and @type='checkbox']")
    public SelenideElement rememberMe;

    @FindBy (xpath = "//*[@class='btn single-btn']")
    public SelenideElement entr;



    public void setLogin (LogInDTO dto){

        userLogin.setValue(dto.login);
        userPassword.setValue(dto.password);
       // rememberMe.click();
        entr.pressEnter();
    }



}