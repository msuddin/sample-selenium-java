import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import page.BasePage;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GradleTest {

    private BasePage basePage;

    @Before
    public void setUp() {
        basePage = new BasePage();
    }

    @After
    public void tearDown() {
        basePage.quiteDriver();
    }

    @Test
    public void shouldPrintOutPageTitle() {
        // Given
        basePage.url("https://en.wikipedia.org");

        // When
        basePage
                .getElement(By.id("searchInput"))
                .searchTextOnElement("Gradle")
                .sendKeyToElement(Keys.ENTER);

        // Then
        assertThat(basePage.pageTitle(), is("Gradle"));
    }
}
