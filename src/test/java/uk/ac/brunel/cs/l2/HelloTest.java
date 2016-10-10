package uk.ac.brunel.cs.l2;

import static org.junit.Assert.*;

import org.junit.Test;

import uk.ac.brunel.cs.l2.Hello;

public class HelloTest {

	@Test
	public void defaultBehaviour() {
		Hello hello = new Hello();
		assertEquals("Hello Brunel", hello.generateHelloString("Brunel"));
	}
	
	@Test
	public void testFrench() {
		Hello hello = new Hello("Bonjour");
		assertEquals("Bonjour Brunel", hello.generateHelloString("Brunel"));
	}

}
