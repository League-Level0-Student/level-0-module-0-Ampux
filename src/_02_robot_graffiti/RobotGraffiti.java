package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) {
		Robot babyyoda = new Robot();
		babyyoda.setSpeed(100);
		babyyoda.penDown();
		babyyoda.move(150);
		babyyoda.turn(90);
		babyyoda.move(50);
		babyyoda.turn(180);
		babyyoda.move(100);
		
		babyyoda.penUp();
		babyyoda.move(100);
	}
}
