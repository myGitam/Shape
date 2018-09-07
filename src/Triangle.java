
public class Triangle extends Shape {
	private Point p1;
	private Point p2;
	private Point p3;

	public Triangle(Point p1, Point p2, Point p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	public Triangle() {
	}

	public Point getP1() {
		return p1;
	}

	public void setP1(Point p1) {
		this.p1 = p1;
	}

	public Point getP2() {
		return p2;
	}

	public void setP2(Point p2) {
		this.p2 = p2;
	}

	public Point getP3() {
		return p3;
	}

	public void setP3(Point p3) {
		this.p3 = p3;
	}

	@Override
	double getPerimetr() {
		return Point.cAlculation(p1, p2) + Point.cAlculation(p1, p3) + Point.cAlculation(p3, p2);
	}

	@Override
	double getArea() {
		double p = this.getPerimetr()/2;
		return Math.sqrt(p * (p - Point.cAlculation(p1, p2)) * (p - Point.cAlculation(p2, p3))
				* (p - Point.cAlculation(p3, p1)));
	}

	@Override
	public String toString() {
		return "Triangle{" + "p1=" + p1 + ", p2=" + p2 + ", p3=" + p3 + '}';
	}

}
