package demoGit;

import org.testng.annotations.Test;

public class NewTest 
{
	@Test
	public void samle()
	{
		String BROWSER = System.getProperty("browser");
		System.out.println(BROWSER);
	}

}
