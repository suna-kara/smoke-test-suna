package com.blueCRM.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber/report.html",
                "rerun:target/rerun.txt",
                "json:target/cucumber.json",
        },
        features = "src/test/resources/features",
        glue =    "com/blueCRM/step_definitions",
        dryRun = false,
        tags = "@enesS"

)

public class CukesRunner {

}
