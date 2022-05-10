package mavenPac;

import org.testng.annotations.Test;

public class CreateGroupsTest {
	
	@Test(groups="smoke")
	public void createGropTest()
	{
		System.out.println("execute this");
		String URL = System.getProperty("url");
		String UN=System.getProperty("username");
		String PWD=System.getProperty("password");
		System.out.println(URL);
		System.out.println(UN);
		System.out.println(PWD);
		
	}
	
	@Test(groups="regression")
	public void regressionTest()
	{
		System.out.println("regression test");
	}

}
