package com.maximus;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber-report", "json:target/cucumber.json" },

		tags = "@demo", features = "src/test/resources/") // com/maximus/features",
//		glue = "/com/maximus/step_definitions", dryRun = false)
// features="src/test/resources/", dryRun = false, tags="@smoke")

public class CukeRunner {

}
