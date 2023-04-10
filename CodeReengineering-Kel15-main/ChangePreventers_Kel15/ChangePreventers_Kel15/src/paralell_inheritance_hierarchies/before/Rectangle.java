package paralell_inheritance_hierarchies.before;

public class Rectangle extends Shape2D implements AreaInterface{
    public Rectangle(Shape2D shape){
        super(shape);
    }

    @Override
	public float area() {
		return shape.getHeight() * shape.getWidth();
	}
}