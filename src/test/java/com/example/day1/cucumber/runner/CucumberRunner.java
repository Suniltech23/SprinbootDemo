package com.example.day1.cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ={"feature"},
        glue = {"com.example.day1.cucumber.glue"},
        plugin = {"pretty","html:target/cucumber-html-report"},
        dryRun = true,
        stepNotifications = true,
        monochrome = true
)
public class CucumberRunner {

}
