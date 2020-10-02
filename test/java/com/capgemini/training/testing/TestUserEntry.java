package com.capgemini.training.testing;
import com.capgemini.training.model.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class TestUserEntry {
		
	@Test
	public void HappyTest() {
		UserRegistration user = new UserRegistration();
		boolean firstName = user.validateFirstName("Mohana");
		assertEquals(true, firstName);
		boolean lastName = user.validateLastName("Kavya");
		assertEquals(true, lastName);
		boolean email = user.validateEmail("kavya.mk@cg.co.in");
		assertEquals(true, email);
		boolean mobile = user.validateMobile("91 9090903456");
		assertEquals(true, mobile);
		boolean password = user.validatePassword("jhsvYTu@1");
		assertEquals(true, password);
	}

	@Test
	public void SadTest() {
		UserRegistration user = new UserRegistration();
		boolean firstName = user.validateFirstName("mk");
		assertEquals(false, firstName);
		boolean lastName = user.validateLastName("sri");
		assertEquals(false, lastName);
		boolean email = user.validateEmail("ab.bl.co");
		assertEquals(false, email);
		boolean mobile = user.validateMobile("912314567890");
		assertEquals(false, mobile);
		boolean password = user.validatePassword("ju@1");
		assertEquals(false, password);
	}
		
}
