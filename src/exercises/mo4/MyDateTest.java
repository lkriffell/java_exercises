package exercises.mo4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyDateTest {

	@Test
	void defaultDate() {
		MyDate date = new MyDate(0);
		
		assertEquals(1, date.getDay());
		assertEquals("January", date.getMonth());
		assertEquals(1970, date.getYear());
	}
	
	@Test
	void testCustomDate() {
		MyDate date = new MyDate(34355555133101L);
		
		assertEquals(7, date.getDay());
		assertEquals("September", date.getMonth());
		assertEquals(3058, date.getYear());
	}
	
	@Test
	void testCustomDateTwo() {
		MyDate date = new MyDate(561555550000L);
		
		assertEquals(18, date.getDay());
		assertEquals("October", date.getMonth());
		assertEquals(1987, date.getYear());
	}
}
