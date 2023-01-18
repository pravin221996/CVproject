package Start;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod3 {
	@Test
	public void login() {

		System.out.println("i am in login");
		Assert.assertEquals(1, 1);
	}
    //if some testcase are always failing at the run time then ,
	//if we want to ignore that test case we use enabled=false by using that it get ignored
	
	@Test(dependsOnMethods ="login" , enabled=false)
	public void dash() {
		System.out.println("i am in dash");
		Assert.assertEquals(1, 2);

	}

	@Test(dependsOnMethods ="dash" , alwaysRun=true )
	public void user() {

		System.out.println("i am in user");
		Assert.assertEquals(1, 1);
	}
}
