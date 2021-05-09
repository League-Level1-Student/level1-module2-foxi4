package _06_tea_party;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TeaPartyETest {
	/**
	 * Jane Austen is a woman, so say “Hello Ms. Austen”. 
	 * George Orwell is a man, so say “Hello Mr. Orwell”. 
	 * Isaac Newton was knighted, so say "Hello Sir Isaac Newton".
	 **/

	@Test
	public void testIsWomanNotKnighted() {
		TeaPartyE teaParty = new TeaPartyE();
		assertEquals("Hello Ms. Austen", teaParty.welcome("Austen", true, false));
	}

	@Test
	public void testIsManNotKnighted() {
		TeaPartyE teaParty = new TeaPartyE();
		assertEquals("Hello Mr. Orwell", teaParty.welcome("Orwell", false, false));
	}

	@Test
	public void testIsManKnighted() {
		TeaPartyE teaParty = new TeaPartyE();
		assertEquals("Hello Sir Isaac Newton", teaParty.welcome("Isaac Newton", false, true));
	}
	
	@Test
	public void testIsWomanKnighted() {
		TeaPartyE teaParty = new TeaPartyE();
		assertEquals("Hello Lady Laura", teaParty.welcome("Laura", true, true));
	}

}

