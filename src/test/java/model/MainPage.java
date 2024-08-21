package model;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    private final SelenideElement formButton = $(By.xpath("//form"));
    private final SelenideElement textBoxInput = $(By.xpath("//form/input"));

    public MainPage(String urls) {
        Selenide.open(urls);
    }

    public void clickSearch() {
        formButton.click();
    }

    public void enterSearchText(String searchText) {
        textBoxInput.setValue(searchText);
        textBoxInput.sendKeys(Keys.ENTER);
    }
}
