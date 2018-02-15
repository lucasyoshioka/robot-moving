package br.com.xbrain.robot;

import org.junit.Test;

import junit.framework.Assert;

public class RobotTest {
	
	@Test
	public void mustWalkStepsRight() {
		Robot robot = oneRobot();
		robot.moveTo(Direction.RIGHT).steps(1).walk();
		Assert.assertEquals(Integer.valueOf(1), robot.currentLinePosition());
		Assert.assertEquals(Integer.valueOf(0), robot.currentColumnPosition());
	}
	
	@Test
	public void mustWalkStepsRightAndStartAgainWhenReachTheEnd() {
		Robot robot = oneRobot();
		robot.moveTo(Direction.RIGHT).steps(12).walk();
		Assert.assertEquals(Integer.valueOf(2), robot.currentLinePosition());
		Assert.assertEquals(Integer.valueOf(0), robot.currentColumnPosition());
	}
	
	@Test
	public void mustWalkStepsUp() {
		Robot robot = oneRobot();
		robot.moveTo(Direction.UP).steps(2).walk();
		Assert.assertEquals(Integer.valueOf(0), robot.currentLinePosition());
		Assert.assertEquals(Integer.valueOf(8), robot.currentColumnPosition());
	}
	
	@Test
	public void mustWalkStepsUpAndStartAgainWhenReachTheEnd() {
		Robot robot = oneRobot();
		robot.moveTo(Direction.UP).steps(13).walk();
		Assert.assertEquals(Integer.valueOf(0), robot.currentLinePosition());
		Assert.assertEquals(Integer.valueOf(7), robot.currentColumnPosition());
	}
	
	@Test
	public void mustWalkStepsLeft() {
		Robot robot = oneRobot();
		robot.moveTo(Direction.LEFT).steps(3).walk();
		Assert.assertEquals(Integer.valueOf(7), robot.currentLinePosition());
		Assert.assertEquals(Integer.valueOf(0), robot.currentColumnPosition());
	}
	
	@Test
	public void mustWalkStepsLeftAndStartAgainWhenReachTheEnd() {
		Robot robot = oneRobot();
		robot.moveTo(Direction.LEFT).steps(14).walk();
		Assert.assertEquals(Integer.valueOf(6), robot.currentLinePosition());
		Assert.assertEquals(Integer.valueOf(0), robot.currentColumnPosition());
	}
	
	@Test
	public void mustWalkDown() {
		Robot robot = oneRobot();
		robot.moveTo(Direction.DOWN).steps(4).walk();
		Assert.assertEquals(Integer.valueOf(0), robot.currentLinePosition());
		Assert.assertEquals(Integer.valueOf(4), robot.currentColumnPosition());
	}
	
	@Test
	public void mustWalkStepsDownAndStartAgainWhenReachTheEnd() {
		Robot robot = oneRobot();
		robot.moveTo(Direction.DOWN).steps(15).walk();
		Assert.assertEquals(Integer.valueOf(0), robot.currentLinePosition());
		Assert.assertEquals(Integer.valueOf(5), robot.currentColumnPosition());
	}
	
	@Test(expected = NullPointerException.class)
	public void mustValidateWhenCreatingARobotWithoutName() {
		Robot.create(null, null);
	}
	
	@Test(expected = NullPointerException.class)
	public void mustValidateWhenCreatingARobotWithoutSpace() {
		Robot.create("Test", null);
	}
	
	private Robot oneRobot() {
		Space space = GameBoard.of(10, 10);
		return Robot.create("Mamute", space);
	}

}
