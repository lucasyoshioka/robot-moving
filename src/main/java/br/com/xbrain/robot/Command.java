package br.com.xbrain.robot;

public interface Command {

	void execute(Integer numberOfSteps, Direction direction, Robot robot);
	
}
