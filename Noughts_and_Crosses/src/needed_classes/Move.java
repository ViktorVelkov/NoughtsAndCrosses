package needed_classes;

public class Move {

	private int row; 
	private int col;
	
	public Move(int row, int col) {
		this.row = row;
		this.col = col;
	}
	
	public int getR() {
		return row;
	}

	public int getC() {
		return col;
	}
	
	public boolean isValid() {
		return (row >= 0 && row < 3 && col >=0 && col <3);
	}
	
	
	
}
