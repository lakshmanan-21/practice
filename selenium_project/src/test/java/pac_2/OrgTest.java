package pac_2;

import org.testng.annotations.Test;

public class OrgTest 
{
	@Test
	public void createOrgtest()
	{
		System.out.println("execute createOrgtest");
		
		String BROWSER=System.getProperty("browser");
		String URL=System.getProperty("url");
		String USERNAME=System.getProperty("username");
		String PASSWORD=System.getProperty("password");
		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		
		System.out.println("execute create contacttest");
	}
	@Test
	public void modifyOrgtest()
	{
		System.out.println("execute modifyOrgtest");
	}

}
