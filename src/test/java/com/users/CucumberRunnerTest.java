package com.users;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
         plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        ,tags = "@smokeTest or @regression"
        ,features = "src/test/java/com/users/UsersManagement.feature"
        ,glue = "com",monochrome = true,dryRun = false)
/*@CucumberOptions(
        plugin = {"pretty","io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"}
        ,tags = "@Login"
        ,features = "src/test/java/com/users/UsersManagement.feature"
        ,glue = "com",monochrome = true,dryRun = false)*/
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {
}
