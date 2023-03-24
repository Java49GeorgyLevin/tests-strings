package telran.strings.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class StringTests {

	@Test
	void testCharAt() {
		assertEquals('T', "TelRan".charAt(0));
		assertTrue("TelRan".charAt(1) > 'b');
	}
	@Test
	void testCompareTo() {
		assertEquals(0, "TelRan".compareTo("TelRan"));
		assertTrue("TelRan".compareTo("Tel") > 0);		
	}
	@Test
	void testCompareToIgnoreCase() {
		assertEquals(0, "TelRan".compareToIgnoreCase("telran"));
		assertTrue("TelRan2".compareTo("TELRAN1") > 0);	
	}
	@Test
	void testConcat() {
		assertEquals("TelRan", "Tel".concat("Ran"));
		assertFalse("Ran".concat("Tel") == "TelRan");
	}
	@Test
	void testStartsWith() {
		assertEquals(true, "TelRan".startsWith("Tel"));
		assertTrue("TelRan".startsWith("Tel"));
	}
	
	@Test
	void testEndsWith() {
		assertEquals(true, "TelRan".endsWith("Ran"));
		assertTrue("TelRan".endsWith("Ran"));
	}
	@Test
	void testContains() {
		assertEquals(true, "TelRan".contains("lRa"));
		assertFalse("TelRan".contains("TR"));
	}
	@Test
	void testIndexOf() {
		assertEquals(3, "TelRan".indexOf("Ran"));
		assertTrue("TelRan".indexOf("el") == 1);
	}
	@Test
	void testLastIndexOf() {
		assertEquals(5, "TelRan".lastIndexOf('n'));
		assertTrue("TelRan".lastIndexOf('l') == 2);
	}
}