package GINGA_ka_Jhore;

import org.testng.annotations.Test;

public class Login_Test {

	
	
	@Test(groups="regression")
	public void m1()
	{
		System.out.println("----Username------");
	}


@Test(groups="regression")
public void m2()
{
	System.out.println("----password------");
}


@Test(groups="smoke")
public void m3()
{
	System.out.println("----login------");
}
@Test(groups="regression")
public void m5()
{
	System.out.println("----logout------");
}

}

//<build>
//<plugins>
//  
//    <plugin>
//      <groupId>org.apache.maven.plugins</groupId>
//      <artifactId>maven-surefire-plugin</artifactId>
//      <version>3.0.0</version>
//      <configuration>
//        <suiteXmlFiles>
//          <suiteXmlFile>testng.xml</suiteXmlFile>
//        </suiteXmlFiles>
//      </configuration>
//    </plugin>
//  
//</plugins>
//</build>
