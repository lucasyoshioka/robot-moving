package br.com.xbrain.robot;

import java.util.HashMap;
import java.util.Map;

public class CommandFactory {

	private Map<Direction, Command> commandsMap = new HashMap<Direction, Command>();

	private CommandFactory() {
		commandsMap.put(Direction.RIGHT, new RightCommand());
		commandsMap.put(Direction.LEFT, new LeftCommand());
		commandsMap.put(Direction.UP, new UpCommand());
		commandsMap.put(Direction.DOWN, new DownCommand());
	}

	public static CommandFactory create() {
		return new CommandFactory();
	}

	public Command parse(Direction direction) {
		return commandsMap.get(direction);
	}

}
