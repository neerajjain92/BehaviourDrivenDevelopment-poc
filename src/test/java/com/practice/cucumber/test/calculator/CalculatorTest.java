package com.practice.cucumber.test.calculator;

import com.practice.cucumber.Calculator;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by jaine03 on 16/01/17.
 * In Regular Expression for Annotation Replacing \\d+ with .+ to support both double and float numbers
 */
public class CalculatorTest {

    private Calculator calculator;

    @Given("^Calculator is turned on$")
    public void calculator_is_turned_on() throws Throwable {
        calculator = new Calculator();
    }

    @When("^I add (.+)$")
    public void addFirst(int number) throws Throwable {
        calculator.add(number);
    }

    @When("^add (.+)$")
    public void addSecond(int number) throws Throwable {
        calculator.add(number);
    }

    @Then("^result should be (.+)$")
    public void result_should_be(int result) throws Throwable {
        Assert.assertTrue(calculator.getCurrentValue() == result);
    }

    @When("^subtract (.+)$")
    public void subtract(int number) throws Throwable {
        calculator.subtract(number);
    }
}
