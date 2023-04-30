package as.automation.steps;

import as.automation.Hooks;
import io.cucumber.java.pt.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class AcessarSiteStepDefinitions {

    WebDriver driver = Hooks.getDriver();
    String baseUrl = "https://advantageonlineshopping.com/#/";

    @Dado("que o usuário acesse a página home do site")
    public void que_o_usuário_acesse_a_página_home_do_site() {
        driver.get(baseUrl);
    }

    @Entao("a página é carregada com o título {string}")
    public void a_página_é_carregada_com_o_título(String string) {
        Assertions.assertEquals("Advantage Shopping", driver.getTitle());
    }

}
