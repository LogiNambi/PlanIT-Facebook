package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utility.ExcelUtils;

public class Testcase1 {
	public static void main(String[] args) throws Exception {
       System.setProperty("webdriver.gecko.driver","path to Firefox Driver");  
       WebDriver driver = new FirefoxDriver();
       driver.get("https://www.facebook.com");
       driver.manage().window().maximize();
       appmodule.Facebooksignup.signup(driver);
       System.out.println("Login Successfully, now it is the time to Log Off buddy.");
       driver.quit();
           //This is to send the PASS value to the Excel sheet in the result column.
       ExcelUtils.setCellData("Pass", 1, 5);

}

}
