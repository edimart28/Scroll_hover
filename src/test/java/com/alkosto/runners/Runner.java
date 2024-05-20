package com.alkosto.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/home.feature",
        glue = "com.alkosto.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE

)

public class Runner {
}
