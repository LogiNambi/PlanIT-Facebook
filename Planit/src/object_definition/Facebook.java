package object_definition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Facebook {
	
	
	public static WebElement Firstname(WebDriver driver)
{
	WebElement Firstname = driver.findElement(By.name("firstname"));
	Firstname.click();
	return  Firstname;
}
public static WebElement Lastname(WebDriver driver)
{
	WebElement Lastname = driver.findElement(By.name("lastname"));
	Lastname.click();
	return Lastname;
}
public static WebElement mail(WebDriver driver)
{
	WebElement mail = driver.findElement(By.name("reg_email_"));
	mail.click();
	return mail;
}
public static WebElement Pwd(WebDriver driver)
{
	WebElement Pwd = driver.findElement(By.name("reg_password_"));
	Pwd.click();
	return Pwd;
}
public static WebElement Male(WebDriver driver)
{
	WebElement Male = driver.findElement(By.id("u_0_7"));
	return Male;
}
public static WebElement Female(WebDriver driver)
{
	WebElement Female = driver.findElement(By.id("u_0_9"));
	return Female;
}
public static WebElement Logon(WebDriver driver)
{
	WebElement Logon = driver.findElement(By.name("websubmit"));
	return Logon;
}
}

