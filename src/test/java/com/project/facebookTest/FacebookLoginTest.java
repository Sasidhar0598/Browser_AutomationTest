package com.project.facebookTest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertFalse;



public class FacebookLoginTest {
    @Test
    public void testFacebookAuthentication() {
        

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open Facebook login page
        driver.get("https://www.facebook.com");
        
        driver.manage().window().maximize();

        // Find Username and password input fields and login button
        WebElement usernameField = driver.findElement(By.id("email"));
        WebElement passwordField = driver.findElement(By.id("pass"));
        WebElement loginButton = driver.findElement(By.name("login"));

        // Enter your Facebook credentials (replace with your test account details)
        
        
        usernameField.sendKeys("sasi@gmail.com");
        passwordField.sendKeys("sasi@123");

        // Click the login button
        loginButton.click();
        
        System.out.println(driver.getCurrentUrl());
        https://www.facebook.com/recover/initiate/?lara_product=www_first_password_failure

        // Wait for the authentication process (replace with appropriate waiting mechanism)

        // Assert that the login was successful (replace with appropriate verification)
        assertFalse(driver.getCurrentUrl().contains("facebook.com/home"), "Facebook authentication failed");

        // Close the browser
        driver.quit();
    }

}
