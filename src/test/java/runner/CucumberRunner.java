package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/feature"},
        glue = { "step.definitions"},
        monochrome = true,
        dryRun = true)
public class CucumberRunner {
}