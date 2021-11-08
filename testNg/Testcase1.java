package testNg;


import org.testng.annotations.Test;
public class Testcase1 extends Baseclass {
	
@Test(priority=0,description="This test case is to test home functionaltity")
public void HomeLoanTest() {
	System.out.println("Inside Home Loan");
}
	
@Test(priority=2,description="This test case is to test home functionaltity")
public void HomeLoanTest1() {
	System.out.println("Inside Home Loan");
}



@Test(priority =3,description ="Test case is to car functionaltity " )
public void CarLoanTest()
{
	System.out.println("inside Car Loan");
}
}
