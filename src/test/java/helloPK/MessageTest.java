package helloPK;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import hellopk.Message;

class MessageTest {
	protected Message mToTest;
	protected String contents;
	
	@BeforeEach
	void setUp() throws Exception {
		contents = "my message";
		mToTest = new Message(contents);
	}

	@Test
	@DisplayName("Test of Message initialisation")
	void testInit() {
		assertEquals(contents, mToTest.getContents());
	}
	
	@Test
	@DisplayName("Test of set content in Message")
	void testSetContent() {
		mToTest.setContents("a new message");
		assertEquals("a new message", mToTest.getContents());
	}

}
