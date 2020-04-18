package entities;

public class Point2D {
	protected double xValue;
	protected double yValue;
	
	Point2D(double xValue, double yValue){
		this.xValue = xValue;
		this.yValue = yValue;
	}
	
	Point2D(){
		this(0,0);
	}
	
	public double getxValue() {
		return xValue;
	}
	public void setxValue(double xValue) {
		this.xValue = xValue;
	}
	public double getyValue() {
		return yValue;
	}
	public void setyValue(double yValue) {
		this.yValue = yValue;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point2D other = (Point2D) obj;
		if (Double.doubleToLongBits(xValue) != Double.doubleToLongBits(other.xValue))
			return false;
		if (Double.doubleToLongBits(yValue) != Double.doubleToLongBits(other.yValue))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "xValue=" + xValue + ", yValue=" + yValue;
	}
	

	
}
