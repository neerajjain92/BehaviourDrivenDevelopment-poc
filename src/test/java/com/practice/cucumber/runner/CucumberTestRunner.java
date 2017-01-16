package com.practice.cucumber.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by jaine03 on 16/01/17.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        features = "src/test/resources/features/",
        dryRun = true,
        glue = "com.practice.cucumber.test.calculator",
        plugin = {"pretty", "html:build/results"}
)
public class CucumberTestRunner {
}
