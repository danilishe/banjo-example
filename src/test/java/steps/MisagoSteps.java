package steps;

import cucumber.api.java.ru.Тогда;
import pages.misago.elements.ModalWindow;

import static org.hamcrest.core.Is.is;
import static ru.yandex.qatools.matchers.webdriver.DisplayedMatcher.displayed;

public class MisagoSteps extends BaseSteps {
    @Тогда("отображается всплывающее окно {string}")
    public void отображаетсяВсплывающееОкно(String windowName) {
        setCurrentBlock(ModalWindow.class, windowName);
        getCurrentBlock().should(is(displayed()));
    }
}
