package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"html:target/Paralel-reports2.html",
                "json:target/json-reports/cucumber2.json",
                "junit:target/xml-report/cucumber2.xml"
        },
        features = "src/test/resources", // testlerimizin olduğu (Cucumber) klasor yolu (.feature lerin)
        glue = "stepdefinitions", // stepdefinitions (Java) klasoru. Testlerimizin olusturuldugu klasor ile javayı birleştirir.
        tags = "@toplu",         // buraya hangi tagı yazarsak testlerdeki o tagyazan testleri çalıştırır.


        dryRun = false   // varsayılan olarak false olur. True yaparsak sadece eksik adimlari bulur
        // ve onlarla ilgili stepdefinition'lari bize verir. eksik yoksa Test PASSED der.
)

public class RaporRunner {
}
