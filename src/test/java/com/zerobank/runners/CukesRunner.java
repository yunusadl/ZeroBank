package com.zerobank.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(


        features = "src/test/resources/features",
        glue = "src/test/java/com/zerobank/stepdefinitions",
        dryRun = true,
        tags = "@wip"


)

public class CukesRunner {






}
