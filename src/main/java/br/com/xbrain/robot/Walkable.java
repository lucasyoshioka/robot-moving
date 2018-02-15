package br.com.xbrain.robot;

public interface Walkable {
	
	Walkable moveTo(Direction direction);
	
	Walkable steps(Integer numberOfSteps);
	
	void walk();

}
