package as.automation.steps;

import as.automation.Hooks;
import io.cucumber.java.pt.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuscaProdutoStepDefinitions {

    WebDriver driver = Hooks.getDriver();

    @Quando("clicar no item de busca e não digitar um texto")
    public void clicar_no_item_de_busca_e_não_digitar_um_texto() {
        driver.findElement(By.name("simpleSearch")).click();
    }

    @Entao("deve exibir uma sugestão dos termos mais buscados")
    public void deve_exibir_uma_sugestão_dos_termos_mais_buscados() {

    }

}
