package br.com.xbrain.robot;

import java.util.HashMap;
import java.util.Map;

public class CommandFactory {

	private Map<Direction, Command> commandsMap = new HashMap<Direction, Command>();

	private CommandFactory(Robot robot) {
		commandsMap.put(Direction.RIGHT, RightCommand.to(robot));
		commandsMap.put(Direction.LEFT, LeftCommand.to(robot));
		commandsMap.put(Direction.UP, UpCommand.to(robot));
		commandsMap.put(Direction.DOWN, DownCommand.to(robot));
	}

	public static CommandFactory create(Robot robot) {
		return new CommandFactory(robot);
	}

	public Command parse(Direction direction) {
		return commandsMap.get(direction);
	}

}
