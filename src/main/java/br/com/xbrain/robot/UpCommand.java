package br.com.xbrain.robot;

public class UpCommand implements Command {

	public void execute(Integer numberOfSteps, Direction direction, Robot robot) {
		Integer position = robot.currentColumnPosition() - numberOfSteps;
		while (position <= 0) {
			position = position + robot.getSpace().getColumnSize();
		}
		robot.setColumnPosition(position);
	}

}
