package com.maximus.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin=
	{"pretty",
				"html:target/cucumber-report",
				"json:target/cucumber.json"
			},
	
	tags = "@demo",
	features = "src/test/resources/com/maximus/features",
	glue = "src/test/java/com/maximus/step_definitions",
	dryRun= true
	)
	//features="src/test/resources/", dryRun = false, tags="@smoke")

public class CukeRunner {

}
