package Start;

import org.testng.Assert;
import org.testng.annotations.Test;

//if depends on method fail then it will not execute that method which method is depend on 
//pass=0  ,fail=1, skip=2

public class DependsOnMethodPractice {

	@Test
	public void login() {

		System.out.println("i am in login");
		Assert.assertEquals(1, 2);
	}

	@Test(dependsOnMethods ="login")
	public void dash() {

		System.out.println("i am in dash");
		Assert.assertEquals(1, 1);

	}

	@Test(dependsOnMethods ="dash" )
	public void user() {

		System.out.println("i am in user");
		Assert.assertEquals(1, 1);

	}

	
}
