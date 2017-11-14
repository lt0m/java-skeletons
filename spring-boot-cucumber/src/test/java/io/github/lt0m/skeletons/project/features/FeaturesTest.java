package io.github.lt0m.skeletons.project.features;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty",
        "html:target/cucumber" }, features = "classpath:features/search.feature", snippets = SnippetType.CAMELCASE)
public class FeaturesTest {

}