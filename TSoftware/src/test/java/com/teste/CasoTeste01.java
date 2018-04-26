/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teste;

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
    public void before(){
        System.setProperty("webdriver.gecko.driver","/ice/Downloads/geckodriver");
        driver = new FirefoxDriver();
    }
    
    @After
    public void after(){
        
    }
    
    @BeforeClass
    public static void beforeClass(){
        
    }
    
    @AfterClass
    public static void afterClass(){
        
    }
    
    @Test
    public void testarNavegador(){
        driver.get("https://www.google.com.br/");
        
        WebElement nome = driver.findElement(By.id("lst-ib"));
        nome.sendKeys("Ramon");
        
        driver.quit();
    }
}

//        driver.navigate().to();
