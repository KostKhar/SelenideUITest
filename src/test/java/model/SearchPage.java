package model;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;

public class SearchPage {


        private final ElementsCollection firstResult = $$x("//*[@class='entry-title']/a");

        //поиск в названия атрибута href
        public String getHrefFirstResult() {
        return firstResult.first().getAttribute("href");
    }

}
