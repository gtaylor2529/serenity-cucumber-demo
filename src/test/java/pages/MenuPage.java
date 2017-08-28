package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.Iterator;
import java.util.List;

public class MenuPage extends PageObject {

    @FindBy(id = "navigationMenuWrapper")
    private WebElementFacade menu;

    @FindBy(tagName = "a")
    private List<WebElementFacade> pages;

    public void goToPage(String pageName) {
        Iterator elements = pages.iterator();
        while (elements.hasNext()) {
            WebElementFacade elementFacade = (WebElementFacade) elements.next();
            if (elementFacade.getText().equalsIgnoreCase(pageName))
                elementFacade.click();
        }
    }
}
