package com.sgtesting.tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo9 {
	public static WebDriver c1=null;
	

	public static void main(String[] args) {
		launchbrowser();
		navigate();
		login();
		minimizewindow();
		createuser1();
		loginuser1();
		createandmodifyuser2();
		loginuser2andcreateuser3();
     	adminloginandmodifyuser1andloginasuser2();
		deleteuser3();
	    loginuser1deluser2();
		adminlogindeluser1();
	
		}
	static void launchbrowser()
	{
		
		try 
		{  
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\driver\\chromedriver.exe");
			c1=new ChromeDriver();
		}
		catch(Exception e)
		{
			e.printStackTrace();	
		}
	}
	static void navigate()
	{
		try 
		{
			c1.get("http://localhost:82/login.do");
			c1.manage().window().maximize();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	static void login()
	{
		try
		{
			c1.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(2000);
			c1.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			c1.findElement(By.id("loginButtonContainer")).click();
			Thread.sleep(2000);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	static void minimizewindow()
	{
		try 
		{
			c1.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();
			Thread.sleep(2000);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	static void createuser1()
	{
		try
		{
			c1.findElement(By.xpath("//a[@href='/administration/userlist.do']")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			c1.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("ravi");
			Thread.sleep(2000);
			c1.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("prasad");
			Thread.sleep(2000);
			c1.findElement(By.id("userDataLightBox_emailField")).sendKeys("123@gmail.com");
			Thread.sleep(2000);
			c1.findElement(By.id("userDataLightBox_usernameField")).sendKeys("raveendra");
			Thread.sleep(2000);
			c1.findElement(By.id("userDataLightBox_passwordField")).sendKeys("rauser1");
			Thread.sleep(2000);
			c1.findElement(By.xpath("//input[@name='passwordCopy']")).sendKeys("rauser1");
			Thread.sleep(2000);
			c1.findElement(By.xpath("//div[@id='userDataLightBox_commitBtn']")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//a[@href='/logout.do']")).click();
			Thread.sleep(2000);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	static void loginuser1()
	{
		try 
		{
					c1.findElement(By.id("username")).sendKeys("demo");
					Thread.sleep(2000);
					c1.findElement(By.name("pwd")).sendKeys("deuser1");
					Thread.sleep(2000);
					c1.findElement(By.id("loginButtonContainer")).click();
					Thread.sleep(2000);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	static void createandmodifyuser2()
	{
		try 
		{
			c1.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//a[@href='/administration/userlist.do']")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			c1.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("rocky");
			Thread.sleep(2000);
			c1.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("kgf");
			Thread.sleep(2000);
			c1.findElement(By.id("userDataLightBox_emailField")).sendKeys("12@gmail");
			Thread.sleep(2000);
			c1.findElement(By.id("userDataLightBox_usernameField")).sendKeys("sony");
			Thread.sleep(2000);
			c1.findElement(By.id("userDataLightBox_passwordField")).sendKeys("sony1");
			Thread.sleep(2000);
			c1.findElement(By.xpath("//input[@name='passwordCopy']")).sendKeys("sony2");
			Thread.sleep(2000);
			c1.findElement(By.xpath("//div[@id='userDataLightBox_commitBtn']")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//span[@class='userNameSpan'][text()='kgf, rocky']")).click();
			Thread.sleep(2000);
			c1.findElement(By.id("userDataLightBox_passwordField")).sendKeys("change");
			Thread.sleep(2000);
			c1.findElement(By.xpath("//input[@placeholder='Retype Password']")).sendKeys("change");
			Thread.sleep(2000);
			c1.findElement(By.xpath("//span[contains(text(),'Changes')]")).click();
			Thread.sleep(3000);
			c1.findElement(By.xpath("//a[@href='/logout.do']")).click();
			Thread.sleep(2000);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	static void loginuser2andcreateuser3()
	{
		try 
		{
			c1.findElement(By.id("username")).sendKeys("sony");
			Thread.sleep(2000);
			c1.findElement(By.name("pwd")).sendKeys("change");
			Thread.sleep(2000);
			c1.findElement(By.id("loginButtonContainer")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//span[contains(text(),'Start ')]")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//a[@href='/administration/userlist.do']")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			c1.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("user3");
			Thread.sleep(2000);
			c1.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("welcome12345");
			Thread.sleep(2000);
			c1.findElement(By.id("userDataLightBox_emailField")).sendKeys("user3@gmail");
			Thread.sleep(2000);
			c1.findElement(By.id("userDataLightBox_usernameField")).sendKeys("meghana");
			Thread.sleep(2000);
			c1.findElement(By.id("userDataLightBox_passwordField")).sendKeys("meghanar");
			Thread.sleep(2000);
			c1.findElement(By.xpath("//input[@name='passwordCopy']")).sendKeys("meghanar");
			Thread.sleep(2000);
			c1.findElement(By.xpath("//div[@id='userDataLightBox_commitBtn']")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//a[@href='/logout.do']")).click();
			Thread.sleep(2000);
		}
		catch (Exception e) 
		{
		  e.printStackTrace();
		}
	}
	static void adminloginandmodifyuser1andloginasuser2()
	{
		try
		{
			c1.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(2000);
			c1.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			c1.findElement(By.id("loginButtonContainer")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//a[@href='/administration/userlist.do']")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//span[text()='prasad, ravi']")).click();
			Thread.sleep(2000);
			c1.findElement(By.id("userDataLightBox_passwordField")).sendKeys("user1");
			Thread.sleep(2000);
			c1.findElement(By.xpath("//input[@placeholder='Retype Password']")).sendKeys("user1");
			Thread.sleep(2000);
			c1.findElement(By.xpath("//span[contains(text(),' Changes')]")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//a[@href='/logout.do']")).click();
			Thread.sleep(2000);
			c1.findElement(By.id("username")).sendKeys("sony");
			Thread.sleep(2000);
			c1.findElement(By.name("pwd")).sendKeys("change");
			Thread.sleep(2000);
			c1.findElement(By.id("loginButtonContainer")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//a[@href='/administration/userlist.do']")).click();
			Thread.sleep(2000);
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	static void deleteuser3()
	{
		try 
		{
			c1.findElement(By.xpath("//span[contains(text(),'passcode3, user3')]")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath(("//button[@id='userDataLightBox_deleteBtn']"))).click();
			Thread.sleep(2000);
			c1.switchTo().alert().accept();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//a[@href='/logout.do']")).click();
			Thread.sleep(2000);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	static void loginuser1deluser2()
	{
		try 
		{
			c1.findElement(By.id("username")).sendKeys("keerthi");
			Thread.sleep(2000);
			c1.findElement(By.name("pwd")).sendKeys("user1");
			Thread.sleep(2000);
			c1.findElement(By.id("loginButtonContainer")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//a[@href='/administration/userlist.do']")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//span[@class='userNameSpan'][text()='kgf, rocky']")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//button[@id='userDataLightBox_deleteBtn']")).click();
			Thread.sleep(2000);
			c1.switchTo().alert().accept();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//a[@href='/logout.do']")).click();
			Thread.sleep(2000);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	static void adminlogindeluser1()
	{
		try 
		{
			c1.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(2000);
			c1.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			c1.findElement(By.id("loginButtonContainer")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//a[@href='/administration/userlist.do']")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//span[text()='prasad, ravi']")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//button[@id='userDataLightBox_deleteBtn']")).click();
			Thread.sleep(2000);
			c1.switchTo().alert().accept();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//a[@href='/logout.do']")).click();
			Thread.sleep(2000);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	}
		