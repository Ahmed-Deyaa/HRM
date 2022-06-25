package com.users;

import com.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.UsersPage;

public class UsersManagementStepDefinition extends BaseTest {

    private LoginPage loginPage;
    private HomePage homePage;
    private UsersPage usersPage;


    @Given("user navigates to orange website")
    public void user_navigates_to_orange_website() {

        driver.get(url);
        loginPage = new LoginPage(driver);

        
    }
    @When("user enters valid username {string} and password {string}")
    public void user_enters_valid_username_and_password(String username, String password)  {
        loginPage.enterCredentials(username,password);
        
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        homePage = loginPage.clickOnLoginButton();
        
    }
    @Then("user navigates to home page successfully")
    public void user_navigates_to_home_page_successfully() {
        Assert.assertTrue(homePage.isHomePageLoaded());
        
    }
    @When("user hover over admin Tab")
    public void user_hover_over_admin_tab() {
        homePage.hoverOverAdminTab();
        
    }
    @When("user hover over userManagement Tab")
    public void user_hover_over_user_management_tab() {
        homePage.hoverOverUserManagementTab();
        
    }
    @When("user click on users tab")
    public void user_click_on_users_tab() {
        usersPage = homePage.clickOnUsersTab();
        
    }
    @Then("user navigates to users page successfully")
    public void user_navigates_to_users_page_successfully() {
        Assert.assertTrue(usersPage.isUsersPageLoaded());
        
    }







}
