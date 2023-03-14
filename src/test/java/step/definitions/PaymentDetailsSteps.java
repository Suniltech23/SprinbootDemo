package step.definitions;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Before;
import org.springframework.boot.test.web.server.LocalServerPort;

import java.net.URISyntaxException;


public class PaymentDetailsSteps {

    private final String BASE_URL = "http://localhost/";
    private Response response;
    private Scenario scenario;

    public String statusCode(String statusCode){return statusCode.trim();}
    public String url(String url){return url.trim();}

    @Before
    public void before(Scenario scenario){
        this.scenario = scenario;
    }

    @LocalServerPort
    private int port;
    @Given ("Get call for Payment")
    public void getCallToURL() throws URISyntaxException {
        RequestSpecification requestSpecification = RestAssured.given();
        response = requestSpecification.port(port).auth().digest("root", "root").when().get("/paymentdetails");

    }
    @Then("Response for PaymentDetails is {statusCode}")
    public void responseIsStstusCode(String statusCode){
        int actualres = response.then().extract().statusCode();
        Assert.assertEquals(statusCode, actualres+"");

    }

}