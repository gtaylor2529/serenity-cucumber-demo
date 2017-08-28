package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import java.util.List;
import java.util.stream.Collectors;

@DefaultUrl("http://www.valtech.com")
public class HomePage extends PageObject {

    @FindBy(className = "block-header__heading")
    private List<WebElementFacade> sectionHeaders;

    @FindBy(id = "menu-toggle-button")
    private WebElementFacade responsiveMenuButton;

    public List<String> getSections() {
        return sectionHeaders.stream()
                .map(element -> element.getText())
                .collect(Collectors.toList());
    }

    public MenuPage openMenu() {
        if (responsiveMenuButton.isVisible())
            responsiveMenuButton.click();
        return new MenuPage();
    }
}