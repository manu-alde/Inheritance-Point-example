package entities;


public class Main {

	public static void main(String[] args) {
		Point2D p2D = new Point2D();
		Point3D p3D = new Point3D(0,0,1);
		Point3D a3D = null;
		
		System.out.println(p2D.toString());
		System.out.println(p3D.toString());
		
		System.out.println(p2D.equals(p3D));
		System.out.println(p3D.equals(p2D));
		System.out.println(p2D.equals(a3D));
		System.out.println(p3D.equals(a3D));
		a3D = new Point3D();
		System.out.println(p2D.equals(a3D));
		System.out.println(a3D.equals(p2D));

	}

}
