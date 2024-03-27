package chap4.p148;

class Cirlce{
	double radius;
	String color;
	
	public Cirlce(double r, String c) {
		radius = r;
		color = c;
	}
	
	public Cirlce(double r) {
		radius = r;
		color = "파랑";
	}
	
	public Cirlce(String c) {
		radius = 10.0;
		color =c;
	}
	public Cirlce() {
		radius = 10.0;
		color = "파랑";
	}
}

public class CircleDemo {
	public static void main(String[] args) {
		Cirlce c1 = new Cirlce(10.0, "빨강");
		Cirlce c2 = new Cirlce(5.0);
		Cirlce c3 = new Cirlce("노랑");
		Cirlce c4 = new Cirlce();
	}
}
