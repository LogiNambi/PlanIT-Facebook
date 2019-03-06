package object_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
	
	public static void dropdown(WebDriver driver)
	   {
		Select select = new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
		select.selectByValue(null);
		Select select1 = new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
		select1.selectByValue(null);
		Select select2 = new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
		select2.selectByValue(null);
		}
     
	}
