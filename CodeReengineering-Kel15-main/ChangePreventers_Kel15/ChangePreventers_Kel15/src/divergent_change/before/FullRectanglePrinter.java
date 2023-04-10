package divergent_change.before;

public class FullRectanglePrinter extends RectanglePrinter {

	public FullRectanglePrinter(Rectangle r) {
		super(r);
	}

	@Override
	public void print() {
		for(int i = 0; i < r.getHeight(); i++) {
			for(int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}