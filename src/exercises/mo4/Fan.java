package exercises.mo4;

public class Fan {
	private final static int SLOW = 1;
	private final static int MEDIUM = 2;
	private final static int FAST = 3;
	private static int speed = SLOW;
	private static boolean on = false;
	private static double radius = 5;
	private static String color = "blue";
	
	public void changeState() {
		if (on) {
			on = false;
		} else {
			on = true;
		}
	}
	
	public boolean showState() {
		return on;
	}
	
	public int showSpeed() {
		return speed;
	}
	
	public String showColor() {
		return color;
	}
	
	public double showRadius() {
		return radius;
	}
	
	public void changeSpeedUp(int currentSpeed) {
		if (currentSpeed == SLOW) {
			speed = MEDIUM;
		} else if (currentSpeed == MEDIUM ) {
			speed = FAST;
		}
	}
	
	public void changeSpeedDown(int currentSpeed) {
		if (currentSpeed == MEDIUM) {
			speed = SLOW;
		} else if (currentSpeed == FAST ) {
			speed = MEDIUM;
		}
	}
	
	public void changeColor(String newColor) {
		color = newColor;
	}
	
	public void changeRadius(int newRadius) {
		radius = newRadius;
	}
	
	public String toString() {
		if (on) {
			return "The " + color + " fan is on lvl " + speed + " speed, with a radius of " + radius;
		} else {
			return "The fan is off";
		}
		
	}
}
