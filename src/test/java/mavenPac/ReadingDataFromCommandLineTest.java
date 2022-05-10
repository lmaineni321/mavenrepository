package mavenPac;

import org.testng.annotations.Test;

public class ReadingDataFromCommandLineTest {

	@Test
	public void readingDataFromCommanndLine()
	{
		String URL = System.getProperty("url");
		String UN=System.getProperty("username");
		String PWD=System.getProperty("password");
		System.out.println(URL);
		System.out.println(UN);
		System.out.println(PWD);
		
	}
}
