package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class FirstTest {

    Integer result;

    @Given("Print start log")
    public void print_start_log() {
        System.out.println("Add two numbers");
    }

    @When("I add {int} and {int}")
    public void i_add_and(Integer int1, Integer int2) {
        result = int1 + int2;
    }

    @Then("Result is {int}")
    public void result_is(Integer int1) {
        Assert.assertEquals(result, int1);
    }
}
