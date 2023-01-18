package Start;

import org.testng.Assert;
import org.testng.annotations.Test;


//if a depends on method is fail but still want to execute that perticular testcase(user)
//alwaysRun=true is use to run the testcase anyhow whether dependson method fail or pass

public class DependsOnMethod2 {
	@Test
	public void login() {

		System.out.println("i am in login");
		Assert.assertEquals(1, 1);
	}

	@Test(dependsOnMethods ="login")
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
