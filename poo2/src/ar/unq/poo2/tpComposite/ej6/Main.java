package ar.unq.poo2.tpComposite.ej6;

public class Main {

	public static void main(String[] args) {
		IShapeShifter a = new Shape(1);
		IShapeShifter b = new Shape(2);
		IShapeShifter c = a.compose(b);

	}

}
