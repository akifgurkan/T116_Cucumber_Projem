package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"html:target/cucumber-reports.html", // cucumber-reports yerine istediğimiz ismi de verebiliriz.
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        },
        features = "src/test/resources", // testlerimizin olduğu (Cucumber) klasor yolu (.feature lerin)
        glue = "stepdefinitions", // stepdefinitions (Java) klasoru. Testlerimizin olusturuldugu klasor ile javayı birleştirir.
        tags = "@wip",         // buraya hangi tagı yazarsak testlerdeki o tagyazan testleri çalıştırır.


        dryRun = false  // varsayılan olarak false olur. True yaparsak ve bu classtan çalistirirsek sadece eksik adimlari bulur
                        // ve onlarla ilgili stepdefinition'lari bize verir. eksik yoksa Test PASSED der.
)

public class Runner {
}

/*
    Runner class'i BOS bir class'dir
    Runner class'inin bize sagladigi islev
    Sahip oldugu 2 notasyon sayesindedir

    dryRun = true yaptigimizda
    var olan adimlari CALISTIRMADAN
    sadece eksik adimlari bulur ve onlarla ilgili stepdefinition'lari bize verir

    EGER eksik adim yoksa,
    bu durumu raporlamak icin Test PASSED isaretlenir

    features = "src/test/resources",
    glue = "stepdefinitions",

    bu iki klasor birbiriyle ilisiklendirildigi icin
    bu klasorlerin altindaki tum file'lar ve class'lar ilisiklidir
    Cucumber da file ve class'lari 1-1 eslestirmek yerine
    tumunu eslestirir

    Eger siz spesifik olarak 1 feature'i,
    belirlediginiz 1 stepdefinition class'i ile calismasini isterseniz
    Runner class'inda bu eslesmeyi yapabilirsiniz

 */