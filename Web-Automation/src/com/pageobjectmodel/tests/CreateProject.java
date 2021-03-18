package com.pageobjectmodel.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateProject {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;


	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createCustomer();
		createproject();
		deleteproject();
		deleteCustomer();
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
	static void createCustomer()
	{
		
			try
			{
				oPage.getCreateTask().click();
				Thread.sleep(2000);
				oPage.getAddNewTask().click();
				Thread.sleep(2000);
				oPage.getCreateCustomer().click();
				Thread.sleep(2000);
				oPage.getCreateNewCustomer().sendKeys("C1");
				Thread.sleep(2000);
				oPage.getSaveNewCustomer().click();
				Thread.sleep(2000);
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void createproject()
		{
			try 
			{
				oPage.getAddNewToCreateProject().click();
				Thread.sleep(2000);
				oPage.getCreateProject().click();
				Thread.sleep(2000);
				oPage.getProjectName().sendKeys("P1");
				Thread.sleep(2000);
				oPage.getSaveCreateProject().click();
				Thread.sleep(2000);
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		static void deleteproject()
		{
			try 
			{
				oPage.getProjectDeleteButton().click();
				Thread.sleep(2000);
				oPage.getProjectDeleteButtonAction().click();
				Thread.sleep(2000);
				oPage.getProjectDelete().click();
				Thread.sleep(2000);
				oPage.getProjectDeletePermanently().click();
				Thread.sleep(2000);
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		public static void deleteCustomer()
		{
			try
			{
				oPage.getNewCustomerButton().click();
				Thread.sleep(2000);
				oPage.getDeleteCustomer().click();
				Thread.sleep(2000);
				oPage.getCustomerDelete().click();
				Thread.sleep(2000);
				oPage.getCustomerDeleteConfirmation().click();
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
