package helloPK;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import hellopk.Hello;

public class HelloTest {

	private Hello monHello ;
	private Hello yourHello ;
	
	@BeforeEach
	public void setUp() throws Exception {
		monHello = new Hello();
		yourHello = new Hello("English");
	}
	
	@Test
	public void testgetLanguageByDefault() {
		assertEquals(
				Hello.DEFAULT_LANGUAGE, 
				monHello.getLanguage(), 
				"Test default language at creation" );
	}
	
	@Test
	public void testgetWelcome4ANewLanguage() {
		yourHello.setLanguage("French");
		assertEquals(
				Hello.UNKNOWN_LANGUAGE, 
				yourHello.getWelcome(),
				"Test welcome message for a new language");
	}
	
	@Test
	public void testSayHelloDefault() {
		assertEquals(
				"Hello" + " in : " + Hello.DEFAULT_LANGUAGE, 
				monHello.sayHello(),
				"Test default sayHello");
	}
	

}
