package uk.ac.brunel.cs.l2;

public class Hello {

	private String salutation;

	public Hello() {
		this("Hello");
	}
	
	public Hello(String salutation) {
		this.salutation = salutation; 
	}
	
	public String generateHelloString(String name) {
		// A deliberate bug has been introduced on the next line.
		// Look at the test output and then debug it!
		return salutation /*+ " " */ + name;
	}
}
