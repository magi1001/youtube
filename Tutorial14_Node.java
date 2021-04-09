package justDoIt;

public class Tutorial14_Node {

	private int x;
	private int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Tutorial14_Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Tutorial14_Node getCenter(Tutorial14_Node other) {
		return new Tutorial14_Node((this.x + other.getX())/2, ((this.y + other.getY())/2));
	}
	
}
