package PageObjects.MainLayout;

import static com.codeborne.selenide.Selenide.page;

/*
* Лейаут
* */
public class MainLayoutPage {

    /*
    * Левое меню
    * */
    public LeftMenuPage leftMenuPage = page(LeftMenuPage.class);

    /*
    * Правое меню
    * */
    public RightMenuPage rightMenuPage = page(RightMenuPage.class);

    /*
    * Верхнее меню
    * */
    public TopMenuPage topMenuPage = page(TopMenuPage.class);
}


