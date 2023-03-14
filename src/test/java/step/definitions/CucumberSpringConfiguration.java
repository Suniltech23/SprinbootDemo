package step.definitions;

import com.example.day1.SpringBootH2DatabaseExampleApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = SpringBootH2DatabaseExampleApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

public class CucumberSpringConfiguration { }