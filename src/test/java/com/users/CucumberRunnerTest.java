package com.users;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
         plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        ,tags = "@smokeTest or @regression"
        ,features = "src/test/java/com/users/UsersManagement.feature"
        ,glue = "com")
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {
}
