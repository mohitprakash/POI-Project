package testcases;

import java.util.ResourceBundle;

import org.testng.annotations.Test;

import base.Createdriver;
import logs.Logs;
import snaps.Takesnaps;

public class TC_001 extends Createdriver
{
	@Test
	public void tcase1()throws Exception
	{
		ResourceBundle rb = ResourceBundle.getBundle("OR");
		Logs.infolog("TC_001 >> is executing");
		f.findElementById(rb.getString("login_username"));
		f.findElementById(rb.getString("login_password"));
		Takesnaps.takescreeshot(f, "TC_002");	
	}

}
