package justDoIt;

public class Tutorial14 {
	public static void main(String[] args) {

		Tutorial14_Node one = new Tutorial14_Node(10, 20);
		Tutorial14_Node two = new Tutorial14_Node(30, 40);
		Tutorial14_Node result = one.getCenter(two);
		System.out.print("x : " + result.getX() + "," + "y : " + result.getY());
	}
}
