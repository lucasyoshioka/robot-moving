package br.com.xbrain.robot;

public class RightCommand implements Command {

	public void execute(Integer numberOfSteps, Direction direction, Robot robot) {
		Integer position = robot.currentLinePosition() + numberOfSteps;
		if (position >= robot.getSpace().getLineSize()) {
			position = position - robot.getSpace().getLineSize();
		}
		robot.setLinePosition(position);
	}

}
