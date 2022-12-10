package com.qa.testscripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.Homepage;


public class Testcase002  extends Testbase{
	Homepage a1;
	@Parameters({"Browser","Url"})
	@Test
	public void Search(String Browser,String Url) throws InterruptedException
	{
	a1=new Homepage(Driver);
	
	
     a1.login().click();
     Thread.sleep(2000);
 	
     a1.signin.click();
     Thread.sleep(2000);
     
     
     
	a1.gmail().sendKeys("shalini22@gmail.com");
	Thread.sleep(2000);
	a1.password().sendKeys("Shalini@05");
	Thread.sleep(2000);
	a1.signupbutton().click();
	Thread.sleep(2000);
	a1.firstname().sendKeys("Shalini");
	a1. lastname().sendKeys("R");
	a1.Continue().click();
			
	

}
}
