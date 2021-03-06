package utils;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber"},
        features = "src/test/resources/features",
        glue = {"bdd/definitions", "bdd/support", "utils"}
//        tags = "@quote"
        // same as VM option -Dcucumber.options="--tags @quote"
)
public class TestRunner {
    @BeforeClass
    public static void setup() {
    }

    @AfterClass
    public static void teardown() {
    }
}
