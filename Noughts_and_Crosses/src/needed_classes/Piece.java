package needed_classes;

public class Piece {
	private boolean isNought;
	public Piece(boolean isNought) {
		this.isNought = isNought;
		
	}

	public Piece(Piece lastPiecePlayed) {
		isNought = !lastPiecePlayed.isNought;
	}

	public String toString() {
		if(isNought) {
			return "O";}
	else { return "X";  }
	}

	
	public boolean equals(Piece otherPiece) {
		
		if(otherPiece == null) {return false;}
		return otherPiece.isNought = this.isNought;
	}
	
	
	 
	

}