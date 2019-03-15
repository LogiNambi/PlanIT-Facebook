package screenshot;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot {
 
	   public void Screenshot(WebDriver driver,String Screenshotname)
		{
			
			try {
				TakesScreenshot s = (TakesScreenshot)driver;	
				File source  = s.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(source,new File("./Screenshots/"+Screenshotname+".png"));
			} 
			catch (Exception e) 
			{
			
				System.out.println("error messge"+e.getMessage());
			}
		}
	}

