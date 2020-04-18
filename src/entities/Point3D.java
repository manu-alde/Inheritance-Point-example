package entities;

public class Point3D extends Point2D{
	private double zValue;
	
	Point3D(double xValue, double yValue, double zValue){
		super(xValue, yValue);
		this.zValue = zValue;
	}
	
	Point3D(){
		this(0,0,0);
	}

	public double getzValue() {
		return zValue;
	}

	public void setzValue(double zValue) {
		this.zValue = zValue;
	}

	@Override
	public String toString() {
		return super.toString() + ", zValue=" + zValue;
	}
	
	
}
