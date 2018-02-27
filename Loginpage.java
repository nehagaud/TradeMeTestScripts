package Trademe_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Loginpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		String baseurl="https://www.trademe.co.nz/";
		String expectedTitle="Buy online and sell with NZ's #1 auction & classifieds site | Trade Me";
		String actualTitle ="";
		
		driver.get(baseurl);
		
		actualTitle =driver.getTitle();
		//System.out.println("actualTitle is "+actualTitle);
		
		if (actualTitle.contentEquals(expectedTitle))
		{
			System.out.println("Test Passed!!");
			
		}
		else
		{
			System.out.println("Test Failed!!");

		}
		
	}

}
