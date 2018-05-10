package br.com.xbrain.robot;

public class LeftCommand implements Command {

	public void execute(Integer numberOfSteps, Direction direction, Robot robot) {
		Integer position = robot.currentLinePosition() - numberOfSteps;
		while (position <= 0) {
			position = position + robot.getSpace().getLineSize();
		}
		robot.setLinePosition(position);
	}

}
