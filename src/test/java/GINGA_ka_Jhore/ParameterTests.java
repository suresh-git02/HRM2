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

//<properties>
//<maven.compiler.source>11.0.17</maven.compiler.source>
//<maven.compiler.target>11.0.17</maven.compiler.target>
//</properties>

//<build>
//<plugins>
//	<plugin>
//		<groupId>org.apache.maven.plugins</groupId>
//		<artifactId>maven-compiler-plugin</artifactId>
//		<version>3.11.0</version>
//		<configuration>
//			<verbose>true</verbose>
//			<fork>true</fork>
//			<executable>C:\Program Files\javNew\jdk-11.0.17\bin\javac
//			</executable>
//			<compilerVersion>1.3</compilerVersion>
//		</configuration>
//	</plugin>
//</plugins>
//</build>





