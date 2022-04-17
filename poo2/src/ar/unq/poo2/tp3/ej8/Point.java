package ar.unq.poo2.tp3.ej8;

public class Point {
	private int x;
	private int y;
	
	public Point() {
		
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void moveX(int newX) {
		this.x = newX;
	}
	
	public void moveY(int newY) {
		this.y = newY;
	}

	public void movePoint(Point newPoint) {
		this.moveX(newPoint.getX());
		this.moveY(newPoint.getY());
	}
	
	public Point sumPoint(Point otherPoint) {
		int resX = this.getX() + otherPoint.getX();
		int resY = this.getY() + otherPoint.getY();
		
		return new Point(resX, resY);
	}
}
