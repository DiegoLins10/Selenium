package co.selenium;
/*
 * @Author Diego Lins 20/04/2021
 * Estudando selenium puro com java
 * 
 */
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DiegoLins\\OneDrive - Fatec Centro Paula Souza\\Desktop\\Faculdade\\Selenium\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("http://amazon.in"); // chama url do site
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver; //executor do selenium moto do js
		
		WebElement SearchBox = driver.findElement(By.id("twotabsearchtextbox")); //mapeando pelo Id
		SearchBox.sendKeys("JBL earphones"); //mandando digitar
		WebElement SearchIcon = driver.findElement(By.id("nav-search-submit-button")); //mapeando pelo id
		SearchIcon.click(); //mandando clicar
		WebElement CheckBox = driver.findElement(By.className("a-checkbox")); // mapeando pelo nome da classe
		CheckBox.click(); //mandando clicar
		Thread.sleep(4000);//mandando esperar
		js.executeScript("window.scrollBy(0,4000)"); //mandando executar
		Thread.sleep(4000);
		driver.quit(); //fechando navegador e drive
	}

}
