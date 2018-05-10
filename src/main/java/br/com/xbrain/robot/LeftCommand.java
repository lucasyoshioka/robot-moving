package br.com.xbrain.robot;

public class LeftCommand implements Command {

	private Robot robot;

	private LeftCommand(Robot target) {
		this.robot = target;
	}

	public static LeftCommand to(Robot target) {
		return new LeftCommand(target);
	}

	public void execute() {
		robot.walkLeft();
	}

}
