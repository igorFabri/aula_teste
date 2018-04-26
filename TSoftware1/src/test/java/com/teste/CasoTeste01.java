/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teste;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author ice
 */
public class CasoTeste01 {

    private static WebDriver driver;

    @Before
    public void before() {
        System.setProperty("webdriver.gecko.driver", "/ice/Downloads/geckodriver");
        driver = new FirefoxDriver();
    }

    @After
    public void after() {

    }

    @BeforeClass
    public static void beforeClass() {

    }

    @AfterClass
    public static void afterClass() {

    }

    @Test
    public void testarNavegador() {
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=accountsettings&continue=https%3A%2F%2Fmyaccount.google.com%2Fintro%3Futm_source%3DOGB%26utm_medium%3Dapp&flowName=GlifWebSignIn&flowEntry=SignUp");

        WebElement firstName = driver.findElement(By.id("firstName"));
        WebElement lastName = driver.findElement(By.id("lastName"));
        WebElement username = driver.findElement(By.id("username"));

        WebElement password = driver.findElement(By.name("Passwd"));
        WebElement confirmPassword = driver.findElement(By.name("ConfirmPasswd"));
        WebElement botao = driver.findElement(By.id("accountDetailsNext"));

        firstName.sendKeys("Ramon");
        lastName.sendKeys("Ramon");
        username.sendKeys("kleysdthon");
        password.sendKeys("Ramon123!@#8855");
        confirmPassword.sendKeys("Ramon123!@#8855");

        botao.click();

        //Wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement telefone = driver.findElement(By.id("phoneNumberId"));
        WebElement botaoTelefone = driver.findElement(By.id("gradsIdvPhoneNext"));
        telefone.sendKeys("(31)981321321");
        botaoTelefone.click();

        driver.quit();
    }
}
