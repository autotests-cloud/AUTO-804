package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("UI tests of auto1-group web site")
    void generatedTest() {
        step("Open https://www.auto1-group.com/", () -> {
            step("// todo: just add selenium action");
        });

        step("set", () -> {
            step("// todo: just add selenium action");
        });

        step("set", () -> {
            step("// todo: just add selenium action");
        });

        step("verify", () -> {
            step("// todo: just add selenium action");
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://www.auto1-group.com/'", () ->
            open("https://www.auto1-group.com/"));

        step("Page title should have text 'AUTO1 Group - Europe's leading digital automotive platform'", () -> {
            String expectedTitle = "AUTO1 Group - Europe's leading digital automotive platform";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://www.auto1-group.com/'", () ->
            open("https://www.auto1-group.com/"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}