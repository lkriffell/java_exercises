package exercises.m05;
import java.math.BigInteger;

import exercises.m04.GeometricObject;

public class Circle extends GeometricObject implements Comparable<BigInteger> {
	BigInteger radius;
	
	public Circle(BigInteger radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int compareTo(BigInteger o) {
		if (radius.equals(o)) {
			return 1;
		} else {
			return 0;
		}
	}
}
