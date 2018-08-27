package hackerrank.hackerrank.JAVA.ObjectOrientedProgramming.JavaMethodOverriding2;

/*
 *  https://www.hackerrank.com/challenges/java-method-overriding-2-super-keyword/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
 *  Java Method Overriding 2 (Super Keyword)
 */
class Solution {
	public static void main(String[] args) {
		MotorCycle M = new MotorCycle();
	}

}

class MotorCycle extends BiCycle {
	String define_me() {
		return "a cycle with an engine.";
	}

	MotorCycle() {
		System.out.println("Hello I am a motorcycle, I am " + define_me());
		String temp = define_me(); // Fix this line
		temp = super.define_me();
		System.out.println("My ancestor is a cycle who is " + temp);
	}

}

class BiCycle {
	String define_me() {
		return "a vehicle with pedals.";
	}
}