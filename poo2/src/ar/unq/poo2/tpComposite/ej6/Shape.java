package ar.unq.poo2.tpComposite.ej6;

import java.util.Arrays;
import java.util.List;

public class Shape implements IShapeShifter {

	private Integer value;
	
	public Shape(Integer value) {
		this.setValue(value);
	}
	
	@Override
	public IShapeShifter compose(IShapeShifter aShapeShifter) {
		ShapeShifter shp = new ShapeShifter();
		
		shp.addShape(this);
		shp.addShape(aShapeShifter);
	
		return shp;
	}

	@Override
	public int deepest() {
		return 0;
	}

	@Override
	public IShapeShifter flat() {
		return this;
	}

	@Override
	public List<Integer> values() {
		return Arrays.asList(this.getValue());
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

}
