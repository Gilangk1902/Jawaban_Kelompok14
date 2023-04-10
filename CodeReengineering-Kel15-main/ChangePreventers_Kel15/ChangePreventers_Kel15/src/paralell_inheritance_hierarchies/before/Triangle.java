package paralell_inheritance_hierarchies.before;

public class Triangle extends Shape2D implements AreaInterface{

    public Triangle(Shape2D shape){
        super(shape);
    }
    
    @Override
	public float area() {
		return shape.getHeight() * shape.getWidth() / 2;
	}
}