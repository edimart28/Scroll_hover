package com.alkosto.stepDefinitions;

import com.alkosto.steps.HomeSteps;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeStepDefinitions {

    WebDriver driver;

    @Steps
    private HomeSteps homeSteps;




    @BeforeAll
    static void setupClass() {
        WebDriverManager.chromedriver().clearDriverCache().setup();
    }

    @BeforeEach
    void setupTest() {

        driver = new ChromeDriver();

    }

    @AfterEach
    void teardown () {  driver.quit();

    }


    @Given("ingresar a la pagina web")
    public void ingresarALaPaginaWeb() {
        homeSteps.openUrl();

    }
    @When("hago scroll hasta el final de la pagina")
    public void hagoScrollHastaElFinalDeLaPagina() {
        try {
            homeSteps.scroll(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }




    }
    @When("hago scroll hasta la parte inicial de la pagina")
    public void hagoScrollHastaLaParteInicialDeLaPagina() throws InterruptedException {
        homeSteps.scroll(-6000);


    }
    @Then("puedo visualizar las opcionnes del boton Mi cuenta sin hacer clic")
    public void puedoVisualizarLasOpcionnesDelBotonMiCuentaSinHacerClic() {

       // homeSteps.hover();

    }


}
