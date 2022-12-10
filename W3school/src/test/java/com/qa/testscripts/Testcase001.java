package com.qa.testscripts;

import org.openqa.selenium.Keys;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.Homepage;


public class Testcase001 extends Testbase {
	Homepage a;
	@Parameters({"Browser","Url"})
	@Test
	public void Search(String Browser,String Url) throws InterruptedException
	{
	a=new Homepage(Driver);
	a.cs().sendKeys("java",Keys.ENTER);
    Thread.sleep(2000);
    String pc=a.page().getText();
    System.out.println(pc);
    
	
	

}
}

