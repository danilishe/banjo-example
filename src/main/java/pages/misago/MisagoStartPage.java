package pages.misago;

import org.openqa.selenium.By;
import pages.html_elements.Button;
import pages.html_elements.Text;
import pages.misago.elements.ModalWindow;
import ru.lanit.at.pages.AbstractPage;
import ru.lanit.at.pages.annotations.Title;

@Title("Стартовая страница песочницы")
public interface MisagoStartPage extends AbstractPage,
        Button.WithButton, ModalWindow.WithModalWindow, Text.WithText {
    @Override
    default boolean isOpen() {
        return getWrappedDriver().findElement(By.tagName("h1")).getText().trim().equalsIgnoreCase("Lanit education");
    }
}
