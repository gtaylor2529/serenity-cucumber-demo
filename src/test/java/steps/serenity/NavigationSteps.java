package steps.serenity;

import net.thucydides.core.annotations.Step;
import pages.HomePage;
import pages.MenuPage;

import static org.assertj.core.api.Assertions.assertThat;

public class NavigationSteps {

    HomePage homePage;
    MenuPage menuPage;

    @Step
    public void isOnTheHomePage() {
        homePage.open();
    }

    @Step
    public void shouldSeeTheSection(String section) {
        assertThat(homePage.getSections()).contains(section);
    }

    @Step
    public void goesToThePage(String pageName) {
        menuPage = homePage.openMenu();
        menuPage.goToPage(pageName);
    }
}