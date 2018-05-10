package br.com.xbrain.robot;

public class UpCommand implements Command {

	private Robot robot;

	private UpCommand(Robot target) {
		this.robot = target;
	}

	public static UpCommand to(Robot target) {
		return new UpCommand(target);
	}

	public void execute() {
		robot.walkUp();
	}

}
