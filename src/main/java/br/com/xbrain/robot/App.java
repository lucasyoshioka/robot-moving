package br.com.xbrain.robot;

public class App {
    
	public static void main( String[] args ) {
		Space space = GameBoard.of(10, 10);
		Robot robot = Robot.create("Mamute", space);
		
		robot.moveTo(Direction.UP).steps(1).walk();
    }
}
