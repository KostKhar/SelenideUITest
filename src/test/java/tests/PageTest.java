package tests;

import model.MainPage;
import model.SearchPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PageTest extends BaseTest{
    @Test
    public void findApple() {
        MainPage mP = new MainPage(appleUrl);
        mP.clickSearch();
        mP.enterSearchText(appleExist);
        SearchPage sP = new SearchPage();

        Assertions.assertTrue(sP.getHrefFirstResult().contains("iphone-13"));
    }


}
