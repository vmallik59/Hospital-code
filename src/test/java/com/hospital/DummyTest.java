package com.hospital;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DummyTest {

	@Test
	public void dummy() {
		int a= 1;
		int b = 1;
		assertTrue(a==b);
	}

}
