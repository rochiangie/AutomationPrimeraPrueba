import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoogleSearchTest {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        // Configura la ubicación del driver de Chrome (asegúrate de tener el ChromeDriver descargado)
        System.setProperty("webdriver.chrome.driver", "ruta/al/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testGoogleSearchPageTitle() {
        // Navega a Google
        driver.get("https://www.google.com");

        // Verifica que el título sea "Google"
        String title = driver.getTitle();
        assertEquals("Google", title);
    }

    @AfterEach
    public void tearDown() {
        // Cierra el navegador después de cada prueba
        if (driver != null) {
            driver.quit();
        }
    }
}
