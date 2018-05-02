package com.sampleTest.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * Unit test for simple App.
 */
public class AppTest 
    
{
	@Test
	public void mailTest() throws MalformedURLException{
        DesiredCapabilities dr=null;
        dr=DesiredCapabilities.firefox();
        dr.setBrowserName("firefox");
        dr.setPlatform(Platform.WINDOWS);
        //         dr=DesiredCapabilities.internetExplorer();
        //         dr.setBrowserName("iexplore");
        //         dr.setPlatform(Platform.WINDOWS);
        RemoteWebDriver driver=new RemoteWebDriver(new     URL("http://172.31.89.221:4444/wd/hub"), dr);
        driver.navigate().to("http://gmail.com");
        driver.findElement(By.xpath("//input[@id='Email']")) .sendKeys("username");
        driver.findElement(By.xpath("//input[@id='Passwd']")) .sendKeys("password");
        driver.close();
}
	
}
