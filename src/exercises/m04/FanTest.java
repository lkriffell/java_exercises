package exercises.mo4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FanTest {

	@Test
	void defaultFan() {
		Fan fan = new Fan();
		
		assertEquals(fan.showState(), false);
		assertEquals(fan.showSpeed(), 1);
		assertEquals(fan.showColor(), "blue");
		assertEquals(fan.showRadius(), 5);
		
		fan.changeState();
		
		assertEquals(fan.toString(), "The blue fan is on lvl 1 speed, with a radius of 5.0");
		assertEquals(fan.showState(), true);
		
		fan.changeSpeedUp(fan.showSpeed());
		assertEquals(fan.showSpeed(), 2);
		
		fan.changeState();
		fan.changeSpeedDown(fan.showSpeed());
		
		assertEquals(fan.toString(), "The fan is off");
	}

	@Test
	void customFan() {
		Fan fanTwo = new Fan();
		
		assertEquals(fanTwo.toString(), "The fan is off");
		fanTwo.changeState();
		fanTwo.changeColor("Pink");
		fanTwo.changeRadius(10);
		fanTwo.changeSpeedUp(fanTwo.showSpeed());
		fanTwo.changeSpeedUp(fanTwo.showSpeed());
		
		assertEquals(fanTwo.showState(), true);
		assertEquals(fanTwo.showSpeed(), 3);
		assertEquals(fanTwo.showColor(), "Pink");
		assertEquals(fanTwo.showRadius(), 10);
		assertEquals(fanTwo.showSpeed(), 3);
		assertEquals(fanTwo.toString(), "The Pink fan is on lvl 3 speed, with a radius of 10.0");
	}
}
