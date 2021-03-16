package com.pageobjectmodel.tests;


	

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class ActiTimePage {
		
		WebDriver oBrowser=null;
		public ActiTimePage(WebDriver oBrowser)
		{
			this.oBrowser=oBrowser;
			PageFactory.initElements(oBrowser, this);
		}
		//UserName text field WebElement
		private WebElement username;
		public WebElement getUserName()
		{
			return username;
		}
		
		//Password text field WebElement
		private WebElement pwd;
		public WebElement getPassword()
		{
			return pwd;
		}
		
		//Login button WebElement
		@FindBy(xpath="//*[@id='loginButton']/div")
		private WebElement oLogin;
		public WebElement getLogin()
		{
			return oLogin;
		}
		
		//FlyoutWindow WebElement
		private WebElement gettingStartedShortcutsPanelId;
		public WebElement getFlyOutWindow()
		{
			return gettingStartedShortcutsPanelId;
		}
		
		//Logout Link WebElement
		@FindBy(linkText="Logout")
		private WebElement oLogout;
		public WebElement getLogout()
		{
			return oLogout;
		}

	}



