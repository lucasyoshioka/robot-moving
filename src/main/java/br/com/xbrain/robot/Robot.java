package br.com.xbrain.robot;

import java.util.Objects;

public class Robot implements Walkable {

	private String name;

	private Space space;

	private Direction direction;

	private Integer numberOfSteps;

	private Integer columnPosition;

	private Integer linePosition;

	private Robot(String name, Space space) {
		this.name = name;
		this.space = space;
		this.columnPosition = 0;
		this.linePosition = 0;
		printCurrentPosition();
	}

	public static Robot create(String name, Space space) {
		Objects.requireNonNull(name, "Your Robot needs a name!");
		Objects.requireNonNull(space, "You must put your Robot on a Space!");
		return new Robot(name, space);
	}

	public Robot moveTo(Direction direction) {
		this.direction = direction;
		return this;
	}

	public Robot steps(Integer numberOfSteps) {
		this.numberOfSteps = numberOfSteps;
		return this;
	}

	public void walk() {
		printAction(numberOfSteps, direction);
		CommandFactory.create().parse(direction)
				.execute(numberOfSteps, direction, this);
		printCurrentPosition();
	}

	private void printCurrentPosition() {
		System.out.println("The current position of " + this.name
				+ " is:\nColumn: " + this.columnPosition + "\nLine: "
				+ this.linePosition + "\n");
	}

	private void printAction(Integer numberOfSteps, Direction direction) {
		System.out.println("Walking " + numberOfSteps + " steps to "
				+ direction + "\n");
	}

	public Integer currentColumnPosition() {
		return this.columnPosition;
	}

	public Integer currentLinePosition() {
		return this.linePosition;
	}

	public void setColumnPosition(Integer columnPosition) {
		this.columnPosition = columnPosition;
	}

	public void setLinePosition(Integer linePosition) {
		this.linePosition = linePosition;
	}

	public Space getSpace() {
		return this.space;
	}

}
