import io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME
import org.junit.platform.suite.api.*



@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "")
class RunCukesTests


/**
 * @RunWith(Cucumber::class)
@CucumberOptions(
plugin = ["pretty"],
dryRun = true,
snippets = CucumberOptions.SnippetType.UNDERSCORE,
features = ["classpath:features"]
)

 */