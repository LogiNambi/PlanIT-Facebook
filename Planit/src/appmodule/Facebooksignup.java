package appmodule;
import org.openqa.selenium.WebDriver;

import Utility.ExcelUtils;
import object_definition.Dropdown;
import object_definition.Facebook;

public class Facebooksignup 

{
	static WebDriver driver;
	public static void signup(WebDriver Driver) throws Exception {
		

		    
		    String Firstname = ExcelUtils.getCellData(1, 1);;
			Facebook.Firstname(driver).sendKeys(Firstname);
			
			String Lastname = ExcelUtils.getCellData(1, 2);;
			Facebook.Lastname(driver).sendKeys(Lastname);
			
			String Mail = ExcelUtils.getCellData(1, 3); ;
			Facebook.mail(driver).sendKeys(Mail);
			
			String Pwd = ExcelUtils.getCellData(1, 4);;
			Facebook.Pwd(driver).sendKeys(Pwd);
			
			Dropdown.dropdown(driver);
		    Facebook.Female(driver).click();
		    Facebook.Logon(driver).click();
	   
	       
	        }

	}


