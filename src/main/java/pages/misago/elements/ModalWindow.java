package pages.misago.elements;

import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Param;
import pages.html_elements.Button;
import pages.html_elements.Input;
import ru.lanit.at.pages.block.AbstractBlockElement;

public interface ModalWindow extends AbstractBlockElement, Button.WithButton, Input.WithInput {
    interface WithModalWindow {
        @FindBy(".//div[contains(@class, 'modal-content')]")
        ModalWindow modalWindow();

        @FindBy(".//div[contains(@class, 'modal-content')][.//h4[normalize-space(.)='{{ title }}']]")
        ModalWindow modalWindow(@Param("title") String title);
    }
}
