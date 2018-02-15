package br.com.xbrain.robot;

public class GameBoard implements Space {
	
	private int[] columnSize;
	
	private int[] lineSize;
	
	private GameBoard(Integer columnSize, Integer lineSize) {
		this.columnSize = new int[columnSize];
		this.lineSize = new int[lineSize];
	}

	public static GameBoard of(Integer column, Integer line) {
		return new GameBoard(column, line);
	}

	public Integer getColumnSize() {
		return columnSize.length;
	}
	
	public Integer getLineSize() {
		return lineSize.length;
	}
	
}
