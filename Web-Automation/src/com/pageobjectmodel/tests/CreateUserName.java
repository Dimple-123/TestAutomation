package com.pageobjectmodel.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateUserName {

	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;


	public static void main(String[] args) {

		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUserName();
		deleteuser();
	
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
			oPage=new ActiTimePage(oBrowser);
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
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void minimizeFlyOutWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createUserName()
	{
		
			try
			{
				oPage.getUser().click();
				Thread.sleep(2000);
				oPage.getAddUser().click();
				Thread.sleep(2000);
				oPage.getFirstName().sendKeys("user");
				Thread.sleep(2000);
				oPage.getLastName().sendKeys("1");
				Thread.sleep(2000);
				oPage.getEmail().sendKeys("user1@gmail");
				Thread.sleep(2000);
				oPage.getUsername().sendKeys("user1");
				Thread.sleep(2000);
				oPage.getPasswordforUser().sendKeys("123456");
				Thread.sleep(2000);
				oPage.getRetypePWDforUser().sendKeys("123456");
				Thread.sleep(2000);
				oPage.getUserCreation().click();
				Thread.sleep(2000);
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		public static void deleteuser()
		{
			try
			{
				oPage.getdeleteuser1().click();
				Thread.sleep(2000);
				oPage.getuser1delete().click();
				Thread.sleep(2000);
			    Alert oAlert=oBrowser.switchTo().alert();
				String content=oAlert.getText();
				System.out.println(content);
				oAlert.accept();
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	static void logout()
	{
		try
		{
			oPage.getLogout().click();
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
