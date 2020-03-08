import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features", glue = "steps", dryRun = false, monochrome = true, plugin = {"pretty"}, strict = true, tags = "@smoke")
public class AcceptanceTests {

}
