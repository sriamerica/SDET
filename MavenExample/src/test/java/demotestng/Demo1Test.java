package demotestng;

import org.testng.annotations.Test;

public class Demo1Test 
{
	@Test
	public void testcase1()
	{
		String url=System.getProperty("URL");
		String browser=System.getProperty("BROWSER");
		String username=System.getProperty("USERNAME");
		String pwd=System.getProperty("PASSWORD");

		System.out.println("TYSS---> Test1");
		System.out.println("URL--->"+ url);
		System.out.println("BROWSER--->"+ browser);
		System.out.println("USERNAME--->"+ username);
		System.out.println("PASSWORD--->"+ pwd);
		System.out.println("TYSS*********");
	}
	@Test
	public void testcase2()
	{
		System.out.println("Hi India");
		System.out.println("Hi America");

	}
}
