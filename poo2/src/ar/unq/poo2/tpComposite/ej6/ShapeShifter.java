package ar.unq.poo2.tpComposite.ej6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeShifter implements IShapeShifter {

	private List<IShapeShifter> shapes;
	
	public ShapeShifter() {
		this.setShapes(new ArrayList<IShapeShifter>());
	}

	@Override
	public IShapeShifter compose(IShapeShifter aShapeShifter) {
		ShapeShifter shp = new ShapeShifter();
		
		shp.addShape(this);
		shp.addShape(aShapeShifter);
		
		return shp;
	}

	public void addShape(IShapeShifter aShapeShifter) {
		this.getShapes().add(aShapeShifter);
	}

	@Override
	public int deepest() {
		int total = 1;
		
		for (IShapeShifter shape : this.getShapes()) {
			int current = total + shape.deepest();
			
			if(total < current) {
				total = current;
			}
		}
		
		return total;
	}

	@Override
	public IShapeShifter flat() {
		
		ShapeShifter shp = new ShapeShifter();
		
		this.values().forEach(value -> shp.addShape(new Shape(value)));
		
		return shp;
	}

	@Override
	public List<Integer> values() {
		List<Integer> values = new ArrayList<Integer>();
		
		this.getShapes().forEach(shape -> values.addAll(shape.values()));
		
		return values;
	}

	public List<IShapeShifter> getShapes() {
		return shapes;
	}

	public void setShapes(List<IShapeShifter> shapes) {
		this.shapes = shapes;
	}

}
