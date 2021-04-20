package exercises.m05;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;

class CircleTest {

	@Test
	void testEquals() {
		Circle circle = new Circle(new BigInteger("5"));
		Circle circleTwo = new Circle(new BigInteger("5"));
		assertEquals(1, circle.compareTo(circleTwo.radius));
	}
	
	@Test
	void testDoesNotEqual() {
		Circle circle = new Circle(new BigInteger("5"));
		Circle circleTwo = new Circle(new BigInteger("10"));
		assertEquals(0, circle.compareTo(circleTwo.radius));
	}

}
