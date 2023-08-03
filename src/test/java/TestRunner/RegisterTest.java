package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

public class RegisterTest {

	@RunWith(Cucumber.class)
	@CucumberOptions(features = { "AllFeatures" }, glue = { "SelfDefinition" }, dryRun = false

	)

	public class RunnerTest {

	}
}
