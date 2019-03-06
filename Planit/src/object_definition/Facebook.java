package object_definition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Facebook {
	
	
	public static WebElement Firstname(WebDriver driver)
{
	WebElement Firstname = driver.findElement(By.xpath("//*[@id=\"u_0_j\"]"));
	Firstname.click();
	return  Firstname;
}
public static WebElement Lastname(WebDriver driver)
{
	WebElement Lastname = driver.findElement(By.xpath("//*[@id=\"u_0_l\"]"));
	Lastname.click();
	return Lastname;
}
public static WebElement mail(WebDriver driver)
{
	WebElement mail = driver.findElement(By.xpath("//*[@id=\"u_0_o\"]"));
	mail.click();
	return mail;
}
public static WebElement Pwd(WebDriver driver)
{
	WebElement Pwd = driver.findElement(By.xpath("//*[@id=\"u_0_v\"]"));
	Pwd.click();
	return Pwd;
}
public static WebElement Male(WebDriver driver)
{
	//WebElement Male = driver.findElement(By.xpath("//*[@id=\"u_0_7\"]"));
	WebElement Male = driver.findElement(By.id("u_0_7"));
	return Male;
}
public static WebElement Female(WebDriver driver)
{
	//WebElement Female = driver.findElement(By.xpath("//*[@id=\"u_0_6\"]"));
	WebElement Female = driver.findElement(By.id("u_0_9"));
	return Female;
}
public static WebElement Logon(WebDriver driver)
{
	WebElement Logon = driver.findElement(By.xpath("//*[@id=\"u_0_11\"]"));
	return Logon;
}
}

