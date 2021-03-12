package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo2 {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minizeFlyOutWindow();
		createUser();
		modifyUser();
		deleteUser();
		logout();
		closeApplication();
		
		

	}
	public static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:82/login.do");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void minizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[1]")).click();
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[1]")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.name("firstName")).sendKeys("Demo1");
			Thread.sleep(2000);
			
			oBrowser.findElement(By.name("lastName")).sendKeys("User");
			Thread.sleep(2000);
			
			oBrowser.findElement(By.name("email")).sendKeys("demo@gmail.com");
			Thread.sleep(2000);
			
			oBrowser.findElement(By.name("username")).sendKeys("Demo1User");
			Thread.sleep(2000);
			
			oBrowser.findElement(By.name("password")).sendKeys("Welcome@123");
			Thread.sleep(2000);
			
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome@123");
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifyUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[2]")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.name("firstName")).clear();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.name("firstName")).sendKeys("Dimple");
			Thread.sleep(2000);
			
			oBrowser.findElement(By.name("lastName")).clear();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.name("lastName")).sendKeys("Murthy");
			Thread.sleep(2000);
			
			oBrowser.findElement(By.name("email")).clear();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.name("email")).sendKeys("Dimple123@gmail.com");
			Thread.sleep(2000);
			
			oBrowser.findElement(By.name("username")).clear();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.name("username")).sendKeys("DimpleMurty");
			Thread.sleep(2000);
			
			oBrowser.findElement(By.name("password")).sendKeys("Welcome12345");
			Thread.sleep(2000);
			
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome12345");
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(2000);
				
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_deleteBtn']")).click();
			Thread.sleep(2000);
			
			Alert oAlert=oBrowser.switchTo().alert();
			String textcontent=oAlert.getText();
			System.out.println(textcontent);
			oAlert.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


}
