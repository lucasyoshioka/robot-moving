package br.com.xbrain.robot;

public class DownCommand implements Command {

	public void execute(Integer numberOfSteps, Direction direction, Robot robot) {
		Integer position = robot.currentColumnPosition() + numberOfSteps;
		if (position >= robot.getSpace().getColumnSize()) {
			position = position - robot.getSpace().getColumnSize();
		}
		robot.setColumnPosition(position);
	}

}
