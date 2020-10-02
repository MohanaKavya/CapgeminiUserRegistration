package com.capgemini.training.testing;

import java.util.Collection;
import java.util.Arrays;
import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;
import com.capgemini.training.model.*;

@RunWith(Parameterized.class)
public class MultiEmailEntryTest {

		private boolean Output;
		private String Input;
		private UserRegistration user;

		@Before
		public void Initialize() {
			user = new UserRegistration();
		}

		public MultiEmailEntryTest(String Input, boolean Output) {
			this.Input = Input;
			this.Output = Output;
		}

		@Parameterized.Parameters
		public static Collection<Object[]> emails() {
			return Arrays.asList(
					new Object[][] { { "abc@yahoo.com", true }, { "abc@.com.my", false }, { "abc.100@gmail.com", true }, { ".abc111@abc.com", false} });
		}

		@Test
		public void testMultiEmailEntryTest() {
			System.out.println("Input : " + Input);
			assertEquals(Output, user.validateEmail(Input));
		}
	}

