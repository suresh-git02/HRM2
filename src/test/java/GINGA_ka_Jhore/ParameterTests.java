package GINGA_ka_Jhore;

import org.testng.annotations.Test;

public class ParameterTests {

	
	@Test(groups="smoke")
	public void test()
	{
		
	String  url=System.getProperty("url");
	String username=System.getProperty("username");
	String passward=System.getProperty("psw");
	String time =System.getProperty("time");
	System.out.println(url);
	System.out.println(username);
	System.out.println(passward);
	System.out.println(time);


}
}