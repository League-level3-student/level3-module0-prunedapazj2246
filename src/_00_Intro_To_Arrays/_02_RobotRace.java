package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		boolean keepMoving = true;
		int SpaceX = 0;
		Robot[] robots = new Robot[20];
		Random r = new Random();
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot();
			robots[i].setWindowSize(1000, 400);
			robots[i].setSpeed(100);
			robots[i].setX(50 + SpaceX);
			robots[i].setY(350);
			SpaceX += 175;
		}

		while (keepMoving) {
			for (int j = 0; j < robots.length; j++) {

				robots[j].move(r.nextInt(50));
				if (robots[j].getY() < 50) {
					keepMoving = false;
					JOptionPane.showMessageDialog(null, "robot "+ j+" won");
					break;
				}

			}
		}

	}
	// 2. create an array of 5 robots.

	// 3. use a for loop to initialize the robots.

	// 4. make each robot start at the bottom of the screen, side by side, facing up

	// 5. use another for loop to iterate through the array and make each robot move
	// a random amount less than 50.

	// 6. use a while loop to repeat step 5 until a robot has reached the top of the
	// screen.

	// 7. declare that robot the winner and throw it a party!

	// 8. try different races with different amounts of robots.

	// 9. make the robots race around a circular track.

}
