 package t;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "use_cases",glue= {"t.acceptans"},plugin= {"html:target/cucumber/wikipedia.html"}
)
public class acceptans {

}
