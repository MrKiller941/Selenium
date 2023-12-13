package com.example;
import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mail {
    @Test
    public void secondTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sobol\\Desktop\\Selenium\\demo\\drivers\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1280, 1025));


        driver.get("https://account.mail.ru/login"); 
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Задержка
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("nahot93534lanxi8@mail.ru"); 
        
        driver.findElement(By.xpath("//*[@class='inner-0-2-89 innerTextWrapper-0-2-90']")).click(); 
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Задержка
        
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("keneryan12");
        driver.findElement(By.xpath("//*[@class='inner-0-2-89 innerTextWrapper-0-2-90']")).click();
       
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
        driver.findElement(By.xpath("//*[@class='ph-project ph-project__account svelte-1osmzf1']")).click();
       
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
        driver.findElement(By.xpath("//*[@data-click-counter='75068944']")).click();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
        driver.findElement(By.xpath("//*[@class='resplash-btn resplash-btn_outlined-themed resplash-btn_mailbox-big caa__dcaf__de8k2m']")).isDisplayed(); // Проверка на наличие кнопки "Создать почту"
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 

        driver.quit();
    }
}