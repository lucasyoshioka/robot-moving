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
		switch (direction) {
		case UP:
			walkUp(numberOfSteps);
			break;
		case DOWN:
			walkDown(numberOfSteps);
			break;
		case RIGHT:
			walkRight(numberOfSteps);
			break;
		case LEFT:
			walkLeft(numberOfSteps);
			break;
		}
	}

	private void walkUp(Integer numberOfSteps) {
		printAction(numberOfSteps, direction);
		this.columnPosition = this.columnPosition - numberOfSteps;
		while (this.columnPosition <= 0) {
			this.columnPosition = this.columnPosition + this.space.getColumnSize();
		}
		printCurrentPosition();
	}

	private void walkDown(Integer numberOfSteps) {
		printAction(numberOfSteps, direction);
		this.columnPosition = this.columnPosition + numberOfSteps;
		if (this.columnPosition >= this.space.getColumnSize()) {
			this.columnPosition = this.columnPosition - this.space.getColumnSize();
		}
		printCurrentPosition();
	}

	private void walkRight(Integer numberOfSteps) {
		printAction(numberOfSteps, direction);
		this.linePosition = this.linePosition + numberOfSteps;
		if (this.linePosition >= this.space.getLineSize()) {
			this.linePosition = this.linePosition - this.space.getLineSize();
		}
		printCurrentPosition();
	}

	private void walkLeft(Integer numberOfSteps) {
		printAction(numberOfSteps, direction);
		this.linePosition = this.linePosition - numberOfSteps;
		while (linePosition <= 0) {
			this.linePosition = this.linePosition + this.space.getLineSize();
		}
		printCurrentPosition();
	}

	private void printCurrentPosition() {
		System.out.println("The current position of " + this.name + " is:\nColumn: " + this.columnPosition + "\nLine: "
				+ this.linePosition + "\n");
	}
	
	private void printAction(Integer numberOfSteps, Direction direction) {
		System.out.println("Walking " + numberOfSteps + " steps to " + direction + "\n");
	}
	
	public Integer currentColumnPosition() {
		return this.columnPosition;
	}
	
	public Integer currentLinePosition() {
		return this.linePosition;
	}

}
