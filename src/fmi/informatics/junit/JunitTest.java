package fmi.informatics.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitTest {

	@Test
	public void tryParse() {
		Junit test = new Junit();
		int result = test.tryParse("123");
		assertEquals(123,result);
	}
	
}
