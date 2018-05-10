package br.com.xbrain.robot;

public class DownCommand implements Command {

	private Robot robot;

	private DownCommand(Robot target) {
		this.robot = target;
	}

	public static DownCommand to(Robot target) {
		return new DownCommand(target);
	}

	public void execute() {
		robot.walkDown();
	}

}
