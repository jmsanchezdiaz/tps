package ar.unq.poo2.tpComposite.ej6;

import java.util.List;

public interface IShapeShifter {
	
	public IShapeShifter compose(IShapeShifter aShapeShifter);
	public int deepest();
	public IShapeShifter flat();
	public List<Integer> values();
	
}
