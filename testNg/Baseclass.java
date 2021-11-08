package testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Baseclass {


@BeforeTest(alwaysRun=true)
public void BeforeTestMethod()
{
	System.out.println("Inside BeforeTest");
}
@BeforeClass
public void Beforeclass()
{
System.out.println("Inside class");
}

@BeforeMethod(alwaysRun=true)
public void setup()
{
	System.out.println("Inside Before");

}
@AfterMethod
public void teardown()
{
System.out.println("Inside After Method"); 
}
@AfterClass
public void Afterclass()
{
	System.out.println("Inside class");
}
@AfterTest(alwaysRun =true)
public void teardowntest()
{
System.out.println("Inside after test");
}
}
