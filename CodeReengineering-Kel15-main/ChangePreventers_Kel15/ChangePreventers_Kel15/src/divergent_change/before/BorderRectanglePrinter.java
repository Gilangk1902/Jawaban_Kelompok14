package divergent_change.before;

public class BorderRectanglePrinter extends RectanglePrinter {

	public BorderRectanglePrinter(Rectangle r) {
		super(r);
	}

	@Override
	public void print() {
		for(int i = 0; i < r.getHeight(); i++) {  //print rectangle border
			for(int j = 0; j < r.getWidth(); j++) {
				System.out.print(
						j == 0 || j == width-1 || 
						i == 0 || i == height-1 ? "*" : " ");
			}
			System.out.println("");
		}
	}

	
}

