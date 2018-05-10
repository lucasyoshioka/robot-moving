package br.com.xbrain.robot;

public class RightCommand implements Command {

	private Robot robot;

	private RightCommand(Robot target) {
		this.robot = target;
	}

	public static RightCommand to(Robot target) {
		return new RightCommand(target);
	}

	public void execute() {
		robot.walkRight();
	}

}
